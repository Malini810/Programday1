package programday2;

public class CopyingArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1= {3,8,2,5,4};
int len=arr1.length;
int[] arr2=new int[len];
int n=0,j=arr1.length-1;
while(n<arr1.length)
{
	arr2[n]=arr1[j];
	n++;
	j--;
	}
for(int i=0;i<arr2.length;i++)
{
System.out.println(arr2[i]);
}
	}

}
