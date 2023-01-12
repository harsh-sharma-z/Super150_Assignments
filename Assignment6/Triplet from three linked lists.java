



import java.util.Scanner;


class Node{
    int val;
    Node next;
    public Node(int item){
        this.val = item;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    private Node tail;
    private int size;

    public void endMeinJodo(int item){
        Node node = new Node(item);
        if(this.size==0){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        size++;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


		
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (int i = 0; i < a; i++) {
            linkedList1.endMeinJodo(sc.nextInt());
        }
        for (int i = 0; i < b; i++) {
            linkedList2.endMeinJodo(sc.nextInt());
        }
        for (int i = 0; i < c; i++) {
            linkedList3.endMeinJodo(sc.nextInt());
        }
        int k = sc.nextInt();

        printTriplet(linkedList1.head, linkedList2.head, linkedList3.head, k);

    }



    private static void printTriplet(Node linkedList1, Node linkedList2, Node linkedList3, int k){
        Node temp1 = linkedList1;
        while (temp1!=null){
            Node temp2 = linkedList2;
            while (temp2!=null){
                Node temp3 = linkedList3;
                while (temp3!=null){
                    if(temp1.val+temp2.val+temp3.val==k){
                        System.out.print(temp1.val+" "+temp2.val+" "+temp3.val);
                        return;
                    }
                    temp3 = temp3.next;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
    }
}
