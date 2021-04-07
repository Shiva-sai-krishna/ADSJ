import java.util.*;
public class LLdemo{
	public static void main(String [] args){
		LinkedList<Integer> al=new LinkedList<Integer>();
    al.addFirst(0);
    al.add(0,1);
    al.addLast(2);
    al.set(0,3);
    System.out.println("element removed : "+al.removeLast()+"\narraylist : "+al+"\nsize : "+al.size());
    System.out.println("using Iterator : ");
	  ListIterator i=al.listIterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
	}
}
