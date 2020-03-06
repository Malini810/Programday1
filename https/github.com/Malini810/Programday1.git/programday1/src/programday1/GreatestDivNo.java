package programday1;

public class GreatestDivNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=31,n2=32;
int small=n1<n2?n1:n2;
boolean common=false;
while(small>=2)
{
if((n1%small==0) && (n2%small==0))
{
	common=true;
	System.out.println("GCD:"+small);
	break;
	}
small--;
	}
if(common==false)
{
	System.out.println("Not GCD");}
	}
}
