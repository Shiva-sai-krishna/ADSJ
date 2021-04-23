import java.util.*;
class item
{
    String name;
    int price;
    item(String n,int p)
    {
        name=n;
        price=p;
    }
}

public class itemSet
{
    public static void main(String args[])
    {
        HashSet<item> hs=new HashSet<item>();
        hs.add(new item("car",150000));
        hs.add(new item("rubber",10));
        hs.add(new item("toffee",1));
        System.out.println(hs);
    }
}
