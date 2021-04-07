import java.util.*;
interface Stack<T>
{
	void push (T x);
	T pop();
	T top();
	boolean isEmpty();
	boolean isFull();
}

class stackAL<T> implements Stack<T>{
	ArrayList<T> al;
	stackAL(){al=new ArrayList<T>();}
	public void push(T x){al.add(x);}
	public T pop()
	{
		if(!isEmpty())
		{
			T ob=al.get(al.size()-1);
			al.remove(ob);
			return ob;
		}
		return null;
	}
	public T top()
	{
		if(!isEmpty()) return al.get(al.size()-1);
		return null;
	}
	public boolean isEmpty()
	{
		if (al.size()==0)
		{
			System.out.println("Stack is empty");
			return true;
		}
		return false;
	}
	public boolean isFull(){return false;}
	void display()
	{
		if(!isEmpty())
			System.out.println("stack : "+al);
	}
	public static void main(String [] args)
	{
		stackAL<Integer> lsi=new stackAL<Integer>();
		lsi.push(1);
		lsi.push(2);
		lsi.push(3);
		lsi.display();
		System.out.println("poped element is : "+lsi.pop()+"\ntop element is : "+ lsi.top());
}
}
