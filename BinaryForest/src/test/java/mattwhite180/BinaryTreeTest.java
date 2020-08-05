package mattwhite180.BinaryForest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinaryTreeTests {

	@Test
	public void myTest() {
		BinaryTree myTree = new BinaryTree();

		assertEquals(20, myTree.doubleIt(10));
	}
}