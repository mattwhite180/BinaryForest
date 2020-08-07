package mattwhite180.BinaryForest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	@Test
	public void insertTest() {
                BinaryTree myTree = new BinaryTree();
                myTree.insert(1);
                myTree.insert(3);
                myTree.insert(4);
                assertTrue(myTree.containsNode(4));
                assertFalse(myTree.containsNode(2));
        }

        @Test
        public void removeTest() {
                BinaryTree myTree = new BinaryTree();
                myTree.insert(3);
                myTree.remove(3);
                assertFalse(myTree.containsNode(3));
        }
}