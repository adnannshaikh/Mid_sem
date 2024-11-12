package searching_Techniques;
import java.util.*;
public class LinearSearch {
	
	
	public static int linearSearch(int[] a,int target) {
		for(int i = 0;i<a.length;i++) {
			if(a[i]==target)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[],target,n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		n = sc.nextInt();
		
		a = new int[n];
		
		for(i=0;i<n;i++) {
			System.out.println("Enter the element:");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the value to find:");
		n = sc.nextInt();
		
		int result = linearSearch(a,n);
		
		if(result != -1) {
			System.out.println("Key found at index:"+result);
		}else {
			System.out.println("Key not found");
		}
		
	}

}
