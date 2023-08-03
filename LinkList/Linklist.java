package LinkList;

public class Linklist {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        public static Node head;
        public static Node tail;

        public static  void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head =  tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }


        public static void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;

        }
    }
    public static void main(String[] args) {

        Linklist ll = new Linklist();
      
        
        
        
    }
   
}
