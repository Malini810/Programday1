package programday2;

public class PlacingOddIndexElementUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {10,20,30,40,50};
int[] result=new int[arr.length/2];
int i=0,j=1;
while(i<result.length)
{
	result[i]=arr[j];
	i++;
	j=j+2;
	}
for(int n=0;n<result.length;n++)
{
System.out.println(result[n]);
}
}
}
