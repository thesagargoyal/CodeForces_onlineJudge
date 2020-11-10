import java.util.*;
public class Example{
 
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		long n=sc.nextLong();
		long k=sc.nextLong();
		
		long arr[] = new long[(int)k];
		
		
		
		if(k==0) {
			System.out.println("YES");
			return;
		}
		
		for(int i=0;i<k;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(arr[0]==1 || arr[(int)k-1]==n) {
			System.out.println("NO");
		} else {
			
 
			
			
			for(int i=0;i<k-2;i++) {
				
				if(arr[i+2]==arr[i]+2) {
					System.out.println("NO");
					return;
				}
				
			}
			System.out.println("YES");
			
		}
		
	}
	
}
