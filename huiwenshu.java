import java.util.Scanner;

public class huiwenshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("������һ��������");
		int sum=0;
		int num = s.nextInt();
		String str = Integer.toString(num); 
		//������ת�����ַ���
		int length = str.length();
		//�ַ�������
		int []number=new int[length];
		
		for(int i = 0;i < length;i++) {
		number[i] = Integer.parseInt(str.charAt(i)+"");	
		} 
		int temp;
		int []number2 =new int[length];
		for(int i=0;i<length;i++) {
			number2[length-i-1]=number[i];
		}
		//������number[]�е����������number2[]��
		for(int i = 0;i < length;i++) {
			if(number[i]!=number2[i]) {	
				break;
			}
			sum=i+1;
			}
		if(sum==length)
			System.out.println("��");
		else
			System.out.println("����");
		/*for(int i1 = 0;i1 < length;i1++) {
			System.out.print(number[i1]+" ");
		}
		for(int i1 = 0;i1 < length;i1++) {
			System.out.print(number2[i1]+" ");
		}*/
	}

}
