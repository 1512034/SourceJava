package baitap.lythuyet;

public class NhanVien {
	public String hoTen;
	protected double luong;

	public NhanVien(String hoTen, double luong) {
		this.hoTen = hoTen;
		this.luong = luong;
	}

	public NhanVien() {
		
	}
	
	public void xuat() {
		System.out.println("Ho ten: " + this.hoTen);
		System.out.println("Luong: " + this.luong);
	}

	private double thueThuNhap() {
		return this.luong * 10 / 100;
	}
}
