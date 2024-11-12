package searching_Techniques;
import java.util.*;
public class RecursiveBinarySearch {

	public static int PBS(int a[],int target,int low,int high) {

		if(low>high) {
			return -1;
		}
		
		int mid = (low+high)/2;
		
		if(a[mid]==target) {
			return mid;
		}
		else if(target > a[mid]){
			return PBS(a,target,mid + 1,high);
		}
		else {
			return PBS(a,target,low,mid - 1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,a[],target;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array:");
		n = sc.nextInt();
		
		a = new int[n];
		
		for(i=0;i<n;i++) {
			System.out.println("Enter the elements of the array:");
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println("Enter the target");
		target = sc.nextInt();
		
		int result = PBS(a,target,0,a.length-1);
		
		if(result != -1) {
			System.out.println("The element is found at index:"+result);
		}else {
			System.out.println("No element found");
		}
	}

}
