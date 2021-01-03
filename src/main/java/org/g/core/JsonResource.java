package org.g.core;

import java.io.File;
import java.net.URL;

/**
 * @author g
 * @date 2021/1/3 3:33 下午
 */
public class JsonResource implements Resource {

	private static final String FILE_NAME = "application.json";

	@Override
	public File getFile() {
		URL url = Thread.currentThread().getContextClassLoader().getResource(FILE_NAME);
		File file = new File(url.getPath());

		return null;
	}

	@Override
	public String getFileName() {
		return null;
	}
}
