package baitap.lythuyet;

public class Sort {
	public static void main(String[] args) {
		int[] a= {5,4,3,12};
		sort(a,0);
		for(int x:a) {
			System.out.println(x);
		}
			
	}
	
	public static void sort(int[] a, int i) {
		if(i>a.length) {
			return;
		}
		
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int tmp=a[i];
				a[i]=a[j];
				a[j]=tmp;
			}
		}
		sort(a,i+1);
	}
}
