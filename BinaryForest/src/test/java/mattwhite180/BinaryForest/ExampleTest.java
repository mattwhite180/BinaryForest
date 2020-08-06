package mattwhite180.BinaryForest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {

	@Test
	public void myTest() {
		Example exapmle = new Example();

		assertEquals(20, exapmle.doubleIt(10));
	}
}