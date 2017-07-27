package BaiTap;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Nhập số học sinh cần nhập: ");

		int n = Integer.parseInt(s.nextLine());

		String[] Name = new String[n];
		double[] Mark = new double[n];
		String temp = s.nextLine();
		// Nhập tên và điểm
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập họ và tên học sinh thứ " + (i + 1) + ": ");
			Name[i] = s.nextLine();
			System.out.print("Nhập điểm học sinh thứ " + (i + 1) + ": ");
			Mark[i] = Double.parseDouble(s.nextLine());
		}

		// xuất 2 mảng vừa nhập kèm học lực
		for (int i = 0; i < n; i++) {
			System.out.println("Họ tên: " + Name[i]);
			System.out.println("Điểm: " + Mark[i]);
			if (Mark[i] < 5)
				System.out.println("Học lực: Yếu");
			else if (Mark[i] >= 5 && Mark[i] < 6.5)
				System.out.println("Học lực: Trung bình");
			else if (Mark[i] >= 6.5 && Mark[i] < 7.5)
				System.out.println("Học lực: Khá");
			else if (Mark[i] >= 7.5 && Mark[i] < 9)
				System.out.println("Học lực: Giỏi");
			else if (Mark[i] >= 9)
				System.out.println("Học lực: Xuất sắc");
		}

		// sap xep sv theo diem tang dan
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Mark[i] > Mark[j]) {
					double temp1 = Mark[i];
					Mark[i] = Mark[j];
					Mark[j] = temp1;

					String temp2 = Name[i];
					Name[i] = Name[j];
					Name[j] = temp2;
				}
			}
		}

		System.out.println("Học sinh theo thứ tự điểm: ");
		for (int i = 0; i < n; i++) {
			System.out.print(Name[i] + " ");

		}
	}
}
