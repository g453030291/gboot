package org.g.tcp;

import java.util.Map;

/**
 * @author g
 * @date 2020/12/13 3:33 下午
 */
public class HttpRequest {

	private Header header;

	private Body body;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	/**
	 * http header
	 */
	private class Header{
		private String method;

		private String host;

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

	/**
	 * http body
	 */
	private class Body{
		private Map<String,Object> map;

		public Map<String, Object> getMap() {
			return map;
		}

		public void setMap(Map<String, Object> map) {
			this.map = map;
		}
	}

}
