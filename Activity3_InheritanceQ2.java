import java.util.Scanner;

class HotelRoom
{
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTv;
	protected boolean hasWifi;
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTv = hasTv;
		this.hasWifi = hasWifi;
	}
	public int getRatePerSqFeet()
	{
		return 0;
		
	}
	public int  CalculateTarrif()
	{
		return getRatePerSqFeet()*numberOfSqFeet;
		
	}
	
}
class DeluxeRoom extends HotelRoom
{
	protected int ratePerSqFeet;

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		this.ratePerSqFeet = 10;
	}
	public int getRatePerSqFeet()
	{
		if(hasWifi)
		{
			return ratePerSqFeet+2;
		}
		return ratePerSqFeet;
		
	}
	public int  CalculateTarrif()
	{
		return getRatePerSqFeet()*numberOfSqFeet;
		
	}
	
}
class DeluxACRoom extends DeluxeRoom
{
	
	public DeluxACRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		ratePerSqFeet = 12;
	}

	
}
class SuiteACRoom extends HotelRoom
{
	private int ratePerSqFeet=15;

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		
	}
	public int getRatePerSqFeet()
	{
		if(hasWifi)
		{
			return ratePerSqFeet+2;
		}
		return ratePerSqFeet;
		
	}
	public int  CalculateTarrif()
	{
		return getRatePerSqFeet()*numberOfSqFeet;
		
	}
	
}
public class Activity3_InheritanceQ2 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Tariff Calculator 1. Deluxe Room 2. Deluxe AC Room3. Suite AC Room Select Room Type:");
		int t=sc.nextInt();
		if(t==1)
		{
			System.out.println("HotelName:");
			String t1=sc.next();
			System.out.println("Room Square Feet Area");
			int t2=sc.nextInt();
			System.out.println("Room has TV (yes/no):");
			String t3=sc.next();
			System.out.println("Room has wifi (yes/no):");
			String t4=sc.next();
			boolean t5;
			boolean t6;
			if(t3.equals("yes"))
			{
				t5=true;
				
			}
			else
			{
				t5=false;
			}
			if(t4.equals("yes"))
			{
				t6=true;
				
			}
			else
			{
				t6=false;
			}
			DeluxeRoom temp=new DeluxeRoom (t1,t2,t5,t6);
			System.out.print(temp.CalculateTarrif());
			
			
			
		}
		if(t==2)
		{
			System.out.println("HotelName:");
			String t1=sc.next();
			System.out.println("Room Square Feet Area");
			int t2=sc.nextInt();
			System.out.println("Room has TV (yes/no):");
			String t3=sc.next();
			System.out.println("Room has wifi (yes/no):");
			String t4=sc.next();
			boolean t5;
			boolean t6;
			if(t3.equals("yes"))
			{
				t5=true;
				
			}
			else
			{
				t5=false;
			}
			if(t4.equals("yes"))
			{
				t6=true;
				
			}
			else
			{
				t6=false;
			}
			DeluxACRoom temp=new DeluxACRoom (t1,t2,t5,t6);
			System.out.print(temp.CalculateTarrif());
			
		}
		if(t==2)
		{
			System.out.println("HotelName:");
			String t1=sc.next();
			System.out.println("Room Square Feet Area");
			int t2=sc.nextInt();
			System.out.println("Room has TV (yes/no):");
			String t3=sc.next();
			System.out.println("Room has wifi (yes/no):");
			String t4=sc.next();
			boolean t5;
			boolean t6;
			if(t3.equals("yes"))
			{
				t5=true;
				
			}
			else
			{
				t5=false;
			}
			if(t4.equals("yes"))
			{
				t6=true;
				
			}
			else
			{
				t6=false;
			}
			SuiteACRoom temp=new SuiteACRoom (t1,t2,t5,t6);
			System.out.print("Room Tariff per day is:"+temp.CalculateTarrif());
			
		}
		
	}

}
