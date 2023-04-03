package com.glearning.client;
import com.glearning.service.CurrencyDem;
public class clientCurrency {


	public static void main(String[] args) {
		CurrencyDem service = new CurrencyDem();
		double[] denominators = new double[] {500, 200, 100, 50, 20, 10};
		service.Currencycount(denominators, 3650);
	}

}

