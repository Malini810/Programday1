package programday2;

public class ArrayMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] no= {-3,-7,-2,-8,-5};
		int max=Integer.MIN_VALUE,i=0;
while(i<no.length)
{
	if(max<no[i])
		{
		max=no[i];
		}
	i++;
	}
System.out.println(max);
	}
}
