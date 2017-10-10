package BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sunginjung on 10/9/17.
 */
public class BFS {

    public void bfs(Vertex root){

        Queue<Vertex> queue = new LinkedList<Vertex>();
        root.setVisited(true);
        queue.add(root);

        while(!queue.isEmpty()){

            Vertex current = queue.remove();
            System.out.println(current + " ");

            for(Vertex v : current.getNeighbors()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }

        }
    }
}
