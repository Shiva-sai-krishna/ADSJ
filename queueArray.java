import java.util.Scanner;
public class queueArray
{
  int[] queue;
  int size,head;
  Scanner sc;

  queueArray ()
  {
    System.out.println("enter the size of queue");
    sc=new Scanner(System.in);
    size=Integer.valueOf(sc.nextLine());
    queue=new int[size];
    head=0;
    System.out.println("\t\tMenu\n1) enqueue\n2) dequeue\n3) display\n4) quit");
  }

  void enqueue()
  {
    if (head==size) System.out.println("queue is full");
    else
    {
      System.out.println("enter element to enqueue");
      queue[head++]=Integer.valueOf(sc.nextLine());
    }
  }

  void dequeue()
  {
    if (head==0) System.out.println("queue is empty");
    else
    {
      for (int i=1;i<head;i++)
        queue[i-1]=queue[i];
      System.out.println("dequeued "+ queue[--head]);
    }
  }

  void display()
  {
    if (head==0) System.out.println("queue is empty");
    else
    {
      System.out.println("elements in queue are : ");
      for (int i=0;i<head;i++) System.out.print(queue[i]+" ");
      System.out.println();
    }
  }

  public static void main(String[] args) {
    queueArray queue=new queueArray();
    int choice =0;
    do{
      System.out.println("enter your choice");
      choice=Integer.valueOf(queue.sc.nextLine());
      switch(choice)
      {
        case 1 :queue.enqueue();break;
        case 2 :queue.dequeue();break;
        case 3 :queue.display();break;
        case 4 :break;
        default:System.out.println("try entering a valid input");break;
      }
    }while(choice!=4);
  }
}
