package LinkedList;
import java.util.*;


public class LinkedList {

   public static class Node{
    int data;
    Node next;
    public Node(int data){
       this.data = data;
       this.next = null;
    }
}
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
     // linklist is empty
     // create new node
       Node newNode = new Node(data);
       size++;
       if(head == null){
        head = tail = newNode;
        return;
       }  
     //link newNode to head
     newNode.next = head;
     head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    //for adding at any index
    public void add(int data,int idx){
        if(idx == 0 ){
            addFirst(data);
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int  i = 0;
        while(i < idx-1){
           temp = temp.next;
           i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public static int removeFirst(){        
        if(size ==0){
            System.out.println("LL is Empty");
            head = tail = null;
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;     
    }

    public static int removeLast(){
         if(size ==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node pre = head;
        for(int i = 0;i<size-2;i++){
           pre = pre.next;
        }
        int val = pre.data;
        pre.next = null; 
        tail = pre;
        size--;
       return -1;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
           System.out.print(temp.data + "->");
           temp = temp.next;
        }
        System.out.println("null");
    }

    //for searching key in LinkedList
    public int itrSearch(int key){
       Node temp = head;
       int i = 0;
       while(temp != null){
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;
       }
       //key.forund
       return -1;
    }

    //search recusively O(n)
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next ,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int searchRecusive(int key){
          return helper(head,key);
    }

    public void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void removeNfromEnd(int n){
          if( n == size){
            head = head.next;
            return;
          }
        
          int i = 1;
          int indexToFind = size - n;
          Node prev = head;
          while(i< indexToFind){
            prev = prev.next;
            i++;
          }
          prev.next = prev.next.next;
          return;
    }



    //LL is palindrome or not
    //find mid
    // reverse second half reverse
    //check left half and right half

     //slow fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }

    public boolean checkPalindrome(){
       if(head == null || head.next == null){
        return true;
       }
       Node midNode = findMid(head);
       
       Node curr = midNode;
       Node prev = null;
       Node next;
       while(curr != null){
        next = curr.next;
        curr.next = prev;
        curr = next;
       }

       Node right = prev;
       Node left = head;

       while(right != null){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
       }
       return true;
    }
    
public static boolean isCycle(){
    Node slow = head;
   Node fast = head;
   
   while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    if(fast == slow){
        return true;      
    }
   }
    return false;
}

public static void removeCycleLoop(){

    //detect cycle
   Node slow = head;
   Node fast = head;
   boolean cycle = false;
   while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    if(fast == slow){
        cycle = true;
        break;
     }
    }
     if(cycle == false){
        return;
    }
    //find meeting point
    slow = head;
    Node prev = null;
    while (slow != fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }

    //remove cycle -> last.next = null
     prev.next = null;    

}    


    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //reverse second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        //aternate merging
        while(left != null && right != null){
            nextL = left.next;
            left.next  =right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(3); // O(1)
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(4);//O(n)
        // ll.addLast(5);
        // ll.print();
        // ll.add(2,1); // O(n)
        // ll.print();
    //     System.out.println(ll.size);
    //     removeFirst();
    //     ll.print();   
    //     removeLast();
    //     ll.print();     
    //    System.out.println(ll.itrSearch(9));
    //    System.out.println(ll.searchRecusive(4));
    //    ll.reverseLL(); // O(n)
    //    ll.print();
    //    removeNfromEnd(2);
    //    ll.print();
    
    // head = new Node(1);
    // head.next = new Node(2);
    // head.next.next = new Node(3);
    // head.next.next.next = head;

    // // head = new Node(1);
    // // Node temp= new Node(2);
    // // head.next = temp;;
    // // head.next.next = new Node(3);
    // // head.next.next.next = temp;

   
    // System.out.println(isCycle());
    // // removeCycleLoop();
    // System.out.println(isCycle());
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    // 1->2->3->4->5
    ll.print();
    ll.zigZag();
    ll.print();

    }
}
