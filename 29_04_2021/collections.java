import java.util.*;
public class collections
{
    public static void main(String[] args)
    {
        Integer[] a={5,4,3,2,7,3,5,4,23,5,3};
        List<Integer> l=Arrays.asList(a);
        System.out.println("original : "+l);
        Collections.sort(l);
        System.out.println("sorted : "+l);
        System.out.println("pos of 5 : "+Collections.binarySearch(l,5));
        Collections.reverse(l);
        System.out.println("reversed : "+l);
    }
}
