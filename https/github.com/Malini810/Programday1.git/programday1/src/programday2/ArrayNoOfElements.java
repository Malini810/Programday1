package programday2;

public class ArrayNoOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {10,20,30,10,40,10,20,10,10};
int search=10,count=0,i=0;
while(i<array.length)
{
	if(array[i]==search)
		{
		count++;
		}
i++;	
}
System.out.println(count);
	}
}
