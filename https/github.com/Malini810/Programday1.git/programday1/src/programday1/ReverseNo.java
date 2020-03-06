package programday1;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem = 0;
		int n = 7853;
		while (n > 0) {
			rem = n % 10;
			System.out.println(rem);
			n = n / 10;
		}

	}

}
