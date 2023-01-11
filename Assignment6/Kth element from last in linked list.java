import java.awt.*;
import java.sql.SQLOutput;
import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Linkedlist {
    Node head;
    Node tail;

    public void Add(int data) {
        if (head == null) {
            Node nn = new Node(data);
            head = nn;
            tail = nn;
        } else {
            Node nn = new Node(data);
            tail.next = nn;
            tail = tail.next;
        }
    }

}

public class Test {
    public static void main (String []args) {
        Scanner sc=new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        int inp = sc.nextInt();
        while (inp!=-1){
            list.Add(inp);
            inp = sc.nextInt();
        }
        int k=sc.nextInt();

        Node temp=list.head;

        
        for(int i=0;i<k;i++)
        {
            temp=temp.next;
        }
        Node temp2=list.head;
        while(temp!=null)
        {
            temp=temp.next;
            temp2=temp2.next;
        }

        System.out.println(temp2.data);
    }
}
