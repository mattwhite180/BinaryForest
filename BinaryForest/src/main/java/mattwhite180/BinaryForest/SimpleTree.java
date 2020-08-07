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
        bt.insert(Integer.parseInt(value));
        bt.insert(4);
        mytree = bt.traverseLevelOrder();
        //mytree = ":)";
    }

    public String getMytree() {
        return mytree;
    }
}