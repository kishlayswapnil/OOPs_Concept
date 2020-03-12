package com.bridgelabz.inventory_data_management;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//Json inventory management main method.
public class JsonInventoryDataManagement {
	//extracting the file.
	final static String filePath="/home/bridgelabz/IdeaProjects/OOPS_Concepts/inventory.json";
	public static void main(String[] args) {
		try {
			//Reading all the strings of the json file.
			String fileStrings = new String((Files.readAllBytes(Paths.get(filePath))));
			JSONObject objJson = new JSONObject(fileStrings);
			//For reading each json array elements through its key value.
			JSONArray rice = objJson.getJSONArray("Rice");
			for (int index = 0; index < rice.length(); index++) {
				System.out.println(rice.getString(index));
			}
			JSONArray wheat = objJson.getJSONArray("Wheat");
			for (int index = 0; index < wheat.length(); index++) {
				System.out.println(wheat.getString(index));
			}
			JSONArray pulse = objJson.getJSONArray("Pulse");
			for (int index = 0; index < pulse.length(); index++) {
				System.out.println(pulse.getString(index));
			}
			JSONArray total = objJson.getJSONArray("Total");
			for (int index = 0; index < total.length(); index++) {
				System.out.println(total.getString(index));
			}
		}catch(IOException | JSONException e){
			e.printStackTrace();
		}
	}
}
