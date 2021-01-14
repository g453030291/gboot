package org.g.resource;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
		return file;
	}

	@Override
	public String getFileName() {
		return null;
	}

	public JsonDocument getBeanDefinitionFromJsonResource() throws IOException {
		File file = getFile();
		byte[] bytes = new byte[1024];
		FileInputStream fileInputStream = new FileInputStream(file);
		int length = 0;
		StringBuilder sb = new StringBuilder();
		while ((length = fileInputStream.read(bytes)) != -1){
			sb.append(new String(bytes,0,length,"UTF-8"));
		}
		String json = sb.toString();
		System.out.println(json);
		Gson gson = new Gson();
		JsonDocument jsonDocument = gson.fromJson(json, JsonDocument.class);
		return jsonDocument;
	}
}
