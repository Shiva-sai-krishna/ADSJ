import java.util.*;
public class childern
{
    public static void main(String [] s)
    {
        Scanner sc=new Scanner(System.in);
        HashSet<String> cookies = new HashSet<String>();
        HashSet<String> banana = new HashSet<String>();
        HashSet<String> temp = new HashSet<String>();
        String input;
        System.out.println("enter children who like cookies");
        while(!(input=sc.nextLine()).equals("")) cookies.add(input);
        System.out.println("enter children who like bannanna chips");
        while(!(input=sc.nextLine()).equals("")) banana.add(input);
        temp.addAll(banana);temp.addAll(cookies);
        System.out.print("children who like both cookies or bannanna : ");
        for (String i : temp) System.out.print(i+" ");
        temp.clear();temp.addAll(cookies);temp.retainAll(banana);
        System.out.print("\nchildren who like both cookies and bannanna : ");
        for (String i : temp) System.out.print(i+" ");
        temp.clear();temp.addAll(cookies);temp.removeAll(banana);
        System.out.print("\nchildren who like only cookies : ");
        for (String i : temp) System.out.print(i+" ");
    }
}
