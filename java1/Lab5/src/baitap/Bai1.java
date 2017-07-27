package baitap;

import java.util.ArrayList;

public class Bai1 {
	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();

		a.add(4.2);
		a.add(1.3);
		a.add(6.4);
		a.add(12.1);
		a.add(11.6);
		a.add(20.7);

		double tong = 0;
		for (Double x : a) {
			tong+=x;			
		}
		System.out.println("Sum of list: " + tong);

	}
}
