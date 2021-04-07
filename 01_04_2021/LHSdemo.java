import java.util.*;
public class LHSdemo
{
    public static void main(String[] args)
    {
      LinkedHashSet<String> lhs = new LinkedHashSet<String>();
      lhs.add("z");
      lhs.add("b");
      lhs.add("c");
      lhs.add("a");
      System.out.print("linked hash set : ");
      Iterator<String> i = lhs.iterator();
      while (i.hasNext()) System.out.print(i.next()+" ");
      System.out.println("\nhs contains c : "+lhs.contains("c"));
      System.out.println("size of hs : " +lhs.size());
      lhs.remove("a");
      System.out.print("hash set after removing a : "+lhs);
    }
}
