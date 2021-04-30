import java.util.*;
public class sortedChainDriver
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        SortedChain<String,Integer> chain=new SortedChain<String,Integer>();
        Integer choice;
        System.out.println("\t\tMenu\n1) insert\n2) delete\n3) display\n4) search\n5) size\n6) exit");
        do
        {
            System.out.println("enter your choice");
            choice=Integer.valueOf(sc.nextLine());
            switch (choice)
            {
                case 1: 
                    System.out.println("enter key (String) and value (Integer)");
                    String[] input=sc.nextLine().split(" ");
                    chain.insert(input[0],Integer.valueOf(input[1]));
                    break;
                case 2:
                    System.out.println("enter key to be deleted");
                    chain.delete(sc.nextLine());
                    break;
                case 3:
                    chain.display();
                    break;
                case 4:
                    System.out.println("enter key to search");
                    chain.search(sc.nextLine());
                    break;
                case 5:
                    System.out.println("size of dictionary : "+chain.size());
                    break;
                case 6:
                    System.out.println("bye");
                    break;
                default : System.out.println("invalid choice");
            }
        }while(choice!=6);
    }
}










