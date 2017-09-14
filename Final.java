package comp;

import java.util.Arrays;
import java.util.Scanner;

public class Final {
	
	private static int alternatingSum(int[] ary){
		int sum = 0;
		for(int i =0; i< ary.length; i++)
		{
			if(i%2 == 0)
				sum += ary[i];
			else
				sum -= ary[i];
		}
		return sum;
	}
	
	private static boolean reverseSame(int num1, int num2){
		int reverse = 0;
		while(num1 != 0)
		{
			reverse += num1 % 10;
			reverse = reverse * 10;
			num1 /=10;
		}
		reverse /= 10;
		return (reverse == num2);
		
	}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
//		System.out.println(reverseSame(1234,4321));
//		System.out.println("input an integer");
//
//    	Scanner keyin = new Scanner(System.in);
//	
//    	int n = keyin.nextInt();
//    	for(int i = 0; i< 3; i++)
//    	{
//
//    		for(int s = 0; s < i*2; s++)
//    			System.out.print(" ");
//    		for(int j = 0; j< n-i*2; j++)
//    		{
//    			System.out.print("* ");
//    		}
//    		System.out.println();
//    	}
//    	for(int i = 0; i< 2; i++)
//    	{
//    		for(int s = 0; s <2- i*2; s++)
//    			System.out.print(" ");
//    		for(int j = 2 ; j< n + i*2; j++)
//    			System.out.print("* ");
//    		System.out.println();
//    	}
    
    	
//		System.out.print("Please enter hour:");
//		Scanner keyboard = new Scanner(System.in);
		
//		int hour = keyboard.nextInt();
//		if (hour<2) {
//			System.out.print("Hour should be >=2. The End");
//		}
//		else {
//			int i,j,k;
//			//Output the upper triangle
//			for(i=0; i<hour/2+hour%2; i++) {
//				for (j=0;j<i;j++) {
//					System.out.print(' ');
//				}
//				for (j=0;j<hour-2*i;j++) {
//					System.out.print('*');
//				}
//				System.out.print('\n');
//			}
//			//Output the lower triangle
//			int m=hour/2+hour%2;
//			for (i=1; i<m; i++) {
//				for (j=0; j<m-1-i; j++) {
//					System.out.print(' ');
//				}
//				for (k=j; k<hour-j; k++) {
//					System.out.print('*');
//				}
//				System.out.print('\n');
//			}
//		}

		Scanner keyIn=new Scanner(System.in);
		int [] arr1 = new int[5];
		int [] arr2 = new int[5];
		int [] arr3 = new int[10];
		
		for(int i = 0; i < 5; i++)
			arr1[i] = keyIn.nextInt();
		for(int i = 0; i < 5; i++)
			arr2[i] = keyIn.nextInt();
		
		int n1 = 0, n2 = 0;
		for(int i = 0; i <10; i++)
		{
			System.out.println("i = " + i + "  n1 = " + n1 + "  n2 = " + n2);
			if (n1 == 5)
			{
				arr3[i] = arr2[n2];
				n2++;
			}
			else if (n2 == 5)
			{
				arr3[i] = arr1[n1];
				n1++;
			}
			else if (arr1[n1] < arr2[n2])
			{
				arr3[i] = arr1[n1];
				n1++;
			}
			else
			{
				arr3[i] = arr2[n2];
				n2++;
			}
		}
		System.out.print("Hey Stuart, the merged array is ");
		for(int i = 0; i < 10; i++)
		{
			System.out.print(arr3[i]);
			if (i < 9)
				System.out.print(',');
		}
		keyIn.close();
			
		
		
		
		
		
		
		
		
		
		

//		System.out.println("Please enter your name: ");
//		String string1 = keyin.next();
//		String string2 = keyin.next();
//		char ch = string1.charAt(0);
//		System.out.println("Your abbreviated name is: ");
//		System.out.println(ch + "."+ string2);
//		int a1 , a2 ,b1,b2;
//		a1 = a2 =b1=b2=5;
//		int a = 5;
//		int b = 5;
//		if (b1 == b2 && a1 == a2 )
//		System.out.println( "All variables have the same value¡± as well");
//		else if (a1 == a2)
//		System.out.println("a1 and a2 have the same value");
//		else if (b1 == b2)
//			System.out.println( "b2 and b1 have the same value");
//		else
//		System.out.println("All variables are different");
//		System.out.println(x);


	}
}
