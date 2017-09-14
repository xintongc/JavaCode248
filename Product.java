package comp;

public class Product {

	private int upc;
	private String name;
	private double price;
	private int quantity;
	private boolean [] ary = new boolean [52];

	
	public Product(){
	
	}
	public Product(int upc, String name, boolean [] a){
		this.upc = upc;
		this.name = name;
		this.ary = a.clone();
		this.price =0;
		this.quantity = 0;
	}
	public String getName(){
		return name;
	}

	public void addStock(int n){
		this.quantity += n;
	}

	public boolean outOfStock(){
		if(quantity == 0)
			return true;
		else
			return false;
	}

	public boolean equals(Product p){
		if(p == null)
			return false;
		return (this.upc == p.upc && this.name == p.name );

	}
	public int getUpc() {
		return upc;
	}
	public void setUpc(int upc) {
		this.upc = upc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		
		Product[] store = new Product[50]; 

		
		for (int i=0;i<50;i++)
		{
		    store [i]= new Product();
			store [i].upc=0;
			store[i].setPrice(i*0.5 + 0.5);
			store[i].setName("product"+(i+1));
		}

		store[store.length-1].setPrice(store[store.length-1].getPrice()+0.5);
		
		for (int i=0;i<50;i++)
		{
			System.out.println(store[i].getName());
			System.out.println(store[i].getPrice());
		}
		
		
	}
}
