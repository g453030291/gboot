package org.g.http;

/**
 * http 请求方法
 * @author g
 * @date 2020/12/13 5:27 下午
 */
public class HttpMethod {

	public static final String GET = "GET";
	public static final String POST = "POST";
	public static final String PUT = "PUT";
	public static final String DELETE = "DELETE";
	public static final String OPTIONS = "OPTIONS";

	/**
	 * 获取http请求方法
	 * @param str
	 * @return
	 */
	public static String getHttpMethod(String str){
		if(str == null && str.equals("")){
			return null;
		}
		str = str.toUpperCase();
		if(GET.equals(str)){
			return GET;
		}else if(POST.equals(str)){
			return POST;
		}else if(PUT.equals(str)){
			return PUT;
		}else if(DELETE.equals(str)){
			return DELETE;
		}else if(OPTIONS.equals(str)){
			return OPTIONS;
		}else {
			return null;
		}
	}

}
