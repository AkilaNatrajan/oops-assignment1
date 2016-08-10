import java.util.Arrays;
import java.util.Scanner;
public class Sales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		int i,k,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of sales persons");
		int n=input.nextInt();
		double []gs=new double[n];
		int []counter=new int[9];
		Arrays.fill(counter, 0);
		System.out.println("enter the gross pay for the sales employees");
		for(i=0;i<n;i++)
		{
			System.out.println("enter the gross pay");
			gs[i]=input.nextDouble();
		}
		for(i=0;i<n;i++)
		{
			gs[i]=200+(0.09*gs[i]);
		}
		System.out.println("the gross pay of the employees are");
		for(i=0;i<n;i++)
		{
			
			j=i+1;
			System.out.println("employee" +j);
			
			System.out.println(gs[i]);
		}
		for(i=0;i<n;i++)
		{
			if(gs[i]>=200&&gs[i]<=299)
			{
				k=0;
				counter[k]++;
				
			}
			else if(gs[i]>=300&&gs[i]<=399)
			{
				k=1;
				counter[k]++;
				
			}

			else if(gs[i]>=400&&gs[i]<=499)
			{
				k=2;
				counter[k]++;
				
			}

			else if(gs[i]>=500&&gs[i]<=599)
			{
				k=3;
				counter[k]++;
				
			}
			else if(gs[i]>=600&&gs[i]<=699)
			{
				k=4;
				counter[k]++;
				
			}
			else if(gs[i]>=700&&gs[i]<=799)
			{
				k=5;
				counter[k]++;
				
			}
		
		else if(gs[i]>=800&&gs[i]<=899)
		{
			k=6;
			counter[k]++;
			
		}
		else if(gs[i]>=900&&gs[i]<=999)
		{
			k=7;
			counter[k]++;
			
		}
		else
		{
			k=8;
			counter[k]++;
			
		}
		
			
			}
		System.out.println("number of employees whose pay is between$200-$299 is"+counter[0]);
		System.out.println("number of employees whose pay is between$300-$399 is"+counter[1]);
		System.out.println("number of employees whose pay is between$400-$499 is"+counter[2]);
		System.out.println("number of employees whose pay is between$500-$599 is"+counter[3]);
		System.out.println("number of employees whose pay is between$600-$699 is"+counter[4]);
		System.out.println("number of employees whose pay is between$700-$799 is"+counter[5]);
		System.out.println("number of employees whose pay is between$800-$899 is"+counter[6]);
		System.out.println("number of employees whose pay is between$900-$999 is"+counter[7]);
		System.out.println("number of employees whose pay is $1000 and above is"+counter[8]);
		
}
	}
