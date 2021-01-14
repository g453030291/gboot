package org.g.resource;

import java.util.List;

/**
 * 配置文件中的映射bean
 * @author g
 * @date 2021/1/13 9:17 下午
 */
public class Bean {

	private String id;

	/** 因为class是关键字,
	 * 所以这里吧class替换为了path,
	 * 和spring中的class是同一个语义,
	 * 都表示类路径*/
	private String path;

	private List<Property> property;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<Property> getProperty() {
		return property;
	}

	public void setProperty(List<Property> property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "Bean{" +
				"id='" + id + '\'' +
				", path='" + path + '\'' +
				", property=" + property +
				'}';
	}
}
