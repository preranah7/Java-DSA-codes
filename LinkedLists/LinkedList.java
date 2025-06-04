package LinkedListLec;

//import java.util.*;
public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; //pointer variable
    public static Node tail;
    public static int size;

    public void addFirst(int data){ //O(1)
        //step1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
           head = tail = newNode;  
           return;          
        }
        //step2 - newNode next = head;
        newNode.next = head;

        //step3 - update head
        head = newNode;
    }


    public void addLast(int data){ //O(1)
        //step1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            //newNode.next = null;
            return;
        }
        //step2 - tail next = newNode
        tail.next = newNode;

        //step3 - update tail
        tail = newNode;
    }


    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0; //track temp idx
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }


    public int removeFirst(){
        if(size == 0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    public int removeLast(){
        if(size == 0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //last's prev : i = size-2
        Node prev = head;
        for(int i = 0; i < size-2 ; i++){
            prev = prev.next;    
        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    public void printll(){ //O(n)
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public int itrSearch(int key){ //O(n)
        Node temp = head; 
        int i = 0;
        while(temp != null){{}
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }

    
    public int helper(Node head , int key){ //O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next , key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head , key);
    }


    public void reverse(){//O(n)
        Node prev = null;
        Node curr = tail = head; //Assingment in java is from right to left
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev; //reverse linking
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void deleteNthfromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if (n == sz) { //if dlt head
            head = head.next; //remove first
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }


    //Slow-Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next; //++1
            fast = fast.next.next; //++2
        }

        return slow; //slow is midNode

    }


    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step 1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head
        Node left = head;
        
        //step3 - check left half and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }


    public  static boolean isCycle(){ //Floyd's CFA
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast){
                return true; //cycle exists
            }
        }
        return false; //cycle doesn't exist
    }


    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null; //last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;          
        }

        //remove cycle -> last.next = null
        prev.next = null;
    }


    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; //mid node

    }


    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }


    public Node mergeSort(Node head){ //O(nlogn)
        if (head == null || head.next == null) {
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft , newRight);
    }

    
    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;


        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL , nextR;

        //alt merge - zig-zag merge
        while (left!=null && right!=null) {
            //zig-zag linking steps
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            
            //update steps
            left = nextL;
            right = nextR;
        }
    }


    public void swap(int x,int y){
        Node swap1 = head;
        Node swap2 = head;
        Node prev1 = head;
        Node prev2 = head;
        while(swap1.data != x){
            prev1 = swap1;
            swap1 = swap1.next;
        }
        while(swap2.data!=y){
            prev2 = swap2;
            swap2 = swap2.next; 
        }
        prev1.next = swap2;
        swap2.next = prev2;
        prev2.next = swap1;
        swap1.next = null;  
    }

    public void EvenOdd(){
        Node checkEvenOdd = head;
        Node dummy1even = new Node(-1);
        Node dummy2odd = new Node(-1);
        Node even = dummy1even;
        Node odd = dummy2odd;
        while(checkEvenOdd!=null){
            if(checkEvenOdd.data % 2 == 0){
                even.next = checkEvenOdd;
                even = even.next;  
            }else{
                odd.next = checkEvenOdd;
                odd = odd.next;
            }
            checkEvenOdd = checkEvenOdd.next;  
        }
        odd.next = null;
        even.next = dummy2odd.next;
        head = dummy1even.next;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(6);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(10);
        ll.addFirst(12);
        ll.addFirst(8);
        ll.printll();
        ll.EvenOdd();



        // ll.addFirst(4);
        // ll.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.printll();
        // ll.swap(2, 4);
        // ll.printll();

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // //ll.addFirst(5);

        // ll.printll();

        // ll.head = ll.mergeSort(ll.head);

        // ll.printll();
   
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // //1->2->3->2
        
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

    }
}
