import java.util.*;
public class bank
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String input;
        Integer n;
        
        System.out.println("enter n and n details of customer details");
        HashMap<String,Float> clients = new HashMap<String,Float>((n=Integer.valueOf(sc.nextLine())));
        for (int i=0;i<n;i++)
        {
            System.out.printf("Enter customer %d name and balance\n",i+1);
            clients.put(sc.nextLine(),Float.valueOf(sc.nextLine()));
        }
        
        System.out.println("using entry set clients are : ");
        for (Map.Entry<String,Float> m : clients.entrySet())
            System.out.println(m.getKey()+" : "+m.getValue());
            
        System.out.println("Enter customer to search ");
        input=sc.nextLine();
        System.out.println((clients.containsKey(input))?input+ " : "+ clients.get(input):"not found");
        
        Float sum=Float.valueOf(0);
        for (Float b : clients.values()) sum+=b;
        System.out.println("sum of customers : "+n);
        
        System.out.println("enter customer to update");
        input=sc.nextLine();
        if (clients.containsKey(input))
        {
            System.out.println("1) add\n2)subtract\nenter choice then amount");
            switch(Integer.valueOf(sc.nextLine()))
            {
                case 1 : clients.replace(input,clients.get(input)+Float.valueOf(sc.nextLine())); 
                break;
                case 2 : clients.replace(input,clients.get(input)+Float.valueOf(sc.nextLine()));
                break;
            }
        }
        else System.out.println("not found");
        
        System.out.println("customer with >= 75000 balance");
        HashMap<String,Float> temp = new HashMap<String,Float>(clients);
        temp.keySet().removeIf(x->(temp.get(x)<75000));
        for (String i : temp.keySet()) 
            System.out.println(i + " : " + clients.get(i));
        
        System.out.println("add new customer data");
        clients.put(sc.nextLine(),Float.valueOf(sc.nextLine()));
        
        System.out.println("enter customer to remove");
        input=sc.nextLine();
        if (clients.containsKey(input)) clients.remove(input);
        else System.out.println("not found");
        
        System.out.println("display only keys :");
        for (String i : clients.keySet()) System.out.println(i);
        
        System.out.println("map in descending order : ");
        TreeMap<String,Float> sorted = new TreeMap<String,Float>(Collections.reverseOrder());
        sorted.putAll(clients);
        for (String i : sorted.keySet())
            System.out.println(i+" : "+sorted.get(i));
        
        
        
        
        
        
        
    }
}
