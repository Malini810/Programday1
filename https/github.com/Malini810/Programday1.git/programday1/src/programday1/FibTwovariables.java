package programday1;

public class FibTwovariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1;
		System.out.println(first);
		System.out.println(second);
		for(int i=2;i<=10;i++)
		{
			second=first+second;
			System.out.println(second);
			first=second-first;
			}
	}

}
