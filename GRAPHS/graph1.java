package GRAPHS;

import java.util.LinkedList;
import java.util.Scanner;

public class graph1 {
    int vertices;
    LinkedList<Integer>[] adjlist;
    public graph1(int vertices)
    {
        this.vertices=vertices;
        adjlist=new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjlist[i]=new LinkedList<>();
        }
    }
    void add_edge(int s,int d)
    {
        adjlist[s].add(d);
        adjlist[d].add(s);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter number of vertices");
//         int v=sc.nextInt();
//        System.out.println("enter number of edges");
//        int e=sc.nextInt();
        graph1 g=new graph1(3);
        g.add_edge(0,1);
        g.add_edge(1,2);
        g.add_edge(2,0);



//        for (int i = 1; i <=e; i++) {
//            if (i==1) System.out.println("enter starting and destination of "+i+"st "+"edge");
//            else if (i==2||i==3)
//                System.out.println("enter starting and destination of "+i+"nd "+"edge");
//            else System.out.println("enter starting and destination of "+i+"th "+"edge");
//
//            int s=sc.nextInt();
//            int d=sc.nextInt();
//            g.add_edge(s,d);
//
//        }
    }
}
