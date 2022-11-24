package QueuingClass;

//LIFO
public class STACK implements IQueuable{

    private final String[] stack;
    private final int capacity;
    private int currIndex;
    private int prevIndex;


    //Constructor
    public STACK(int c) {
        this.stack = new String[c];
        this.capacity = c;
        this.currIndex = 0;
        this.prevIndex = 0;
    }

    //Enqueue - add items to queue
    @Override
    public String[] enqueue(String value) {
        if (size() == capacity){
            System.out.println("Queue is full.");
        } else {
            stack[currIndex] = value;
            prevIndex = currIndex;
            currIndex++;
        }
        return stack;
    }

    //Dequeue - removes last item from queue
    @Override
    public String dequeue() {
        if (size() == 0) {
            System.out.println("Queue is empty.");
            return null;
        }else {
            String removed = stack[prevIndex];
            stack[prevIndex] = null;
            currIndex = prevIndex;
            prevIndex--;
            return removed;
        }
    }

    //getQueue - get a copy of current queue
    @Override
    public String[] getQueue() {
        if (size() == 0) {
            System.out.println("Queue is empty.");
            return null;
        } else {
            String[] temp = new String[capacity];
            int x = 0;

            for (int i = 0; i < capacity; i++) {
                temp[x] = stack[i];
                x++;
            }
            return temp;
        }
    }

    //size - get number of items in queue
    @Override
    public int size() { return currIndex; }


}