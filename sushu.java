package shangji;

import java.util.Scanner;
public class sushu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int b=0;
		Scanner s = new Scanner(System.in);
		System.out.println("输入范围");
		int M = s.nextInt();
		int N = s.nextInt();
		if(M>N) {
			int L=M;
			M=N;
			N=L;
		}
		for(int i = M;i < N;i ++) {
			int j;
			for(j = 2;j <= i;j ++) {
				
				if(i%j==0)
					break;
			}
			if(i==1)
				continue;
			if(j>i/2) {
				sum+=j;
				b++;
			}	
		}
		System.out.println("有"+b+"个素数");
		System.out.println("素数的和为："+sum);
		
	}

}
