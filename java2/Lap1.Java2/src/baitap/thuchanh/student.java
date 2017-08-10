package baitap.thuchanh;

import java.util.Scanner;

public class student extends person{
	private int mark;
	private String grade;
	
	//get mark
	public int getMark() {
		return this.mark;
	}
	
	//get grade
	public String getGrade() {
		return this.grade;
	}
	
	//set mark
	public void setMark(int mark) {
		this.mark=mark;
	}
	
	// tính grade
	public void calGrade() {
		if(this.mark>=8) {
			this.grade="distinction";
			return;
		}
		if(this.mark>=7) {
			this.grade="credit";
			return;
		}
		if(this.mark>=5) {
			this.grade="pass";
			return;
		}
		if(this.mark>=0) {
			this.grade="fail";
			return;
		}
	}
	
	//constructor
	public student() {
		super();
		this.mark=0;
		this.grade="";
	}
	
	// nhập thong tin student
	public void input() {
		super.input();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Nhập mark: ");
		this.mark=sc.nextInt();
		
		this.calGrade();
	}
	
	// xuất thông tin student
	public void display() {
		super.display();
		System.out.println("Mark: "+this.mark);
		
		System.out.println("Grade: "+this.grade);
	}
	
	// hàm main
	public static void main(String[] args) {
		student a=new student();
		
		a.input();
		a.display();
	}
}
