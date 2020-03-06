package programday2;

public class ArraySecMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] no= {3,7,2,8,5};
int max=Integer.MIN_VALUE;
int max2=Integer.MIN_VALUE;
int i=0;
while(i<no.length)
{
if(no[i]>max)
{
	max2=max;
	max=no[i];
	}
else if(no[i]>max2)
{
	max2=no[i];
	}
i++;
}
System.out.println(max);
System.out.println(max2);
	}

}
