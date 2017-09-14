package comp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pack;
		int hours;
		double amount=0;
		Scanner keyIn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.println("Hey Justin");
		
		
		//read 1st value		
		hours = keyIn.nextInt();
		
		while (hours != -1)
		{
			pack = keyIn.next();
			if (pack.equals("A"))
			{
				amount = 9.95;
				if (hours > 10)
					amount+= (hours - 10) * 2;
			}
			else if (pack.equals("B"))
			{
				amount = 13.95;
				if (hours > 20)
					amount += (hours - 20) * 1;
			}	
			else if (pack.equals("C"))
				amount = 19.95;
			
			System.out.println("The bill amount is " + df.format(amount) );
			hours = keyIn.nextInt();
		}
		keyIn.close();
	}

}
