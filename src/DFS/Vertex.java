package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunginjung on 10/15/17.
 */
public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> neighbors;

    public Vertex(String name){
        this.name = name;
        this.neighbors = new ArrayList<Vertex>();
    }

    public String toString(){
        return this.name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(Vertex vertex) {
        this.neighbors.add(vertex);
    }
}
