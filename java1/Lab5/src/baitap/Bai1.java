package baitap;

import java.util.*;

public class Bai1 {
	public static void main(String[] args) {

		// nhập số lượng số thực
		int n;
		System.out.print("Nhập số lượng số thực của danh sách: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		ArrayList<Double> a = new ArrayList<Double>();

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập số thực: ");
			double temp = s.nextDouble();
			a.add(temp);
		}

		for (double x : a) {
			System.out.print(x + " ");
		}

	}

}
