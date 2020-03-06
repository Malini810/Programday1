package programday2;

public class ArraySwapUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m[]= {92,99,93,97,84};
int i=0;
int temp=m[i];
while(i<m.length-1)
{
	m[i]=m[i+1];
	i++;
	}
m[i]=temp;
System.out.println(m[0]);
}
}
