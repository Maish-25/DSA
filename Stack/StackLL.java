package Stack;

public class StackLL {
   
    static class Node{
            Node next;
            int data;
            Node(int data){
                this.data = data;
                this.next = null;
            }
    }
    static class Stack2{
        static Node head = null;

        //isEmpty()
        public static boolean isEmpty(){
            return head == null;
        }
        // push()
        public static void push(int n){
            Node newNode  = new Node(n);
            if(isEmpty()){
                head = newNode;
                return;
            }       
            newNode.next = head;
            head = newNode;
        }
        //pop
        public static int pop(){
          if(isEmpty()){
            return -1;
          }
          int top = head.data;
          head = head.next;
          return top;
        }
        //peek
        public static int peek(){
           if(isEmpty()){
            return -1;
           }
           return head.data;
        }
    }
    public static void main(String[] args) {
        Stack2 st = new Stack2();
       st.push(1);
       st.push(2);
       st.push(3);
       while(!st.isEmpty()){
        System.out.println(st.peek());
        st.pop();
       }
       
    }
}
