package baitap;

import java.util.*;

public class Bai2 {
	public static void main(String[] args) {

		// nhập số lượng
		int n;
		System.out.print("Nhập số lượng số thực của danh sách: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		s.nextLine();

		ArrayList<String> fullName = new ArrayList<String>();

		// nhập danh sách họ tên

		for (int i = 0; i < n; i++) {
			System.out.print("Nhap họ tên: ");
			String temp;
			temp = s.nextLine();
			fullName.add(temp);
		}

		for (String x : fullName) // xuất
		{
			System.out.print(x + " ");
		}

		Collections.shuffle(fullName);

		System.out.println("Danh sách sau khi xáo");
		for (String x : fullName) // xuất
		{
			System.out.print(x + " ");
		}
		System.out.println();

		// sap xep
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};

		Collections.sort(fullName, comp);

		System.out.println("Danh sách sau khi sắp xếp");
		for (String x : fullName) // xuất
		{
			System.out.print(x + " ");
		}
		System.out.println();

		// xoa ten

		System.out.print("Nhập tên cần xóa: ");
		String tenXoa = s.nextLine();
		for (int i = 0; i < fullName.size(); i++) {
			if (tenXoa.equals(fullName.get(i))) {
				fullName.remove(i);
			}
		}

		System.out.println("Danh sách sau khi xóa");
		for (String x : fullName) // xuất
		{
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
