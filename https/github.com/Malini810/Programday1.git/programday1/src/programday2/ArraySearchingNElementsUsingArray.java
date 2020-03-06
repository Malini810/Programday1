package programday2;

public class ArraySearchingNElementsUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {10,20,10,30,40,10,25,20};
int[] search= {10,20};
int j=0;
while(j<2)
{
int i=0,count=0;
while(i<arr.length)
{
	if(arr[i]==search[0])
	{
		count++;
	
	}
	i++;
}
System.out.println(count);
j++;	
}
	}
}
