package baitap.lythuyet;

import java.util.*;

public class NhanVien {

	public static void main(String[] args) {
		String reCode = "[A-Z]{5}";
		String rePass = ".{6}";
		String reFullName = "\\w\\D+";
		String reEmail = "\\w+@\\w+\\.\\w+";
		String reTel = "083\\d{7}";
		String reLicensePlate = "5\\d-[A-Z]-((\\d{4})|(\\d{3}\\.{2}))";
		String reID = "\\d{10}";
		String reWeb = "http://www\\.\\w+\\.\\w+";

		String code, pass, fullName, email, tel, licensePlate, id, web;

		Scanner s = new Scanner(System.in);

		System.out.print("Nhập mã nhân viên: ");
		code = s.nextLine();

		System.out.print("Nhập mật khẩu: ");
		pass = s.nextLine();

		System.out.print("Nhập họ và tên nhân viên: ");
		fullName = s.nextLine();

		System.out.print("Nhập email: ");
		email = s.nextLine();

		System.out.print("Nhập số điện thoại: ");
		tel = s.nextLine();

		System.out.print("Nhập biển số xe: ");
		licensePlate = s.nextLine();

		System.out.print("Nhập CMND: ");
		id = s.nextLine();

		System.out.print("Nhập website: ");
		web = s.nextLine();

		if (!code.matches(reCode)) {
			System.out.println("Mã nhân viên không đúng");
		}
		if (!pass.matches(rePass)) {
			System.out.println("Mật khẩu không đúng");
		}
		if (!fullName.matches(reFullName)) {
			System.out.println("Họ và tên nhân viên không đúng");
		}
		if (!email.matches(reEmail)) {
			System.out.println("Email nhân viên không đúng");
		}
		if (!tel.matches(reTel)) {
			System.out.println("SDT nhân viên không đúng");
		}
		if (!licensePlate.matches(reLicensePlate)) {
			System.out.println("Biển số nhân viên không đúng");
		}
		if (!id.matches(reID)) {
			System.out.println("CMND nhân viên không đúng");
		}
		if (!web.matches(reWeb)) {
			System.out.println("website nhân viên không đúng");
		}
	}
}
