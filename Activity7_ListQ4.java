import java.util.ArrayList;
import java.util.Scanner;
public class Activity7_ListQ4{

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			a1.add(sc.nextInt());
		}
		int count1 =0;
		int count2=0;
		for(Integer z:a1)
		{
			if(z>=50)
			{
				count1++;
			}
			if(z>=100)
			{
				count2++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
	
	}
}