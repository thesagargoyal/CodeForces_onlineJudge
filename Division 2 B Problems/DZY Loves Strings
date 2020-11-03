                                                                              B. DZY Loves Strings
                                                                          time limit per test1 second
                                                                        memory limit per test256 megabytes
                                                                              inputstandard input
                                                                             outputstandard output
                                                                             
                                                                             
DZY loves collecting special strings which only contain lowercase letters. For each lowercase letter c DZY knows its value wc. For each special string s = s1s2... s|s| (|s| is the length of the string) he represents its value with a function f(s), where


Now DZY has a string s. He wants to insert k lowercase letters into this string in order to get the largest possible value of the resulting string. Can you help him calculate the largest possible value he could get?

Input
The first line contains a single string s (1 ≤ |s| ≤ 103).

The second line contains a single integer k (0 ≤ k ≤ 103).

The third line contains twenty-six integers from wa to wz. Each such number is non-negative and doesn't exceed 1000.

Output
Print a single integer — the largest possible value of the resulting string DZY could get.














import java.util.*;
 
public class uHi {
 
	public static void main(String[] args) 
	{ 
		
				
	    Scanner sc=new Scanner(System.in);
	    
	    String z=sc.nextLine();
	    
	    int n=sc.nextInt();
	    
	    int[] arr=new int[26];
	    
	    int max=0;
	    
	    for(int i=1;i<=26;i++) {
	    	
	    	int x=sc.nextInt();
	    	if(x>=max) {
	    		max=x;
	    	}
	    	arr[i-1]=x;
	    }
	    
 
	    
	    int sum=0;
	    
	    for(int i=0;i<z.length()+n;i++) {
	    	
	    	if(i<z.length()) {
	    		int x=z.charAt(i);
	    		
	    		sum+=(i+1)*arr[x-97];
	    		
	    		
	    	}
	    	else {
	    		sum+=max*(i+1);
	    	}
	    	
	    }
	    System.out.println(sum);
	}
	
}
