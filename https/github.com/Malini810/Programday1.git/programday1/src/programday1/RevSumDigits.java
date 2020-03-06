package programday1;

public class RevSumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 44563;
		int rev = 0;
			while (n > 0) {
			int rem = n % 10;
			rev = rev + rem;
			System.out.println(rev);
			n = n / 10;
		}
		
	}

}
