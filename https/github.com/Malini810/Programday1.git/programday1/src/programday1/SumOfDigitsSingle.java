package programday1;

public class SumOfDigitsSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=311991,sum,rem;

do {	
	 sum=0;
while(n>0)
{
	rem=n%10;
	sum=sum+rem;
	n=n/10;
		}
n=sum;
}while(sum>9);
System.out.println(sum);
	}
	}

