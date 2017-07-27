package Bai3;

import java.util.Scanner;
import java.lang.Math;

public class Bai3 {
	public static void main(String[] args) {
		
		double edge;
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Input edge of the cube: ");
		
		edge=s.nextDouble();
		
		double V=Math.pow(edge, 3);
		
		System.out.println("Volume of cube: "+V);
		
		s.close();
	}
}
