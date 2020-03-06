package programday1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 44563;
		int rev = 0;
		int temp=n;
		while (n > 0) {
			int rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		System.out.println(rev);
	
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
	
}
}
