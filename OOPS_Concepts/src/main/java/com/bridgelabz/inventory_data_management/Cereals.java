package com.bridgelabz.inventory_data_management;

public class Cereals {
	public String name;
	public int price;
	public int weight;
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return "Cereals{" +
				       "price=" + price +
				       ", name='" + name + '\'' +
				       ", weight=" + weight +
				       '}';
	}
}
