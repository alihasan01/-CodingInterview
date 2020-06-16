package Problem5.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Problem2.Source.Problem2;
import Problem5.Source.Question5_OneAway;

class JUnitTest {

	@Test
	void test() {
		Question5_OneAway obj = new Question5_OneAway();
		boolean result = obj.oneAway("ali","ali");
		assertEquals(result , true);
		
		result = obj.oneAway("Ali","ali");
		assertEquals(result , true);
		
		result = obj.oneAway("ali","aii");
		assertEquals(result , true);
		
		result = obj.oneAway("aii","ali");
		assertEquals(result , true);
		
		result = obj.oneAway("ali","ai");
		assertEquals(result , true);
		
		result = obj.oneAway("ali","alii");
		assertEquals(result , true);
		
		result = obj.oneAway("al","aii");
		assertEquals(result , false);
		
		result = obj.oneAway(null,"aii");
		assertEquals(result , false);
		
		result = obj.oneAway("","");
		assertEquals(result , true);
	}

}
