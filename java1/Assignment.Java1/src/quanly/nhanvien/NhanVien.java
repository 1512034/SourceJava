package quanly.nhanvien;

import java.util.*;

public class NhanVien {
	protected String id;
	protected String fullName;
	protected double salary;
	
	Scanner sc=new Scanner(System.in);
	
	public void nhap() {
		System.out.print("Nhap ho ten nhan vien: ");
		this.fullName=sc.nextLine();
		System.out.print("Nhap ma nhan vien: ");
		this.id=sc.nextLine();
		System.out.print("Nhap luong: ");
		this.salary=sc.nextDouble();
	}
	
	public void xuat() {
		System.out.println("Ho va ten: "+this.fullName);
		System.out.println("Ma nhan vien: "+this.id);
		System.out.println("Luong: "+this.salary);
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
