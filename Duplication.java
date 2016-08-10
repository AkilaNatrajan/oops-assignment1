import java.util.Scanner;
public class Duplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,l;
		int k=0;
		int flag;
		System.out.println("enter the number of elements in the array");
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int []a=new int[n];
		System.out.println("enter the elements of the array between 10 1nd 100(inclusive)" );
		for(i=0;i<n;i++)
		{	flag=0;
			System.out.println("enter the element");
			int c=input.nextInt();
			if(i==0)
			{
				a[k]=c;
				k++;
			}
			else
			{
				for(j=0;j<i;j++)
				{
					if(c==a[j])
					{
						flag=-1;
						break;			
					}
				}
				if(flag==0)
				{
					a[k]=c;
					k++;
				}
				
			}
			System.out.println("the elements are");
			for(l=0;l<k;l++)
			{
	System.out.println(a[l]);
			}
		}


	}

}
