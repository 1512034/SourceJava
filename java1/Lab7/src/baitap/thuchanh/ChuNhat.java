/*
 * xây dựng lớp ChuNhat gồm 2 thuộc tính dai và rong
 * phương thức : getChuVi(), getDienTich, xuat() 			tính chuvi, diện tích, xuất dài, rộng, chu vi, diện tích
 * 
 * */

package baitap.thuchanh;

public class ChuNhat {
	protected double dai, rong;

	public ChuNhat() {
		
	}
	
	public ChuNhat(double dai, double rong) {
		this.rong=rong;
		this.dai=dai;
	}
	
	public double getChuVi() {
		return (this.dai + this.rong) * 2;
	}

	public double getDienTich() {
		return this.dai * this.rong;
	}

	public void xuat() {
		System.out.println("Dai: " + this.dai);
		System.out.println("Rong: " + this.rong);
		System.out.println("Chu vi: " + getChuVi());
		System.out.println("Dien tich: " + getDienTich());
	}
}
