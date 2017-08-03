package baitap.thuchanh;

import java.util.*;
import java.lang.*;

public class QLSV {
	public static void main(String[] args) {

		ArrayList<SinhVienPoly> sv = new ArrayList<SinhVienPoly>(); // danh sach sinh vien

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Nhap danh sach sinh vien");
		System.out.println("2. Xuat thong tin danh sach sinh vien");
		System.out.println("3. Xuat danh sach sinh vien hoc luc gioi");
		System.out.println("4. Sap xep danh sach sinh vien theo diem");
		System.out.println("5. Ket thuc");
		System.out.print("Chon chuc nang: ");

		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			int n; // so luong sinh vien can nhap

			System.out.print("Nhap so luong sinh vien it can nhap: ");
			n = sc.nextInt();

			// nhap danh sach sinh vien it
			for (int i = 0; i < n; i++) {
				SinhVienPoly temp = new SinhVienIt("Nguyen dang binh", 6, 7, 8);
				temp.nhap();
				sv.add(temp);
			}

			System.out.print("Nhap so luong sinh vien biz can nhap: ");
			n = sc.nextInt();

			// nhap danh sach sinh vien biz
			for (int i = 0; i < n; i++) {
				SinhVienPoly temp = new SinhVienBiz("", 0, 0);
				temp.nhap();
				sv.add(temp);
			}
		case 2:
			System.out.println("Danh sach sinh vien ");
			for (SinhVienPoly x : sv) {
				x.xuat();
			}
		case 3:
			System.out.println("Danh sach sinh vien hoc luc gioi");
			for (SinhVienPoly x : sv) {
				if(x.getDiem()>=7.5&&x.getDiem()<9) {
					x.xuat();
				}
			}
		case 4:
			System.out.println("Danh sach sau khi sap xep");
			for(int i=0;i<sv.size()-1;i++) {
				for(int j=i+1;j<sv.size();j++) {
					if(sv.get(i).getDiem()>sv.get(j).getDiem()) {
						Collections.swap(sv, i, j);
					}
				}
			}
			for (SinhVienPoly x : sv) {
				x.xuat();
			}
		}

	}
}
