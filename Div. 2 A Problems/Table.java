                                                                                A. Table
                                                                        time limit per test1 second
                                                                      memory limit per test256 megabytes
                                                                            inputstandard input
                                                                           outputstandard output
                                                                           
                                                                           
                                                                           
Simon has a rectangular table consisting of n rows and m columns. Simon numbered the rows of the table from top to bottom starting from one and the columns — from left to right
starting from one. We'll represent the cell on the x-th row and the y-th column as a pair of numbers (x, y). The table corners are cells: (1, 1), (n, 1), (1, m), (n, m).

Simon thinks that some cells in this table are good. Besides, it's known that no good cell is the corner of the table.

Initially, all cells of the table are colorless. Simon wants to color all cells of his table. In one move, he can choose any good cell of table (x1, y1), an arbitrary corner of 
the table (x2, y2) and color all cells of the table (p, q), which meet both inequations: min(x1, x2) ≤ p ≤ max(x1, x2), min(y1, y2) ≤ q ≤ max(y1, y2).

Help Simon! Find the minimum number of operations needed to color all cells of the table. Note that you can color one cell multiple times.

Input
The first line contains exactly two integers n, m (3 ≤ n, m ≤ 50).

Next n lines contain the description of the table cells. Specifically, the i-th line contains m space-separated integers ai1, ai2, ..., aim. If aij equals zero, then cell (i, j)
isn't good. Otherwise aij equals one. It is guaranteed that at least one cell is good. It is guaranteed that no good cell is a corner.

Output
Print a single number — the minimum number of operations Simon needs to carry out his idea.






import java.util.*;
import java.lang.*;
import java.io.*;
 
 
public class Sagar {
	
	
	public static void main (String[] args){
	    
		Scanner sc=new Scanner(System.in);
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int ans=0;
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				int z=sc.nextInt();
				if(z==1) {
					
					if((i<=m && j==1) || (i<=m && j==n) ||(i==1 && j<=n) || (i==m && j<=n))
					{
						ans=2;
					}
				}
			}
		}
		if(ans==2)System.out.println(2);
		else
			System.out.println(4);
	}	
}
