package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {

		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		n = s.nextInt();
		int[] a = new int[n]; // khai báo mảng có n phần tử

		// Nhập các phần tử của mảng
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu a[" + i + "]: ");
			a[i] = s.nextInt();
		}

		// Xuất mảng vừa nhập
		System.out.print("Mang vua nhap: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		// tìm phần tử min
		int min = a[0];
		for (int i = 1; i < n; i++) {
			min = Math.min(min, a[i]);
		}

		System.out.println("Min of arrays: " + min);

		Arrays.sort(a); // Sắp xếp mảng tăng dần

		// Xuất mảng vừa sắp xếp
		System.out.print("Mang vua sắp xếp: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

		int tong = 0;
		int dem = 0;
		for (int i = 0; i < n; i++) { // tính tổng các phần tử chia hết cho 3
			if (a[i] % 3 == 0) {
				tong += a[i];
				dem++;
			}
		}

		System.out.println("Trung bình cộng các số chia hết cho 3: " + tong * 1.0 / dem);

		s.close();
	}
}
