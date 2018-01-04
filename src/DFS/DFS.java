package DFS;

import java.util.List;
import java.util.Stack;

/**
 * Created by sunginjung on 10/15/17.
 */
public class DFS {

    private Stack<Vertex> stack;

    public DFS() {
        this.stack = new Stack<Vertex>();
    }

    public void dfs_rec(List<Vertex> vertextList) {

        for(Vertex v : vertextList) {
            if(!v.isVisited()) {
                v.setVisited(true);
                dfsRecursive(v);
            }
        }

    }

    public void dfs(List<Vertex> vertextList) {

        for(Vertex v : vertextList) {
            if(!v.isVisited()) {
                v.setVisited(true);
                dfsWithStack(v);
            }
        }

    }

    private void dfsWithStack(Vertex root) {

        this.stack.add(root);
        root.setVisited(true);

        while(!stack.isEmpty()) {

            Vertex current = this.stack.pop();
            System.out.println("Current: " + current);

            for(Vertex v: root.getNeighbors()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }

        }

    }

    private void dfsRecursive(Vertex v){

        System.out.println("current: " + v);

        for(Vertex v : v.getNeighbors()) {
            if(!v.isVisited()) {
                v.setVisited(true);
                dfsRecursive(v);
            }
        }
    }
}
