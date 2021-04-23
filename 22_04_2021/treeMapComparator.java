import java.util.*;
class mycomparator implements Comparator<String>
{
    public int compare(String a,String b)
    {
        return b.compareTo(a);
    }
}

public class treeMapComparator
{
    public static void main(String args[])
    {
        TreeMap<String,Integer> tm=new TreeMap<String,Integer>(new mycomparator());
        tm.put("a",1);tm.put("b",2);tm.put("c",3);tm.put("d",4);tm.put("e",5);
        System.out.println(tm);
    }
}
