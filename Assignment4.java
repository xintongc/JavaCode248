package comp;

public class Assignment4 {

	public static void main(String[] args) {
		Menu m = new Menu(); // no messages, no prompts, no options
		 // read an integer
		 int number1 = m.getOptionNumber();
		 System.out.println("You entered " + number1);
		 System.out.println("----------------------");
	 // introduce bottom prompt
		 m.setBottomPrompt("Enter an integer for bottom prompt: ");
		 // read an integer
		 int number2 = m.getOptionNumber();
		 System.out.println("You entered " + number2);
		 System.out.println("----------------------");
		 m.setBottomPrompt(null);
		  // introduce bottom message
		 m.setBottomMessage("Enter an integer for bottom message: ");
		 // read an integer
		 int number3 = m.getOptionNumber();
		  System.out.println("You entered " + number3);
		  System.out.println("----------------------");
		  m.setTopMessage("*************************************************");
		   // introduce top prompt
		   m.setTopPrompt("An integer is even if it is twice another integer");
		   // reset bottom message
		   m.setBottomMessage("*************************************************");
		   // intro bottom prompt
		   m.setBottomPrompt("Enter an even integer: ");
		   // read an integer
		   int number4 = m.getOptionNumber();
		   System.out.println("You entered " + number4);
	}

}
