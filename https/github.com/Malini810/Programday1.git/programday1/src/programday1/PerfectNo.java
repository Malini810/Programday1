package programday1;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=6,sum=0;
int temp=n;
for(int i=1;i<n;i++)
{
	if(n%i==0)
	{
		sum=sum+i;
		}
			}
	if(sum==temp)
	{
		System.out.println("perfect");
	}
	}
}
