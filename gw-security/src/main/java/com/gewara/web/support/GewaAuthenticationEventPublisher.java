package com.gewara.web.support;

import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.gewara.model.acl.GewaraUser;
import com.gewara.util.GewaLogger;
import com.gewara.util.WebLogger;
/**
 * @author acerge(acerge@163.com)
 * @since 6:08:04 PM Jun 19, 2010
 */
public class GewaAuthenticationEventPublisher implements AuthenticationEventPublisher {
	private final transient GewaLogger dbLogger = WebLogger.getLogger(getClass());
	@Override
	public void publishAuthenticationFailure(AuthenticationException exception, Authentication authentication) {
		dbLogger.warn("�û���¼ʧ�ܣ�" + authentication.getName() + "ʧ��ԭ��:" + exception.getMessage());
	}

	@Override
	public void publishAuthenticationSuccess(Authentication authentication) {
		GewaraUser user = (GewaraUser) authentication.getPrincipal();
		dbLogger.warn("�û���¼�ɹ���" + user.getId() + ":" +user.getRealname());
	}
}
