
public class Date {
private int month;
private int day;
private int year;
public
	Date()
	{month=0;
	day=0;
	year=0;
	}
void setDetails(int m,int d,int y)
{
	month=m;
	day=d;
	year=y;
}
int getMonth()
{
	return month;
}
int getDay()
{
	return day;
}
int getYear()
{
	return year;
}
void displayDate()
{
	System.out.println("the date is ");
	System.out.print(month);
	System.out.print("/" +day);
	System.out.print("/" +year);
	
	
}
}
