import java.util.*;
public class generic
{
    static <T,V,X> void display(T obj,X obj2,V obj3) 
    {
        System.out.println(obj+" "+obj2+" "+obj3);
    }
    public static void main(String[] args)
    {
        display(5,"Shiva",36);
    }
}
