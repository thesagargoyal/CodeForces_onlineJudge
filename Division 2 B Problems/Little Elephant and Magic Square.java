import java.util.*;
public class Example{
 
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		long[][] arr=new long[3][3];
		
		long sum1=0;
		long sum2=0;
		long sum3=0;
		
		for(int i=0;i<3;i++) {
			
			
			arr[i][0]=sc.nextLong();
			arr[i][1]=sc.nextLong();
			arr[i][2]=sc.nextLong();
			
			sum1+=arr[i][0];
			sum2+=arr[i][1];
			sum3+=arr[i][2];
		}
		
		long max=Math.max(sum1, sum2);
		max=Math.max(max,sum3);
		
		max+=1;
		
		long x=0;
		long y=0;
		long z=0;
		
		while(true) {
			
			x=max-sum1;
			y=max-sum2;
			z=max-sum3;
			
			if(x+y+z==max) {
				break;
			}
			else {
				max+=1;
			}
			
		}
		
		arr[0][0]=x;
		arr[1][1]=y;
		arr[2][2]=z;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
