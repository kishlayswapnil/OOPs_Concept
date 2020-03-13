package com.bridgelabz.stockreport;

import org.json.simple.parser.ParseException;
import java.io.IOException;
import java.util.Scanner;

//A Stock report can be generated.
public class StockPortfolio {
	public static void main(String[] args) throws IOException, ParseException {
		Scanner scan = new Scanner(System.in);
		OperationImplementation objOperation = new OperationImplementation();
		System.out.println("Press 1 Add Company details");
		System.out.println("Press 2 view All Company names");
		System.out.println("Press 3 view company Details");
		
		//Enter the desired choice value.
		int choice = scan.nextInt();
		switch (choice) {
			case 1:
				System.out.println("Enter the Company name");
				String companyName = scan.next();
				System.out.println("Enter the Company share");
				int companyShare = scan.nextInt();
				System.out.println("Enter the share price");
				int sharePrice = scan.nextInt();
				
				//Adding data in method to enter in json file.
				Company detail = new Company(companyName, companyShare, sharePrice);
				objOperation.addCompanyDetails(detail);
				break;
			case 2:
				objOperation.viewAllCompanyNames();
				break;
			case 3:
				System.out.println("Enter the company name");
				companyName = scan.next();
				objOperation.viewCompanyDetails(companyName);
				break;
			default:
				System.out.println("Invalid Choice");
		}
	}
}
