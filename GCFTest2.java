import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GCFTest2 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	final void testMain() {
		int[] test1 = {9377, 13003};
		int[] test2 = {14003, 38};
		int[] test3 = {197, 198};
		int[] test4 = {1024, 2048};
		int[] test5 = {50, 80, 25};
		
		assertEquals(GCF.gcf(test1), 1);
		assertEquals(GCF.gcf(test2), 19);
		assertEquals(GCF.gcf(test3), 1);
		assertEquals(GCF.gcf(test4), 1024);
		assertEquals(GCF.gcf(test5), 5);
	}

}
