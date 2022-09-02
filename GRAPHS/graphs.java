package GRAPHS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
class graph_implement
{
    LinkedList<Integer> [] adjacency;

    public graph_implement(int v) {
        adjacency = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacency[i] = new LinkedList<Integer>();
        }
    }
    public void insert_edge(int s,int d)
    {
        adjacency[s].add(d);
        adjacency[d].add(s);
    }

    public void print(int v)
    {
        for (int i = 0; i < v ; i++) {
            if (adjacency[i].size()>0)
            {
                System.out.print("vertex "+i+" connected to-->");
                for (int j = 0; j < adjacency[i].size(); j++) {
                    System.out.print(adjacency[i].get(j)+"-->");
                }
                System.out.println(" ");
            }
        }
    }

}

public class graphs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Edges");
        int e= sc.nextInt();
        System.out.println("Enter Number of Vertices");
        int v= sc.nextInt();

        graph_implement g=new graph_implement(v);

        for (int i = 1; i <=e; i++) {
            if (i==1) System.out.println("enter starting and destination of "+i+"st "+"edge");
            else if (i==2||i==3)
            System.out.println("enter starting and destination of "+i+"nd "+"edge");
            else System.out.println("enter starting and destination of "+i+"th "+"edge");

            int s=sc.nextInt();
            int d=sc.nextInt();
            g.insert_edge(s,d);

        }
        g.print(v);

    }
}
