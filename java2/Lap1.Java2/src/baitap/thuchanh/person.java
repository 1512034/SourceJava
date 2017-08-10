package baitap.thuchanh;

import java.util.*;

public class person implements personExample {
	protected String id;
	protected String name;
	protected int age;

	// constructor
	public person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// constructor
	public person() {
		this.id = "";
		this.name = "";
		this.age = 0;
	}

	// get id
	public String getID() {
		return this.id;
	}

	// get name
	public String getName() {
		return this.name;
	}

	// get age
	public int getAge() {
		return this.age;
	}

	// set id
	public void setID(String id) {
		this.id = id;
	}

	// set name
	public void setName(String name) {
		this.name = name;
	}

	// set age
	public void setAge(int age) {
		this.age = age;
	}

	// nhập thong tin person
	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập ID: ");
		this.id = sc.nextLine();
		System.out.print("Nhập name: ");
		this.name = sc.nextLine();
		System.out.print("Nhập age: ");
		this.age = sc.nextInt();
	}

	// xuất thông tin person
	public void display() {
		System.out.println(" ID: " + this.id);

		System.out.println("Name: " + this.name);

		System.out.println("Age: " + this.age);

	}
}
