package Bai2;

import java.util.Scanner;
import java.lang.Math;

public class Bai2 {
	public static void main(String[] args) {
		
		double dai,rong;
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Nhập chiều rộng: ");
		rong=s.nextDouble();
		System.out.print("Nhập chiều dài: ");
		dai=s.nextDouble();
		
		double cv=(dai+rong)*2;
		double dt=dai*rong;
		double min=Math.min(dai,rong);
		
		System.out.println("Chu vi HCN: "+cv);
		System.out.println("Diện tích HCN: "+dt);
		System.out.println("Cạnh nhỏ nhất: "+min);
		
		s.close();
		
	}
}
