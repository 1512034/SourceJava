package BaiTap;

import java.util.*;
import java.lang.Math;

public class Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. Giai phuong trinh bac 1 ");
		System.out.println("2. Giai phuong trinh bac 2 ");
		System.out.println("3. Tinh tien dien ");
		System.out.print("Nhap lua chon: ");
		int cn;
		cn = scanner.nextInt();

		switch (cn) {
		case 1:
			giaiPTB1();
			break;
		case 2:
			giaiPTB2();
			break;
		case 3:
			tinhTienDien();
			break;
		}
	}

	public static void giaiPTB1() {
		Scanner s = new Scanner(System.in);

		double a, b;

		System.out.print("Nhap a: ");
		a = s.nextDouble();
		System.out.print("Nhap b: ");
		b = s.nextDouble();

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem.");
			} else {
				System.out.println("Phuong trinh vo nghiem.");
			}
		} else {
			System.out.println("x=" + (-b / a));
		}

		s.close();
	}

	public static void giaiPTB2() {
		double a, b, c;

		Scanner s = new Scanner(System.in);

		System.out.print("Nhap a: ");
		a = s.nextDouble();
		System.out.print("Nhap b: ");
		b = s.nextDouble();
		System.out.print("Nhap c: ");
		c = s.nextDouble();

		double delta = b * b - 4 * a * c;

		if (delta < 0) {
			System.out.println("Phuong trinh vo nghiem.");
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("Phuong trinh co nghiem duy nhat x = " + x);
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Nghiem x1 = " + x1);
			System.out.println("Nghiem x2 = " + x2);
		}
		s.close();
	}

	public static void tinhTienDien() {
		int x;

		System.out.print("Nhap so dien: ");

		Scanner s = new Scanner(System.in);

		x = s.nextInt();

		if (x < 50) {
			int tien = x * 1000;
			System.out.print("So tien phai tra: " + tien);
		} else if (x > 50) {
			int tien = 50 * 1000 + (x - 50) * 1200;
			System.out.print("So tien phai tra: " + tien);
		}
		s.close();
	}
}
