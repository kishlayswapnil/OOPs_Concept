package com.bridgelabz.stockreport;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OperationImplementation implements Operations {
	String filePath = "/home/bridgelabz/IdeaProjects/OOPS_Concepts/src/main/java/com/bridgelabz/stockreport/StockInventory.json";
	
	//Method to add company details in the json file.
	public void addCompanyDetails(Company detail) throws IOException, ParseException {
		JSONObject objJson = new JSONObject();
		try {
			//Inserting keys with their values in json file.
			objJson.put("name", detail.getCompanyName());
			objJson.put("share", detail.getCompanyShare());
			objJson.put("price", detail.getSharePrice());
			
			//Creating an instance to parse data from json file.
			JSONParser parser = new JSONParser();
			FileReader objFileReader = new FileReader(filePath);
			Object objParser = parser.parse(objFileReader);
			JSONArray objArray = new JSONArray(objParser.toString());
			
			//After Parsing the data passing it in json array.
			objArray.put(objJson);
			objFileReader.close();
			
			//Finally, writing back the data in array to the json file.
			FileWriter objFileWriter= new FileWriter(filePath);
			objFileWriter.write(objArray.toString());
			objFileWriter.flush();
			objFileWriter.close();
			System.out.println("Data saved successfully");
		}
		//Catching json exceptions.
		catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	//Method to view the company names by traversing the array for key "name".
	@Override
	public void viewAllCompanyNames() throws FileNotFoundException, IOException, ParseException {
		try {
			JSONParser parser = new JSONParser();
			FileReader objFileReader = new FileReader(filePath);
			Object objParser = parser.parse(objFileReader);
			JSONArray objArray = new JSONArray(objParser.toString());
			for(int index=0; index<objArray.length(); index++) {
				JSONObject objJson = objArray.getJSONObject(index);
				System.out.println(objJson.get("name"));
			}
		}
		//Catching json exceptions.
		catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	//Method to view all the company details.
	@Override
	public void viewCompanyDetails(String companyName) throws FileNotFoundException, IOException, ParseException {
		try {
			JSONParser parser = new JSONParser();
			FileReader objFileReader = new FileReader(filePath);
			Object objParser = parser.parse(objFileReader);
			JSONArray objArray = new JSONArray(objParser.toString());
			for(int index=0; index<objArray.length(); index++) {
				JSONObject objJson = objArray.getJSONObject(index);
				if(objJson.get("name").equals(companyName)) {
					System.out.println("Company name : "+objJson.get("name"));
					System.out.println("Total share of company : "+objJson.get("share"));
					System.out.println("price of one share : "+objJson.get("price"));
					break;
				}
			}
			objFileReader.close();
		}
		//Catching json exceptions.
		catch (JSONException e) {
			e.printStackTrace();
		}
	}
}
