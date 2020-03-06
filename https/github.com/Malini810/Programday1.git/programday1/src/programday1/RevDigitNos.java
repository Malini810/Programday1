package programday1;

public class RevDigitNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem=0;
		int noOfdigits=0;
		int n=7853;
		while(n>0)
		{
		rem=n%10;
			n=n/10;
			noOfdigits++;
			}
		System.out.println(noOfdigits);
			}
	}
