import java.util.*;
public class CustomerMain
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        Customer var=new Customer();
        System.out.println("Enter the details:");
        String tt=sc.nextLine();
        String[] t=tt.split(",");
      
        var.setName(t[0]);
        var.setAddress(t[1]);
        var.setMobile(t[2]);
        System.out.print("Name: ");
        System.out.println(var.getName());
        System.out.print("Address: ");
        System.out.println(var.getAdress());
        System.out.print("Mobile:");

        System.out.println(var.getMobile());





    }
    
}


class Customer
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

