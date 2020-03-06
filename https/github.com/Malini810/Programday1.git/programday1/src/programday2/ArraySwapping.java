package programday2;

public class ArraySwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] m= {91,76,89,76,99,92};
m[2]=m[2]+m[4];
m[4]=m[2]-m[4];
m[2]=m[2]-m[4];
System.out.println(m[2]);
System.out.println(m[4]);
	}

}
