package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank ){
            this.name = name;
            this.rank = rank;
        }

        @Override 
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student>pq = new PriorityQueue<>();
        //if want to reverse this order - 
        //PriorityQueue<Student>pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name +"->"+pq.peek().rank);
            pq.remove();
        }
        //output
        // C->2
        // A->4
        // B->5
        // D->12



        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    
        // pq.add(3);//O(log n) , n - no. of elements exist in PQ
        // pq.add(4);
        // pq.add(1);
        // pq.add(7);

        // while (!pq.isEmpty()) {
        //     System.out.println(pq.peek());//O(1)
        //     pq.remove(); //O(log n)
        // }
        // //By default value for integers in ascending order - 1 3 4 7
    }
}

