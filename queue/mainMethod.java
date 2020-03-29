import java.util.*;

class mainMethod{
    public static void main(String[] args) {
        PriorityQueue<String> things = new PriorityQueue<>();

        things.offer("first");
        printQueue(things);
        things.offer("second");
        printQueue(things);
        things.offer("third");
        printQueue(things);

        things.poll();
        printQueue(things);
        things.poll();
        printQueue(things);
        things.poll();
        printQueue(things);
    }

    private static void printQueue(PriorityQueue<String> q){
        if(q.isEmpty()){
            System.out.println("ur Queue is empty");
        }
        else{
            System.out.printf("%s " , q);
            System.out.println(q.peek());
        }
    }
}