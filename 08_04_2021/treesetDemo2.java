import java.util.*;
public class treesetDemo2
{
    public static void main(String[] args)
    {
        TreeSet<String> ts=new TreeSet<String>();
        Scanner sc=new Scanner(System.in);
        String input;
        System.out.println("enter names");
        while(!(input=sc.nextLine()).equals("")) ts.add(input);
        System.out.println("tree set : "+ts+"\nsize : "+ts.size()+"\nenter element to check");
        input=sc.nextLine();
        System.out.println(input+" : "+(ts.contains(input) ? "yes" : "no"));
        System.out.println("first : "+ts.pollFirst()+"\nLast : "+ts.pollLast());
        System.out.println("just greater than "+input+" : "+ts.higher(input));
        System.out.println("just lower than "+input+" : "+ts.lower(input));
    }
}
