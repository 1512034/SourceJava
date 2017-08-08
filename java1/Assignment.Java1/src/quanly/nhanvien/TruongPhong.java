package quanly.nhanvien;

public class TruongPhong extends NhanVien {
	protected double luongTN;
	
	public void nhap() {		//nhập thông tin trưởng phòng
		System.out.print("Nhap ho ten nhan vien: ");
		super.fullName=sc.nextLine();
		System.out.print("Nhap ma nhan vien: ");
		super.id=sc.nextLine();
		System.out.print("Nhap luong: ");
		super.salary=sc.nextDouble();
		System.out.print("Nhap luong trach nhiem: ");
		this.luongTN=sc.nextDouble();
	}
	
	public void xuat() {		//xuất thông tin trưởng phòng
		System.out.println("Ho va ten: "+this.fullName);
		System.out.println("Ma nhan vien: "+this.id);
		System.out.println("Luong: "+this.salary);
		System.out.println("luong trach nhiem: "+this.luongTN);
	}
	
	public double getThuNhap() {	// ghi đè phương thức get thu nhập trưởng phòng
		return super.salary+this.luongTN;
	}
	
	// khởi tạo class TruongPhong
	public TruongPhong(String id,String fullName,double salary, double luongTN) {
		super(id,fullName,salary);
		this.luongTN=luongTN;
	}
	
	public TruongPhong() {
		super();
		this.luongTN=0;
	}
}
