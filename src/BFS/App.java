package BFS;


/**
 * Created by sunginjung on 10/9/17.
 */
public class App {

    public static void main(String[] args) {

        BFS bfs = new BFS();

        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);

        v1.addNeighbor(v2);
        v1.addNeighbor(v4);
        v4.addNeighbor(v5);
        v2.addNeighbor(v3);
        v2.addNeighbor(v6);

        bfs.bfs(v1);

    }



}
