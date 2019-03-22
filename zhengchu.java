package shangji;

public class zhengchu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i = 1;i <= 20;i ++) {
			if(i%3!=0)
				continue;
			sum+=i;
		}
		System.out.println("能被三整除的数的和为："+sum);
	}

}
