package baitap.thuchanh;

import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		MyHinhTron A = new MyHinhTron();

		A.nhap();
		System.out.println("Chu vi: " + A.chuVi());
		System.out.println("Dien tich: " + A.dienTich());

	}
}

interface HinhTron {
	double chuVi();

	double dienTich();
}

class MyHinhTron implements HinhTron {
	private double r;

	public void nhap() {
		System.out.print("Nhập bán kính hình tròn: ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		this.r = r;

	}

	public double chuVi() {
		return r * 2 * Math.PI;
	}

	public double dienTich() {
		return r * r * Math.PI;
	}
}
