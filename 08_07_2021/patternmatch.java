import java.util.*;
public class patternmatch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a,b;
        int n,m,i,j;
        boolean zero=true;
        System.out.println("enter some text");
        a=sc.nextLine();
        n=a.length();
        System.out.println("enter pattern to find in text");
        b=sc.nextLine();
        m=b.length();
        for (i=0;i<=n-m;i++)
        {
            for (j=0;j<m;j++)
            {
                if (a.charAt(i+j)!=b.charAt(j))
                    break;
            }
            if (j==m)
            {
                zero=false;
                System.out.println("found at position : "+(i+1));
            }
        }
        if (zero) System.out.println("no match found");
    }
}
