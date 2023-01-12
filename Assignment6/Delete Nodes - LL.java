
import java.util.*;

class Main {
    static class LinkedList {
        // Complete the function below
        public void help() throws Exception {
            Node ah=new Node(0,null);
            Node at=ah;
            for(Node nn=head;nn!=null;nn=nn.next){
                int f=0;
                for(Node nn1=nn.next;nn1!=null;nn1=nn1.next){
                    if(nn.data<nn1.data){
                        f=1;
                        break;
                    }
                }
                if(f==0){
                    at.next=new Node(nn.data,null);
                    at=at.next;
                }
            }
            head=ah.next;
        }

        //  You dont need to read the code below.

        private class Node {
            int data;
            Node next;

            Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }

        private Node head;
        private Node tail;
        private int size;

        public LinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public LinkedList(Node head, Node tail, int size) {
            this.head = head;
            this.tail = tail;
            this.size = size;
        }

        // O(1)
        public int size() {
            return this.size;
        }

        // O(1)
        public void addLast(int data) {
            
            
            Node node = new Node(data, null);

            if (this.size() == 0) {
                this.head = node;
                this.tail = node;
            } 
            else {
                this.tail.next = node;
                this.tail = node;
            }

            this.size++;
        }

        public void help2() {
            Node node = this.head;

            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }
    }
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        LinkedList uwu = new LinkedList();

        for (int j = 0; j <k; j++) {
            
            
            uwu.addLast(sc.nextInt());
        }

        uwu.help();
        uwu.help2();
    }
}
