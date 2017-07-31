package com.gewara.api.filter;

import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.RpcResult;
import com.alibaba.dubbo.rpc.filter.GenericFilter;
import com.gewara.Config;
import com.gewara.api.vo.ResultCode;
import com.gewara.constant.AutherFilterConstant;
import com.gewara.util.GewaLogger;
import com.gewara.util.WebLogger;
import com.gewara.web.support.ResourceStatsUtil;

/**
 * @author ge.biao
 * �ͻ���Filter��ͳһ��װ�쳣������ResultCode
 * ����������Service�����з��������뷵��ResultCode<?>
 */
@Activate(group = {Constants.CONSUMER})
public class ResultCodeTransformFilter extends GenericFilter {
	private GewaLogger dbLogger = WebLogger.getLogger(getClass());
	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		Map<String, String> header = DubboConsumerUtil.getHeader();
		try{
			//add systemid
			RpcContext context = RpcContext.getContext();
			if(header!=null){
				header.put(AutherFilterConstant.SYSTEMID, Config.SYSTEMID);
				context.setAttachments(header);
			}else{
				context.setAttachment(AutherFilterConstant.SYSTEMID, Config.SYSTEMID);
			}
			Result result = super.invoke(invoker, invocation);
			if(result.hasException()){
				dbLogger.error(invoker.getUrl().getPath()+ "." + invocation.getMethodName(), result.getException(), 10);
				//TODO:����timeout,noprovider, ProviderReturnedException
				ResultCode ret = ResultCode.getFailure(ResultCode.CODE_UNKNOWN_ERROR, "�����·");
				ret.setException(result.getException());
				//����ͳ��
				String service = StringUtils.substringAfterLast(invoker.getUrl().getPath(), ".");
				ResourceStatsUtil.getErrorStats().incrementCount("dubbo." + service);
				return new RpcResult(ret);
			}
			return result;
		}catch(Throwable e){
			dbLogger.error(e, 10);
			ResultCode ret = ResultCode.getFailure(ResultCode.CODE_UNKNOWN_ERROR, "�����·��");
			ret.setException(e);
			return new RpcResult(ret);
		}finally{
			if(header!=null){
				DubboConsumerUtil.clearHeader();
			}
		}
	}
}
