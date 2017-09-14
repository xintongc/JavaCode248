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
Represents and stores IceCreamOrders in a cart using a regular Java array as its underlying
storage. To facilitate program testing, the cart capacity is limited to 5 IceCreamOrders.
*/
import java.text.DecimalFormat;

public class ShoppingCart {

	private IceCreamOrder [] orderPlaced;// an array that store the order placed by user
	private static int orderNo;// track how many orders user already placed
	private double totalPrice;// to compute the total price of orders in shopping cart

	DecimalFormat df = new DecimalFormat("#.00");
	
	/*constructor, set orderNo and totalPrice to 0*/
	public ShoppingCart(){
		orderPlaced = new IceCreamOrder[7];//set an array of length 7 to put 5 orders, the first and the last will not be used
		orderNo = 0;
		totalPrice = 0;
	}
	
    /*a getter to get orderPlaced*/
	public IceCreamOrder[] getOrderPlaced() {
		return orderPlaced;
	}

	/*go through the array orderPlaced, add each order's price and return the total price
*/	
	public double computeTotalPrice(){
		totalPrice=0;
		for(int i = 1; i<= orderNo;i++)
			totalPrice+= orderPlaced[i].price();
		
		String thePrice = df.format(totalPrice);//set the double with only 2 decimal places
		totalPrice = Double.parseDouble(thePrice);
		
		return totalPrice;
	
	}

	/*Adds the supplied ice cream order to the cart
	add one to orderNo 
	If the list is full, it prints an error message and ignores the request.*/
	
	public void add(IceCreamOrder order){
		if (orderNo <= 5)
		{	
			for(int i=1; i<orderPlaced.length; i++)
			{
				if(orderPlaced[i]== null)
				{
					orderPlaced[i] = order;
					orderNo++;
					// totalPrice += orderPlaced[i].price();
					break;
				}
			}
		}
		else 
			System.out.print("Your Shopping Cart is full with 5 ice cream orders.\n Cannot add orders!");
	}

	
	
	/*Removes an order at a specified position from the cart. If the list is empty or the
	specified position is out of range, it prints an error message and ignores the request.*/
	public void remove(int position){

		if(orderPlaced[1]== null)//if the position 1 is null, it means the cart is empty
			System.out.println("Your Shopping Cart is empty.");
		else if(position > orderNo || position < 0)  //if the specified position is out of range, it prints an error message and ignores the request
			System.out.println("The position you input is out of range");
		else if(position == 5)
		{// if remove the order in position 5, set this position of orderPlaced array to null
	     //then it been removed, also decrease one to orderNo
			orderNo--;
			// totalPrice -= orderPlaced[position].price();
			orderPlaced[position]=null;
		}
		else
		{
			orderNo--;
			// totalPrice -= orderPlaced[position].price();
			/*if the position is not 1 to 4, move the order in next position to this position,
			so the order in this selected position is been removed, then increment the position,
			if the next positon is not null, then move it again, until the next position is null
			also, orderNo decrease one 
			*/
			
			do
			{
				orderPlaced[position] = orderPlaced[position+1];
				position++;
			}
			while(orderPlaced[position+1]!=null);
			orderPlaced[position]=null;

		}
	}



	/*output the order in the array of IceCreamOrder when the element is not null*/
	private String outPutOrder(IceCreamOrder a[]){
		String temp = "";
		for(int i=1; i<a.length; i++ )
		{
			if(a[i]!=null)
				temp += a[i] ;
		}
		return temp;
	}
	
/*toString method to output the all placed order*/
	public String toString(){
		return "Your current selections of our scrumptious ice creams\n" +
				"-------------------------------------------------------------------\n" + outPutOrder(orderPlaced) +
				"-------------------------------------------------------------------\n";
	}

	/*if the first element of the array of orderPlaced is empty, the cart is empty*/
	public boolean isEmpty(){
		if(orderPlaced[1]==null)
			return true;
		else
			return false;
	}

	/*if the last element of the array of orderPlaced is  not empty, the cart is full*/
	public boolean isFull(){
		if(orderPlaced[5]!=null)
			return true;
		else
			return false;
	}

	/*Returns the order placed at the supplied position in the cart. If the specied position
	is out of range, it prints an error message and ignores the request.*/
	public IceCreamOrder get(int position){
		if (position > orderNo || position < 0)
		{
			System.out.println("Out of range");
			return null;
		}
		else
			return orderPlaced[position]; 
	}
	
/*	Returns the number of orders currently in the cart.*/	
	public static int size(){
		return orderNo;
	}


}
















