package programday2;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
args=new String[5];
		System.out.println(args.length);
System.out.println(args);
args[0]="hai";
System.out.println(args[0]);
int total=0;
Scanner sc=new Scanner(System.in);
int len=sc.nextInt();
int[] marks=new int[len];
for(int i=0;i<len;i++)
{
	System.out.println("Please enter marks");
	marks[i]=sc.nextInt();
			total=total+marks[i];
	}
System.out.println(total);

	}
}

