import java.util.*;
public class hashset
{
    public static void main(String[] args)
    {
        Integer[] a={2,5,3,4,1,1,1,2,3};
        HashSet<Integer> hs=new HashSet<Integer>(Arrays.asList(a));
        System.out.println(hs);
    }
}
