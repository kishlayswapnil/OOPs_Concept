package com.bridgelabz.stockreport;

//A Basic structure of what details will be entered to the json file.
public class Company {
	private String companyName;
	private int companyShare;
	private int sharePrice;
	
	//A Company method will be used to fetch following detail.
	public Company(String companyName, int companyShare, int sharePrice) {
		this.companyName = companyName;
		this.companyShare = companyShare;
		this.sharePrice = sharePrice;
	}
	
	//Method to fetch company name from main file.
	public String getCompanyName() {
		return companyName;
	}
	
	//Method to fetch company share from main file.
	public int getCompanyShare()
	{
		return companyShare;
	}
	
	//Method to fetch company share price from main file.
	public int getSharePrice()
	{
		return sharePrice;
	}
	
}
