package comp;

import java.util.Scanner;

public class MoveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyin = new Scanner(System.in);
		int n = keyin.nextInt();
		int m = keyin.nextInt();
		
		int [] samle =new int [n];
		
		for(int i = 0; i<n;i++)
			samle[i]= keyin.nextInt();
		
		for (int i = 0; i < m; i++)
	    {
	        int temp = samle[n-1];
	        for (int j = 0; j < n-1; j++)
	        {
	            //System.out.println(samle[n-1-j]+ " samle[n-1-j]");
	            samle[n-1-j] = samle[n-j-2];
	           // System.out.println(samle[n-1-j]+ " samle[n-1-j]");
	        }
	        samle[0] = temp;
	    }
		for (int i = 0; i < n; i++)
	    {
	        if (i != n-1)
	        {
	        	System.out.print(samle[i]+ " ");
	        }
	        else
	        {
	        	System.out.println(samle[i]);
	        }
	    }
		
		
		
	}

}
