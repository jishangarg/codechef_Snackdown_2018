import java.util.*;
public class Main{

     public static void main(String []args){
         Scanner in=new Scanner(System.in);
         int t=in.nextInt();
         
         for(int i=0;i<t;i++)
         {
             int n=in.nextInt();
             List<Integer> A=new ArrayList<>();
             List<Integer> B=new ArrayList<>();
             for(int j=0;j<n;j++)
             {
                 A.add(in.nextInt());
                 if(j-1>=0)
                    B.add(B.get(j-1)+A.get(j));
                 else
                    B.add(A.get(j));
             }
             int sum=1;
             int day=0;
             
             while(sum<n)
             {
                 day++;
                 
                 sum+=B.get(sum-1);
             }
            
             System.out.println(day);
         }
        
     }
}
