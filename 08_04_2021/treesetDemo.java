import java.util.*;
public class treesetDemo
{
    public static void main(String[] args)
    {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements");
        String input;
        while (!(input=sc.nextLine()).equals("")) ts.add(Integer.valueOf(input));
        System.out.println("entered elements : "+ts);
        System.out.println("enter element");
        System.out.println("headSet : "+ts.headSet(sc.nextInt(),true));
    }
}
