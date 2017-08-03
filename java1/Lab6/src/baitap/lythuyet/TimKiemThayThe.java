package baitap.lythuyet;

import java.util.*;

public class TimKiemThayThe {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("content: ");
		String content=scanner.nextLine();
		System.out.println("find: ");
		String find=scanner.nextLine();
		System.out.println("replace: ");
		String replace=scanner.nextLine();
		
		String result=content.replaceAll(find, replace);
		
		System.out.println("Result: "+result);
	}
}
