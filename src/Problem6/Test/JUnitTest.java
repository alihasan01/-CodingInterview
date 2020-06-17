package Problem6.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Problem5.Source.Question5_OneAway;
import Problem6.Source.Question6_StringCompression;

class JUnitTest {

	@Test
	void test() {
		Question6_StringCompression obj = new Question6_StringCompression();
		String result = obj.StringCompression("aabcccccaaa");
		assertEquals(result , "a2b1c5a3");
		
		result = obj.StringCompression("abc");
		assertEquals(result , "abc");
	}
	@Test
	void test1() {
	
		Question6_StringCompression obj = new Question6_StringCompression();		
		String result = obj.StringCompression("abc");
		assertEquals(result , "abc");
	}

}
