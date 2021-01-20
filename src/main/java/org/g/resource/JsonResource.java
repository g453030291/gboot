package org.g.resource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author g
 * @date 2021/1/3 3:33 下午
 */
public class JsonResource implements Resource {

	private static Gson GSON = new GsonBuilder().serializeNulls().create();

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

	@Override
	public InputStream getFileAsInputStream() {
		InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(FILE_NAME);
		return resourceAsStream;
	}

	public JsonDocument getBeanDefinitionFromJsonResource() {
		JsonDocument jsonDocument = GSON.fromJson(new InputStreamReader(getFileAsInputStream()), JsonDocument.class);
		return jsonDocument;
	}
}
