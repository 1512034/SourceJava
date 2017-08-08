package baitap.lythuyet;

public class Demo {
	public static void main(String[] args) {

		MyClass o = new MyClass();
		int t1 = o.x += 300;

		int t2 = MyClass.x += 500;
		
		System.out.println(t1);
		System.out.println(t2);
		
		MyClass.method();

		int s1 = sum(2, 7);
		int s2 = sum(2, 3, 4, 5, 87);
		System.out.print(s1);
		System.out.print(s2);

		String st2 = mergeString("binh", "hoi");
		String st1 = mergeString("Toi yeu ", "hang", "Nhieu lam");

		System.out.println(st2);
		System.out.println(st1);

	}

	public static int sum(int... x) {
		int s = 0;
		for (int a : x) {
			s += a;
		}
		return s;
	}

	public static String mergeString(String... s) {
		String temp = "";
		for (String a : s) {
			temp += a;
		}
		return temp;
	}
}
