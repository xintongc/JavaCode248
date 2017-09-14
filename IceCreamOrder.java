package comp;
//-------------------------------------------------------
//Assignment (4)
//Written by: (Xintong Cheng ID: 40021566)
//For COMP 248 Section (R) Fall 2016
//--------------------------------------------------------

/*Date:Nov 28,2016
WHAT DOES THIS PROGRAM DO?
---------------------------
Purpose:
let the customers to select the type of ice cream they want
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class IceCreamOrder {

	
	private String flavor;
	private String vessel;
	private String amount;
	private double unitPrice;
	private int quantity;
	
	Scanner keyin = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.00");
	//return the order that customer selected as request
	public String toString(){ 
		return quantity + " orders of " + amount + " of "+flavor+ " ice cream in a " + vessel + " for $" + price() + " = " + quantity + " x " + unitPrice +"\n";
	}
	//compute price for each order 
	public double price(){ 
		String thePrice = df.format(quantity * unitPrice);
		double priceCount = Double.parseDouble(thePrice);
		return priceCount;
	}
	
	//constructor that set the flavor, vessel, amount, unitPrice and quantity
			
	public IceCreamOrder(String flavor, String vessel, String amount, double unitPrice, int quantity) {
		this.flavor = flavor; 
		this.vessel = vessel;
		this.amount = amount;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	//constructor, if user do not input quantity, then set the quantity to 1
	public IceCreamOrder(String flavor, String vessel, String amount, double unitPrice) {
		this.flavor = flavor;
		this.vessel = vessel;
		this.amount = amount;
		this.unitPrice = unitPrice;
		this.quantity = 1;
	}
	// set the flavourTopPrompt,flavourTopMessage, etc
	private String flavourTopPrompt = "\nPlacing an order is as easy as ABC , and D.\n";
	private String  flavourTopMessage = "Step A: Select your favorite flavour\n";
	private String [] flavourList = {"","Avocado","Banana","Chocolate","Coffee","Hazelnut","Lemon","Mango","Mocha","Vanilla"};
	private String  optionBottomMessage ="?-> Enter an option number :";
	
	private String vesselTopMessage = "\nStep B: Select a vessel for your ice cream :\n";
	private String [] vesselList ={"","Cone","Cup","Sundae",};
	
	private String amountTopMessage = "\nStep C: How much ice cream ?\n";
	private String [] amountList = {"","Single Scoop","Double Scoop","Triple Scoop"};
	
	private String quantityTopMessage = "\nStep D: how many orders of your current selection ?\n";
	private String [] quantityList = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
	private String quantityBottomMessage = "?-> Enter how many orders :";
	
	
	/*print the list of flavour,vessel,amount,quantity and let the user to select
	 * 
	 */
	public IceCreamOrder() {
		System.out.print(flavourTopPrompt + flavourTopMessage + outPutArray(flavourList) + optionBottomMessage);
		int flavourNo = keyin.nextInt();
		flavor = flavourList[flavourNo];
		
		System.out.print( vesselTopMessage + outPutArray(vesselList) + optionBottomMessage );
		int vesselNo = keyin.nextInt();
		vessel = vesselList[vesselNo];
		
		System.out.print(amountTopMessage +outPutArray(amountList) + optionBottomMessage);
		int amountNo = keyin.nextInt();
		amount = amountList[amountNo];
		
		System.out.print(quantityTopMessage +outPutArray(quantityList) + quantityBottomMessage );
		int quantityNo = keyin.nextInt();
		quantity = quantityNo;
		
		double [][] unitPriceList = { {3.49, 4.49, 5.49}, {2.99, 3.99, 4.99}, {4.25, 5.25, 6.25} };
		double icePrice = unitPriceList[vesselNo - 1][amountNo - 1];
		setUnitPrice(icePrice);
	}
	
	
	
	/*output the elements of string in an array with the index number*/
	private String outPutArray(String a[]){
		String temp = "";
		for(int i=1; i<a.length; i++ )
			temp += "    "+"("+ i +")" + a[i] + "\n" ;
		return temp;
	}
	
	
	
	/*getter and setter*/
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getVessel() {
		return vessel;
	}

	public void setVessel(String vessel) {
		this.vessel = vessel;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
