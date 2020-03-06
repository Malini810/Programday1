package programday1;

public class ArmStrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=153;
int count=0,rem=0;
int temp=n;
while(n>0)
{
	rem=n%10;
	count=count+(rem*rem*rem);
	n=n/10;
	}
if(temp==count)
{
	System.out.println("Armstrong no");
}
else
{
	System.out.println("Not an armstrong no");
}
	}

}
