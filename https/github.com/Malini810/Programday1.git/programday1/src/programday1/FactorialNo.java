package programday1;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int i=1, fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		while(i<=n)
					{
			fact=fact*i;
			i++;
		}
System.out.println(fact);*/

/* int n1=5,fact=1;
for(int i=1;i<=n1;i++)
{
	fact=fact*i;
	}
System.out.println(fact);
n1--;*/

		int given=5;
		do {
			int fact=1;
			int n=1;
			while(n<=given)
			{
				fact=fact*n;
				n++;
			}
			System.out.println(fact);
			given=given-1;
		}
		while(given>0);
	}
}
