package quanly.nhanvien;

import java.util.*;

public class QLNV {

	

	// Nhập danh sách sinh viên
	public static void nhapDS(ArrayList<NhanVien> list) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Nhập số nhân viên hành chính: ");
		int hc = sc.nextInt();
		for (int i = 0; i < hc; i++) {
			NhanVien tmp = new NhanVien();
			tmp.nhap();
			list.add(tmp);
		}

		System.out.println("Nhập số nhân viên tiếp thị: ");
		int tt = sc.nextInt();
		for (int i = 0; i < tt; i++) {
			NhanVien tmp = new TiepThi();
			tmp.nhap();
			list.add(tmp);
		}

		System.out.println("Nhập số nhân viên trưởng phòng: ");
		int tp = sc.nextInt();
		for (int i = 0; i < tp; i++) {
			NhanVien tmp = new TruongPhong();
			tmp.nhap();
			list.add(tmp);
		}
	}

	// Xuất danh sách nhân viên ra màn hình
	public static void xuatDS(ArrayList<NhanVien> list) {
		for (NhanVien a : list) {
			System.out.println(a.getName());
		}
	}

	// tìm nhân viên theo mã
	public static void timMa(ArrayList<NhanVien> list) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập mã nhân viên cần tìm: ");
		String findID = sc.nextLine();

		for (NhanVien a : list) {
			if (findID.equals(a.getID())) {
				a.xuat();
			}
		}
	}

	// Xóa nhân viên theo mã
	public static void xoaMa(ArrayList<NhanVien> list) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập mã nhân viên cần xóa: ");
		String findID = sc.nextLine();

		for(int i=0;i<list.size();i++) {
			if (findID.equals(list.get(i).getID())) {
				list.remove(i);
			}
		}
	}

	// Cập nhật nhân viên theo mã
	public static void capNhatMa(ArrayList<NhanVien> list) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập mã nhân viên cần cập nhật: ");
		String findID = sc.nextLine();

		for (int i = 0; i < list.size(); i++) {
			if (findID.equals(list.get(i).getID())) {
				System.out.println("Bạn muốn nhập loại nhân viên nào: ");
				System.out.println("1. Nhân viên hành chính");
				System.out.println("2. Nhân viên tiếp thị");
				System.out.println("3. Trưởng phòng");
				System.out.print("Chọn chức năng: ");
				int cn = sc.nextInt();

				switch (cn) {
				case 1: {
					NhanVien a = new NhanVien();
					a.nhap();
					list.set(i, a);
					break;
				}
				case 2: {
					NhanVien a = new TiepThi();
					a.nhap();
					list.set(i, a);
					break;
				}
				case 3: {
					NhanVien a = new TruongPhong();
					a.nhap();
					list.set(i, a);
					break;
				}
				}
			}
		}
	}

	// tìm các nhân viên theo khoảng lương
	public static void timLuong(ArrayList<NhanVien> list) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập lương tối thiểu: ");
		double min = sc.nextDouble();
		System.out.print("Nhập lương tối đa: ");
		double max = sc.nextDouble();

		for (NhanVien a : list) {
			if (a.getSalary() >= min && a.getSalary() <= max) {
				a.xuat();
			}
		}
	}

	// Sắp xếp nhân viên theo họ tên
	public static void sapXepHoTen(ArrayList<NhanVien> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getName().compareToIgnoreCase(list.get(j).getName()) == 1) {
					Collections.swap(list, i, j);
				}
			}
		}
	}

	// Sắp xếp nhân viên theo thu nhập
	public static void sapXepThuNhap(ArrayList<NhanVien> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getThuNhap() > list.get(j).getThuNhap()) {
					Collections.swap(list, i, j);
				}
			}
		}
	}

	// Xuất 5 nhân viên thu nhập cao nhất
	public static void fiveNVCaoNhat(ArrayList<NhanVien> list) {

		int length = list.size();
		for (int i = (length - 1); i >= length - 6; i--) {
			System.out.println(list.get(i).getName());
		}

	}

	//
	public static void main(String[] args) {

		int loop = 1;
		
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		
		do {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Nhập danh sách nhân viên");
		System.out.println("2. Xuất danh sách nhân viên");
		System.out.println("3. Tìm và hiển thị nhân viên theo mã");
		System.out.println("4. Xóa nhân viên theo mã");
		System.out.println("5. Cập nhật thông tin nhân viên theo mã");
		System.out.println("6. Tìm các nhân viên theo khoảng lương");
		System.out.println("7. Sắp xếp nhân viên theo họ tên");
		System.out.println("8. sắp xếp nhân viên theo thu nhập");
		System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
		System.out.print("Chọn chức năng: ");

		int cn; // lưu giữ chức năng chọn
		cn = sc.nextInt();

			switch (cn) {
			case 1:
				System.out.println("Mời bạn nhập danh sách nhân viên");
				nhapDS(list);
				break;
			case 2:
				System.out.println("Danh sách nhân viên: ");
				xuatDS(list);
				break;
			case 3:
				System.out.println("Tìm và hiển thị nhân viên theo mã");
				timMa(list);
				break;
			case 4:
				System.out.println("Xóa nhân viên theo mã");
				xoaMa(list);
				break;
			case 5:
				System.out.println("Cập nhật nhân viên theo mã");
				capNhatMa(list);
				break;
			case 6:
				System.out.println("Tìm các nhân viên theo khoảng lương");
				timLuong(list);
				break;
			case 7:
				System.out.println("Sắp xếp nhân viên theo họ tên");
				sapXepHoTen(list);
				break;
			case 8:
				System.out.println("sắp xếp nhân viên theo thu nhập");
				sapXepThuNhap(list);
				break;
			case 9:
				System.out.println("Xuất 5 nhân viên có thu nhập cao nhất");
				sapXepThuNhap(list);
				fiveNVCaoNhat(list);
				break;
			}

			System.out.print("bạn có muốn quay lại chương trình không Y/N 1/0: ");
			loop = sc.nextInt();
			
		} while (loop == 1);

	}
}
