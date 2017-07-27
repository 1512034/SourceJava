package BaiTap;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham();
		
		sp1.setTenSp("dau goi");
		sp1.setDonGia(125000);
		sp1.setGiamGia(12000);
		
		sp2.setTenSp("kem đánh răng");
		sp2.setDonGia(23000);
		sp2.setGiamGia(1000);
		
		
		sp1.xuat();
		sp2.xuat();
	}
}
