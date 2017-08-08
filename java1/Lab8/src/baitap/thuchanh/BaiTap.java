package baitap.thuchanh;

public class BaiTap {
	public static void main(String[] args) {
		double t1 = sum(1.2, 2.1, 3.4, 5.4);
		System.out.println(t1);

		double m1 = min(5.3, 6.1, 2.5);
		System.out.println("Min: " + m1);
		double m2 = max(3.4, 1.2, 7.5);
		System.out.println("Max: " + m2);
		
		String name="nguyen dang binh";
		name=toUpperFirstChar(name);
		System.out.println(name);
	}

	public static final double sum(double... x) {
		double s = 0;
		for (double a : x) {
			s += a;
		}
		return s;
	}

	public static final double min(double... x) {
		double tmin = x[0];
		for (double a : x) {
			if (tmin > a) {
				tmin = a;
			}
		}
		return tmin;
	}

	public static final double max(double... x) {
		double tmax = x[0];
		for (double a : x) {
			if (tmax < a) {
				tmax = a;
			}
		}
		return tmax;
	}
	
	public static String toUpperFirstChar(String s) {
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++) {
			
			char firstChar=words[i].charAt(0);			//	tách tham số theo ký tự trắng
			
			//duyệt các từ trong mảng words, lấy ký tự đàu tiên của mỗi từ với phương thức charAt() và đổi sang ký tự hoa
			char upperFirstChar=String.valueOf(firstChar).toUpperCase().charAt(0);			
			
			//	thay đổi từ củ sang từ đã chuyển sang ký tự hoa
			words[i]=upperFirstChar+words[i].substring(1);
		}
		
		// thực hiện nối mảng các từ thành chuỗi
		String ss=String.join(" ",words);
		return ss;
	}
}
