package comp;

import java.util.Scanner;

public class Changeline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] ary = {{1, 2, 2, 1, 2},{5, 6, 7, 8, 3},{9, 3, 0, 5, 3},{7, 2, 1, 4, 6},{3, 0, 8, 2, 4}};
		Scanner keyin = new Scanner(System.in);
		int i1= keyin.nextInt();
		int i2 = keyin.nextInt();
		if(i1<5 && i2<5 && i1!=i2 && i1>=0 && i2 >=0 )
		{
			int [] temp =new int [5];
			for(int i = 0; i<5;i++)
			{
				temp[i]= ary[i1][i];
				ary[i1][i]=ary[i2][i];
				ary[i2][i]=temp[i];
			}
			for(int i = 0; i<5;i++)
			{
				for(int j = 0; j<5;j++)
					System.out.print(ary[i][j] + " ");
				System.out.println();
			}
		}
		else
			System.out.print("error");

		
	}

}
