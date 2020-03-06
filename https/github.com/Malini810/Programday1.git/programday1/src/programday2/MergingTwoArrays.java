package programday2;

public class MergingTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {10,20,30};
int[] b= {5,15};
int[] result=new int[a.length+b.length];
int i=0,k=0;
while(i<result.length)
{
	if(i<a.length)
	{
	result[i]=a[i];
	}
	else
	{
		result[i]=b[k];
		k++;
	}
	i++;
}
for(int j=0;j<result.length;j++)
{
System.out.println(result[j]);
}
}
}
