package quanly.sinhvien;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<SinhVien> a = new ArrayList<SinhVien>();

		System.out.println("1. Nhap danh sach sinh vien");
		System.out.println("2. Xuat danh sach sinh vien da nhap");
		System.out.println("3. Xuat danh sach sinh vien theo diem tang dan hoac theo ten(abc)");
		System.out.println("4. Tim sinh vien theo ho ten");
		System.out.println("5. Tim va sua sinh vien theo ho ten");
		System.out.println("6. Tim va xoa sinh vien theo ho ten");
		System.out.println("7. Exit");

		System.out.print(" > > Nhap chuc nang: ");
		int cn;
		Scanner s = new Scanner(System.in);
		cn = s.nextInt();

		switch (cn) {
		case 1:
			nhapDSSV(a);
			break;
		case 2:
			System.out.println("Danh sach sinh vien vua nhap ");
			xuatDSSV(a);
			break;
		case 3:
			nhapDSSV(a);
			xuatDSTheoDiem(a);
			System.out.println("Danh sach sinh vien vua duoc sap xep ");
			xuatDSSV(a);
			break;
		case 4:
			timTen(a);
			break;
		case 5:
			timSua(a);
		case 6:
			timXoa(a);
		case 7:
			break;
		default:
			System.out.println("Chon chuc nang 1,2,3,4...");
			break;
		}

	}

	public static void nhapDSSV(ArrayList<SinhVien> a) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap so sinh vien muon nhap: ");
		n = s.nextInt();

		for (int i = 0; i < n; i++) {
			SinhVien temp = new SinhVien();
			temp.Nhap();
			a.add(temp);
		}

	}

	public static void xuatDSSV(ArrayList<SinhVien> a) {
		for (SinhVien x : a)
			x.Xuat();
	}

	public static void xuatDSTheoDiem(ArrayList<SinhVien> a) {
		//	sap xep dssv theo diem
		Comparator<SinhVien> comp = new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1,SinhVien o2) {
				if(o1.getMark()==o2.getMark())return 0;
				if(o1.getMark()<o2.getMark())return -1;
				return 1;
			}
		};
		Collections.sort(a,comp);
		
		//	sap xep sinh vien theo ten (abc)
		/*
		Comparator<SinhVien> comp=new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1,SinhVien o2) {
				return o1.getFullName().compareTo(o2.getFullName());
			}
		};
		Collections.sort(a,comp);
		*/
	}

	public static void timTen(ArrayList<SinhVien> a) {
		String ten;
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap ho ten sinh vien can tim: ");
		ten = s.nextLine();

		for (SinhVien x : a) {
			if (ten.equals(x.getFullName())) {
				x.Xuat();
			}
		}
	}

	public static void timSua(ArrayList<SinhVien> a) {
		String ten;
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap ho ten sinh vien can tim: ");
		ten = s.nextLine();

		for (int i = 0; i < a.size(); i++) {
			if (ten.equals(a.get(i).getFullName())) {
				System.out.println("Nhập thông tin sinh viên cần sửa");
				SinhVien temp = new SinhVien();
				temp.Nhap();
				a.set(i, temp);
			}
		}
	}

	public static void timXoa(ArrayList<SinhVien> a) {
		String ten;
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap ho ten sinh vien can tim: ");
		ten = s.nextLine();

		for (int i = 0; i < a.size(); i++) {
			if (ten.equals(a.get(i).getFullName())) {
				a.remove(i);
			}
		}
	}

}
