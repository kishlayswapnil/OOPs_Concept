package com.bridgelabz.stockreport;

import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Operations {
	void addCompanyDetails(Company detail)throws FileNotFoundException, IOException, ParseException;
	void viewAllCompanyNames()throws FileNotFoundException, IOException, ParseException;
	void viewCompanyDetails(String companyName)throws FileNotFoundException, IOException, ParseException;
}
