import java.util.*;

public class heapsort
{
    static void heapify(int[] a,int n,int i)
    {
        int parent,lchild,rchild,largest;
        parent=i;
        lchild=2*i+1;
        rchild=lchild+1;
        largest=parent;

        if (lchild<n && a[lchild]>a[largest])
            largest=lchild;
        if (rchild<n && a[rchild]>a[largest])
            largest=rchild;
        if (parent!=largest)
        {
            parent=a[i];
            a[i]=a[largest];
            a[largest]=parent;

            heapify(a,n,largest);
        }
    }

    static void heapsort(int[] a)
    {
        int n=a.length-1,i,temp;
        for (i=(n-1)*2;i>=0;i--) //start from last node with children
            heapify(a,n,i);
        for (i=n;i>=1;i--)
        {
            temp=a[i];
            a[i]=a[0];
            a[0]=temp;
            heapify(a,i,0);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("enter the size of array");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter elements of array");
        for (i=0;i<n;i++)
            a[i]=sc.nextInt();
        heapsort(a);
        for (i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}













