import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixGraphTest {

    private Graph graph;
    private Graph undirected;
    Edge edge;

    @BeforeEach
    void setup(){
        graph = new MatrixGraph(5, true);
        undirected = new MatrixGraph(5,false);
        edge = new Edge(0,1);
    }

    @Test
    void isEdge() {
        graph.insert(edge);
        boolean actual = graph.isEdge(0,1);
        boolean expected = true;
        assertEquals(expected,actual);
    }
    @Test
    void isNotEdge() {
        graph.insert(edge);
        boolean actual = graph.isEdge(0,2);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void insert() {
        graph.insert(edge);
        boolean actual = graph.isEdge(0,1);
        boolean expected = true;
        assertEquals(expected,actual);
    }
    @Test
    void insertUnDirected() {
        undirected.insert(edge);
        boolean actual = undirected.isEdge(0,1);
        boolean expected = true;
        assertEquals(expected,actual);
        actual = undirected.isEdge(1,0);
        assertEquals(expected,actual);
    }

    @Test
    void remove() {
        graph.insert(edge);

        graph.remove(edge);
        boolean actual = graph.isEdge(0,2);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void breadthFirstTraversal() {
    }

    @Test
    void depthFirstTraversal() {
    }
}