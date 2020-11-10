import java.util.*;
public class Example{
 
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			char x=s.charAt(i);
			
			if(map.containsKey(x)) {
				map.put(x, map.get(x)+1);
			}
			else {
				map.put(x, 1);
			}
			
		}
		
		
		int even=0;
		int odd=0;
		int one=0;
		for(char x:map.keySet()) {
			int num=map.get(x);
			
			 if(num%2==0)even++;
			
			else odd++;
		}
		if(odd%2!=0 || odd==0)System.out.println("First");
		else
			System.out.println("Second");
	}
	
}
