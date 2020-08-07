package mattwhite180.BinaryForest;

public class SimpleTree {
    private BinaryTree bt;
    private String mytree;

    public SimpleTree() {
        mytree = "EMPTY";
        bt = new BinaryTree();
    }

    public SimpleTree(String value) {
        mytree = value;
        bt = new BinaryTree();
    }

    public void setMytree(String value) {
        mytree = "";
        try {
            String[] stringList = value.split(",");
            for(int i = 0; i < stringList.length; i++) {
                bt.insert(Integer.parseInt(stringList[i]));
            }
	    } catch (Exception e) {
            mytree = "ERROR";
            return;
	    }
        mytree += "LEVELORDER:" + bt.traverseLevelOrder() + ";";
        mytree += "INORDER:" + bt.traverseInOrder(bt.root) + ";";
        mytree += "PREORDER:" + bt.traversePreOrder(bt.root) + ";";
        mytree += "POSTORDER:" + bt.traversePostOrder(bt.root) + ";";
        //mytree = ":)";
    }

    public String getMytree() {
        return mytree;
    }

    public void insert(int value) {
        bt.insert(value);
    }
}