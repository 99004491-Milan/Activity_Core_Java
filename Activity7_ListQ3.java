import java.util.ArrayList;
import java.util.Scanner;
public class Activity7_ListQ3{

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a1=new ArrayList<String>();
		ArrayList<String> a2=new ArrayList<String>();
		System.out.println(" the top 5 scorers of IPL Season 13");
		String t="";
		for(int i=0;i<5;i++)
		{
			t=sc.next();
			a1.add(t);
		}
		System.out.println(" the top 5 scorers of IPL Season 12");
		for(int i=0;i<5;i++)
		{
			t=sc.next();
			a2.add(t);
		}
		System.out.println("Consistent run scorers");
		for(String i:a1)
		{
			for(String j:a2)
			{
				if(i.equals(j))
				{
					System.out.println(i);
				}
			}
		}
	}
}