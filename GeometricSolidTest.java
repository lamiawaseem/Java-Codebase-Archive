import junit.framework.TestCase;

public class GeometricSolidTest extends TestCase implements GeometricSolid 
{
    public double getVolume() {
        return 0;
    }

	public double getSurfaceArea() {
		return 0;
	}
	
   public void test()
   {
	   //dummy test... as long as this test compiles, the interface is written correctly
       assertEquals(true,true);
   }
	

}