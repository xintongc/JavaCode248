package comp;

import java.util.Scanner;

public class joself {

	public static void main(String[] args) {
		// sorting numbers in an array
		int ar[] = new int [8];
		Scanner keyin = new Scanner(System.in);
		
		for(int i=0; i<ar.length; i++)
			ar[i]= keyin.nextInt();
		
		for(int index=0; index<ar.length -1; index++)
		
			for(int scan =index +1; scan <ar.length; scan++ )
				if(ar[index] > ar[scan])
				{
					int temp = ar[index];
					ar[index] =ar[scan];
					ar[scan] = temp;
				}
			
		for(int i=0; i<ar.length; i++)
			System.out.print(ar[i]+ " ");



	}

}
