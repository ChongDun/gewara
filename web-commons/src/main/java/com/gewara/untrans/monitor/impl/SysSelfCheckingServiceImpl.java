package com.gewara.untrans.monitor.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.gewara.Config;
import com.gewara.untrans.monitor.SysSelfCheckingJob;
import com.gewara.untrans.monitor.SysSelfCheckingService;

/**
 * ϵͳ������
 * @author user
 *
 */
public class SysSelfCheckingServiceImpl implements  SysSelfCheckingService{
	
	List<SysSelfCheckingJob> jobList=null;
	
	public SysSelfCheckingServiceImpl(List<SysSelfCheckingJob> jobList){
		this.jobList=jobList;
	}
	
	@Override
	public Map<String,String> checkSysStatus(){
		
		Map<String,String> map=new LinkedHashMap<String,String>();
		
		//ϵͳ��ʶ
		map.put("Server",  Config.SYSTEMID + "," + Config.getHostname());
		
		//���ػ�������
		String gewaraconfig = System.getProperty("GEWACONFIG");
		if (gewaraconfig == null) {
			gewaraconfig = System.getProperty(Config.SYSTEMID + "-GEWACONFIG");
		}
		map.put("GEWACONFIG",  gewaraconfig);
		
		//ע��ļ������
		for (SysSelfCheckingJob job : jobList) {
			try{
				map.put(job.getCheckName(),  job.getCheckStatus());
			}catch (Exception e) {
			}
		}
		
		return map;
	}

}
