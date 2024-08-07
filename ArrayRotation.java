import java.util.*;
class ArrayRotation
{
    public static void reverse(int []a,int start,int end)
    {
        int start=0,end=n-1;
        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
            
        }
    }
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
        int k=sc.nextInt();
        k=k%n;
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }

    }
}