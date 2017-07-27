package BaiTap;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		System.out.println("1. Kiem tra so nguyen to");
		System.out.print("Chon chua nang: ");

		int cn;
		Scanner scanner = new Scanner(System.in);
		cn = scanner.nextInt();

		switch (cn) {
		case 1:

			int x;
			System.out.println("Nhap so nguyen to x: ");
			x = scanner.nextInt();
			int i;
			for (i = 2; i <= x / 2; i++) {
				if (x % i == 0) {
					System.out.println("Khong phai so nguyen so");
					break;
				}
			}
			if (i > x / 2) {
				System.out.println("La so nguyen so");
			}

		}
	}
}
