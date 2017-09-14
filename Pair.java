package comp;

public class Pair {
	int first, second;
	public Pair(){
	first = second = 0;
	}
	public Pair(int f, int s){
	first = f; second = s;}
	int getFirst() {
	return first;
	}
	int getSecond() {
	return second;
	}
	void setFirst(int f) {
	first = f;
	}
	void setSecond(int s) {
	second = s;
	}
	void printPair() {
	System.out.println("Pair: " + first + ", " + second);
	}
}
