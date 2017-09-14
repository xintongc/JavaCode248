package comp;

public class SODAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] scores ={{1,2,3},{1,1,1},{3,4,5},{10,20,30}};
		
		final int SODAS = scores.length;
		final int PEOPLE = scores[0].length;
		
		int[] sodaSum= new int[SODAS];
		int[] personSum= new int[PEOPLE];
		
		for (int soda=0; soda < SODAS; soda++)
			for (int person=0; person < PEOPLE; person++)
			{
			sodaSum[soda] += scores[soda][person];
			personSum[person] += scores[soda][person];
			}
		
		for (int soda=0; soda < SODAS; soda++)
			System.out.println("Soda #" + (soda+1) + ": " + sodaSum[soda]);
			for (int person =0; person < PEOPLE; person++)
			System.out.println ("Person #"+ (person+1) +": "+ personSum[person]);
		
			
	}
}
