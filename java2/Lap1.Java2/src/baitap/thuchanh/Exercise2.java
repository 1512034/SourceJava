package baitap.thuchanh;

import java.util.*;
import java.lang.*;

public class Exercise2 {
	public static void main(String[] args) {
		PTBacHai a=new  PTBacHai();
		a.nhap();
		a.xetNghiem();
	}
}

class PTBacHai {
	private double a, b, c;

	// Nhập hệ số abc
	public void nhap() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập a: ");
		this.a = sc.nextDouble();
		System.out.print("Nhập b: ");
		this.b = sc.nextDouble();
		System.out.print("Nhập c: ");
		this.c = sc.nextDouble();
	}

	// get a
	public double getA() {
		return this.a;
	}

	// get b
	public double getB() {
		return this.b;
	}

	// get c
	public double getC() {
		return this.c;
	}

	// set a
	public void setA(double a) {
		this.a = a;
	}

	// set b
	public void setB(double b) {
		this.a = b;
	}

	// set c
	public void setC(double c) {
		this.a = c;
	}

	// tính delta
	public double delta() {
		return this.b * this.b - 4 * (this.a * this.c);
	}

	// xét nghiệm của phương trình
	public void xetNghiem() {
		double tmpDelta = delta();

		if (tmpDelta < 0) {
			System.out.println("Phương trình vô nghiệm");
		} else if (tmpDelta == 0) {
			System.out.println("Phương trình có nghiệm duy nhất ");
			System.out.println("x = " + -this.b / (2 * this.a));
		} else {
			System.out.println("Phương trình có 2 nghiệm phân biệt ");
			System.out.println("x1 =  " + (-this.b + Math.sqrt(tmpDelta)) / (2 * a));
			System.out.println("x2 =  " + (-this.b - Math.sqrt(tmpDelta)) / (2 * a));
		}
	}

}
