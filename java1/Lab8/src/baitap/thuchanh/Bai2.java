package baitap.thuchanh;

public class Bai2 {
	public static void main(String[] args) {
		double m1 = min(5.3, 6.1, 2.5);
		System.out.println("Min: " + m1);
		double m2 = max(3.4, 1.2, 7.5);
		System.out.println("Max: " + m2);
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
}
