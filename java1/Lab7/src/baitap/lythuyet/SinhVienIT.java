package baitap.lythuyet;

public class SinhVienIT extends SinhVien {
	public double diemJava;
	public double diemCss;
	@Override 
	public double getDiemTB() {
		return (2*diemJava+diemCss)/3;
	}
}
