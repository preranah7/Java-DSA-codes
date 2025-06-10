package Queues;
import java.util.*;
public class DequeLec {
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();

        System.out.println("First Element = "+deque.getFirst());
        System.out.println("Last Element = "+deque.getLast());
    }
}