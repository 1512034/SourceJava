package baitap.thuchanh;

import java.util.*;

public class SinhVienIt extends SinhVienPoly {

	public double diemJava;
	public double diemHtml;
	public double diemCss;
	
	@Override
	public void nhap() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("nhap ten: ");
		super.hoTen=s.nextLine();
		System.out.print("nhap diem java: ");
		this.diemJava=s.nextDouble();
		System.out.print("nhap diem html: ");
		this.diemHtml=s.nextDouble();
		System.out.print("nhap diem css: ");
		this.diemCss=s.nextDouble();
		this.nganh="IT";
	}
	
	public double getDiem() {
		return (2*diemJava+diemHtml+diemCss)/4;
	}
	
	public SinhVienIt(String hoTen, double diemJava, double diemHtml, double diemCss) {
		super(hoTen, "IT");
		this.diemJava=diemJava;
		this.diemCss=diemCss;
		this.diemHtml=diemHtml;
	}

}
