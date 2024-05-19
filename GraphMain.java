/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan12;

/**
 *
 * @author zack
 */
public class GraphMain {
//    public static void main(String[] args) {
//        Graph graph = new Graph(5);
//
//        // Menambahkan vertex
//        graph.addVertex('A'); // 0 
//        graph.addVertex('B'); // 1
//        graph.addVertex('C'); // 2
//        graph.addVertex('D'); // 3
//        graph.addVertex('E'); // 4
//
//        
//        // Menambahkan edge
//        graph.addEdge(0, 1); // AB
//        graph.addEdge(1, 2); // BC
//        graph.addEdge(0, 3); // AD
//        graph.addEdge(3, 4); // DE
//
//        // Menampilkan adjacency matrix
//        graph.adjacencyMatrix();
//        System.out.println();
//    }
    
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        // Menambahkan vertex
        graph.addVertex('A'); // 0 
        graph.addVertex('B'); // 1
        graph.addVertex('D'); // 2
        graph.addVertex('Z'); // 3

        // Menambahkan edge
        graph.addEdge(0, 1); // AB
        graph.addEdge(0, 2); // AD
        graph.addEdge(1, 2); // BD
        graph.addEdge(1, 3); // BZ

        // Menampilkan adjacency matrix
        graph.adjacencyMatrix();
        System.out.println();
    }
}

