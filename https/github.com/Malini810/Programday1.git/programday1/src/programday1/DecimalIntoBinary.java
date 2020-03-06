package programday1;

public class DecimalIntoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4;
String rem="";
while(n>0)
{
rem=n%2+rem;
n=n/2;
}
System.out.print(rem);
}
}
