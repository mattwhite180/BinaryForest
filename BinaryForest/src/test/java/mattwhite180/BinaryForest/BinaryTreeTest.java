package mattwhite180.BinaryForest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

        @Test
        public void traverseTest() {
                BinaryTree myTree = new BinaryTree();
                myTree.insert(6);
                myTree.insert(4);
                myTree.insert(8);
                myTree.insert(3);
                myTree.insert(5);
                myTree.insert(7);
                myTree.insert(9);

                String inOrderString = new String(",3,4,5,6,7,8,9");
                assertEquals(myTree.traverseInOrder(myTree.root), inOrderString);

		String preOrderString = new String(",6,4,3,5,8,7,9");
		assertEquals(myTree.traversePreOrder(myTree.root), preOrderString);
        
		String postOrderString = new String(",3,5,4,7,9,8,6");
		assertEquals(myTree.traversePostOrder(myTree.root), postOrderString);

		String levelOrderString = new String(",6,4,8,3,5,7,9");
		assertEquals(myTree.traverseLevelOrder(), levelOrderString);
        }
        
        @Test
        public void hasNumTest() {
                BinaryTree myTree = new BinaryTree();
                String stringComma = new String(",,,,,,,,");
                String string0 = new String(",,,,0,,,");
                String stringNothing = new String();
                String goodString = new String(",0,0,0");
                assertFalse(myTree.hasNum(stringComma));
                assertTrue(myTree.hasNum(string0));
                assertFalse(myTree.hasNum(stringNothing));
                assertTrue(myTree.hasNum(goodString));
        }

        /*
        @Test
        public void viewTest() {
                BinaryTree myTree = new BinaryTree();
                myTree.insert(6);
                myTree.insert(8);
                myTree.insert(7);
                String goodString = new String(",6,NULL,8,NULL,NULL,7,NULL");
		assertEquals(myTree.treeToString(), goodString);
        }
        */
}
