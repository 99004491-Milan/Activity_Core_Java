import java.util.*;
class Innings
{
    private String teamname;
    private String inningsname;
    private int runs;
    public void set_teamname(String n)
    {
        teamname=n;
    }
    public void set_inningsname(String n)
    {
        inningsname=n;
    }
    public void set_runs(int n)
    {
        runs=n;
    }
    public String get_teamname()
    {
        return teamname;
    }
    public String get_innings_name()
    {
        return inningsname;
    }
    public int get_runs()
    {
        return runs;
    }
}
public class InningsMain {
    public static void main(String[] args) throws Exception
    {
        Innings obj=new Innings();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the team name:");
        String n=sc.nextLine();
        System.out.println("Enter session:");
        String n1=sc.nextLine();
        System.out.println("Enter runs:");
        int n2=sc.nextInt();
        obj.set_teamname(n);
        obj.set_teamname(n1);
        obj.set_runs(n2);
        System.out.println(" name:");
        System.out.println(obj.get_teamname());
        System.out.println("Scored");
        System.out.println(obj.get_runs());
        if(obj.get_innings_name().equals("First"))
        {
            System.out.print("Need ");
            System.out.print(obj.get_runs()+1);
            System.out.print(" to win");
        }
        else{
            System.out.println("Match Ended");
        }



    }
    
}
