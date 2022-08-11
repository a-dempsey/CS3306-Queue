import java.util.NoSuchElementException;
import java.util.Arrays;

public class Queue{
    private static int queue[];
    private static int length;
    private static int first ;
    private static int last = 0;
    private int max = 10;

    public Queue(){
        queue = new int[max];
    }

    // retruns size of the queue
    public int size(){
        System.out.println(length);
        return length;
    }

    // adds element to end of the queue
    public boolean add(int e){
        try{
            queue[last] = e;
            length++;
            System.out.println(Arrays.toString(queue));
            return true;} catch(IllegalStateException exception){
            System.out.println(exception);
            return false;
        }
    }

    // returns first elt of queue
    public int element(){
        try{
            System.out.println(queue[first]);
            return queue[first];
        } catch (NoSuchElementException e) {
            System.out.println("There are no elements in the queue");
            return 0;
        }

    };

    // retruns first element of queue
    public int peek(){
        if(length == 0){
            System.out.println("false");
            return 0;
        } else {
            return queue[first];
        }
    }

    /// removes first elt of queue and returns it. if empty return null
    public int poll(){
        if(length == 0){
            return 0;
        }else{
            int f = queue[first];
            queue[first] = 0;
            length --;
            return f;
        }
    }

    // removes the first element of the queue
    public void remove(){
        queue[first] = 0;
        length --;
    }

}