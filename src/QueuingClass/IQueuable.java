package QueuingClass;

public interface IQueuable {

    //adds value to queue and returns new queue
    //enqueue(value: string): string[];
    String[] enqueue(String value);

    //removes item from queue, and returns the item removed
    //dequeue(): string;
    String dequeue();

    //returns a list of all the items in the queue
    //getQueue(): string[];
    String[] getQueue();

    //returns the number of items in the queue
    //size():number;
    int size();

}
