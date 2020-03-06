package programday2;

public class ArraySearchingNElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,20,30,10,40,10,20,10,10};
		int search1=10,search2=20,count=0,count1=0,i=0;
		while(i<array.length)
		{
			if(array[i]==search1)
				{
				count++;
				}
				else if(array[i]==search2)
		{
			count1++;
		}
			i++;
		}
		System.out.println(count);
		System.out.println(count1);
	}
}
