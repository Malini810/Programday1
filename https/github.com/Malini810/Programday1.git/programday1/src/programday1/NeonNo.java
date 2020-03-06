package programday1;

public class NeonNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=9,rem=0,count=0;
int temp=n;
int sq=n*n;
System.out.println(sq);
while(sq>0)
{
	rem=sq%10;
	count=count+rem;
	sq=sq/10;
	}
System.out.println(count);
if(temp==count)
{
	System.out.println("Neon no");
	}
else
{
	System.out.println("Not a neon no");}
}
}
