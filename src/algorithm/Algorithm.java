/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;
import algorithm.graph.TopologicalSort;
import algorithm.graph.BFS;
import algorithm.graph.BellmanFord;
import algorithm.graph.DFS;
import algorithm.graph.Dijkstra;
import algorithm.graph.FloydWarshall;
import algorithm.graph.Graph;
import algorithm.graph.Kruskal;
import algorithm.graph.Prims;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author nayeem
 */
public class Algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("---------------------------------------\n"
                    +"             * Algoithm *             \n"
                    +"--------------------------------------\n"
                    +"	1. Data Structure\n"
                    +"	2. Graph Algorithm\n");
            System.out.println();
            System.out.print("Type your choice >: ");
            int choice = s.nextInt();


            if(choice == 1) {
                Input in = new Input();
                System.out.println("---------------------------------------\n"
                        +"             * Data Structure *       \n"
                        +"--------------------------------------\n"
                        +"    1. Linear Search\n"
                        +"    2. Binary Search\n"
                        +"    3. Bubble Sort\n"
                        +"    4. Insertion Sort\n"
                        +"    5. Selection Sort\n"
                        +"    6. Merge Sort\n"
                        +"    7. Quick Sort\n"
                        +"    8. Counting Sort\n"
                        +"    9. Radix Sort\n"
                        +"   10. Bucket Sort\n"
                        +"   11. Shell Sort\n"
                        +"   12. Stack\n"
                        +"   13. Queue\n"
                        +"   14. Link List\n"
                        +"   15. Heap Sort\n"
                        +"   16. Binary Search Tree");
                System.out.println();
                System.out.print("Enter your Data Structure choice >: ");
                int n1 = s.nextInt();

                switch(n1) {
                    case 1:
                        new LinearSearch(in.sortInput()).result();
                        break;
                    case 2:
                        new BinarySearch(in.sortInput()).result();
                        break;
                    case 3:
                        new BubbleSort().bubbleSort(in.sortInput());
                        break;
                    case 4:
                        new InsertionSort(in.sortInput()).result();
                        break;
                    case 5:
                        new SelectionSort(in.sortInput()).result();
                        break;
                    case 6:
                        new MergeSort(in.sortInput()).result();
                        break;
                    case 7:
                        new QuickSort(in.sortInput()).result();
                        break;
                    case 8:
                        new CountingSort(in.sortInput()).result();
                        break;
                    case 9:
                        new RadixSort(in.sortInput()).result();
                        break;
                    case 10:
                        new BucketSort(in.sortInput()).result();
                        break;
                    case 11:
                        new ShellSort(in.sortInput()).result();
                        break;
                    case 12:
                        StackTest test = new StackTest();
                        Stack<Integer> stack = new Stack<Integer>();

                        test.stack_push(stack);
                        test.stack_pop(stack);
                        test.stack_push(stack);
                        test.stack_peek(stack);
                        test.stack_search(stack, 2);
                        test.stack_search(stack, 6);

                        break;
                    case 13:
                        new QueueTest().operation();
                        break;
                    case 14:
                        new LinkedListTest().operation();
                        break;
                    case 15:
                        new HeapSort(in.sortInput()).result();
                        break;
                    case 16:
                        new BinarySearchTree().result();
                        break;
                    default:
                        System.out.println("Please Enter Valid Number\n");
                        break;
                }

            }

            else {
                System.out.println("---------------------------------------\n"
                        +"             * Graph Algorithm *       \n"
                        +"--------------------------------------\n"
                        +"    1.  Graph Representaion\n"
                        +"    2.  BFS\n"
                        +"    3.  DFS\n"
                        +"    4.  Topological Sort\n"
                        +"    5.  Krushkal\n"
                        +"    6.  Prim's\n"
                        +"    7.  Dijkastra\n"
                        +"    8.  Bellman-Ford\n"
                        +"    9.  Floyed-Warshall\n");
                System.out.println();
                System.out.print("Type your Graph Algorithm choice >: ");
                int n2 = s.nextInt();

                switch(n2) {
                    case 1:
                        Graph g = new Graph();
                        // Creating a graph with 5 vertices
                        int V = 5;
                        ArrayList<ArrayList<Integer>> adj
                                = new ArrayList<ArrayList<Integer> >(V);

                        for (int i = 0; i < V; i++)
                            adj.add(new ArrayList<Integer>());

                        // Adding edges one by one
                        g.addEdge(adj, 0, 1);
                        g.addEdge(adj, 0, 4);
                        g.addEdge(adj, 1, 2);
                        g.addEdge(adj, 1, 3);
                        g.addEdge(adj, 1, 4);
                        g.addEdge(adj, 2, 3);
                        g.addEdge(adj, 3, 4);

                        g.printGraph(adj);
                        break;
                    case 2:
                        BFS bfs = new BFS(4);

                        bfs.addEdge(0, 1);
                        bfs.addEdge(0, 2);
                        bfs.addEdge(1, 2);
                        bfs.addEdge(2, 0);
                        bfs.addEdge(2, 3);
                        bfs.addEdge(3, 3);

                        System.out.println("Following is Breadth First Traversal "+
                                "(starting from vertex 2)");

                        bfs.BFSResult(2);
                        System.out.println("\n");
                        break;
                    case 3:
                        DFS dfs = new DFS(4);

                        dfs.addEdge(0, 1);
                        dfs.addEdge(0, 2);
                        dfs.addEdge(1, 2);
                        dfs.addEdge(2, 0);
                        dfs.addEdge(2, 3);
                        dfs.addEdge(3, 3);

                        System.out.println(
                                "Following is Depth First Traversal "
                                        + "(starting from vertex 2)");

                        dfs.DFSResult(2);
                        System.out.println("\n");
                        break;
                    case 4:
                        // Create a graph given in the above diagram
                        TopologicalSort ts = new TopologicalSort(6);
                        ts.addEdge(5, 2);
                        ts.addEdge(5, 0);
                        ts.addEdge(4, 0);
                        ts.addEdge(4, 1);
                        ts.addEdge(2, 3);
                        ts.addEdge(3, 1);

                        System.out.println("Following is a Topological "
                                + "sort of the given graph");
                        // Function Call
                        ts.topologicalSort();
                        System.out.println("\n");
                        break;
                    case 5:
                        /* Let us create following weighted graph
                             10
                        0--------1
                        |  \     |
                       6|   5\   |15
                        |      \ |
                        2--------3
                            4       */
                        int Ver = 4; // Number of vertices in graph
                        int Edg = 5; // Number of edges in graph
                        Kruskal kruskal = new Kruskal(Ver, Edg);

                        // add edge 0-1
                        kruskal.edge[0].src = 0;
                        kruskal.edge[0].dest = 1;
                        kruskal.edge[0].weight = 10;

                        // add edge 0-2
                        kruskal.edge[1].src = 0;
                        kruskal.edge[1].dest = 2;
                        kruskal.edge[1].weight = 6;

                        // add edge 0-3
                        kruskal.edge[2].src = 0;
                        kruskal.edge[2].dest = 3;
                        kruskal.edge[2].weight = 5;

                        // add edge 1-3
                        kruskal.edge[3].src = 1;
                        kruskal.edge[3].dest = 3;
                        kruskal.edge[3].weight = 15;

                        // add edge 2-3
                        kruskal.edge[4].src = 2;
                        kruskal.edge[4].dest = 3;
                        kruskal.edge[4].weight = 4;

                        // Function call
                        kruskal.KruskalMST();

                        System.out.println("\n");

                        break;
                    case 6:
                        /* Let us create the following graph
                        2 3
                        (0)--(1)--(2)
                        | / \ |
                        6| 8/ \5 |7
                        | /     \ |
                        (3)-------(4)
                            9         */
                        Prims prims = new Prims();
                        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                                { 2, 0, 3, 8, 5 },
                                { 0, 3, 0, 0, 7 },
                                { 6, 8, 0, 0, 9 },
                                { 0, 5, 7, 9, 0 } };

                        // Print the solution
                        prims.primMST(graph);
                        System.out.println("\n");
                        break;
                    case 7:
                        int Vertex = 5;
                        int source = 0;

                        // Adjacency list representation of the
                        // connected edges
                        List<List<Dijkstra.Node>> adjc = new ArrayList<List<Dijkstra.Node> >();

                        // Initialize list for every node
                        for (int i = 0; i < Vertex; i++) {
                            List<Dijkstra.Node> item = new ArrayList<Dijkstra.Node>();
                            adjc.add(item);
                        }

                        // Inputs for the DPQ graph
                        adjc.get(0).add(new Dijkstra.Node(1, 9));
                        adjc.get(0).add(new Dijkstra.Node(2, 6));
                        adjc.get(0).add(new Dijkstra.Node(3, 5));
                        adjc.get(0).add(new Dijkstra.Node(4, 3));

                        adjc.get(2).add(new Dijkstra.Node(1, 2));
                        adjc.get(2).add(new Dijkstra.Node(3, 4));

                        // Calculate the single source shortest path
                        Dijkstra dpq = new Dijkstra(Vertex);
                        dpq.dijkstra(adjc, source);

                        // Print the shortest path to all the nodes
                        // from the source node
                        System.out.println("The shorted path from node :");
                        for (int i = 0; i < dpq.dist.length; i++)
                            System.out.println(source + " to " + i + " is "
                                    + dpq.dist[i]);
                        System.out.println("\n");
                        break;
                    case 8:
                        int BV = 5; // Number of vertices in graph
                        int BE = 8; // Number of edges in graph

                        BellmanFord bel = new BellmanFord(BV, BE);

                        // add edge 0-1 (or A-B in above figure)
                        bel.edge[0].src = 0;
                        bel.edge[0].dest = 1;
                        bel.edge[0].weight = -1;

                        // add edge 0-2 (or A-C in above figure)
                        bel.edge[1].src = 0;
                        bel.edge[1].dest = 2;
                        bel.edge[1].weight = 4;

                        // add edge 1-2 (or B-C in above figure)
                        bel.edge[2].src = 1;
                        bel.edge[2].dest = 2;
                        bel.edge[2].weight = 3;

                        // add edge 1-3 (or B-D in above figure)
                        bel.edge[3].src = 1;
                        bel.edge[3].dest = 3;
                        bel.edge[3].weight = 2;

                        // add edge 1-4 (or A-E in above figure)
                        bel.edge[4].src = 1;
                        bel.edge[4].dest = 4;
                        bel.edge[4].weight = 2;

                        // add edge 3-2 (or D-C in above figure)
                        bel.edge[5].src = 3;
                        bel.edge[5].dest = 2;
                        bel.edge[5].weight = 5;

                        // add edge 3-1 (or D-B in above figure)
                        bel.edge[6].src = 3;
                        bel.edge[6].dest = 1;
                        bel.edge[6].weight = 1;

                        // add edge 4-3 (or E-D in above figure)
                        bel.edge[7].src = 4;
                        bel.edge[7].dest = 3;
                        bel.edge[7].weight = -3;

                        bel.BellmanFordResult(bel, 0);
                        System.out.println("\n");
                        break;
                    case 9:
                        int adjacency_matrix[][];
                        int numberofvertices;

                        Scanner scan = new Scanner(System.in);
                        System.out.println("Enter the number of vertices");
                        numberofvertices = scan.nextInt();

                        adjacency_matrix = new int[numberofvertices + 1][numberofvertices + 1];
                        System.out.println("Enter the Weighted Matrix for the graph");
                        for (int fwsource = 1; fwsource <= numberofvertices; fwsource++)
                        {
                            for (int destination = 1; destination <= numberofvertices; destination++)
                            {
                                adjacency_matrix[fwsource][destination] = scan.nextInt();
                                if (fwsource == destination)
                                {
                                    adjacency_matrix[fwsource][destination] = 0;
                                    continue;
                                }
                                if (adjacency_matrix[fwsource][destination] == 0)
                                {
                                    adjacency_matrix[fwsource][destination] = 999;
                                }
                            }
                        }

                        System.out.println("The Transitive Closure of the Graph");
                        FloydWarshall floydwarshall = new FloydWarshall(numberofvertices);
                        floydwarshall.floydwarshall(adjacency_matrix);
                        scan.close();
                        System.out.println("\n");
                        break;
                    default:
                        System.out.println("Please Select Correct Number\n");
                        break;
                }

            }

        }
    }
    
}
