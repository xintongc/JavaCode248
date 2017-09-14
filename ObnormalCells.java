package comp;

import java.util.Scanner;

public class ObnormalCells {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyin = new Scanner(System.in);
		int n = keyin.nextInt();
		
		int count= 0;
		int [][] pic = new int[n][n];
		
		for(int i = 0; i<n;i++)
			{
			for(int j = 0; j<n;j++)
				pic[i][j] = keyin.nextInt();
			}
		
		for(int i = 1; i<n-1;i++)
			for(int j = 1; j<n-1;j++)
			{
					if(  ((pic[i][j]-pic[i-1][j]>=50)||(pic[i][j]-pic[i-1][j]<=-50)) && ((pic[i][j]-pic[i+1][j]>=50)||(pic[i][j]-pic[i+1][j]<=-50)) && ((pic[i][j]-pic[i][j-1]>=50)||(pic[i][j]-pic[i][j-1]<=-50)) && ((pic[i][j]-pic[i][j+1]>=50)||(pic[i][j]-pic[i][j+1]<=-50)) )
						count++;
				
				
			}
		System.out.print(count);
		keyin.close();
	}

}
