package BaiTap;

import java.util.*;

public class Bai3 {
	public static void main(String[] args) {
		int x;

		System.out.print("Nhap so dien: ");

		Scanner s = new Scanner(System.in);

		x = s.nextInt();

		if (x < 50) {
			int tien = x * 1000;
			System.out.print("So tien phai tra: " + tien);
		} else if (x > 50) {
			int tien=50*1000+(x-50)*1200;
			System.out.print("So tien phai tra: " + tien);
		}
		s.close();
	}
}
