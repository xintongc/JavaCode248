package comp;

import java.util.Scanner;

public class FindMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		int N;
		int [] array =new int [15];
		N = keyin.nextInt();
		do {
	        if (N == 0) {
	            break;
	        }
	        for (int i=0; i<N; i++) {
	            array[i]= keyin.nextInt();
	        }
	        for (int i=0; i<N-1; i++)
	        {
	            for (int j=0; j<N-1-i; j++) {
	                if (array[j] > array[j+1]) {
	                    int tmp = array[j+1];
	                    array[j+1] = array[j];
	                    array[j] = tmp;
	                }
	            }
	        }
	        if (N % 2 == 0) {
	        	System.out.println( (array[N/2 - 1] + array[N/2]) / 2 );
	        } else {
	        	System.out.println( array[N/2] );
	        }
	}
	    while (N!=0);
	   
		keyin.close();
		
	}

}
