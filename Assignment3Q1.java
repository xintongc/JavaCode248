package comp;

import java.util.Scanner;

public class Assignment3Q1 {

	public static void main(String[] args) {
		
				// -------------------------------------------------------
				// Assignment (3)
				// Written by: (Xintong Cheng ID: 40021566)
				// For COMP 248 Section (R) ?Fall 2016
				// --------------------------------------------------------
				/*Date:Nov 4,2016
				 
			     WHAT DOES THIS PROGRAM DO?
				---------------------------
			    The program will ask the user to enter a set of relevant nouns and adjectives 
				that will be used to generate different versions of a poem.
				The user should enter 3 nouns and 3 adjectives at least.
				Then the Java Poem will generate a poem which has 3 lines.
				Same noun or the same adjectives will not be picked again, unless the entire list of nouns and adjectives has been used.
				*/
				//welcome banner
		System.out.print("---------------------------------------------------------\n" +
				"     Do you want to write a poem?? Lets get started!!\n" +

				"---------------------------------------------------------\n\n");
		int n = 0, m =0;  //n is the number of nouns, m is the number of adjectives
		Scanner keyin = new Scanner(System.in);
		do
		{
		System.out.println("How may nouns ? min 3");  //ask the user how many nouns they will input
		n = keyin.nextInt();
		}
		while(n < 3);
		System.out.println("Enter " + n + " nouns"); 
		String[] nouns = new String[n];              //according the number the user input, declare a array of string to store those nouns
		boolean[] nounsUsed = new boolean[n];       //declare a array of boolean as the same size of the array of string
													//this array of boolean is to track whether a noun with a same index in array "nouns"  is been used
													//true is used, false is not be used
		for(int i=0; i<nouns.length; i++)           
			nouns[i] = keyin.next();                //using a loop to store the nouns which user input into the array nouns

		do
		{
		System.out.println("How may adjectives? min 3"); //ask the user how many adjectives they will input
		m = keyin.nextInt();
		}
		while(m < 3);
		System.out.println("Enter " + m + " adjectives"); //same as nouns above, declare a string array to store adjectives 
		String[] adjectives = new String[m];			// same as nouns above, declare a boolean array is to track whether a adjective is been used 
		boolean[] adjectivesUsed = new boolean[m];

		for(int i=0; i<adjectives.length; i++)   //using a loop to store the adjectives which user input into the array adjectives
			adjectives[i] = keyin.next();

		System.out.print("----------------------------------------------\n" +
				"          Here is my Java POEM!!\n" +
				"          ****LOOK AROUND****\n"+

				"-----------------------------------------------\n\n");
		String [] space = {"","        ","                "};  //this String array is for generate the space before each line of poem

		int x = 0, y = 0;   //declare x as the index of the "nouns" array and y as the index of the "adjectives" array
		String another = "y"; // declare "another" to store whether the user want to generate another poem
		
		//"usedAllNouns" is a boolean to tell whether all nouns have been used, same noun will not be picked again, unless the entire list of nouns has been used. 
		boolean usedAllNouns= false; 
		// "usedAllAdjectives" is a boolean to tell whether all adjectives have been used, same adjectives will not be picked again, unless the entire list of adjectives has been used. 
		boolean usedAllAdjectives= false; 
		do  //generate a 3 lines poem until the user stop input 'y'
		{
			for(int i=0; i<3; i++) // generate 3 lines of poem, the limit 3 is the lines of poem
			{
				boolean everyNounsUsed = true;  //declare everyNounsUsed and initialize it as true
				for(int j=0; j<nounsUsed.length; j++) 
				{
					everyNounsUsed &=nounsUsed[j]; //go through the boolean array named nounsUsed and && them one by one
					usedAllNouns = everyNounsUsed; // if every boolean in nounsUsed is true, then the value of everyNounsUsed, store the value in usedAllNouns
				}
				
				if(usedAllNouns)        //if usedAllNouns is true,it means all nouns have been used, so we reset the value in "nounsUsed" to false
					for(int j=0; j<nounsUsed.length; j++)
						nounsUsed[j] = false;

				               
					do   //  after we generate the random index, we need to check whether the noun has been used        
					{   //if the index in nounsUsed array stores true, it means the noun has been used, we need to generate the index of nouns again
						x = (int)(Math.random() * n);
					}
					while(nounsUsed[x]);  // until we find a noun has not been used
					nounsUsed[x] = true; //when we find the noun has not been used, we use this noun to generate the poem and then change the value in the same index in "nounsUsed" to true


				boolean allAdjectivesUsed = true;    // same as nouns
				for(int j=0; j<adjectivesUsed.length; j++)
				{
					allAdjectivesUsed &=adjectivesUsed[j];
					usedAllAdjectives = allAdjectivesUsed;
				}
				
				if(usedAllAdjectives)        
					for(int j=0; j<adjectivesUsed.length; j++)
						adjectivesUsed[j] = false;


				
					do
					{
						y = (int)(Math.random() * m);
					}
					while(adjectivesUsed[y]);
					adjectivesUsed[y] = true;
				

				//print a line of the poem, the "space" is the String array I declare before which used to generate the space before each line
				System.out.println(space[i]+ adjectives[y] +" "+ nouns[x]); 
			}
			System.out.print("Another Poem (y/n)? ");//ask the user whether like to make another poem, if input "y" then make another poem
			another = keyin.next();
			if(!another.equals("y")) //if the user has not input 'y',then break the program
				break;
			System.out.println();
			System.out.print("----------------------------------------------\n" +
					"          Here is my Java POEM!!\n" +
					"          ****LOOK AROUND****\n"+

					"-----------------------------------------------\n\n");
		}
		while(another.equals("y"));




	}

}
