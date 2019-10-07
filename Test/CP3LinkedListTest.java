import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    @Test
    void addFirst() {
    }

    @Test
    void getFirst() {
    }

    @Test
    void removeFirst() {
    }

    @Test
    void print() {
        CP3LinkedList<String> list = new CP3LinkedList<>();

        list.addFirst("Ian");
        list.addFirst("Evan");
        list.addFirst("Ryan");

        list.print();
    }

    @Test
    void fiboIterative(){
        int actual = CP3LinkedList.fiboIterative(10);
        int expected = 34;

        assertEquals(expected, actual);
    }

    @Test
    void fiboRecursive(){
        CP3LinkedList.fiboRecursive(10);
    }
}