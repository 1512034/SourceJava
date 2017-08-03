
/*
 * Xây dựng lớp Vuong kế thừa lớp ChuNhat
 * ghi đè phương thức xuat() để xuất thông tin cạnh, chu vi, diên tích
 * 
 * */

package baitap.thuchanh;

public class Vuong extends ChuNhat {
	public Vuong(double canh) {
		super(canh,canh);
	}
	
	public void xuat() {
		System.out.println("Canh : "+super.dai);
		System.out.println("Chu vi: "+super.getChuVi());
		System.out.println("Dien tich: "+super.getDienTich());
	}

}
