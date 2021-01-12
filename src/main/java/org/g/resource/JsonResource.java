package org.g.resource;

import java.io.*;
import java.net.URL;

/**
 * @author g
 * @date 2021/1/3 3:33 下午
 */
public class JsonResource implements Resource {

	private static final String FILE_NAME = "application.json";

	@Override
	public File getFile() throws IOException {
		URL url = Thread.currentThread().getContextClassLoader().getResource(FILE_NAME);
		File file = new File(url.getPath());
		FileReader fileReader = new FileReader(file);

		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		char[] chars = new char[];
		bufferedReader.read
		return file;
	}

	@Override
	public String getFileName() {
		return null;
	}
}
