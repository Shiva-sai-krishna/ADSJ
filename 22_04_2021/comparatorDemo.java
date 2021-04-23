import java.util.*;
class mycomparator implements Comparator<String>
{
    public int compare(String a,String b)
    {
        return a.toLowerCase().compareTo(b.toLowerCase());
    }
}
class comparatorDemo{
	public static void main(String [] args){
        TreeSet<String> ts=new TreeSet<String>(new mycomparator());
        ts.add("a");
        ts.add("B");
        ts.add("c");
        System.out.println("tree set : " + ts);
	}	
}
