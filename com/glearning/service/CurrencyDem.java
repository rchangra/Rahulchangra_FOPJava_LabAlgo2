package com.glearning.service;

import java.util.ArrayList;
import java.util.List;

public class CurrencyDem {
public static void Currencycount(double[] denominators,double amount) {
	boolean flag = true;
List<String> result = new ArrayList<>();
while(flag) {
	for (int i =0 ; i<denominators.length;i++) {
		int numberdemo = 0;
		while(amount>=numberdemo) {
			amount = amount-denominators[i];
			numberdemo++;
			
		}
		if(numberdemo !=0) {
			result
			.add("Number of denominators :: " + numberdemo + "Currency ::" );
		}
		
	}
flag = false;
}
System.out.println(result);
	
		}

public void Currencycount(double[] denominators, int amount) {
	// TODO Auto-generated method stub
	
}
}
