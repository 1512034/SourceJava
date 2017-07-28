package quanly.sinhvien;

import java.util.*;

public class CauHoi {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Ai đẹp trai nhất");
		a.add("Bình yêu ai nhất");
		a.add("Tổng thống Mỹ là ai");
		a.add("Đi chơi với anh em nhé");
		a.add("Bạn có nhớ nhà không");
		
		Collections.shuffle(a);
		for(String x:a) {
			System.out.println(x);
		}
	}
}
