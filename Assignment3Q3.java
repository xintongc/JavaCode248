package comp;

// -------------------------------------------------------
// Assignment (3)
// Written by: (Xintong Cheng ID: 40021566)
// For COMP 248 Section (R) Fall 2016
// --------------------------------------------------------

/*Date:Nov 12,2016
WHAT DOES THIS PROGRAM DO?
---------------------------
Purpose:
This is the driver to Scale class. This driver created 4 weights,and modified the weights and units, and also compared different weights.
It also use the method waterIntake() to have the recommended daily water intake according to weight and work out time. 
*/
public class Assignment3Q3 {

	public static void main(String[] args) {

		Scale weight1 = new Scale();  //declares weight1 
		Scale weight2 = new Scale(50);//declares weight2 and set weight 50 in kg 
		Scale weight3 = new Scale(110, "lbs");//declares weight3 and set weight 110 in lbs 
		
		System.out.println("Weight 1: "+weight1.toString()); //print the 3 weights using toString() method
		System.out.println("Weight 2: "+weight2.toString());
		System.out.println("Weight 3: "+weight3.toString());
		System.out.println();
		
		System.out.println("Weight 2 in pounds: "+weight2.getPounds()); //Convert weight 2 to pounds
		System.out.println("Weight 3 in Kg: "+weight3.getKg()); //Convert weight 3 to kg
		System.out.println();
		
		System.out.println("Daily water intake for 50.0 kg = "+weight2.waterIntake()+" cups");//Calculate water intake for weight 2 & 3
		System.out.println("Daily water intake for 110.0 lbs = "+weight3.waterIntake()+" cups");
		
		System.out.println("Daily water intake for 50.0 kg and 90min workout= "+weight2.waterIntake(90)+" cups");
		System.out.println("Daily water intake for 110.0 lbs and 60min workout= "+weight3.waterIntake(60)+" cups");
		System.out.println();
		
		System.out.println("Weight 1 & Weight 2 0.0 kg & 50.0 kg =? " +weight1.equals(weight2)); //Test if weights 1,2 & 3 are equal
		System.out.println("Weight 2 & Weight 3 50.0 kg & 110.0 lbs =? " +weight2.equals(weight3));
		System.out.println();
		
		weight1.setWeight(50);
		System.out.println("Modify weight 1: "+weight1.toString()); //Modify weight 1 and compare with weights 2 & 3
		System.out.println("Weight 1 50.0 kg Weight 2 50.0 kg =? " +weight1.equals(weight2));
		System.out.println("Weight 1 50.0 kg & Weight 3 110.0 lbs =? " +weight1.equals(weight3));
		System.out.println();
		
		Scale weight4 = new Scale(50,"lbs"); //Create weight 4 and compare to weights 2 & 3
		System.out.println("Weight 4: "+weight4.toString());
		System.out.println("Weight 4 & Weight 2 =? 50.0 lbs =? 50.0 kg " +weight4.equals(weight2));
		System.out.println("Weight 4 & Weight 3 =? 50.0 lbs =? 110.0 lbs " +weight4.equals(weight3));
		System.out.println();
		
		//Compare weights using isLessThan() and isGreaterThan() methods
		System.out.println("Weight 2 < Weight 4 ? 50.0 kg < 50.0 lbs "+weight2.isLessThan(weight4));
		System.out.println("Weight 3 < Weight 4 ?110.0 lbs < 50.0 lbs "+weight3.isLessThan(weight4));
		System.out.println();
		
		System.out.println("Weight 2 > Weight 4 ? 50.0 kg > 50.0 lbs "+weight2.isGreaterThan(weight4));
		System.out.println("Weight 3 > Weight 4 ? 110.0 lbs > 50.0 lbs "+weight3.isGreaterThan(weight4));
		System.out.println();
		
		System.out.println("Weight 1 < Weight 2 ? 50.0 kg < 50.0 kg "+weight1.isLessThan(weight2));
		System.out.println("Weight 1 > Weight 3 ? 50.0 kg > 110.0 lbs "+weight1.isGreaterThan(weight3));
		
	}

}
