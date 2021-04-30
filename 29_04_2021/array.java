import java.util.*;
public class array
{
    public static void main(String[] args)
    {
        Integer[] a=new Integer[10];
        Arrays.fill(a,0);
        Integer[] b=Arrays.copyOf(a,a.length);
        for (int i=0;i<10;i++) a[i]=i+1;
        Arrays.sort(a);
        System.out.println(Arrays.asList(a));
        System.out.println("pos of 5 :"+(Arrays.binarySearch(a,5)+1));
    }
}
