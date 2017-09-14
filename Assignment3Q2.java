package comp;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3Q2 {

	public static void main(String[] args) {
		
				// -------------------------------------------------------
				// Assignment (3)
				// Written by: (Xintong Cheng ID: 40021566)
				// For COMP 248 Section (R) Fall 2016
				// --------------------------------------------------------
		
		        /*Date:Nov 5,2016
		        WHAT DOES THIS PROGRAM DO?
			    ---------------------------
				Purpose:a program to book tickets for a play. 
				The small theatre having 6 rows each with 7 seats/row) labeled A, B, C, D, E, F and G.
				The user is allowed to book several tickets in one session.
				For every seat request, the program displays the balance to be paid and marks the reserved seat with ¡®X¡¯ if the seat is available
		        When the user is successful with booking his seats, the system prompts him with a message that his reservation is complete.
		        Then a second user can start a new booking session 
		        */
		
		//welcome banner
		System.out.print("---------------------------------------------------------\n" +
				"-------------COMP248 Concert IS BACK IN TOWN-------------\n" +
				"		Hurry book your ticket Now!!\n"+

				"---------------------------------------------------------\n\n");

		char seat[][]= new char[6][8];    //declare a 2D-array to show the seats
		for(int i=0; i<seat.length; i++)  //generate the seats row and letter by using ascii code
			for(int j=1; j<seat[i].length; j++)
			{
				seat[i][0]=(char) (49+i);
				seat[i][j]=(char) (64+j);
			}
		String newBooking; //declare the string of the row number and the seat letter which user will input
		do
		{
			for(int i=0; i<seat.length; i++)  //print the seats which generated before
			{
				for(int j=0; j<seat[i].length; j++)
					System.out.print(seat[i][j]+" ");
				System.out.println();
			}

			System.out.println(); //print the price list of the seats
			System.out.print("Rows 1 & 2 Gold   100 CAD/ticket\n" +
					"Rows 3 & 4 Silver   70 CAD/ticket\n"+
					"Rows 5 & 6 Bronze   40 CAD/ticket\n");

			int availableSeats = 0;  //declare and initialize the number of available seats
			for(int i=0; i<seat.length; i++)
				for(int j=1; j<seat[i].length; j++)
				{
					if(seat[i][j]!='X')
						availableSeats++;  //count the available seats, go through every letter element of the 2D-array  
				} 						  //if the letter stored in the array is not 'X', the seat is available, then count++


			System.out.println("Available seats " + availableSeats); //print the number of available seats
			System.out.println("How many tickets do you need?"); //let user input the number of tickets needed and store it into ticketsNeed
			Scanner keyin = new Scanner(System.in);
			int ticketsNeed = keyin.nextInt();


			if(ticketsNeed > availableSeats)   //if the ticketsNeed is greater than availableSeats, print sorry message and exit
			{
				System.out.println("Sorry cannot process your request\n"+
						"No more seat are available\n"+
						"Thank you for choosing our reservation system!!\n");
				System.exit(0);
			}

			else
			{
				double balance = 0;  //declare and initialize the balance of booking seats
				// a 'for' loop for booking tickets, the condition for ending this loop is reach the number of ticketsNeed from user input
				
				selectSeats: for(int t=0;t<ticketsNeed;) //set a label "selectSeats" for booking seats
				{					// if the user input invalid seat number or letter, then go back to this loop and let the user input again
					System.out.println("Input your seat selection"); //let the user to input the seats selected
					System.out.println("Enter the row number and then the seat letter (example: 3B)");
					String selection = keyin.next();
					if(selection.length() < 2)  //if the length of string which user input is less than 2, then the seat is invalid
						{
						System.out.println("Invalid Seat assignment");
						continue selectSeats;   //print the remind message and go back to the "selectSeats" loop to let the user input again
						}
					else    
					{


						char row = selection.charAt(0);  //cast the string which user input to 2 char, the first char is the row number
						char letter = selection.charAt(1); //the second char is the seats letter


						int bookRow=0, bookLetter=0;

						if(selection.length() != 2) //if the length of string is not 2, then it is invalid, print remind message and select again
						{
							System.out.println("Invalid Seat assignment");
							continue selectSeats;
						}
						else if (!(row > 48 && row<55))
						{    //if the number is out of the range of seats' number, then it is invalid, print remind message and select again
							System.out.println("Invalid row number -try again");
							continue selectSeats;						
						}
						else if(!(letter>64 && letter < 72))
						{	//if the letter is out of the range of seats' letter, then it is invalid, print remind message and select again
							System.out.println("Invalid Seat letter - try again");
							continue selectSeats;
						}
						else // if the number and the letter is valid, then cast the char to int
						{   //using ascii code to change the char to the seat number and letter in the array accordingly 
							bookRow =(int)row-49;   //bookRow is the index of the array stands for row of seats 
							bookLetter =(int)letter-64;  //bookLetter is the index of the array stands for letter of seats
						}


						if(seat[bookRow][bookLetter]=='X') //if the array element user selected is stored 'X', then the seats is  not available
							{  
							System.out.println("Sorry seat is not available");
							continue selectSeats;  //go back to the selectSeats loop and select again
							}

						if(row < 51 && row > 48)  //according to the row the user selected, counting the balance
							balance += 100;    // the seats in the first 2 rows are 100 
						else if(row < 53 && row > 50)
							balance +=70;   // the seats in the third and forth rows are 70
						else if(row < 55 && row > 52)
							balance +=40;  // the seats in the last 2 rows are 40

						
						seat[bookRow][bookLetter]='X';  //the seats been booked is marked as 'X'
						System.out.println("Your seat is reserved. Your balance is " + balance); //show the message and the balance
						t++;  //counter for the selectSeats loop, of one seats been booked, the counter plus one
						      //the selectSeats loop repeat until the counter reach the number of ticket the user need

						for(int i=0; i<seat.length; i++) //print the seats image after booking
						{
							for(int j=0; j<seat[i].length; j++)
								System.out.print(seat[i][j]+" ");
							System.out.println();
						}

					}
				}
				System.out.println("Reservation complete! Please proceed to payment"); //print complete message
			}
			System.out.println("Do you wish to start a new booking? (y/n)?");//ask if the user wish to start a new booking
			newBooking = keyin.next();  //if the user input 'y', then a new booking start

		}
		while(newBooking.equals("y"));

	}

}
