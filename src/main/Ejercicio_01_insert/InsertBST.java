package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {
    

    public Node insert(Node root2,int val) {
        return insertRec(root2, val);
    }

    private Node insertRec(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.getValue()) {
            node.setLeft(insertRec(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insertRec(node.getRight(), value));
        }

        return node;
    }

    
}
