package com.gewara.untrans;

public interface OpenApiRegService {
	/**
	 * ע��openapi
	 * @param path
	 * @param data
	 */
	void registerOpenApi(String path, String data);

	/**
	 * ȡ��ע��openapi
	 */
	void unregisterOpenApi();
}
