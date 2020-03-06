package programday1;

public class PrimeNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2,div=3;
		boolean check=true;
	if(n==2)
	{
		
		System.out.println("Prime");
	}
	else
	{
		if(n%2!=0)
		{
		while(div<n)
{
	if(n%div==0)
		{
		System.out.println("Not prime:" +n);
		check=false;
		break;
		}
	div=div+2;
	}
		if(check==true)
		{
			System.out.println("Prime");
		}
	}
		else {
			System.out.println("Not prime");
		}
	}
}

}
