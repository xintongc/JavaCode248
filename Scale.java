package comp;
//-------------------------------------------------------
//Assignment (3)
//Written by: (Xintong Cheng ID: 40021566)
//For COMP 248 Section (R) Fall 2016
//--------------------------------------------------------

/*Date:Nov 12,2016
WHAT DOES THIS PROGRAM DO?
---------------------------
Purpose:
This class contains methods to set weight and unit, calculate the recommended daily water intake according to weight and work out time. 
It also can compare two weights in different units.

This class contains 3 constructors to set weight and unit,2 accessor methods to return the value of the weight in kg or lbs
2 mutator methods to set the value of the weight or set both weight and unit
A public method called waterIntake() that returns an integer value representing the number of recommended daily cups of water intake given the weight.
A toString() method to return the value and the unit of the weight
An equals() method to test for equality of two objects of class Scale.
isLessThan() and isGreaterThan() method to compare between two objects of class Scale.

*/

public class Scale {
	
	private double weight;
	private String unit;
	
	public Scale(){ //No-argument constructor ( sets weight to zero and unit to kg)
		weight = 0;
		unit = "kg";
	}
	
	public Scale(double w){ //One argument constructor ( sets the weight to a value and assumes unit to be kg )
		weight = w;
		unit = "kg";
	}
	
	public Scale(double w, String u){//Two argument constructor ( sets both weight and unit)
		weight = w; 
		unit = u;
	}
	
	public double getKg(){ //method to return the value of the weight in kg
		if(unit.equals("kg")) //if the unit is kg, return weight
			return weight;
		else  //if the unit is not kg, then return weight divided by 2.2, keep two decimal place
			return Math.round((weight/2.2)*100)/100.0d;
	}
	
	public double getPounds(){//method to return the value of the weight in lbs
		if(unit.equals("lbs"))
			return weight;//if the unit is lbs, return weight
		else//if the unit is not lbs, then return weight times 2.2, keep two decimal place 
			return Math.round((weight*2.2)*100)/100.0d;
	}
	public void setWeight(double w){ 
		weight = w;//method to set the value of the weight
	}
	
	public void setWeightUnit(double w, String u){
		weight = w; //method to set both weight and unit
		unit = u;
	}
	
	public int waterIntake(){//returns an integer value representing the number of recommended daily cups of water intake given the weight
		return (int)getPounds()/16;
	}
	
	public int waterIntake(int min){//takes an argument for the daily minutes of exercise and returns the daily recommended water intake (in cups)
		double waterForweight = getPounds()/2;
		double waterForWorkOut = (min/30)*12;
		int waterTake = (int)(waterForweight + waterForWorkOut)/8;
		return  waterTake;
	}
	
	public String toString(){// return the value and the unit of the weight
		String weit = Double.toString(weight);
		return weit + " " + unit; 
	}
	
	public boolean equals(Scale b){//test for equality of two objects of class Scale.
		if(unit.equals(b.unit))   //if the two weights in a same unit, then compare their weights directly
		{
			if(weight == b.weight)
				return true;
			else
				return false;
		}
		else if(unit.equals("kg"))//if the two weights are not in a same unit,use getKg() method to make both weights compare in Kg
		{
			if(weight == b.getKg())
				return true;
			else
				return false;
		}
		else 
			{
			if (getKg() == b.weight) 
				return true;
			else
				return false;
			}
	}
		
		public boolean isLessThan(Scale b){ //compare between two objects of class Scale
			if(unit.equals(b.unit)) //if the two weights in a same unit, then compare their weights directly
			{
				if(weight < b.weight)
					return true;
				else
					return false;
			}
			else if(unit.equals("kg")) //if the two weights are not in a same unit,use getKg() method to make both weights in Kg then compare them
			{
				if(weight < b.getKg())
					return true;
				else
					return false;
			}
			else
				{
				if (getKg() < b.weight)
					return true;
				else
					return false;
				}
		}
		
		
			public boolean isGreaterThan(Scale b){//compare between two objects of class Scale
				if(unit.equals(b.unit))//if the two weights in a same unit, then compare their weights directly
				{
					if(weight > b.weight)
						return true;
					else
						return false;
				}
				else if(unit.equals("kg"))//if the two weights are not in a same unit,use getKg() method to make both weights in Kg then compare them
				{
					if(weight > b.getKg())
						return true;
					else
						return false;
				}
				else 
					{
					if (getKg() > b.weight)
						return true;
					else
						return false;
					}
		}

}
