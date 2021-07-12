import java.util.*;
public class kmp
{
    static void kmpSearch(String txt,String ptr)
    {
        int n,m,i,j;
        int[] lps;

        n=txt.length();
        m=ptr.length();
        lps=new int[m];
        lpsArray(ptr,lps);

        for (i=0,j=0;i<n;)
        {
            if (txt.charAt(i)==ptr.charAt(j))
            {
                i++;
                j++;
                if (j==m)
                {
                    j=lps[j-1];
                    System.out.println("Found match at position : "+(i-m));
                }
            }
            else
            {
                if (j!=0) j=lps[j-1];
                else i+=1;
            }
        }

    }

    static void lpsArray(String ptr,int[] lps)
    {
        int i,len,m;
        m=ptr.length();
        lps[0]=0;
        for (len=0,i=1;i<m;)
        {
            if (ptr.charAt(len)==ptr.charAt(i))
            {
                lps[i]=len+1;
                i++;
                len++;
            }
            else
            {
                if (len==0)
                {
                    lps[i]=0;
                    i++;
                }
                else
                {
                    len=lps[len-1];
                }
            }
        }
        System.out.print("lps array : ");
        for (int j : lps) System.out.print(j+" ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a,b;
        int i,j;
        System.out.println("enter some text");
        a=sc.nextLine();
        System.out.println("enter pattern to find in text");
        b=sc.nextLine();
        kmpSearch(a,b);
    }
}














