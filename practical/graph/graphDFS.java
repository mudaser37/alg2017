import java.util.Iterator;
import java.util.LinkedList;

class graphDFS {
    public static void main(String[] args) {
        
        grahp g= new grahp(10);

        g.addEdge(0,2);
        g.addEdge(0,1);
        g.addEdge(0,3);
        g.addEdge(0,4);
        g.addEdge(1,7);


        g.dfs(0);


    }
}


class grahp{

    private int vertex;
    private LinkedList<Integer> adj[];

    grahp(int v){
        vertex=v;
        adj=new LinkedList[v];

        for (int i = 0; i <v ; i++) {
            adj[i]=new LinkedList<>();
        }
    }

    void display(){
        for (int i = 0; i <adj.length ; i++) {
            System.out.print(adj[i]);
        }

        System.out.println();
    }

    void addEdge(int v, int w){
        adj[v].add(w);

    }

    void dfshelper(int v, boolean[] visited){
        visited[v]=true;
        System.out.print(v+" ");

        Iterator<Integer> i= adj[v].listIterator();

        while (i.hasNext()){
            int n=i.next();
            if (!visited[n]){
                dfshelper(n, visited);
            }
        }
    }


    void dfs(int v){
        boolean visited[]=new boolean[vertex];
        dfshelper(v,visited);
    }

}
