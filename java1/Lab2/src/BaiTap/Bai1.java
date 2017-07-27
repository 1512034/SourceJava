//giai phuong trinh bac nhat

package BaiTap;

import java.util.*;
import java.lang.Math;

public class Bai1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double a,b;

		System.out.print("Nhap a: ");
		a = s.nextDouble();
		System.out.print("Nhap b: ");
		b = s.nextDouble();

		if(a==0) {
			if(b==0) {
				System.out.println("Phuong trinh vo so nghiem.");
			}else {
				System.out.println("Phuong trinh vo nghiem.");
			}
		}else {
			System.out.println("x="+(-b/a));
		}
		
		s.close();
	}
}
