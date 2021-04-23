import java.util.*;
class mycomparator implements Comparator<object>
{
    public int compare(object obj1,object obj2)
    {
        return -obj1.name.compareTo(obj2.name);
    }
}
class object 
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
}

public class objectsort2
{
    public static void main(String args[])
    {
        List<object> al=new ArrayList<object>();
        al.add(new object("car",150000));
        al.add(new object("rubber",10));
        al.add(new object("toffee",1));
        Collections.sort(al,new mycomparator());
        System.out.println(al);
    }
}










