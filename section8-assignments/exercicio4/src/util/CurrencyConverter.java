package util;

public class CurrencyConverter {
	public static double dollarPrice;
	
	public static double dollarPayment(double quantity) {
		double dollarTotalValue = quantity * dollarPrice;
		dollarTotalValue += dollarTotalValue * 0.06;
		return dollarTotalValue;
	}
}
