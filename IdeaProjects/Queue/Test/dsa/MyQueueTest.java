package dsa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MyQueueTest {
    MyQueue queue;
    @BeforeEach
    void setUp(){
        queue = new MyQueue();
    }

    @Test
    public void testQueueIsEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testEnqueueXToQueue_isEmptyIsFalse() {
        queue.enqueue("Emmax");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testEnqueueXYToQueue_isEmptyIsFalse() {
        queue.enqueue("Emmax");
        queue.enqueue("Emma");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testEnqueueXYZAToQueue_isEmptyIsFalse() {
        queue.enqueue("Emmax");
        queue.enqueue("Emma");
        queue.enqueue("Emma");
        queue.enqueue("Emma");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testDequeueAQueue_isEmptyIsFalse() {
        queue.enqueue("Emmax");
        queue.enqueue("E");
        queue.enqueue("Emmanuel");
        queue.enqueue("Emmanuella");
        queue.dequeue();
        queue.dequeue();
        queue.enqueue("Emmanuel");
        queue.enqueue("nuel");
        assertTrue(queue.isEmpty());
    }


}
