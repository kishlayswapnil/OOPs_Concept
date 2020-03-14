package com.bridgelabz.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Class to implement the regex methods.
public class RegularExpression {
	
	//String that is to be checked and replaced.
	static String string = "Hello <<name>>, We have your full name as <<full name>> \n"
			                       + "in our system your contact number is 91­xxxxxxxxxx.\n"
			                       + "Please,let us know in case of any clarification. Thank you BridgeLabz 01/01/2016";
	
	static String name = " ", fullName = " ", mobNo = " ", date = " ";
	
	//A method to replace the strings has been declared.
	public static String wordsReplace(String objString, String regex, String replace) {
		Pattern pat = Pattern.compile(regex);
		Matcher match = pat.matcher(string);
		return string = match.replaceAll(replace);
	}
}
