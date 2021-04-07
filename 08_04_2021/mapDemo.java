import java.util.*;
public class mapDemo
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("a",1);
        hm.put("b",2);
        hm.put("c",3);
        hm.put("d",4);
        hm.put("e",5);
        hm.put("f",6);
        System.out.println("using for each loop :");
        for (String i : hm.keySet()) System.out.println("key : "+i+" value : "+hm.get(i));
        System.out.println("\nusing entry set :");
        for (Map.Entry<String,Integer> entry : hm.entrySet()) System.out.println("key : "+entry.getKey()+" value : "+entry.getValue());
        System.out.println("\ncontains key = x : "+hm.containsKey("x"));
    }
}
