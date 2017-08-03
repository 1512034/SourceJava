package baitap.lythuyet;

import java.util.*;

public class StringNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input string of number: ");
		String content = scanner.nextLine();

		String[] daySo=content.split(",");
		for(String x:daySo)
		{
			int so=Integer.parseInt(x);
			if(so%2==0)
			{
				System.out.println(so);
			}
		}
	}
}
