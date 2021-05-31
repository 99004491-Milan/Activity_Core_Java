import java.util.*;
public class Activity7_ListQ1 {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a=new ArrayList<String>();
		System.out.println(" the player details");
		System.out.println("Enter player name:");
		String temp=sc.next();
		a.add(temp);
		System.out.println("Enter age");
		temp=sc.next();
		a.add(temp);
		System.out.println("Enter Country");
		temp=sc.next();
		a.add(temp);
		System.out.println(" Player Details");
		for(String i:a)
		{
			System.out.println(i);
		}
		System.out.println(" Enter Skill");
		temp=sc.next();
		System.out.println(" Enter the position to add the skill");
		int t=sc.nextInt();
		a.add(t, temp);
		System.out.println(" Player Details");
		for(String i:a)
		{
			System.out.println(i);
		}
		System.out.println(" Enter the position of the detail to be removed");
		t=sc.nextInt();
		a.remove(t);
		System.out.println(" Player Details");
		for(String i:a)
		{
			System.out.println(i);
		}
		
		
		

	}
}
