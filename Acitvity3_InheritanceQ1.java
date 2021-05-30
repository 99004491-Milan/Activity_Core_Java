import java.util.Scanner;
abstract class Vehicle
{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
	
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	public void displayMake()
	{
		System.out.println("***"+this.make+"***");
		
	}
	public void displayBasicInfo()
	{
		System.out.println("---Basic Information");
		System.out.println(this.vehicleNumber);
		System.out.println(this.fuelType);
		System.out.println(this.fuelCapacity);
		System.out.println(this.cc);
	}
	public abstract void displayDetailInfo();
	
	
}
class TwoWheeler extends Vehicle
{
	private boolean kickStartAvailable;
	

	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		System.out.println("Kick Start available"+kickStartAvailable);
	}
}
class FourWheeler extends Vehicle
{
	private String audioSystem;
	private int numberOfDoors;
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
			int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		System.out.println(audioSystem);
		System.out.println(numberOfDoors);
	}
}

public class Acitvity3_InheritanceQ1 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		int t=sc.nextInt();
		if(t==1)
		{
			System.out.println("Vehicle Make");
			String t1=sc.next();
			System.out.println("Vehicle Number");
			String t2=sc.next();
			System.out.println("Fuel Tpye: \n 1.Petrol \n 2.Diesel");
			int t3=sc.nextInt();
			String t4="";
			if(t3==1)
			{
				 t4="Petrol";
			}
			else
			{
				 t4="Diesel";
			}
			System.out.println("Fuel Capacity");
			int t5=sc.nextInt();
			System.out.println("Engine CC");
			int t6=sc.nextInt();
			System.out.println("Audio System");
			String t7=sc.next();
			System.out.println("Number of Doors");
			int t8=sc.nextInt();
			FourWheeler temp=new FourWheeler(t1,t2,t4,t5,t6,t7,t8);
			temp.displayMake();
			temp.displayBasicInfo();
			temp.displayDetailInfo();
			
			
			
			
		}
		else
		{
			System.out.println("Vehicle Make");
			String t1=sc.next();
			System.out.println("Vehicle Number");
			String t2=sc.next();
			System.out.println("Fuel Tpye: \n 1.Petrol \n 2.Diesel");
			int t3=sc.nextInt();
			String t4="";
			if(t3==1)
			{
				 t4="Petrol";
			}
			else
			{
				 t4="Diesel";
			}
			System.out.println("Fuel Capacity");
			int t5=sc.nextInt();
			System.out.println("Engine CC");
			int t6=sc.nextInt();
			System.out.println("Kick Start Available");
			String t7=sc.next();
			
			if(t7.equals("yes"))
			{
			TwoWheeler temp=new TwoWheeler(t1,t2,t4,t5,t6,true);
			temp.displayMake();
			temp.displayBasicInfo();
			temp.displayDetailInfo();
			}
			else
			{
				TwoWheeler temp=new TwoWheeler(t1,t2,t4,t5,t6,false);
				temp.displayMake();
				temp.displayBasicInfo();
				temp.displayDetailInfo();
			}
			
			
		}
		
	}

}
