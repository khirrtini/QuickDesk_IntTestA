package QueuingClass;

//FIFO
public class QUEUE implements IQueuable{

    private final String[] queue;
    private final int capacity;
    private int index;


    //Constructor
    public QUEUE(int c) {
        this.queue = new String[c];
        this.capacity = c;
        this.index = 0;
    }

    //Enqueue - add items to queue
    @Override
    public String[] enqueue(String value) {
        if (size() == capacity) {
            System.out.println("Queue is full.");
        } else {
            queue[index] = value;
            index++;
        }
        return queue;
    }

    //Dequeue - removes first item from queue
    @Override
    public String dequeue() {
        if (size() == 0) {
            System.out.println("Queue is empty.");
            return null;
        } else {
            String removed = queue [0];
            for (int i = 0; i < queue.length - 1; i++) {
                    queue[i] = queue[i+1];
                    queue[i+1] = null;
            }
            index--;
            return removed;
        }
    }

    //getQueue - get a copy of current queue
    @Override
    public String[] getQueue() {
        if (size()== 0) {
            System.out.println("Queue is empty");
            return null;
        } else {
            String[] temp = new String[capacity];
            int x = 0;

            for (int i = 0; i < capacity; i++) {
                temp[x] = queue[i];
                x++;
            }
            return temp;
        }
    }

    //size - get number of items in queue
    @Override
    public int size() { return index; }

}
