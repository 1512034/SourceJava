package baitap.lythuyet;

public class TruongPhong extends NhanVien {
	public double trachNhiem;

	public TruongPhong(String hoTen, double luong, double trachNhiem) {
		super.hoTen = hoTen;
		super.luong = luong;
		this.trachNhiem = trachNhiem;
	}

	public void xuat() {
		System.out.println("Ho ten: " + super.hoTen);
		System.out.println("Luong : " + super.luong);
		super.xuat();
		System.out.println("trach nhiem : " + this.trachNhiem);
	}
}
