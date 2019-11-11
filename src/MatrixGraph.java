import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MatrixGraph extends AbstractGraph {
    //entries in matrix are 1.0 or 0.0
    //1.0 indicates an edge.
    //0.0 indicates no edge
    
    private double[][] matrix;
    
    public MatrixGraph(int nV, boolean direct){
        super(nV, direct);
        matrix = new double[nV][nV];
        for (int row = 0; row < nV; row++)
            for (int col = 0; col < nV; col++)
                    matrix[row][col] = 0.0;        
    }

    public boolean isEdge(int source, int dest) {
        //complete this method
        return matrix[source][dest] == 1;
    }

    public void insert(Edge edge) {
        //complete this method
        // if graph is undirected, insert two edges
        // otherwise, insert just one edge
        matrix[edge.getSource()][edge.getDestination()] = 1.0;
        if (!isDirected()){
            matrix[edge.getDestination()][edge.getSource()] = 1.0;
        }
    }

    public void remove(Edge edge) {
        //complete this method
        // as for insert method
        matrix[edge.getSource()][edge.getDestination()] = 0;
        if (!isDirected()){
            matrix[edge.getDestination()][edge.getSource()] = 0;
        }
    }

    private enum vertixState {NOTVISITED, VISITED, WAITING}
    
    public void breadthFirstTraversal(int start){
	//Output the vertices in breadth first order

        Deque<Integer> queue = new LinkedList();

        vertixState[] vertices =  new vertixState[getNumVertices()];

        queue.add(start);

        for (int i = 0; i < getNumVertices(); i++){
            vertices[i] = vertixState.VISITED;
            for (int j = 0; j < getNumVertices(); j++){
                if(isEdge(i,j)){
                    vertices[j] = vertixState.WAITING;
                }
            }
        }
    }
    
    public void depthFirstTraversal(int start){
        //Output the vertices in depth first order
    }    
}
