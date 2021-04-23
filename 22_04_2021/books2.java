import java.util.*;
class book 
{
    String title,author;
    book(String t,String a){title=t;author=a;}
    public String toString()
    {
        return String.format("title : %s\nauthor : %s\n",title,author);
    }
}

public class books2
{
    public static void main(String args[])
    {
        TreeMap<book,Integer> tm = new TreeMap<book,Integer>(new Comparator<book>(){
            public int compare(book b1,book b2){
                return b1.author.compareTo(b2.author);
        }});
        tm.put(new book("PO","Tolle"),150);
        tm.put(new book("HP","JK"),100);
        tm.put(new book("atomic habits","??"),200);
        for (book i : tm.keySet()) 
        System.out.println(i+"price : "+tm.get(i)+"\n");
    }
}
