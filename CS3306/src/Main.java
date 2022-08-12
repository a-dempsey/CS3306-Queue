/**
 * Class Main creates an instance of the queue class.
 * Tests functionality of Queue class.
 * @author Amy Dempsey 119425074
 */

public class Main {
    public static void main(String[] args){
        Queue queue = new Queue(10);
        queue.size();
        queue.add(12);
        queue.element();
        queue.peek();
        queue.size();
        queue.poll();
        queue.size();
        queue.remove();
        queue.add(4);
    }
}
