package BaiTap;

import java.util.*;

public class SanPham {
	private String tenSp;
	private int donGia;
	private int giamGia;

	public String getTenSp() {
		return this.tenSp;
	}
	
	public int getDonGia() {
		return this.donGia;
	}
	
	public int getGiamGia() {
		return this.giamGia;
	}
	
	public void setTenSp(String tenSp) {
		this.tenSp=tenSp;
	}
	
	public void setDonGia(int donGia) {
		this.donGia=donGia;
	}
	
	public void setGiamGia(int giamGia) {
		this.giamGia=giamGia;
	}
	
	private double getThueNhapKhau() {
		return donGia * 10 / 100;
	}

	public void xuat() {
		System.out.println("Tên mặt hàng: " + this.tenSp);
		System.out.println("Đơn giá: " + this.donGia);
		System.out.println("Giảm giá: " + this.giamGia);
		System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
	}
	
	public void nhap() {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Nhập tên mặt hàng: ");
		this.tenSp=s.nextLine();
		System.out.print("Nhập đơn giá: ");
		this.donGia=s.nextInt();
		System.out.print("Nhập giảm giá: ");
		this.giamGia=s.nextInt();
	}
	
	public SanPham(String tenSp,int donGia,int giamGia) {
		this.tenSp=tenSp;
		this.donGia=donGia;
		this.giamGia=giamGia;
	}
	
	public SanPham(String tenSp,int donGia) {
		this.tenSp=tenSp;
		this.donGia=donGia;
		this.giamGia=0;
	}

	public SanPham() {
		this.tenSp="";
		this.donGia=0;
		this.giamGia=0;
	}
}
