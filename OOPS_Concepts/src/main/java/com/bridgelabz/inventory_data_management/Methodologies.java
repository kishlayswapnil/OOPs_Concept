package com.bridgelabz.inventory_data_management;

import java.io.IOException;

//Interface to declare all the methods that will be used.
public interface Methodologies {
	void addName(Inventory details) throws IOException;
	void itemList() throws IOException;
	void price(String str) throws IOException;
	void remove(String str) throws IOException;
}
