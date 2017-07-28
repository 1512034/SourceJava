package quanly.sinhvien;

import java.util.*;

public class SinhVien {
	private String fullName;
	private double mark;
	
	public void Nhap() {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Input Full Name: ");
		this.fullName=s.nextLine();
		System.out.print("Input mark: ");
		this.mark=s.nextDouble();
	}
	
	public void Xuat() {
		System.out.println("Full name: "+this.fullName);
		System.out.println("Mark: "+this.mark);
	}
	
	public String getFullName() {
		return this.fullName;
	}
	
	public double getMark() {
		return this.mark;
	}
	
	public SinhVien() {
		this.fullName="No name";
		this.mark=0;
		
	}
	
}
