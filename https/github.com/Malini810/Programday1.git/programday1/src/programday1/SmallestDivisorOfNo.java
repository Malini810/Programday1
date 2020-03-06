package programday1;

public class SmallestDivisorOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=105;
int div=2;
while(div<=n)
{
	if(n%div==0)
		{
		System.out.println(div);
		break;
		}
	div++;
	}
	}

}
