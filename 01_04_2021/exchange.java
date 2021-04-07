import java.util.*;
public class exchange
{
  static <T> void swap(int i,int j,ArrayList<T> ali)
  {
      T temp=ali.get(i-1);
      ali.set(i-1,ali.get(j-1));
      ali.set(j-1,temp);
  }
  public static void main(String[] a)
  {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> ali = new ArrayList<Integer>();
    for (int i=0;i<10;i++) {ali.add(i+1);}
    System.out.println("list before exchange : "+ali);
    System.out.println("enter element indexes to exchange");
    exchange.swap(sc.nextInt(),sc.nextInt(),ali);
    System.out.println("list after exchange : "+ali);
  }
}
