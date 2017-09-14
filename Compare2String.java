package comp;

public class Compare2String {

private static boolean sameArray(String[] a1, String a2[]){
		
		for( int i=0; i< a1.length; i++)
		{
			boolean same = false;
			for( int j=0; j< a2.length; j++)
			{
				if(a1[i].equals(a2[j]))
					{
					same = true;
					break;
					}
			}
			if(!same)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] b1 = {"sone354","encs282", "comp232"};
		String[] b2 = {"sone353","encs282", "comp232"};
		System.out.print(Compare2String.sameArray(b1,b2));
	}

}
