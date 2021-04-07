import java.util.*;
class ALdemo{
	public static void main(String [] args){
		ArrayList<Integer> al=new ArrayList<Integer>();
    al.add(0,0);
    al.add(0,1);
    al.add(0,2);
    al.set(0,3);
    System.out.println("element removed : "+al.remove(2)+"\narraylist : "+al+"\nsize : "+al.size());
    System.out.print("using Iterator : ");
	  Iterator i=al.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
	}
}
