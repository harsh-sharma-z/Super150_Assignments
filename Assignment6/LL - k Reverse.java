//Given a head to Linked List L, write a function to reverse the list taking k elements at a time. Assume k is a factor of the size of List.
//
//        You need not have to create a new list. Just reverse the old one using head.
//
//        Input Format
//        The first line contains 2 space separated integers N and K
//
//        The next line contains N space separated integral elements of the list.
//
//        Constraints
//        0 <= N <= 10^6 0 <= K <= 10^6
//
//        Output Format
//        Display the linkedlist after reversing every k elements
//
//        Sample Input
//        9 3
//        9 4 1 7 8 3 2 6 5
//        Sample Output
//        1 4 9 3 8 7 5 6 2
//        Explanation
//        N = 9 & K = 3
//
//        Original LL is : 9 -> 4 -> 1 -> 7 -> 8 -> 3 -> 2 -> 6 -> 5
//
//        After k Reverse : 1 -> 4 -> 9 -> 3 -> 8 -> 7 -> 5 -> 6 -> 2
//
import java.util.Scanner;
import java.util.Stack;

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

    public void addLast(int item){
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
        int n = sc.nextInt();
        int k = sc.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }
        Node res = LinkedListKReverse(list.head, k);
        while (res!=null){
            System.out.print(res.val+" ");
            res = res.next;
        }
    }
    private static Node LinkedListKReverse(Node head, int k){
        Stack<Node> uwu = new Stack<>();
        Node onichan = new Node(0);
        Node yamate = onichan;
        Node sidx = null;
        while (head!=null){
            if (uwu.size()==0){
                sidx = head;
            }
            uwu.push(head);
            if(uwu.size()==k){
                while (!uwu.isEmpty()){
                    int ele = uwu.pop().val;
                    Node abc = new Node(ele);
                    onichan.next = abc;
                    onichan = onichan.next;
                }
            }
            head = head.next;
        }
        if(uwu.size()>0){
            onichan.next = sidx;
        }
        return yamate.next;
    }
}
