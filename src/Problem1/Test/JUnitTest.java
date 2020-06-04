package Problem1.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Problem1.Source.Problem1;

class JUnitTest {

	@Test
	void test() {
		Problem1 test = new Problem1();
		boolean result = test.IsUniqueOptimal("Ali");
		assertEquals(result , true);
		result = test.IsUniqueOptimal("hasan");
		assertEquals(result , false);
		result = test.IsUniqueOptimal("");
		assertEquals(result , true);
		result = test.IsUniqueOptimal(null);
		assertEquals(result , false);
	}

}
