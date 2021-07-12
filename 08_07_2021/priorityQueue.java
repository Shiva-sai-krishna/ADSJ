import java.util.*;

public class priorityQueue <T extends Comparable<T>>
{
    T[] heap;
    T temp,temp2;
    int size,t1,t2,t3,t4;

    priorityQueue(T[] heap)
    {
        this.heap=heap;
        size=0;
    }

    void display()
    {
        for (int i=1;i<=size;i++)
            System.out.print(heap[i]+" ");
        System.out.println();
    }

    T top()
    {
        return heap[1];
    }

    boolean isFull()
    {
        if (size==heap.length-1)
            System.out.println("queue is full");
        return size==heap.length-1;
    }

    boolean isEmpty()
    {
        if (size==0)
            System.out.println("queue is empty");
        return size==0;
    }

    void insert(T ele)
    {

        if (!isFull())
        {
            t1=++size;
            t2=t1/2;
            while (t1!=1 && heap[t2].compareTo(ele)<0)
            {
                heap[t1]=heap[t2];
                t1=t2;
                t2=t1/2;
            }
            heap[t1]=ele;
        }
    }

    T delete()
    {
        if (!isEmpty())
        {
            temp2=heap[1];
            heap[1]=heap[size--];
            t1=1;
            while (true)
            {
                t2=2*t1;
                t3=2*t1+1;
                t4=t1;
                if (t2<=size && heap[t2].compareTo(heap[t1])>0)
                    t4=t2;
                if (t3<=size && heap[t3].compareTo(heap[t4])>0)
                    t4=t3;
                if (t4==t1) break;
                else
                {
                    temp=heap[t4];
                    heap[t4]=heap[t1];
                    heap[t1]=temp;
                    t1=t4;
                }
            }
            return temp2;
        }
        return null;
    }

    public static void main(String[] args)
    {
        int n,choice;
        Integer temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of priority queue");
        n=Integer.parseInt(sc.nextLine());
        priorityQueue<Integer> pq=new priorityQueue<Integer>(new Integer[n]);
        System.out.println("\t\tMENU\n1) insert\n2) delete\n3) top\n4) display\n5) quit");
        do
        {
            System.out.println("enter your choice");
            choice=Integer.parseInt(sc.nextLine());
            switch (choice)
            {
                case 1:
                    System.out.println("enter the value to insert");
                    temp=Integer.valueOf(sc.nextLine());
                    pq.insert(temp);
                    System.out.println("inserted element : "+temp);
                    break;
                case 2:
                    temp=pq.delete();
                    System.out.println("deleted element : " +temp);
                    break;
                case 3:
                    temp=pq.top();
                    System.out.println("top element : "+temp);
                    break;
                case 4:
                    System.out.print("elements in the heap are : ");
                    pq.display();
                    break;
                case 5:
                    System.out.println("exit");
                    break;
                default :
                    System.out.println("enter valid input");
            }
        }while (choice!=5);
    }
}
