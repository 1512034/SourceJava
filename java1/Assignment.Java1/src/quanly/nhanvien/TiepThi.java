package quanly.nhanvien;

public class TiepThi extends NhanVien {
	protected double doanhSo;
	protected double hoaHong;

	public void nhap() { // nhập thông tin tiếp thị
		System.out.print("Nhập họ tên nhân viên: ");
		super.fullName = sc.nextLine();
		System.out.print("Nhập mã nhân viên: ");
		super.id = sc.nextLine();
		System.out.print("Nhập lương: ");
		super.salary = sc.nextDouble();
		System.out.print("Nhập doanh số: ");
		this.doanhSo = sc.nextDouble();
		System.out.print("Nhập hoa hồng: ");
		this.hoaHong = sc.nextDouble();
	}

	public void xuat() { // xuất thông tin trưởng phòng
		System.out.println("Họ và tên: " + this.fullName);
		System.out.println("Mã: " + this.id);
		System.out.println("Lương: " + this.salary);
		System.out.println("Hoa hồng: " + this.hoaHong);
		System.out.println("Doanh số: " + this.doanhSo);
	}

	// get thu nhập nhân viên tiếp thị
	public double getThuNhap() {
		return super.salary + this.doanhSo + this.hoaHong;
	}

	// constructor(String id, String fullName, double salary, double doanhSo, double hoaHong)
	public TiepThi(String id, String fullName, double salary, double doanhSo, double hoaHong) {
		super(id, fullName, salary);
		this.doanhSo = doanhSo;
		this.hoaHong = hoaHong;
	}

	//	constructor()
	public TiepThi() {
		super();
		this.doanhSo = 0;
		this.hoaHong = 0;
	}
}
