package baitap.thuchanh;

abstract public class SinhVienPoly {
	public String hoTen;
	public String nganh;

	public SinhVienPoly(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}

	abstract public double getDiem();
	abstract public void nhap();

	public String getHocLuc() {
		if (getDiem() < 5) {
			return "Yeu";
		} else if (getDiem() < 6.5) {
			return "Trung binh";
		} else if (getDiem() < 7.5) {
			return "Kha";
		} else if (getDiem() < 9) {
			return "gioi";
		}
		return "Xuat sac";
	}
	
	public void xuat() {
		System.out.println("Ho ten: "+this.hoTen);
		System.out.println("Nganh: " +this.nganh);
		System.out.println("Diem: "+this.getDiem());
		System.out.println("Hoc luc: "+this.getHocLuc());
	}
}
