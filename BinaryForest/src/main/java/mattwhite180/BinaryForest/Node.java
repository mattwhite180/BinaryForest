package mattwhite180.BinaryForest;

public class Node {
    int value;
    Node left;
    Node right;
 
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    Node() {
        this.value = 0;
        right = null;
        left = null;
    }
}