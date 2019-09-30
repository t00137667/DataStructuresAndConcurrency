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
}