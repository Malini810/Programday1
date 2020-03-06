package programday2;

public class Arrayloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] marks= {92,93,99,97,74};
boolean nopresent=false;
for(int i=0;i<marks.length;i++)
{
	if(marks[i]==93)
		{
		nopresent=true;
		System.out.println("I got");
		break;
		}
	}
	if(nopresent==false)
		{
		System.out.println("Mark is not present");
		}
		}

}
