package quanly.nhanvien;

public class TruongPhong extends NhanVien {
	protected double luongTN;

	public void nhap() { // nhập thông tin trưởng phòng
		System.out.print("Nhập họ tên nhân viên: ");
		super.fullName = sc.nextLine();
		System.out.print("Nhập mã nhân viên: ");
		super.id = sc.nextLine();
		System.out.print("Nhập lương: ");
		super.salary = sc.nextDouble();
		System.out.print("Nhập lương trách nhiêm: ");
		this.luongTN = sc.nextDouble();
	}

	public void xuat() { // xuất thông tin trưởng phòng
		System.out.println("Họ và tên: " + this.fullName);
		System.out.println("Mã: " + this.id);
		System.out.println("Lương: " + this.salary);
		System.out.println("Lương trách nhiệm: " + this.luongTN);
	}

	public double getThuNhap() { // ghi đè phương thức get thu nhập trưởng phòng
		return super.salary + this.luongTN;
	}

	// constructor(id, name, salary, luongtn)
	public TruongPhong(String id, String fullName, double salary, double luongTN) {
		super(id, fullName, salary);
		this.luongTN = luongTN;
	}

	// constructor()
	public TruongPhong() {
		super();
		this.luongTN = 0;
	}
}
