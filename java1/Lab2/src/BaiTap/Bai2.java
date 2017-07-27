//giai phuong trinh bac 2

package BaiTap;

import java.util.*;
import java.lang.Math;

public class Bai2 {
	public static void main(String[] args) {
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
}
