                                                                              B. Fedor and New Game
                                                                           time limit per test1 second
                                                                        memory limit per test256 megabytes
                                                                               inputstandard input
                                                                              outputstandard output
                                                                              
                                                                              
                                                                              
After you had helped George and Alex to move in the dorm, they went to help their friend Fedor play a new computer game «Call of Soldiers 3».

The game has (m + 1) players and n types of soldiers in total. Players «Call of Soldiers 3» are numbered form 1 to (m + 1). Types of soldiers are numbered from 0 to n - 1. Each player has an army. Army of the i-th player can be described by non-negative integer xi. Consider binary representation of xi: if the j-th bit of number xi equal to one, then the army of the i-th player has soldiers of the j-th type.

Fedor is the (m + 1)-th player of the game. He assume that two players can become friends if their armies differ in at most k types of soldiers (in other words, binary representations of the corresponding numbers differ in at most k bits). Help Fedor and count how many players can become his friends.

Input
The first line contains three integers n, m, k (1 ≤ k ≤ n ≤ 20; 1 ≤ m ≤ 1000).

The i-th of the next (m + 1) lines contains a single integer xi (1 ≤ xi ≤ 2n - 1), that describes the i-th player's army. We remind you that Fedor is the (m + 1)-th player.

Output
Print a single integer — the number of Fedor's potential friends.





import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
import java.util.*;
import java.util.*
;
public class Sagar{
 
	
	static int check(int num) {
		
		String z=Integer.toBinaryString(num);
		int cnt=0;
		for(int i=0;i<z.length();i++) {
			if(z.charAt(i)=='1')cnt++;
		}
		
		return cnt;
	}
	
	public static void main(String args[] ) throws Exception {
	
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt()+1;
		int k=sc.nextInt();
		
		ArrayList<Integer> l=new ArrayList<>();
		
		for(int i=0;i<m;i++) {
			l.add(sc.nextInt());
		}
		int x=l.get(m-1);
		
		int ans=0;
		
		for(int i=0;i<m-1;i++) {
			
			int z=check(x^l.get(i));
			
			if(z<=k)ans++;
			
		}
		System.out.println(ans);
	}
 
 }
