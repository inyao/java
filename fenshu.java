package shangji;

import java.util.Scanner;
public class fenshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		System.out.println("����Nֵ:");
		int N=input.nextInt();
		double sum=0;
		double a=2.0,b=1.0;
		double c=0;
		for(int i = 1;i <= N;i ++) {
		   sum+=a/b;
		   c=a;
		   a=a+b;
		   b=c;
		}
		System.out.println("�������е�ֵΪ��");
		System.out.println(String.format("%.2f",sum));
	}

}
