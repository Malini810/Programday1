package programday1;

public class LeastCommonMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 18, n2 = 30;
		int big = n1 > n2 ? n1 : n2;
		int big2 = big;
		int small = n1 < n2 ? n1 : n2;
		while (true) {
			if (big % small == 0) {
				System.out.println("LCM:" + big);
				break;
			}
			big += big2;
		}
	}
}
