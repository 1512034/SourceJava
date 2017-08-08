package baitap.thuchanh;

public class Bai1 {

	public static void main(String[] args) {
		double t1=sum(1.2,2.1,3.4,5.4);
		System.out.println(t1);
	}

	public static final double sum(double... x) {
		double s = 0;
		for (double a : x) {
			s += a;
		}
		return s;
	}
}
