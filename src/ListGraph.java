import java.util.ArrayList;
import java.util.LinkedList;

public class ListGraph extends AbstractGraph{
    private ArrayList<LinkedList<Edge>> adjacencyLists;

    public ListGraph(int nv, boolean directed) {
        super(nv, directed);
        adjacencyLists = new ArrayList(nv);
        for (int i = 0; i < nv; i++) {
            //adjacencyLists.add(i, new LinkedList());
            adjacencyLists.add(new LinkedList());
        }
    }
    public boolean isEdge(int source, int dest) {
        //complete this method
        return true;
        //return matrix[source][dest] == 1;
    }
    public void insert(Edge edge) {
        //complete this method
        // if graph is undirected, insert two edges
        // otherwise, insert just one edge
        //matrix[edge.getSource()][edge.getDestination()] = 1.0;
        if (!isDirected()){
            //matrix[edge.getDestination()][edge.getSource()] = 1.0;
        }
    }

    public void remove(Edge edge) {
        //complete this method
        // as for insert method
        //matrix[edge.getSource()][edge.getDestination()] = 0;
        if (!isDirected()){
            //matrix[edge.getDestination()][edge.getSource()] = 0;
        }
    }

}
