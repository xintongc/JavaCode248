package comp;

public class PrimeNumber {

	public static void main(String[] args) {

		int sum=0;
		int a[]=new int [100];
		for(int i =2;i<Math.sqrt(100);i++)
		{
			sum = i;
			if(a[sum]==0)
			{
				while(sum<100)
				{
					sum = sum+i;
					if(sum<100) a[sum]=1;
				}
			}
		}
			for(int i =2; i<100; i++)
			{
				if(a[i]==0) System.out.println(i);
			}
	}

}
