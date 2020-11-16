import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
 
 
 
 
 
public class Codeforces{
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		int[] chk=new int[n];
		
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			arr[i]=x;
			chk[i]=x;
		}
		
		if(arr.length==2 && arr[0] >arr[1]) {
			System.out.println(1);
			return;
		}
		if(arr.length==2 && arr[0]<=arr[1]) {
			System.out.println(0);
			return;
		}
		
		Arrays.sort(chk);
		boolean isTrue=true;
		
		
		int cnt=0;
		int strt=0;
		for(int i=0;i<n-1;i++) {
				if(arr[i]>arr[i+1]) {
					
				isTrue=false;
				strt=i+1;
				break;
				}
 
		}
		
		if(isTrue) {
			System.out.println(0);
			return;
		}
		
		cnt=0;
		for(int i=strt;i<n;i++) {
			cnt++;
			if(arr[i]!=chk[i-strt]) {
				System.out.println(-1);
				return;
			}
		}
			System.out.println(cnt);
	}
	
}
