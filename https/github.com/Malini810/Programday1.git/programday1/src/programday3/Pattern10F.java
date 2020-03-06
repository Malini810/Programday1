package programday3;

public class Pattern10F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=3;col++)
				{
				if(((row==2)||(row==4)||(row==5))&& ((col==2)||(col==3)))
				{
					System.out.print(" ");
				}
						else
				{
					System.out.print("*");
				}
						}
			System.out.println();
		}
	}

}
