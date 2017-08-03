package baitap.lythuyet;

import java.util.*;

public class PhoneNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Nhập số điện thoai: ");
		String phoneNumber=scanner.nextLine();
		
		String pattern="0[0-9]{9,10}";
		if(phoneNumber.matches(pattern)) {
			System.out.println("Bạn đã nhập đúng số mobile");
		}
		else {
			System.out.println("Bạn đã sai số mobile");
		}
		
		System.out.print("Nhập địa chỉ email: ");
		String email=scanner.nextLine();
		
		String reEmail="\\w+@\\w+\\.\\w+";
		
		if(!email.matches(reEmail)) {
			System.out.println("Email khong hop le");
		}
		
		System.out.print("Nhập số điện thoại Quảng Trị: ");
		String qtPhone=scanner.nextLine();
		
		String reQTPhone="0533\\d{6}";
		
		if(!qtPhone.matches(reQTPhone)) {
			System.out.println("Bạn đã nhập sai số");
		}
		
	}
}
