package programday2;

public class AddAdjacentElementsbetweenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,5,8,15};int s=0;
while(s<arr.length-1)
{
	int no1=arr[s];
	int no2=arr[s+1];
	int big=no1>no2?no1:no2;
	int small=no1<no2?no1:no2;
for(int i=small+1;i<big;i++)
{
	System.out.println(i);
	}
s++;
	}

}
}
