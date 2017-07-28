package baitap;

import java.util.*;

public class Bai3 {
	public static void main(String[] args) {
		System.out.println("1. Nhập danh sách sản phẩm");
		System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
		System.out.println("3. Tìm và xóa sản phẩm theo tên từ bàn phím");
		System.out.println("4. Xuất giá trung bình của các sản phẩm");
		System.out.print("Nhập chức năng: ");

		Scanner s = new Scanner(System.in);
		int cn;
		cn = s.nextInt();

		ArrayList<SanPham> sp = new ArrayList<SanPham>();

		switch (cn) {
		case 1:
			nhapDS(sp);
			xuatDS(sp);
		case 2:
			System.out.println("Danh sách sau sắp xếp: ");
			sapXepGia(sp);
			xuatDS(sp);
		case 3:
			timXoa(sp);
			System.out.println("Danh sách sau xóa: ");
			xuatDS(sp);
		case 4:
			double giaTB = tinhGiaTB(sp);
			System.out.print("Giá cả trung bình: " + giaTB);

		}
	}

	public static void nhapDS(ArrayList<SanPham> sp) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập số lượng sản phẩm: ");
		n = s.nextInt();

		for (int i = 0; i < n; i++) {
			SanPham temp = new SanPham();
			temp.nhap();
			sp.add(temp);
		}
	}

	public static void xuatDS(ArrayList<SanPham> sp) {
		for (SanPham x : sp) {
			x.xuat();
		}
	}

	public static void sapXepGia(ArrayList<SanPham> sp) {
		Comparator<SanPham> comp = new Comparator<SanPham>() {
			@Override
			public int compare(SanPham o1, SanPham o2) {
				if (o1.getGia() == o2.getGia())
					return 0;
				if (o1.getGia() < o2.getGia())
					return -1;
				return 1;
			}
		};
		Collections.sort(sp, comp);
	}

	public static void timXoa(ArrayList<SanPham> sp) {

		Scanner s = new Scanner(System.in);

		String temp = new String();
		System.out.print("Nhập tên sản phẩm cần xóa: ");
		temp = s.nextLine();

		for (int i = 0; i < sp.size(); i++) {
			if (temp.compareTo(sp.get(i).getName()) == 0) {
				sp.remove(i);
			}

		}
	}

	public static double tinhGiaTB(ArrayList<SanPham> sp) {
		int tong = 0;
		for (SanPham x : sp) {
			tong += x.getGia();
		}
		return tong * 1.0 / sp.size();
	}
}
