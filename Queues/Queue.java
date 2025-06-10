package Queues;

public class Queue {

    static class queue{
        static int arr[];
        static int size;
        static int rear;

        queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }


        //add
        public static void add(int data){//O(1)
            if (rear == size-1) {
                System.out.println("Queue is full");
                return;
            }

            rear = rear+1;
            arr[rear] = data;
        }


        //remove
        public static int remove(){//O(n)
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }

            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }


        //peek
        public static int peek(){//O(1)
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }


        //print
        public static void print(){
            while(!isEmpty()){
                System.out.println(peek());
                remove();
            }
        }

    }
    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.print();

    }
}