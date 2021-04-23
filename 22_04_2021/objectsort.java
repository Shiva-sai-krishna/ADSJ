import java.util.*;
class object implements Comparable<object>
{
    String name;
    int price;
    object(String n,int p)
    {
        name=n;
        price=p;
    }
    public String toString()
    {
        return String.format("name  : %s\nprice : %d\n",name,price);
    }
    public int compareTo(object b)
    {
        if (price>b.price) return 1;
        if (price<b.price) return -1;
        return 0;
    }
}

public class objectsort
{
    public static void main(String args[])
    {
        List<object> al=new ArrayList<object>();
        al.add(new object("car",150000));
        al.add(new object("rubber",10));
        al.add(new object("toffee",1));
        Collections.sort(al);
        System.out.println(al);
    }
}
