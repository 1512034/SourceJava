package BaiTap;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		int n;
		System.out.print("Nhap bang cua chuong can xuat: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		for (int i = 1; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + n * i);

		}
		s.close();
	}
}
