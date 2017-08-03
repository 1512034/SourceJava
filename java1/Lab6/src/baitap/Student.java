package baitap;

import java.util.*;

public class Student {
	private String fullName; // full name
	private String phoneNumber; // phone number
	private String email; // email address

	public static void main(String[] args) {
		ArrayList<Student> st=new ArrayList<Student>();
		
		for(int i=0;i<5;i++) {
			Student temp=new Student();
			temp.input();
			st.add(temp);
		}
		
		for(int i=0;i<st.size();i++) {
			st.get(i).output();
		}
		
	}
	// construct a new student with given fields
	public Student(String fullName, String phoneNumber, String email) {
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public Student() {
		this.fullName="";
		this.phoneNumber="";
		this.email="";
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);

		String reFullName = "\\w\\D+";
		String rePhone = "0\\d{9,10}";
		String reEmail = "\\w+@\\w+\\.\\w+";

		System.out.print("Enter name: ");
		this.fullName = scanner.nextLine();
		if (!this.fullName.matches(reFullName)) {
			System.out.println("false name");
		}

		System.out.print("Enter phone number: ");
		this.phoneNumber = scanner.nextLine();
		if (!this.phoneNumber.matches(rePhone)) {
			System.out.println("false phone number ");
		}

		System.out.print("Enter email: ");
		this.email = scanner.nextLine();
		if (!this.email.matches(reEmail)) {
			System.out.println("false email "+this.email
					);
		}
		
	}

	public void output() {
		System.out.println(this.fullName + "\t" + this.phoneNumber + "\t" + this.email);
	}

}
