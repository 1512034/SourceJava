package baitap.thuchanh;

import java.util.*;

public class vdmang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		try {
			for (int i = 0; i < 6; i++) {
				System.out.print("Nhap: ");
				a[i] = sc.nextInt();
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}
		int s = 0;
		for (int x : a) {
			s += x;
		}

		System.out.println("Tong: " + s);
	}

}
