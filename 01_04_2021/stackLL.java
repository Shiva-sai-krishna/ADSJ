import java.util.*;
interface Stack<T>
{
	void push (T x);
	T pop();
	T top();
	boolean isEmpty();
	boolean isFull();
}

class stackLL<T> implements Stack<T>{
	LinkedList<T> ll;
	stackLL(){ll=new LinkedList<T>();}
	public void push(T x){ll.push(x);}
	public T pop()
	{
		if(!isEmpty()) return ll.pop();
		return null;
	}
	public T top()
	{
		if(!isEmpty()) return ll.peek();
		return null;
	}
	public boolean isEmpty()
	{
		if (ll.size()==0)
		{
			System.out.println("Stack is empty");
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		return false;
	}
	void display()
	{
		if(!isEmpty())
			System.out.println("stack elements are : "+ll);
	}
	public static void main(String [] args)
	{
		stackLL<Integer> lsi=new stackLL<Integer>();
		lsi.push(1);
		lsi.push(2);
		lsi.push(3);
		lsi.display();
		System.out.println("poped element is : "+lsi.pop()+"\ntop element is : "+ lsi.top());
}
}
