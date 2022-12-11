package factory;

import entities.Financing;

public class FinancingFactory {

	public static Financing createFinancingCorrect() {

		double totalAmount = 100000.0;
		double income = 2000.0;
		int month = 80;

		return new Financing(totalAmount, income, month);
	}

	public static Financing createFinancingIncorrect() {

		double totalAmount = 100000.0;
		double income = 2000.0;
		int month = 20;

		return new Financing(totalAmount, income, month);
	}

}
