package programday2;
import java.util.Scanner;
public class ArrayDenominations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] denom={2000,500,200,100};
int totalNotes=0,i=0,count=0;
Scanner sc=new Scanner(System.in);
int amount=sc.nextInt();
while(i<denom.length)
{
	count=amount/denom[i];
	if(count!=0)
	{
		System.out.println(count);
	}
	totalNotes=totalNotes+count;
	amount=amount%denom[i];
   i++;
}
	}

}
