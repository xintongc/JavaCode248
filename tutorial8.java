package comp;

import java.util.Arrays;
import java.util.Scanner;

public class tutorial8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
		//Q9	
		char ar1[] = new char[5];
		char ar2[]= new char[5];
		System.out.println("Please input 2 string, and I will compare if they have same contents");
		Scanner keyin = new Scanner(System.in);
		
		for(int i=0; i<ar1.length; i++)
			ar1[i]= keyin.next().charAt(0);
		
		
		for(int i=0; i<ar2.length; i++)
			ar2[i]= keyin.next().charAt(0);
		
		
		boolean ar3[] = new boolean [5];
		for(int i=0; i<ar1.length; i++)
			for(int j=0; j<ar2.length; j++)
			{
				if(ar1[i]==ar2[j])
					ar3[i]= true;
			}
		
		if(ar3[1]&&ar3[2]&&ar3[3]&&ar3[4]&&ar3[0])
			System.out.print("The two set of char are same, ignore the order");
		else
			System.out.print("The two set of char are not the same");
			
		*/		
		
		//Q10
		boolean[] bo = new boolean [5];
		int k=0;
		int ar[][]={{4,9,2},{3,5,7},{8,1,6}};
		int sumi[]=new int[3];
		int sumj[]=new int[3];
		for(int i=0; i<ar.length; i++)
			for(int j=0; j<ar[i].length; j++)
			{
				sumi[i]+=ar[i][j];
				sumj[j]+=ar[i][j];
			}
		for(int i=0; i<ar.length; i++)
			System.out.println(Arrays.toString(ar[i]));
		
		System.out.println(Arrays.toString(sumi));
		System.out.println(Arrays.toString(sumj));
		
		
		for(int i=1; i<sumi.length; i++)
			if(sumi[0]==sumi[i])
				{
				bo[k]= true;
				k++;
				}
		for(int j=0; j<sumj.length; j++)
			if(sumi[0]==sumj[j])
			{
			bo[k]= true;
			k++;
			}
		boolean tell=true;
		for(int i=1; i<bo.length; i++)
			 tell &=bo[i];
		if(tell)	
			System.out.println("How wonderful it is! It's a magic square!!");
		else
			System.out.println("What a pity, it's not a magic square.");
			
			
	
		/*
	//Q11
		Scanner keyin = new Scanner(System.in);
		System.out.println("The time to witness a magic is coming...");
		System.out.println("What size of magic square you want to creat?");
		int k = keyin.nextInt();
		int i = k-1;
		int j = k/2;
		int count = 1;
		int ar[][]= new int [k][k];
		
		ar[i][j]=count;
		count++;
		
		while(count<=k*k)
		{
			int a=((i+1==k)?0:i+1);
			int b=((j+1==k)?0:j+1);
		if(ar[a][b]==0)
		{
			ar[a][b]=count++;
			i=a;
			j=b;
		}
		else
		{
			i=((i-1<0)?k:i-1);
			ar[i][j]=count++;
		}
			
		
		}
		
		for(int z=0; z<ar.length; z++)
			System.out.println(Arrays.toString(ar[z]));
		*/	
		
	}
}
