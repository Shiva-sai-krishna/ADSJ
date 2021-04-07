import java.util.*;
public class hallbooking
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> halls = new HashMap<String,Integer>();
        String input;
        System.out.println("enter hall name with rent\n");
        while(!(input=sc.nextLine()).equals(""))
        {
            String inputs[]=input.split("  ");
            halls.put(inputs[0],Integer.valueOf(inputs[1]));
        }
        String hallname=null;
        Integer rent=-1;
        
        for (String i :halls.keySet())
        {
            if (halls.get(i)>rent) 
            {
                hallname=i;
                rent=halls.get(i);
            }
        }
        
        System.out.printf("hall with highest rent\nhall : %s\nrent : %d\n",hallname,rent);
    }
}
