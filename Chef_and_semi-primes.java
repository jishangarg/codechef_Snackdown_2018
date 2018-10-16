import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=in.nextInt();
			ArrayList<Integer> al=new ArrayList<>();
			for(int j=2;j<=n;j++)
			{
				
				int count=0;
				int k=2;
				int j2=j;
                int prev=0;
				while(j2>1 && count<2 )
				{
                    
					if(j2%k==0){
						
                        if(k==prev)
                            break;
                        j2=j2/k;
						count++;    
                        prev=k;
					}
					else
						k++;
					
				}
				if(j2==1 && count==2)
				{
					al.add(j);
				}
			}
			int flag=0;
			for(int k=0;k<al.size();k++)
			{
				if(al.contains(n-al.get(k))){
				   System.out.println("YES");
					flag=1;
					break;
				}
			}
			if(flag==0)
				   System.out.println("NO");
		}
	}
}
