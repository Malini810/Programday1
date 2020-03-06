package programday2;

public class ArrayMovingTowardsLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {5,10,15,20,25};
int i=0,temp1=a[0],temp2=a[1];
while(i<3)
{
	a[i]=a[i+2];
i++;	
}
System.out.println(a[3]);
	}

}
