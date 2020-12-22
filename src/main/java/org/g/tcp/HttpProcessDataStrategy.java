package org.g.tcp;

import org.g.http.HttpData;

/**
 * 各类型请求解析数据接口
 * @author g
 * @date 2020/12/20 9:12 下午
 */
public interface HttpProcessDataStrategy {

	HttpData processData(String str);

}
