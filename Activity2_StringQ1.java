import java.util.*;
public class Activity2_StringQ1 {
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String o = s1.substring(0, 1).toUpperCase() + s1.substring(1).toLowerCase();
		System.out.println(o);
		System.out.print(s2.toUpperCase());
		
	}

}
