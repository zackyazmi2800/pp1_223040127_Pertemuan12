/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan12;

/**
 *
 * @author zack
 */
public class Vertex {
    private char label; 
    private boolean wasVisited;

    // Constructor
    public Vertex(char lab) {
        this.label = lab;
        this.wasVisited = false;
    }

    // Getter label
    public char getLabel() {
        return label;
    }

    // Setter label
    public void setLabel(char label) {
        this.label = label;
    }

    // Getter wasVisited
    public boolean isWasVisited() {
        return wasVisited;
    }

    // Setter wasVisited
    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}
