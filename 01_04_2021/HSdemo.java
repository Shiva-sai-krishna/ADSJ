import java.util.*;
public class HSdemo
{
    public static void main(String[] args)
    {
      HashSet<String> hs = new HashSet<String>();
      hs.add("z");
      hs.add("b");
      hs.add("c");
      hs.add("a");
      System.out.print("hash set : ");
      Iterator<String> i = hs.iterator();
      while (i.hasNext()) System.out.print(i.next()+" ");
      System.out.println("\nhs contains c : "+hs.contains("c"));
      System.out.println("size of hs : " + hs.size());
      hs.remove("a");
      System.out.print("hash set after removing a : "+hs);
    }
}
