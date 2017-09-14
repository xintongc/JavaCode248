package comp;

import java.util.Scanner;

public class NumOfTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyin = new Scanner(System.in);
		int t = keyin.nextInt();
		int r = keyin.nextInt();
		int count = 1;


		boolean [] tree =new boolean [t];
		
		for(int i =0; i<r;i++)
		{
			int start = keyin.nextInt();
			int end = keyin.nextInt();
			for (int j = start; j <= end; j++)
				tree[j]= true;
		}

		
		
		for(int i = 0; i< t; i++)
		{
			if(tree[i]==false)
				count++;
		}

		System.out.println(count);

		keyin.close();


	}

}
