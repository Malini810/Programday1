package programday3;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 3; col++) 
				{
				if((row==1) || (row==5))	
				{
					if(col==1)
					{
						System.out.print(" ");
					}
									else
				{
					System.out.print("*");
				}
				}
					else if(col==1)
					{
						System.out.print("*");
					}
	}
	System.out.println();
		}
	}
}
