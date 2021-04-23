import java.util.*;
class emp implements Comparable<emp>
{
    Integer id,sal;
    emp(int i,int s){id=i;sal=s;}
    public String toString()
    {   
        return String.format("id : %d\nsalary : %d\n",id,sal);
    }
    public int compareTo(emp guy)
    {
        if (sal<guy.sal) return -1;
        if (sal>guy.sal) return 1;
        return 0;
    }
}

public class employe
{
    public static void main(String args[])
    {
        SortedSet<emp> ss=new TreeSet<emp>();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter number of employes");
        n=sc.nextInt();
        System.out.println("enter emp details");
        while((n--)!=0) ss.add(new emp(sc.nextInt(),sc.nextInt()));
        System.out.println("emp with max :\n"+ss.last()+"\nemp with min :\n"+ss.first()+"\nemps with sal greater than 30k :");
        for (emp i : ss.tailSet(new emp(0,30001))) System.out.println(i);
    }
}
