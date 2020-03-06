package programday1;

public class BinaryIntoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1001;
int rem, dec=0,power=0;
while(n>0)
{
rem=n%10;
//System.out.println(rem);
dec=dec+rem*(int)Math.pow(2, power);
n=n/10;
power++;
}
System.out.println(dec);
}
}
