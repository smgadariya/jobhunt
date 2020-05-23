package practice.java8;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
	        double payment = 23.23;

	        NumberFormat lp;  //Local Payment

	        lp = NumberFormat.getCurrencyInstance(Locale.US);
	        System.out.println("US: " + lp.format(payment));

	        lp = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
	        System.out.println("India: " + lp.format(payment));

	        lp = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        System.out.println("China: " + lp.format(payment));

	        lp = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        System.out.println("France: " + lp.format(payment));

	}

}
