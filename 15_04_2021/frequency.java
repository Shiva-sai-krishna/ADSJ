import java.util.*;
public class frequency
{
    public static void main(String [] s)
    {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<Character,Integer> freq = new LinkedHashMap<Character,Integer>();
        for (Character i : input.toCharArray()) 
        {
            if (freq.containsKey(i)) freq.replace(i,freq.get(i)+1);
            else freq.put(i,1);
        }
        for (Character i : freq.keySet()) System.out.println(i + " : " + freq.get(i));
    }
}
