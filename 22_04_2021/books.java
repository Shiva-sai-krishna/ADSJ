import java.util.*;
class book implements Comparable<book>
{
    String title,author;
    book(String t,String a){title=t;author=a;}
    public String toString()
    {
        return String.format("title : %s\nauthor : %s\n",title,author);
    }
    public int compareTo(book b)
    {
        return title.compareTo(b.title);
    }
}

public class books
{
    public static void main(String args[])
    {
        TreeMap<book,Integer> tm = new TreeMap<book,Integer>();
        tm.put(new book("PO","Tolle"),150);
        tm.put(new book("HP","JK"),100);
        tm.put(new book("atomic habits","??"),200);
        for (book i : tm.keySet()) 
        System.out.println(i+"price : "+tm.get(i)+"\n");
    }
}
