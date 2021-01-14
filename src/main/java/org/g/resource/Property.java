package org.g.resource;

/**
 * bean属性
 * @author g
 * @date 2021/1/13 9:20 下午
 */
public class Property {

	private String name;

	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Property{" +
				"name='" + name + '\'' +
				", value='" + value + '\'' +
				'}';
	}
}
