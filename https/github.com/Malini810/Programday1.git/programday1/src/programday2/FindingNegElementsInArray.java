package programday2;

public class FindingNegElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1= {-5,8,-3,10};
int count=0;
for(int i=0;i<arr1.length;i++)
{
	if(arr1[i]<0)
{
	count++;
	}
}
//System.out.println(count);
int[] result=new int[count];
int j=0;
for(int i=0;i<arr1.length;i++)
{
	if(arr1[i]<0)
		{
		result[j]=arr1[i];
		j++;
		}
	}
	for(int i=0;i<result.length;i++)
	{
		System.out.println(result[i]);
	}
	}

}

