package programday1;

public class FibonacciSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int first=0,second=1;
System.out.println(first);
System.out.println(second);
for(int i=2;i<=10;i++)
{
	int third=first+second;
	System.out.println(third);
	first=second;
	second=third;
	}*/
	/*	int first=0,second=1,count=0;
		System.out.println(first);
		System.out.println(second);
		while(true)
		{
				int third=first+second;
				count++;
				if(count==10)
				{
			System.out.println(third);
			break;
				}
				first=second;
			second=third;
		}*/
		int first=0,second=1,count=0;
		//System.out.println(first);
		//System.out.println(second);
		while(true)
		{
				int third=first+second;
				count++;
				first=second;
			   second=third;
				if(third==233)
				{
			System.out.println("I got");
			break;
				}
				else if(third>233)
				{
					System.out.println("Not in series");}
				}
	}
}

