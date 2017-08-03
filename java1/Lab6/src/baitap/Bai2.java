package baitap;

import java.util.*;

public class Bai2 {
	public static void main(String[] args) {
		ArrayList<SanPham> a = new ArrayList<SanPham>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Nhap sp thu " + (i + 1));
			SanPham temp=new SanPham();
			temp.nhap();
			a.add(temp);
		}
		for(SanPham x:a) {
			if(x.getMaker().equalsIgnoreCase("nokia")){
				x.xuat();
			}
		}
	}
}

class SanPham {
	private String name, cost, maker;

	public void nhap() {
		Scanner s = new Scanner(System.in);

		System.out.print("Nhap ten sp: ");
		this.name = s.nextLine();
		System.out.print("Nhap gia sp: ");
		this.cost = s.nextLine();
		System.out.print("Nhap hang sx sp: ");
		this.maker = s.nextLine();
	}
	
	public void xuat() {
		System.out.println("Name sp: "+this.name);
		System.out.println("Cost sp: "+this.cost);
		System.out.println("Maker sp: "+this.maker);
	}
	
	public String getMaker() {
		return this.maker;
	}
	
	public SanPham(String name, String cost, String maker) {
		this.name = name;
		this.cost = cost;
		this.maker = maker;
	}

	public SanPham() {
		this.name = "";
		this.cost = "";
		this.maker = "";
	}
}