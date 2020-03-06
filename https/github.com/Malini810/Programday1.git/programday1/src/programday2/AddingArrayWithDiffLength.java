package programday2;

public class AddingArrayWithDiffLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1= {5,8,3,10};
int[] arr2= {2,3};
int len1=arr1.length;
int len2=arr2.length;
int len=len1>len2?len1:len2;
int[] result=new int[len];
int addcount=len1<len2?len1:len2;
int i=0;
while(i<addcount)
{
result[i]=arr1[i]+arr2[i];
i++;
}
	//System.out.println(i);
	while(i<len)
		{
		result[i]=arr1[i];
		i++;
		}
	for(int j=0;j<result.length;j++)
	{
			System.out.println(result[j]);
	}
	}

}
