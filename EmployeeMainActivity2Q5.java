import java.util.*;
import java.io.*;
class Employee
{
    private String name;
    private String address;
    private String mobile;
    public void setName(String n)
    {
        name=n;

    }
    public void setAddress(String n)
    {
        address=n;
    }
    public void setMobile(String n)
    {
        mobile=n;
    }
    public String getName()
    {
        return name;
    }
    public String getMobile()
    {
        return mobile;
    }
    public String getAdress()
    {
        return address;
    }
}


public class EmployeeMainActivity2Q5{
public static void main(String args[]) throws Exception{
    
        Scanner sc=new Scanner(System.in);
        Employee var=new Employee();
        System.out.println("Enter the name:");
        String t1=sc.nextLine();
        System.out.println("Enter the address:");
        String t2=sc.nextLine();
        System.out.println("Enter the mobile:");
        String t3=sc.nextLine();
        var.setName(t1);
        var.setAddress(t2);
        var.setMobile(t3);
        
        while(true)
        {
            System.out.println("Employee Details");
        System.out.print("Name: ");
        System.out.println(var.getName());
        System.out.print("Address: ");
        System.out.println(var.getAdress());
        System.out.print("Mobile: ");
        System.out.println(var.getMobile());
        
            System.out.prinln("Verify and Update the details");
            System.out.prinln("Menu");
            System.out.prinln("1. Update Employee name");
            System.out.println("2.Update Employee name ");
            System.out.println("3. Update Employee mobile");
            System.out.println("4. All information correct/exit ");
            int temp=sc.nextInt();
            if(temp==4)
            {
                break;
            }
            if(temp==1)
            {
                Sytem.out.println("Current name is:"+ var.getName());
                System.out.println("Enter the name:");
                String t1=sc.nextLine();
                var.setName(t1);

            }
            if(temp==2)
            {
                Sytem.out.println("Current address is:"+ var.getAdress());
                System.out.println("Enter the address:");
                String t1=sc.nextLine();
                var.setAddress(t1);

            }
            if(temp==3)
            {
                Sytem.out.println("Current mobile is:"+ var.getMobile());
                System.out.println("Enter the mobile:");
                String t1=sc.nextLine();
                var.setMobile(t1);

            }
            
        }




    
 

}
}