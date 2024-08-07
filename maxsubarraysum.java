import java.util.*;
class ArraySum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int maxsum=0;
        for(i=0;i<n;i++)
        {
            int sum=0;
            for(j=i;j<n;j++)
            {
                sum+=arr[j];
                maxsum=Math.max(sum,maxsum);
            }
        }
        System.out.print (maxsum);
    }
}