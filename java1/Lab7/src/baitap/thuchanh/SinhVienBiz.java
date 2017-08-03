package baitap.thuchanh;

import java.util.*;

public class SinhVienBiz extends SinhVienPoly {

	public double diemMarketing;
	public double diemSales;

	public double getDiem() {
		return (2 * diemMarketing + diemSales) / 3;
	}

	public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
		super(hoTen, "Sale");
		this.diemMarketing=diemMarketing;
		this.diemSales=diemSales;
	}

	@Override
	public void nhap() {
		Scanner s = new Scanner(System.in);

		System.out.print("nhap ten: ");
		super.hoTen = s.nextLine();
		System.out.print("nhap diem marketing: ");
		this.diemMarketing = s.nextDouble();
		System.out.print("nhap diem sale: ");
		this.diemSales = s.nextDouble();
		this.nganh = "Biz";

	}

}
