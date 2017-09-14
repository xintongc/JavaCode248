package comp;

import java.util.Arrays;
import java.util.Scanner;

public class monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int succedent[] = new int [8];//这个数组用于保存一个猴子后一位是谁，比如“next[5]的值是7”就是说5号猴子的下一位是7号猴子，6号猴子已经在之前退出了。
		int precedent[] = new int [8]; //这个数组用于保存一个猴子前一位是谁，用法和上面的类似。

		int n, m;

		while (true) {
			Scanner keyin = new Scanner(System.in);		
			System.out.println("Please input 2 intergers");
			n = keyin.nextInt();// n monkeys
			m = keyin.nextInt();//who count m will quit
			//  System.out.println(n);
			// System.out.println(m);
			//cin >> n >> m;

			if (n == 0 && m == 0)
				break;
			for (int i = 0; i < n - 1; i++) {
				succedent[i] = i + 1;
				precedent[i + 1] = i;
			}
			succedent[n - 1] = 0;
			precedent[0] = n - 1;

			int current = 0;
			while (true)
			{
				//如果一共要报m次号，那么取m-1次succedent之后就是需要退出的那只猴子
				for (int count = 1; count < m; count++)
				{
					System.out.println("count "+count);
					System.out.println("current "+ current+ "\t"+ "succedent[current] " + succedent[current]+"\n");

					current = succedent[current];////

					System.out.println("current "+ current+ "\t"+ "succedent[current] " + succedent[current]+"\n");
					System.out.println(Arrays.toString(succedent));
					System.out.println(Arrays.toString(precedent));
				}

				int pre = precedent[current];
				int suc = succedent[current];
				//让current号猴子退出很简单，就是把前一位的“下一位”指向current的下一位，
				//下一位的“前一位”指向current的前一位就好了
				succedent[pre] = suc;
				precedent[suc] = pre;
				if (pre == suc) {
					//如果只剩下两个了，那么每个人的前位和后位就是同一个了。
					//current是退出的，那么另一个就是剩下的。
					//我们的序号是从0编号的，输出时要加一
					System.out.println(pre+1);
					//cout << pre+1 << endl;
					break;
				}
				current = suc;
			}
		}



	}
}

