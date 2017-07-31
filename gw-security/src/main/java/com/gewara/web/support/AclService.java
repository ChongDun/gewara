package com.gewara.web.support;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.gewara.model.acl.GewaraUser;


public interface AclService<T extends SecurityModule> extends UserDetailsService{
	GewaraUser getGewaraUser(Long userid, String logonType);
	/**
	 * ��ȡ��API������ģ��
	 * @return
	 */
	List<T> getSecurityModuleList();
	List<T> getMenuList(String tag);
	List<String> getRolenameList();
	void setLogonType(String ptn);
	
	
	/**
	 * �����û�����ȡ�û�����
	 * @param name
	 * @param logonType
	 * @return
	 */
	@Override
	GewaraUser loadUserByUsername(String name);
	boolean isCopyAuthorities();
}
