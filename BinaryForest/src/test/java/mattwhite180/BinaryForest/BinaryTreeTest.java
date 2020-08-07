package mattwhite180.BinaryForest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	@Test
	public void insertTest() {
                BinaryTree myTree = new BinaryTree();
                myTree.insert(3);
                myTree.insert(4);
                assertEquals(myTree.containsNode(4), true);
                assertNotEquals(myTree.containsNode(2), true);
        }

        @Test
        public void removeTest() {
                BinaryTree myTree = new BinaryTree();
                myTree.insert(3);
                myTree.remove(3);
                assertNotEquals(myTree.containsNode(3), true);
        }
}