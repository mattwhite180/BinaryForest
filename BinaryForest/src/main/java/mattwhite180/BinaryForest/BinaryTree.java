package mattwhite180.BinaryForest;

import java.util.*;
import java.util.ArrayList;

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
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
    
    private String getNodeByBinary(Node node, String address, int level) {
        if (node == null) {
            return "NULL";
        }
        if (level >= address.length()) {
            return Integer.toString(node.value);
        }
        if (address.charAt(level) == 'L') {
            return getNodeByBinary(node.left, address, level + 1);
        }
        else { // == 'R'
            return getNodeByBinary(node.right, address, level + 1);
        }
    }

    private boolean hasNum(String str) {
        for (int i = 0; i < str.length(); i++) {
             if (Character.isDigit(str.charAt(i))) {
                 return true;
             }
        }
        return false;
    }

    // public

    public String traverseInOrder(Node node) {
        /*
        left subtree --> root node --> right subtree
        */
        String myString = new String();
		if (node != null) {
	    	myString += traverseInOrder(node.left);
	    	myString += "," + String.valueOf(node.value);
	    	myString += traverseInOrder(node.right);
		}
        return myString;
    }

    public String traversePreOrder(Node node) {
        /*
        root node --> left subtree --> right subtree
        */
		String myString = new String();
		if (node != null) {
		    myString += "," + String.valueOf(node.value);
		    myString += traversePreOrder(node.left);
	   		myString += traversePreOrder(node.right);
		}
		return myString;
    }

    public String traversePostOrder(Node node) {
        /*
        left subtree --> right subtree --> root node
        */
		String myString = new String();

		if (node != null) {
	    	myString += traversePostOrder(node.left);
            myString += traversePostOrder(node.right);
	    	myString += "," + String.valueOf(node.value);
		}
		return myString;
    }

	public String traverseLevelOrder() {
		
		String myString = new String();

		if (root == null) {
			return myString;
		}

		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);

		while (!nodes.isEmpty()) {
			Node node = nodes.remove();

			myString += "," + String.valueOf(node.value);

			if (node.left != null) {
				nodes.add(node.left);
			}

			if (node.right != null) {
				nodes.add(node.right);
			}
		}
		return myString;
    }

    public String treeToString() {
        String myString = new String();

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("L");
        myList.add("R");
        while (true) {
            String tempString = new String();
            for (int i = 0; i < myList.size(); i++) {
                tempString += "," + getNodeByBinary(root, myList.get(i), 0);
            }
            if (hasNum(tempString) == false) {
                return myString;
            }
            ArrayList<String> tempList = new ArrayList<String>();
            for (int i = 0; i < myList.size(); i++) {
                tempList.add("L" + myList.get(i));
            }
            for (int i = 0; i < myList.size(); i++) {
                tempList.add("R" + myList.get(i));
            }
            myList = tempList;
        }
    }

    public String treeToStringmyDev(String myString, int level, Node node) {
        /*
        root node --> left subtree --> right subtree
        */
        String myString = new String();
        if (node != null) {
            myString += "," + String.valueOf(node.value);
            myString += traversePreOrder(node.left);
            myString += traversePreOrder(node.right);
        }
        return myString;
    }

    public String treeToStringDev() {
        ArrayList<Integer> nullList = new ArrayList<Integer>();
        String myString = new String();

        int levelTotal = 1;
        boolean allNull = false;

        while (true) {
            allNull = true;
            for (int i = 0; i < levelTotal; i++) {
                
            }
            if (allNull == true) {
                return myString;
            }
            levelTotal *= 2;
        }
    }

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
