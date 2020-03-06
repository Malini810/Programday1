package programday2;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int len=sc.nextInt();
int[] marks=new int[len];
for(int i=0;i<len;i++)
{
	System.out.println("Enter marks:");
	marks[i]=sc.nextInt();
	}
System.out.println(marks[1]);
	}

}
