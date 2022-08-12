import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

public class UnitTest {
    Queue queue = new Queue(15);
    /**
     * Tests functionality of size method from Queue class
     */
    @Test
    public void sizeTest(){
        assertNotNull(queue.size());
    }

    /**
     * Tests functionality of add method from Queue class
     */
    @Test
    public void addTest(){
        queue.add(5);
        assertEquals(queue.element(), 5);
    }

    /**
     * Tests functionality of element method from Queue class
     */
    @Test
    public void elementTest(){
        queue.add(46);
        queue.add(36);
        assertEquals(queue.element(), 36);
    }

    /**
     * Tests functionality of peek method from Queue class
     */
    @Test
    public void peekTest(){
        queue.add(2);
        assertEquals(queue.peek(), Integer.toString((2)));
    }

    /**
     * Tests functionality of poll method from Queue class
     */
    @Test
    public void pollTest(){
        queue.remove();
        queue.remove();
        assertNull(queue.poll());
    }

    /**
     * Tests functionality of remove method from Queue class
     */
    @Test
    public void removeTest(){
        queue.add(55);
        queue.remove();
        queue.add(67);
        assertEquals(queue.element(), 67);
    }

    /**
     * Tests null functionality of peek method from Queue class
     */
    @Test
    public void peek2Test(){
        queue.remove();
        queue.remove();
        queue.remove();
        assertNull(queue.peek());
    }
}
