package com.bridgelabz.inventory_data_management;

import java.io.IOException;
import java.util.Scanner;

public class InventoryManager {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		MethodologiesImplementation objImplement = new MethodologiesImplementation();
		
		System.out.println("press 1 for ADD name");
		System.out.println("press 2 for Item List");
		System.out.println("press 3 for Total Price");
		System.out.println("press 4 for remove data");
		System.out.println("press 5 to end the operation");
		int choice = scan.nextInt();
		do {
			
			switch (choice) {
				case 1:
					System.out.println("Enter the Item name");
					String name = scan.next();
					
					System.out.println("Enter the Item weight");
					double weight = scan.nextDouble();
					System.out.println(weight);
					
					System.out.println("Enter the Item price");
					double price = scan.nextDouble();
					System.out.println(price);
					
					Inventory objInventory = new Inventory(name, weight, price);
					objImplement.addName(objInventory);
					break;
				case 2:
					try {
						objImplement.itemList();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 3:
					System.out.println("Enter the Item name");
					String strName = scan.next();
					objImplement.price(strName);
					break;
				case 4:
					System.out.println("Enter the Item name");
					String itemName = scan.next();
					objImplement.remove(itemName);
					break;
				default:
					System.out.println("Invalid Choice Made");
			}
		}while (choice<5);
	}
}

