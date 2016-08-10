import java.util.Scanner;
public class DataTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d=new Date();
Scanner input=new Scanner(System.in);
System.out.println("enter month, day and year");
int m=input.nextInt();
int da=input.nextInt();
int y=input.nextInt();
d.setDetails(m, da, y);
System.out.println("the given month is" + d.getMonth());
System.out.println("the given day is" + d.getDay());
System.out.println("the given year is" + d.getYear());
d.displayDate();
	}

}
