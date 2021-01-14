package org.g.resource;

import java.util.List;

/**
 * 替代spring中的document对象
 * @author g
 * @date 2021/1/13 9:14 下午
 */
public class JsonDocument {

	private List<Bean> beans;

	public List<Bean> getBeans() {
		return beans;
	}

	public void setBeans(List<Bean> beans) {
		this.beans = beans;
	}

	@Override
	public String toString() {
		return "JsonDocument{" +
				"beans=" + beans +
				'}';
	}
}
