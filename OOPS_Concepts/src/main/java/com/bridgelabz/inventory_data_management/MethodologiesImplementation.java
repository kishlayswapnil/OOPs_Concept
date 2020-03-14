package com.bridgelabz.inventory_data_management;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MethodologiesImplementation implements Methodologies {
	String filePath = "/home/bridgelabz/IdeaProjects/OOPS_Concepts/src/main/java/com/bridgelabz/inventory_data_management/Inventory2.json";
	ObjectMapper objectMapper = new ObjectMapper();
	
	//Method to add the Inventory Details.
	public void addName(Inventory detail) {
		try {
			JSONObject objJson = new JSONObject();
			
			//Adding Item details in the json file.
			objJson.put("name", detail.getName());
			objJson.put("weight", detail.getWeight());
			objJson.put("price", detail.getPrice());
			
			//Accessing the file to extract the contents.
			FileReader objFileReader = new FileReader(filePath);
			//Parsing the data from the json file.
			JSONParser parser = new JSONParser();
			Object object1 = parser.parse(objFileReader);
			JSONArray objArray = new JSONArray(object1.toString());
			objArray.put(objJson);
			try {
				//Writing back to the json file the element which was added.
				FileWriter objFileWriter = new FileWriter(filePath);
				objFileWriter.write(objArray.toString());
				objFileWriter.flush();
				objFileWriter.close();
				System.out.println("Data stored Successfully.........");
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Method to check the list of items have been created.
	@Override
	public void itemList() throws IOException {
		JSONParser parser = new JSONParser();
		try {
			FileReader objFileReader = new FileReader(filePath);
			Object object = parser.parse(objFileReader);
			JSONArray objArray = new JSONArray(object.toString());
			
			//Traversing through the array.
			for (int index = 0; index < objArray.length(); index++) {
				JSONObject objJson = objArray.getJSONObject(index);
				
				//Displaying the final results.
				System.out.print("name:" + objJson.get("name") + " ");
				System.out.print("weight:" + objJson.get("weight") + " ");
				System.out.print("price:" + objJson.get("price") + " ");
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//This method is calculating the price according to the weight of item.
	@Override
	public void price(String value) throws IOException {
		String name = "";
		double total;
		double price = 0;
		double weight = 0;
		try {
			JSONParser parser = new JSONParser();
			
			FileReader objFileReader = new FileReader(filePath);
			Object object = parser.parse(objFileReader);
			JSONArray objArray = new JSONArray(object.toString());
			for (int index = 0; index < objArray.length(); index++) {
				JSONObject objJson = objArray.getJSONObject(index);
				
				//Storing the values for calculation.
				if (objJson.get("name").equals(value)) {
					name = (String) objJson.get("name");
					weight = objJson.getDouble("weight");
					price = objJson.getDouble("price");
				}
			}
			
			//Adding the total value.
			total = weight * price;
			System.out.println("total price of" + name + " = " + total);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void remove(String value) throws IOException {
	
	}
}
