import java.util.*;
public class treeFruit
{
    public static void main(String[] args)
    {
        TreeSet<String> ts=new TreeSet<String>();
        Scanner sc=new Scanner(System.in);
        String input;
        System.out.println("enter fruits");
        while(!(input=sc.nextLine()).equals("")) ts.add(input);
        Iterator it = ts.iterator();
        System.out.print("using iterator : ");
        while(it.hasNext()) System.out.print(it.next() + " ");
        it = ts.descendingIterator();
        System.out.print("\nusing descending iterator : ");
        while(it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();
    }
}
