package programday2;

public class ArrayMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] no= {3,7,2,8,5};
		int min=Integer.MAX_VALUE,i=0;
while(i<no.length)
{
	if(min>no[i])
		{
		min=no[i];
		}
	i++;
	}
System.out.println(min);
	}

}
