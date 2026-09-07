
import org.junit.Test;

import junit.framework.TestCase;

public class RobotTest extends TestCase {

	public void test1() {
		Robot r = new Robot(100,100);
		
		for (int i = 0; i <= 500; i++) {
			r.makeRandomMove();
		}
		System.out.println(String.format("Distance: %s", r.getDistanceFromStart()));
		System.out.println(String.format("Expected: %s", 13.6014));
		assertEquals(13.6014, r.getDistanceFromStart(), 0.0001);		
	}

	public void test2() {
		Robot r = new Robot(10,10);
		
		for (int i = 0; i <= 500; i++) {
			r.makeRandomMove();
		}
		System.out.println(String.format("Distance: %s", r.getDistanceFromStart()));
		System.out.println(String.format("Expected: %s", 13.6014));
		assertEquals(13.6014, r.getDistanceFromStart(), 0.0001);		
	}

	public void test3() {
		Robot r = new Robot(-10,-10);
		
		for (int i = 0; i <= 1000; i++) {
			r.makeRandomMove();
		}

		System.out.println(String.format("getX()  : %s", r.getLocation().getX()));
		System.out.println(String.format("Expected: %s", 17));
		assertEquals(17, r.getLocation().getX(), 0.001);		
		System.out.println(String.format("Expected: %s", -32));
		assertEquals(-32, r.getLocation().getY(), 0.001);		
	}

}
