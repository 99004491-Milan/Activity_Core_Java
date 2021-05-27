import java.util.Scanner;
public class Activity1Q2 {
    public static void findCricketerId(int[] arr,int n,int score)
    {
        for(int i=1;i6<n;i=i+2)
        {
            if(arr[i]>score)
            {
                System.out.println(arr[i-1]);
            }

        }
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.print("Negative array size");
            flag=1;
        }
        if (flag==0)
        {
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]<0)
                {
                    System.out.print("Invalid Input");
                    flag=1;
                }
            }
            if(flag==0)
            {
                int score =sc.nextInt();
                if(score<0)
                {
                    System.out.print("invalid score");
                    flag=1;
                }
                if(flag==0)
                {
                    Activity1Q2.findCricketerId(arr,n,score);
                }
            }
        }   

    }
    
}
