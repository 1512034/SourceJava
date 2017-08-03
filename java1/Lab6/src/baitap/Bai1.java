package baitap;

import java.util.*;

public class Bai1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Nhap ho  va ten: ");
		String fullName = s.nextLine();

		System.out.print(fullName.substring(0, fullName.indexOf(" ")).toUpperCase());
		System.out.print(fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" ")));
		System.out.print(fullName.substring(fullName.lastIndexOf(" ")).toUpperCase());

	}
}
