package programday2;

public class PrintRevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {5,8,4,3,9,2};
/*for(int i=array.length-1;i>=0;i--)
{
	System.out.println(array[i]);
	}*/

//index position

/*for(int i=0;i<array.length;i++)
{
	if(array[i]==8)
	{
	System.out.println("15 is present at:"+i);}
	}*/

//print element by index
for(int i=array.length-1;i>=0;i++)
{
	if(i==3)
		{
		System.out.println(array[i]);
		}
	}
	}
}
