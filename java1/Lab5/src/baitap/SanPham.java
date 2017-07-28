package baitap;

import java.util.*;

public class SanPham {
	private String name;
	private int gia;

	public String getName() {
		return this.name;
	}
	
	public int getGia() {
		return this.gia;
	}
	
	public void nhap() {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
		this.name = s.nextLine();
		System.out.print("Nhập giá sản phẩm: ");
		this.gia = s.nextInt();
	}

	public void xuat() {
		System.out.println("Tên sản phẩm: "+this.name);
		System.out.println("Giá sản phẩm: "+this.gia);
	}
}
