import java.util.*;
public class booyerMore
{
    static void boyerMore(String txt,String ptr)
    {
        int i,j,m,n,t;
        int[] lf=new int[256];
        lastFound(ptr,lf);
        n=txt.length();
        m=ptr.length();
        for (i=m-1,j=m-1;i<n;)
        {
            if (txt.charAt(i)==ptr.charAt(j))
            {
                if (j==0)
                {
                    System.out.println("found match at position : "+i);
                    i+=m-j;
                    j=m-1;
                }
                else
                {
                    i--;
                    j--;
                }
            }
            else
            {
                t=lf[(int)txt.charAt(i)];
                i+=m-Math.min(j,t+1);
                j=m-1;
            }
        }
    }

    static void lastFound(String ptr,int[] lf)
    {
        int i;
        for (i=0;i<256;i++) lf[i]=-1;
        for (i=0;i<ptr.length();i++)
            lf[(int)ptr.charAt(i)]=i;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a,b;
        System.out.println("enter some text");
        a=sc.nextLine();
        System.out.println("enter pattern to find in text");
        b=sc.nextLine();
        boyerMore(a,b);
    }
}


























