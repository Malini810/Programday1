package programday1;

public class First20Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int PrimeCount = 1;
		int n = 3;
		System.out.println("2 is a prime no");
		while (PrimeCount < 20) {
			int div = 3;
			boolean check = true;
				if (n % 2 != 0) {
					while (div < n) {
						if (n % div == 0) {
							// System.out.println("Not prime:" +n);
							check = false;
							break;
						}
						div = div + 2;
					}
					if (check == true) {
						System.out.println(n + "is a Prime no");
						PrimeCount++;
					}

				}

				else {
					// System.out.println("Not prime");
				}

				n = n + 2;	
		}

			
		}

	}
