package comp;

import java.util.Scanner;

public class moneypaying {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.println("Please input the upper bound");
		int n = keyin.nextInt();
		for(int i=10; i<= n;i++)
		{//int i=13;
			int num = i;
			int sum=0;
			while(num!=0)
			{ //System.out.println(num%10);
				sum += num%10;
				num = num / 10;
			}
			if (i%sum!=0)
				continue;
			System.out.println(i);
		}
		
		//System.out.println();
	}
}
