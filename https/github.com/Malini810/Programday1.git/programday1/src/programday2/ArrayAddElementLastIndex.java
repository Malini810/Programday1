package programday2;

public class ArrayAddElementLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array1= {5,6,3,4,7};
int no=60;
int len=array1.length;
int[] array2=new int[len+1];
int len2=array2.length;
array2[len2-1]=no;
for(int i=0;i<array1.length;i++)
{
	array2[i]=array1[i];
	}
for(int i=0;i<array2.length;i++)
{
System.out.println(array2[i]);
	}
}
}
