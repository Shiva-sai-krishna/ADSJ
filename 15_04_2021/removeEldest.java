import java.util.*;
public class removeEldest
{
    public static void main(String [] s)
    {
        LinkedHashMap<Integer,Integer> lhm= new LinkedHashMap<Integer,Integer>()
        {
            protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest)
            {
                return size()>5;
            }
        };
        lhm.put(1,1);lhm.put(2,2);lhm.put(3,3);lhm.put(4,4);lhm.put(5,5);
        System.out.println("map : "+lhm);
        lhm.put(6,6);
        System.out.println("map : "+lhm);
    }
}
