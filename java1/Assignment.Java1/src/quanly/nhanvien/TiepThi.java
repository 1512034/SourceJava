package quanly.nhanvien;

public class TiepThi extends NhanVien{
	protected double doanhSo;
	protected double hoaHong;
	
	public void nhap() {		//nhập thông tin tiếp thị
		System.out.print("Nhap ho ten nhan vien: ");
		super.fullName=sc.nextLine();
		System.out.print("Nhap ma nhan vien: ");
		super.id=sc.nextLine();
		System.out.print("Nhap luong: ");
		super.salary=sc.nextDouble();
		System.out.print("Nhap doanh so: ");
		this.doanhSo=sc.nextDouble();
		System.out.print("Nhap hoa hong: ");
		this.hoaHong=sc.nextDouble();	
	}
	
	public void xuat() {		//xuất thông tin trưởng phòng
		System.out.println("Ho va ten: "+this.fullName);
		System.out.println("Ma nhan vien: "+this.id);
		System.out.println("Luong: "+this.salary);
		System.out.println("Hoa hong: "+this.hoaHong);
		System.out.println("Doanh so: "+this.doanhSo);
	}
	
	
	
	//	get thu nhập nhân viên tiếp thị
	public double getThuNhap() {
		return super.salary+this.doanhSo+this.hoaHong;
	}
	
	//	khởi tạo tiep thị
	public TiepThi(String id,String fullName,double salary, double doanhSo, double hoaHong) {
		super(id,fullName,salary);
		this.doanhSo=doanhSo;
		this.hoaHong=hoaHong;
	}
	
	public TiepThi() {
		super();
		this.doanhSo=0;
		this.hoaHong=0;
	}
}
