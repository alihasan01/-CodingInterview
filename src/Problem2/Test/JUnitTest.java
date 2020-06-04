package Problem2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Problem2.Source.Problem2;

class JUnitTest {

	@Test
	void test() {
		Problem2 obj = new Problem2();
		boolean result = obj.permutation("hello", "olleh");
		assertEquals(result , true);
		result = obj.permutation("Hellow ", "World");
		assertEquals(result , false);
		result = obj.permutation("", "ila");
		assertEquals(result , false);
		result = obj.permutation("Hello world", "world Hello");
		assertEquals(result , true);
		result = obj.permutation("", "");
		assertEquals(result , true);
		result = obj.permutation("", null);
		assertEquals(result , false);
		result = obj.permutation("ali", "ila");
		assertEquals(result , true);
	}

}
