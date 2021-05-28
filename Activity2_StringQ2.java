import java.util.Scanner;
public class Activity2_StringQ2 {
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String[] temp1=s1.split(" ");
		String[] temp2=s2.split(" ");
		if(temp1[1].toLowerCase().equals(temp2[1].toLowerCase()))
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}
		
	}

}