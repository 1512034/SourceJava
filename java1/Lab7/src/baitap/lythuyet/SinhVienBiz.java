package baitap.lythuyet;

public class SinhVienBiz extends SinhVien{
	public double keToan;
	public double marketing;
	public double banHang;
	@Override
	public double getDiemTB()
	{
		return (keToan+marketing+banHang)/3;
	}
	
}
