package programday2;

public class Arraydec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] by = new byte[6];
		System.out.println(by[0]);
		
		short[] sh = new short[6];
		System.out.println(sh[0]);
		
		int[] arr = new int[6];
		System.out.println(arr[0]);
		
		float[] arr1 = new float[6];
		System.out.println(arr1[0]);
		
		double[] arr3 = new double[6];
		System.out.println(arr3[0]);

		long[] lg = new long[6];
		System.out.println(lg[0]);
		
		char[] arr4 = new char[6];
		System.out.println(arr4[0]);
		
		String[] arr5 = new String[5];
		System.out.println(arr5[4]);
		
		int[] marks=new int[3];
		marks[0]=90;
		marks[1]=85;
		marks[2]=45;
		int l=marks.length;
		for(int i=0;i<l;i++)
		{
		System.out.println(marks[i]);
		}
		
		int[] marks2= {90,87,45,37,78};
		int n=0;
		while(n<=marks2.length-1)
		{
		System.out.println(marks2[n]);
		n++;
		}
	}

}
