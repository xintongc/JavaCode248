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

this menus used in text-based menu-driven programs, where the user
is presented with a list of options to choose from
*/
import java.util.Scanner;

public class Menu {

	private String topPrompt;
	private String bottomPrompt;
	private String topMessage;
	private String bottomMessage;
	private String [] optionList = null;
	private String theString = "?->";
	
	
	public Menu() {  //default constructor
		this.topPrompt = null;
		this.bottomPrompt = null;
		this.topMessage = null;
		this.bottomMessage = null;
		this.optionList = null;
	}
	
	public Menu(String [] optionList) { //initialize the option list in this Menu
		this.topPrompt = "Choose an option:";
		this.bottomPrompt = "Enter an option number:";
		this.topMessage = null;
		this.bottomMessage = null;
		this.optionList = optionList;
	}
	
	public boolean isEmpty(){
		if(this.optionList == null)  // if the optionList is null or the length is 0, then it is empty, return true, otherwise return false
			return true;
		else if( this.optionList.length == 0)
			return true;
		else
			return false;
	}
	public int length(){  // return the length of optionList
		if(this.optionList == null)
			return 0;
		else
			return this.optionList.length;
	}
	
	private String outputarray(){  //go through the elements in optionList, make it to a string with number before each elements
		String temp = "";
		if(this.optionList==null)
			return "";
		else
		{
		for(int i=0; i<this.optionList.length; i++ )
		{
		
			temp += "    "+"("+ (i+1) +")";
			temp += this.optionList[i] ;
			temp +="\n";
		}
		return temp;
		}
	}
	
	private String output(String str){ //do not out put the string if it is null
		if(str==null)
			return "";
		else
			return str + "\n";
	}
	
	private String outputbottomPrompt(String str){ //do not out put the string if it is null
		if(str==null)
			return "";
		else
			return str;
	}
	//@Override
	public String toString() {//output the menu
		return output(topMessage) + output(topPrompt) + outputarray()+ output(bottomMessage) + theString + outputbottomPrompt(bottomPrompt);
	}
	
	public int getOptionNumber(){
		System.out.print(toString());
		Scanner keyin = new Scanner(System.in);
		int n = keyin.nextInt();
		if(this.optionList == null || optionList.length ==0)
			return n;//if there is no option list, return the number that input
		else
		{
			while(n < 1 || n > optionList.length)
			{//if the n is valid, call toString and return the number 
				System.out.print(toString());
				n = keyin.nextInt();
			}
			return n;
		}
	}

	public String getTopPrompt() {
		return topPrompt;
	}
	public void setTopPrompt(String topPrompt) {
		this.topPrompt = topPrompt;
	}
	public String getBottomPrompt() {
		return bottomPrompt;
	}
	public void setBottomPrompt(String bottomPrompt) {
		this.bottomPrompt = bottomPrompt;
	}
	public String getTopMessage() {
		return topMessage;
	}
	public void setTopMessage(String topMessage) {
		this.topMessage = topMessage;
	}
	public String getBottomMessage() {
		return bottomMessage;
	}
	public void setBottomMessage(String bottomMessage) {
		this.bottomMessage = bottomMessage;
	}
	
	
	
	
}
