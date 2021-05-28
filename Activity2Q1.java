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

class EmployeeMain {
    public void call() throws Exception
    {
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
        System.out.println("Employee Details");
        System.out.print("Name: ");
        System.out.println(var.getName());
        System.out.print("Address: ");
        System.out.println(var.getAdress());




    }
    
}

public class Activity2Q1{
public static void main(String args[]) throws Exception{
 EmployeeMain temp=new EmployeeMain();
temp.call();

}}
