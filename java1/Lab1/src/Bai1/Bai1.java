package Bai1;
import java.util.*;
public class Bai1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

		System.out.print("Input Your fullname: ");
		String FullName=s.nextLine();
		System.out.println("Input you Average: ");
		double Average=s.nextDouble();
		System.out.println(FullName+" "+Average+" diem");
		
		s.close();
	}
}
