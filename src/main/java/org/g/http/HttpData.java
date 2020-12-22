package org.g.http;

import java.util.HashMap;

/**
 * http数据封装
 * @author g
 * @date 2020/12/21 8:49 下午
 */
public class HttpData {

	private String method;

	private String host;

	private String version;

	private String uri;

	private HashMap<String,Object> param;

	private String connection;

	private String cacheControl;

	private Integer upgradeInsecureRequests;

	private String userAgent;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public HashMap<String, Object> getParam() {
		return param;
	}

	public void setParam(HashMap<String, Object> param) {
		this.param = param;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public String getCacheControl() {
		return cacheControl;
	}

	public void setCacheControl(String cacheControl) {
		this.cacheControl = cacheControl;
	}

	public Integer getUpgradeInsecureRequests() {
		return upgradeInsecureRequests;
	}

	public void setUpgradeInsecureRequests(Integer upgradeInsecureRequests) {
		this.upgradeInsecureRequests = upgradeInsecureRequests;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
}
