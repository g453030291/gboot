package org.g.entity;

/**
 * @author g
 * @date 2021/1/4 10:58 下午
 */
public class Book {

	private int id;

	private String name;

	private long price;

	private Dog dog;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				", dog=" + dog +
				'}';
	}
}
