package Bai4;

import java.util.*;
import java.lang.Math;

public class Bai4 {
	public static void main(String[] args) {
		
		double a,b,c;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Input a: ");
		a=s.nextDouble();
		System.out.print("Input b: ");
		b=s.nextDouble();
		System.out.print("Input c: ");
		c=s.nextDouble();
		
		double delta=Math.pow(b, 2)-4*a*c;
		
		System.out.println("Can delta: "+Math.sqrt(delta));
		s.close();
	}
}
