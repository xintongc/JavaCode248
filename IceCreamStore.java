package comp;
//-------------------------------------------------------
//Assignment (4)
//Written by: (Xintong Cheng ID: 40021566)
//For COMP 248 Section (R) Fall 2016
//--------------------------------------------------------

/*Date:Nov 30,2016
WHAT DOES THIS PROGRAM DO?
---------------------------
Purpose:
Stores a ShoppingCart and interacts with the customer through a set of predened menus.
The main menu displayed by IceCreamStore provides options that allow customers to print,
price, or revise the ice cream orders in their cart, or to add new orders to or remove existing
orders from their cart.
*/
import java.util.Scanner;

public class IceCreamStore {

	private IceCreamOrder order;
	private ShoppingCart cart = new ShoppingCart();

	//the message in the menu if the cart is not empty and not full
	private String notFullMessage1 = "\nYour shopping cart contains "; 
	private String notFullMessage2 =" ice cream orders\nWhat would you like to do?\n";
	
	//optionList of the menu
	private String [] optionList = {"","Place an order","Delete an order","Price the cart","List the cart","Proceed to checkout","Exit this menu"};
	private String  optionBottomMessage ="?-> Enter an option number :";

	//the top and bottom message in the menu if the cart is full
	private String fullMessage = "\nYour Shopping Cart is full with 5 ice cream orders.\nCannot place orders ! what would you like to do?\n";
	private String fullBottomMessage = "Please select option 2, 3, 4, 5, or 6\n";

	//the top and bottom message in the menu if the cart is empty
	private String emptyMessage = "\nYour Shopping Cart is empty.\nYou have only two options : 1 or 6\n";
	private String emptyBottomMessage = "Please enter 1 or 6\n";

	Scanner keyin = new Scanner(System.in);
	
	//output the array of IceCreamOrder, and a Exit this menu option at the bottom of the list
	private String outPutArray(IceCreamOrder a[]){
		String temp = "";
		int exitNum = 0;
		for(int i=1; i<a.length; i++ )
			if(a[i]!=null)// if the element is not null, then concat the order in temp
			{				
				temp += "    "+"("+ i +")" + a[i];
				exitNum = i;
			}
		return temp + "    (" + (exitNum + 1) + ")Exit this menu\n";
	}


/*output the element in an array of String*/
	private String outPutoptionList(String a[]){
		String temp = "";
		for(int i=1; i<a.length; i++ )
			temp += "    "+"("+ i +")" + a[i] + "\n" ;
		return temp;
	}

	/*places an order and add the order in the cart.*/
	public void placeOrder(){
		order = new IceCreamOrder();
		cart.add(order);
	}

	
	/*displays a list of all of the orders in the cart as options, prompts for and
	reads the option number associated with the order to be deleted, and then removes
	that order from the cart*/
	public void deleteOrder(){
		System.out.print("\nYou have selected to remove an order from your cart\nWhat would you like to do?\n");
		System.out.print(outPutArray(cart.getOrderPlaced()));
		System.out.print(optionBottomMessage);
		int n = keyin.nextInt();//user input the index of which order the user wants to delete

		while( n > ShoppingCart.size()+1)
		{
			System.out.print("The number you input is invaild, please input again:");
			n = keyin.nextInt();
		}

		if(n==ShoppingCart.size()+1)
			run();
		else
		{
			switch(n)
			{
			case 1: cart.remove(1); break;
			case 2: cart.remove(2); break;
			case 3: cart.remove(3); break;
			case 4: cart.remove(4); break;
			case 5: cart.remove(5); break;
			}
			System.out.print("\nThe order you selected was deleted\n");
		}
	}


	/*Returns the total price of all the items in the cart.*/
	public double computeTotalPrice(){
		return cart.computeTotalPrice();
	}

	/*Prints the total price of all the items in the cart.*/
	public void printTotalPrice(){
		System.out.println("\n---------------------------------------------------=\n" +
								"Total price of all your orders in the cart : $" + computeTotalPrice() +
					  	"\n---------------------------------------------------=\n");
	}

	/*Prints a complete list of all orders in the cart.*/
	public void reviewOrders(){
		System.out.print(cart.toString());
	}

	/*it first calls reviewOrders() and then printTotalPrice().
	after checkout, empty the cart by creat a new cart*/
	public void checkout(){
		reviewOrders();
		printTotalPrice();
		cart = new ShoppingCart();
	}


	public void run(){

		do
		{

			if(ShoppingCart.size()==0)
			{
				System.out.print(emptyMessage + outPutoptionList(optionList) + emptyBottomMessage +  optionBottomMessage);
				int n = keyin.nextInt();
				switch(n)
				{//if the cart is empty, user can only select 1 or 6
				case 1: placeOrder();break;
				case 6: System.out.print("Cheers!"); System.exit(0); break;
				default: run();
				}
			}
			else if (ShoppingCart.size()==5)
			{
				System.out.print(fullMessage + outPutoptionList(optionList)+ fullBottomMessage +  optionBottomMessage);
				int n = keyin.nextInt();
				switch(n)
				{//if the cart is full, the user cannot select 1
				case 2: deleteOrder(); break;
				case 3: printTotalPrice();break;
				case 4: reviewOrders();break;
				case 5: checkout();break;
				case 6: System.out.print("Cheers!"); System.exit(0); break;
				default: run();
				}

			}
			else
			{
				System.out.print(notFullMessage1 + ShoppingCart.size() + notFullMessage2 + outPutoptionList(optionList)+ optionBottomMessage);
				int n = keyin.nextInt();
				switch(n)
				{
				case 1: placeOrder();break;
				case 2: deleteOrder(); break;
				case 3: printTotalPrice(); break;
				case 4: reviewOrders();break;
				case 5: checkout();break;
				case 6: System.out.print("Cheers!"); System.exit(0); break;
				default: run();
				}
			}

		}
		while(true);

	}

}
