package shangji;

import java.util.Scanner;
public class shiuxianhua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=1;
		Scanner input=new Scanner(System.in);
		System.out.println("输入N值：");
		int N=input.nextInt();
		for(int i = 1;i <= N;i ++) {
			m=m*10;
		}
		System.out.println("水仙花数为：");
		for(int i = 100;i < m;i ++) {
			int g = i%10;
			int s = i/10%10;
			int b = i/100;
			if(i==g*g*g+b*b*b+s*s*s)
				System.out.println(i);
			
		}
		
	}

}
