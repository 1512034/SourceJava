package baitap.lythuyet;

import java.util.*;

public class SinhVien {
	public static void main(String[] args) {

		System.out.println("Nhập mảng tên sinh viên ");
		int n;
		System.out.print("Nhập số phần tử: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		s.nextLine();

		String[] sinhVien = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập tên sinh viên thứ " + (i + 1) + ": ");
			sinhVien[i] = s.nextLine();
		}

		System.out.println("Danh sách sinh viên vừa nhập");
		for (String x : sinhVien) {
			System.out.println(x);
		}

		System.out.println("Những sinh viên họ Nguyễn hoặc tên Tuấn hoặc tên lot Mỹ");
		for (String x : sinhVien) {
			if (x.startsWith("Nguyễn") || x.endsWith("Tuấn") || x.contains("Mỹ")) {
				System.out.println(x.toUpperCase());
			}
		}
	}
}
