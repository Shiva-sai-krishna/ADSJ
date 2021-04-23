import java.util.*;
class item implements Comparable<item>
{
    String name;
    int price;
    item(String n,int p)
    {
        name=n;
        price=p;
    }
    public String toString()
    {
        return String.format("name  : %s\nprice : %d\n",name,price);
    }
    public int compareTo(item b)
    {
        if (price>b.price) return 1;
        if (price<b.price) return -1;
        return 0;
    }
}

public class itemSetAsc
{
    public static void main(String args[])
    {
        TreeSet<item> hs=new TreeSet<item>();
        hs.add(new item("car",150000));
        hs.add(new item("rubber",10));
        hs.add(new item("toffee",1));
        for (item i : hs) System.out.print(i);
    }
}
