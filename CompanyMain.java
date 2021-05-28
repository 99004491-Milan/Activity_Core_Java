import java.util.*;
public class CompanyMain
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        Company var=new Company();
        System.out.println("Enter the company name:");
        String n=sc.nextLine();
        System.out.println("Enter the employees:");
        String n1=sc.nextLine();
        System.out.println("Enter TeamLead:");
        String n2=sc.nextLine();
        var.setName(n);
        var.setEmployees(n1);
        var.setLead(n2);
        int flag=0;
        String[] e=var.getEmployees().split(",");
        for( String i:e)
        {
            if(i.equals(var.getLead()))
            {
               
                flag=1;
            }
        }
      
      if(flag==1)
      {
        System.out.print("Name: ");
        System.out.println(var.getName());
        System.out.print("Employees: ");
        System.out.println(var.getEmployees());
        
        System.out.print("Lead:");
        System.out.println(var.getLead());
      }
       
        if(flag==0)
        {
            System.out.print("Invalid Input");
        }





    }
    
}


class Company
{
    private String name;
    private String employees;
    private String lead;
    public void setName(String n)
    {
        name=n;

    }
    public void setEmployees(String n)
    {
        employees=n;
    }
    public void setLead(String n)
    {
        lead=n;
    }
    public String getName()
    {
        return name;
    }
    public String getEmployees()
    {
        return employees;
    }
    public String getLead()
    {
        return lead;
    }
}

