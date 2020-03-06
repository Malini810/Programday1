package programday2;

public class ArrayDelPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {5,3,2,4,7};
int n=7,i=0;
while(i<array.length)
{
	if(array[i]==n)
		{
		
		break;
			}
	i++;
	}
if(i==array.length)
{
	System.out.println("No is not present");
	}
else
{
System.out.println("3 is present at:" +i);
}
for(int j=i;j<array.length-1;j++)
{
	array[j]=array[j+1];
	}
System.out.println(array[0]);
	}

}
