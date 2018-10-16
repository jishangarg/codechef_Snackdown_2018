import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=in.nextInt();
			int[] arr=new int[n+1];
			for(int j=2;j<=(n+1)/2;j++)
			{
				int k=2;
				if(arr[j]==0)
    				while(k*j<=n)
    				{
    					arr[k]++;
    					k++;
    				}	
			}
			int flag=0;
			for(int j=2;j<=(n+1)/2;j++)
			{
			    System.out.println("rr "+arr[j]+" "+arr[n-j]);
				if(arr[j]==2)
				{
					if(arr[n-j]==2){
						System.out.println("YES");
						flag=1;
						break;
					}
				}
			}
			
			if(flag==0)
				System.out.println("NO"); 
		}
	}
}
