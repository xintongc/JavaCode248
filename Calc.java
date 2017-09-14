package comp;

public class Calc {
	private double number;
	
	Calc(double n) {
		number = n;
	}
	
	public void add(double m){
		number +=m;
	}
	public void substract(double k){
		number -=k;
	}
	public void mult(double w){
		number *=w;
	}
	public void div(double q){
		number /=q;
	}
	public double show(){
		return number;
	}

public static void main(String[] args) {
	Calc calculator = new Calc(2);
	System.out.println(calculator.show());
	calculator.add(10);
	System.out.println(calculator.show());
	calculator.substract(2.25);
	System.out.println(calculator.show());
	calculator.mult(10);
	System.out.println(calculator.show());
	calculator.div(2);
	System.out.println(calculator.show());
	
	double d=9232.919394d;
	d = Math.round(d*100)/100.0d;
	System.out.println(d);
}

}
