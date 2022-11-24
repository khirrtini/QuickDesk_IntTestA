package QueuingClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        //Testing out FIFOQUEUE / QUEUE
        System.out.println("FIFO / Queue\n");

        QUEUE queue = new QUEUE(5);

        queue.enqueue("Apple");
        queue.enqueue("Banana");
        queue.enqueue("Cherry");
        queue.enqueue("Durian");
        queue.enqueue("Elderberry");
        queue.enqueue("Fig");

        System.out.println(Arrays.toString(queue.getQueue()));
        System.out.println("Size: " + queue.size());

        System.out.println("Removed: " + queue.dequeue());
        System.out.println(Arrays.toString(queue.getQueue()));
        System.out.println("Size: " + queue.size());

        queue.enqueue("Fig");
        System.out.println(Arrays.toString(queue.getQueue()));
        System.out.println("Size: " + queue.size());



        //Testing out LIFOQUEUE / STACK
        System.out.println("\n\nLIFO / Stack\n");

        STACK stack = new STACK(5);

        stack.enqueue("Alligator");
        stack.enqueue("Bear");
        stack.enqueue("Cat");
        stack.enqueue("Deer");
        stack.enqueue("Elephant");
        stack.enqueue("Frog");

        System.out.println(Arrays.toString(stack.getQueue()));
        System.out.println("Size: " + stack.size());

        System.out.println("Removed: " + stack.dequeue());
        System.out.println(Arrays.toString(stack.getQueue()));
        System.out.println("Size: " + stack.size());

        stack.enqueue("Frog");
        System.out.println(Arrays.toString(stack.getQueue()));
        System.out.println("Size: " + stack.size());



    }
}
