package mattwhite180.BinaryForest;

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = new Node();
    }

    BinaryTree(int val) {
        root = new Node(val);
    }

    BinaryTree(Node val) {
        root = val;
    }

    // private

	private Node insertRecursive(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    }
	    else if (value < current.value) {
	        current.left = insertRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = insertRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}

    private Node deleteRecursive(Node current, int value) {
            if (current == null) {
                return null;
            }
        
            if (value == current.value) {
                if ( (current.left == null) && (current.right == null) ) {
                    return null;
                }
                else if (current.right == null) {
                    return current.left;
                }
                else { // current.left == null
                    return current.right;
                }
            } 
            else if (value < current.value) {
                current.left = deleteRecursive(current.left, value);
                return current;
            }
            else { // value > current.value
                current.right = deleteRecursive(current.right, value);
                return current;
            }
    }

    private boolean containsNodeRecursive(Node current, int value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        return true;
        } 
        if (value < current.value) {
            return containsNodeRecursive(current.left, value);
        }
        else {
            return containsNodeRecursive(current.right, value);
        }
        /*
	    return value < current.value
	      ? containsNodeRecursive(current.left, value)
          : containsNodeRecursive(current.right, value);
          */
	}

    // public

    public void insert(int value) {
	    root = insertRecursive(root, value);
    }
    
    public boolean containsNode(int value) {
	    return containsNodeRecursive(root, value);
	}

    public void remove(int value) {
	    root = deleteRecursive(root, value);
	}

}

// https://www.baeldung.com/java-binary-tree
// https://www.geeksforgeeks.org/binary-tree-data-structure/