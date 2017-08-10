package baitap.thuchanh;

import java.util.*;

public class sinhvien {
	private int masv;
	private String hoten;
	private int diem;
	private String xeploai;

	private static final int DIEM = 0;
	private static final String HOTEN = "CHUA_CO_TEN";
	private static final String XEPLOAI = "CHUA_XEP_LOAI";
	private static final int MASV = 0;

	public sinhvien(int masv, String hoten, int diem, String xeploai) {
		this.masv = masv;
		this.hoten = hoten;
		this.diem = diem;
		this.xeploai = xeploai;
	}

	public sinhvien() {
		this(MASV, HOTEN, DIEM, XEPLOAI);
	}

	public int getDiem() {
		return this.diem;
	}

	public String getHoTen() {
		return this.hoten;
	}

	public int getMaSV() {
		return this.masv;
	}

	public String getXepLoai() {
		return this.xeploai;
	}

	public void setMaSV(int masv) {
		this.masv = masv;
	}

	public void setHoTen(String hoten) {
		this.hoten = hoten;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}

	public void setXepLoai(String xeploai) {
		this.xeploai = xeploai;
	}

	public void setXepLoai() {
		if (this.diem >= 8) {
			this.xeploai = "Gioi";
		} else if (this.diem >= 7) {
			this.xeploai = "Kha";
		} else if (this.diem >= 5) {
			this.xeploai = "Trung binh";
		} else {
			this.xeploai = "Yeu";
		}
	}

	public String toString() {
		return this.masv + "\t" + this.hoten + "\t" + this.diem + "\t" + this.xeploai + "\n";
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Nhap ma sinh vien: ");
			this.masv = sc.nextInt();
			sc.nextLine();
			System.out.print("Nhap ho ten sinh vien: ");
			this.hoten = sc.nextLine();
			System.out.println("Nhap diem sinh vien: ");
			this.diem = sc.nextInt();
			this.setXepLoai();
		} catch (InputMismatchException e) {
			System.out.println("Error: " + e.toString());
			System.out.println("sai kieu yeu cau nhap lai");
		}
	}

	public void xuat() {
		System.out.println("Ho ten: " + this.hoten);
		System.out.println("Ma sinh vien: " + this.masv);
		System.out.println("Diem: " + this.diem);
		System.out.println("Xep loai: " + this.xeploai);
	}

	public static void main(String[] args) {
		sinhvien s = new sinhvien();
		System.out.println("Sinh vien: " + s);
		s.nhap();
		System.out.println("sau khi nhap");
		System.out.println(s);
	}
}
