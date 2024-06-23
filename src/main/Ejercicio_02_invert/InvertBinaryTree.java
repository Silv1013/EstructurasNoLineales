package main.Ejercicio_02_invert;
import main.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertTree (Node root){
        if (root == null) {
            return null;
        }

        // Se intercambia el nodo izquierdo y derecho

        Node left = invertTree(root.getLeft());
        Node right = invertTree(root.getRight());

        root.setLeft(right);
        root.setRight(left);

        return root;

    }

    
}
