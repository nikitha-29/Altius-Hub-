import java.util.*;
Class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int low=0;
        int high=n-1;
        int flag=0;
        int ans;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==x)
            {

                ans=mid;
                flag=1;
            }
            else if(a[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
           
        }
        if(flag==0)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("element found:"+ans);

        }
    }
}