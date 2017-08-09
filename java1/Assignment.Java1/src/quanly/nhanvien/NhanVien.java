package quanly.nhanvien;

import java.util.*;

public class NhanVien {
	protected String id;
	protected String fullName;
	protected double salary;
	
	Scanner sc=new Scanner(System.in);
	
	public void nhap() {				
		System.out.print("Nhập họ tên nhân viên: ");
		this.fullName=sc.nextLine();
		System.out.print("Nhập mã nhân viên: ");
		this.id=sc.nextLine();
		System.out.print("Nhập lương: ");
		this.salary=sc.nextDouble();
	}
	
	public void xuat() {
		System.out.println("Họ và tên: "+this.fullName);
		System.out.println("Mã: "+this.id);
		System.out.println("Lương: "+this.salary);
	}
	
	public String getName() {
		return this.fullName;
	}
	
	public String getID() {
		return this.id;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public double getThuNhap() {
		return this.salary;
	}
	
	public double getThueTN() {
		if(getThuNhap()<9000000)
			return 0;
		else if(getThuNhap()<15000000)
			return getThuNhap()*10/100;
		return getThuNhap()*12/100;
	}
	
	public NhanVien() {
		this.id="";
		this.fullName="";
		this.salary=0;
	}
	
	public NhanVien(String id, String fullName, double salary) {
		this.id=id;
		this.fullName=fullName;
		this.salary=salary;
	}
	
	
}
