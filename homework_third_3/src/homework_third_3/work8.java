package homework_third_3;
import java.util.Scanner;
public class work8 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.24
		int n1=(int)(System.currentTimeMillis()%12);
		int n2=(int)(System.currentTimeMillis()%4);
		String str1=null,str2=null;
		switch(n1)
		{
		case 0:
			str1="Ace";
			break;
		case 1:
			str1="2";
			break;  
		case 2:
			str1="3";
			break;
		case 3:
			str1="4";
			break;
		case 4:
			str1="5";
			break;
		case 5:
			str1="6";
			break;
		case 6:
			str1="7";
			break;
		case 7:
			str1="8";
			break;
		case 8:
			str1="9";
			break;
		case 9:
			str1="10";
			break;
		case 10:
			str1="Jack";
			break;
		case 11:
			str1="Queen";
			break;
		case 12:
			str1="King";
			break;
		}
		
		switch(n2)
		{
		case 0:
			str2="Clubs";
			break;
		case 1:
			str2="Diamonds";
			break;
		case 2:
			str2="Hearts";
			break;
		case 3:
			str2="Spades";
			break;
		}
		
		System.out.println("The card you picked is "+str1+" of "+str2);

	}

}
