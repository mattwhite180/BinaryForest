package mattwhite180.BinaryForest;

public class SimpleTree {
    private BinaryTree bt;
    private String mytree;

    public SimpleTree() {
        mytree = "";
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
        mytree += "INPUT FROM USER................." + value + ";";
        mytree += "TRAVERSAL IN ORDER..........." + bt.traverseInOrder(bt.root) + ";";
        mytree += "TRAVERSAL PRE ORDER........" + bt.traversePreOrder(bt.root) + ";";
        mytree += "TRAVERSAL POST ORDER......" + bt.traversePostOrder(bt.root) + ";";
        mytree += "TRAVERSAL LEVEL ORDER..." + bt.traverseLevelOrder() + ";";
        mytree += "TRAVERSAL TESTING1234..." + bt.treeToString();
        //mytree = ":)";
    }

    public String getMytree() {
        return mytree;
    }

    public void insert(int value) {
        bt.insert(value);
    }
}
