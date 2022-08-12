import java.util.NoSuchElementException;
import java.util.Arrays;

/**
 * Java class Queue implements instance methods size(), add(),
 * element(), peek(), poll(), remove()
 * @author Amy Dempsey 119425074
 */

public class Queue{
    private static int queue[];
    private static int length;
    private static int first ;
    private static int last = 0;

    /**
     * Queue constructor that creates a queue of maximum size 10
     */
    public Queue(int max){
        queue = new int[max];
    }

    /**
     * Get the size of the queue instance
     * @return returns the size of the queue as an integer
     */
    public int size(){
        System.out.println(length);
        return length;
    }

    /**
     * Adds element to the end of the queue
     * @param e - element to be added to the queue
     * @return boolean true/false indicating if element was added to
     * the queue or not
     */
    public boolean add(int e){
        try{
            if (length == 0){
                queue[last] = e;
                length++;
            }else{ queue[last] = e;
                length++;
                last ++;}

            System.out.println(Arrays.toString(queue));
            return true;} catch(IllegalStateException exception){
            System.out.println(exception);
            return false;
        }
    }

    /**
     * Retrieves the head of the queue without removing it.
     * @return the head of the queue
     */
    public int element(){
        try{
            System.out.println(queue[first]);
            return queue[first];
        } catch (NoSuchElementException e) {
            System.out.println("There are no elements in the queue");
            return 0;
        }

    };

    /**
     * Retrieves head of the queue
     * @return the head of the queue if it exists. Otherwise,
     * returns null
     */
    public String peek(){
        if(length == 0){
            return null;
        } else {
            return Integer.toString(queue[first]);
        }
    }

    /**
     * Retrieves & removes head of queue.
     * If the queue is empty, returns null.
     * @return null if queue is empty. Head of queue otherwise
     */
    public String poll(){
        if(length == 0){
            return null;
        }else{
            int f = queue[first];
            queue[first] = 0;
            length --;
            return Integer.toString(f);
        }
    }

    /**
     * Removes the head of the queue.
     */
    public void remove(){
        queue[first] = 0;
        length --;
       // System.out.print(Arrays.toString(queue));
    }

}