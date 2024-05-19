/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan12;

/**
 *
 * @author zack
 */
public class Graph {
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int nVerts; 

    // Constructor
    public Graph(int maxVerts) {
        vertexList = new Vertex[maxVerts];
        adjMat = new int[maxVerts][maxVerts];
        nVerts = 0;
        for (int i = 0; i < maxVerts; i++) {
            for (int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    // Method addVertex
    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    // Method addEdge
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    // Method adjacencyMatrix
    public void adjacencyMatrix() {
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[0].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Display vertex
    public void displayVertex(int v) {
        System.out.print(vertexList[v].getLabel() + " ");
    }
    
    // Getter vertexList
    public Vertex[] getVertexList() {
        return vertexList;
    }

    // Getter adjacencyMatrix
    public int[][] getAdjMat() {
        return adjMat;
    }

    // Getter NVertices
    public int getNVerts() {
        return nVerts;
    }
}