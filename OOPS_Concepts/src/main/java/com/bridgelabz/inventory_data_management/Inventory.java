package com.bridgelabz.inventory_data_management;

//A Basic structure of what details will be entered to the json file.
public class Inventory {
	private String name;
	private double weight;
	private double price;
	
	//Method to add data in json file.
	public Inventory(String name,double weight, double price) {
		this.name = name;
		this.weight=weight;
		this.price =price;
	}
	
	//Method to get the name from json file.
	public String getName() {
		return name;
	}
	
	//Method to get the weight from the json file.
	public double getWeight()
	{
		return weight;
	}
	
	//Method to get the price from json file.
	public double getPrice() {
		return price;
	}
}