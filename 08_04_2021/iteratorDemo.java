import java.util.*;
public class iteratorDemo
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        String input;
        System.out.println("enter elements in list");
        while (!(input=sc.nextLine()).equals("")) al.add(Integer.valueOf(input));
        Iterator it=al.iterator();
        System.out.print("using iterator : ");
        while (it.hasNext()) System.out.print(it.next()+ " ");
        ListIterator lit=al.listIterator();
        System.out.print("\nusing list iterator forward : ");
        while (lit.hasNext()) System.out.print(lit.next()+ " ");
        System.out.print("\nusing list iterator backward : ");
        while (lit.hasPrevious()) System.out.print(lit.previous()+ " ");
        System.out.println();
    }
}
