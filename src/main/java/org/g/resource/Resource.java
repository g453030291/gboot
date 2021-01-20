package org.g.resource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 通过各种形式加载外部资源文件
 * 统一入口
 * 统一出口（返回的都是inputStream）
 * @author g
 * @date 2021/1/3 9:52 上午
 */
public interface Resource {

	/**
	 * get file
	 * @return file object
	 * @exception FileNotFoundException file not found
	 */
	File getFile();

	/**
	 * get file name
	 * @return file name
	 */
	String getFileName();

	/**
	 * get file as inputStream
	 * @return
	 */
	InputStream getFileAsInputStream();

}
