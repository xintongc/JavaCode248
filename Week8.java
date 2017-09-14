package comp;

import java.util.Scanner;

public class Week8 {


	public static void main(String[] args) {

		int count = 0;
		int max = 0;
		int index1=0;
		Scanner keyin = new Scanner(System.in);
		String n = keyin.nextLine();
		char c[] = new char[200];

		for(int i =0; i<200; i++)
		{
			c[i]=n.charAt(i);
			if(c[i]==' ') 
			{
				if(max < count)
				{
					max = count;
					index1=i;
				}
				count=0;

			}
			else if(c[i]!=' ') 
			{
				count++;
			}

		}
		for(int i = index1-max; i<index1;i++)
			System.out.print(c[i]);



		keyin.close();

	}
}
