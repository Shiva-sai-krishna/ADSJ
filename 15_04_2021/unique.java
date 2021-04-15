import java.util.*;
public class unique
{
    public static void main(String [] s)
    {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
        for (Character c : input.toCharArray()) lhs.add(c);
        for (Character c : lhs) System.out.print(c);
    }
}
