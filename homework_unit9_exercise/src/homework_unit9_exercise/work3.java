package homework_unit9_exercise;
import java.util.GregorianCalendar;
public class work3 {

	public static void main(String[] args) {
		//9.5
		GregorianCalendar x = new GregorianCalendar();
		
		System.out.print(x.get(GregorianCalendar.YEAR)+"��");
		System.out.print(x.get(GregorianCalendar.MONTH)+"��");
		System.out.print(x.get(GregorianCalendar.DAY_OF_MONTH)+"��");
		System.out.println();
		
		x.setTimeInMillis(1234567898765L);
		System.out.print(x.get(GregorianCalendar.YEAR)+"��");
		System.out.print(x.get(GregorianCalendar.MONTH)+"��");
		System.out.print(x.get(GregorianCalendar.DAY_OF_MONTH)+"��");
		System.out.println();

	}

}
