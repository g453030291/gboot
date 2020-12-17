package org.g.tcp;

import java.util.HashMap;
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
	public static final class Header{
		private HttpMethod method;

		private String host;

		private String uri;

		private HashMap<String,String> uri_param;

		private String connection;

		private String cacheControl;

		private Integer upgradeInsecureRequests;

		private String userAgent;

		public HttpMethod getMethod() {
			return method;
		}

		public void setMethod(HttpMethod method) {
			this.method = method;
		}

		public String getHost() {
			return host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getUri() {
			return uri;
		}

		public void setUri(String uri) {
			this.uri = uri;
		}

		public HashMap<String, String> getUri_param() {
			return uri_param;
		}

		public void setUri_param(HashMap<String, String> uri_param) {
			this.uri_param = uri_param;
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
	public class Body{
		private Map<String,Object> map;

		public Map<String, Object> getMap() {
			return map;
		}

		public void setMap(Map<String, Object> map) {
			this.map = map;
		}
	}

}
