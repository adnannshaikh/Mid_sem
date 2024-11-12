package searching_Techniques;
import java.util.*;
public class BInarySearch {
	
	public static int BinarySearch(int[] a,int target) {
		Arrays.sort(a);
		int low=0,high=a.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(target == a[mid])
				return mid;
			else if(target>a[mid]) {
				low = mid + 1;
			}
			else if(target < a[mid]) {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,a[],target;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		n = sc.nextInt();

		a = new int[n];
		
		for(i=0;i<n;i++) {
			System.out.println("Enter the array elements:");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the target element:");
		n = sc.nextInt();
		
		int result = BinarySearch(a,n);
	
		if(result != -1) {
			System.out.println("Element is found at index:"+result);
		}else {
			System.out.println("No element found");
		}
	
	
	}

}
