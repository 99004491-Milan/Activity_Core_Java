import java.util.*;
public class Activity1Q1
{
	public static int findElementCount(int[] arr,int n,int search)
	{
		int count=0;
	
		for(int i=0;i<n;i++)
		{
			if(arr[i]==search)
			{
				count++;
			}
		
		}
		return count;

	}
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.print("Invalid Input");
		}
		int flag=1;
		if(n>=0)
		{
		int arr[]=new int[n];
		for(int t=0;t<n;t++)
		{
			arr[t]=sc.nextInt();
			if(arr[t]<0)
			{
				flag=0;
				System.out.print("Invalid Input");
				break;
			}
		}
		if(flag==1)
		{
		int search=sc.nextInt();
		if (n<0 ||search<0)
		{
			flag=0;
		}
		if(flag==0)
		{
			System.out.print("Invalid Input");
		}
		
		if(flag==1){
		int ans=Activity1Q1.findElementCount(arr,n,search);
		System.out.print(ans);
		}
	}
	}
		
	}


}