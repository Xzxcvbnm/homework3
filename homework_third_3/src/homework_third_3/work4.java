package homework_third_3;
import java.util.Scanner;
public class work4 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.19 
		int a,b,c;
		System.out.println("�����������ε������ߣ�");
		Scanner n=new Scanner(System.in);
		System.out.println("a=");
		a=n.nextInt(); 
		System.out.println("b=");
		b=n.nextInt();
		System.out.println("c="); 
		c=n.nextInt();
		if(a+b>c&&a+c>b&&b+c>a)
			System.out.println("�����ε��ܳ�Ϊ��"+a+b+c);
		else
			System.out.println("Invalid input");

	}

}
