package org.g.entity;

/**
 * @author g
 * @date 2021/1/12 8:10 上午
 */
public class Dog {

	private Integer id;

	private String name;

	private Car car;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
}
