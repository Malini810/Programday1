package programday1;

public class Spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1124, sum=0;
		int prod = 1, rem,rev=0;
	int temp=n;
		do {
			while (n > 0) {
				rem = n % 10;
				prod = prod * rem;
				n = n / 10;
			}
		} while (prod > 9);
		System.out.println(prod);
		do {
			while (temp > 0) {
				rev = temp % 10;
				sum = sum + rev;
				temp = temp / 10;
			}
			temp = sum;
		} while (sum > 9);
		System.out.println(sum);
		if(sum==prod)
		{
			System.out.println("Spy No");
		}
	}
}
