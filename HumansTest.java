import java.time.LocalDateTime;
import junit.framework.TestCase;

public class HumansTest extends TestCase{
	Human Alan;
	Adult Ada;
	Youth Steve;
	CentennialStudent Ayan;

	private void createHumans()
	{
		Alan = new Human("Alan", "Turing", Gender.MALE, 1912, 6, 23);
		Ada = new Adult("Ada", "Lovelace", Gender.FEMALE, 1975, 10, 9, "Walmart", "Manager");
		Steve = new Youth("Steve", "Jobs", Gender.MALE, 2004, 2, 24, 11, "Apple High School");
		Ayan = new CentennialStudent("Ayan", "Siddiqui", Gender.MALE, 2005, 5, 31, 12, 116, "Mr. Billing");
	}
	
	public void testConstructors() 
	{
		createHumans();
		assertEquals(true, Alan != null);
		assertEquals(true, Ada != null);
		assertEquals(true, Steve != null);
		assertEquals(true, Ayan != null);
	}
	
	public void testAccessors() 
	{
		createHumans();

		assertEquals(1912, Alan.getBirthYear());
		assertEquals(6, Alan.getBirthMonth());
		assertEquals(23, Alan.getBirthDay());
		assertEquals("Alan", Alan.getFirstName());
		assertEquals("Turing", Alan.getLastName());

		assertEquals(2004, Steve.getBirthYear());
		assertEquals(2, Steve.getBirthMonth());
		assertEquals(24, Steve.getBirthDay());
		assertEquals("Steve", Steve.getFirstName());
		assertEquals("Jobs", Steve.getLastName());
		assertEquals(11, Steve.getSchoolGrade());
		assertEquals("Apple High School", Steve.getSchoolName());

		assertEquals(2005, Ayan.getBirthYear());
		assertEquals(5, Ayan.getBirthMonth());
		assertEquals(31, Ayan.getBirthDay());
		assertEquals("Ayan", Ayan.getFirstName());
		assertEquals("Siddiqui", Ayan.getLastName());
		assertEquals(12, Ayan.getSchoolGrade());
		assertEquals("Centennial High School", Ayan.getSchoolName());
	}
	
	public void testMutators() 
	{
		createHumans();

		Alan.setFirstName("Monty");
		Alan.setLastName("Burnsy");
		assertEquals("Monty", Alan.getFirstName());
		assertEquals("Burnsy", Alan.getLastName());
		
		Ada.setFirstName("Ned");
		Ada.setLastName("Flanders");
		assertEquals("Ned", Ada.getFirstName());
		assertEquals("Flanders", Ada.getLastName());
	}
	
	public void testTypes() 
	{
		createHumans();

		Human person1 = Ayan;		
		assertEquals(true, person1 instanceof Human);
		assertEquals(true, person1 instanceof Youth);
		assertEquals(true, person1 instanceof CentennialStudent);
		assertEquals(false, person1 instanceof Adult);

		Human person2 = Ada;		
		assertEquals(true, person2 instanceof Human);
		assertEquals(false, person2 instanceof Youth);
		assertEquals(false, person2 instanceof CentennialStudent);
		assertEquals(true, person2 instanceof Adult);

		Human person3 = Alan;		
		assertEquals(true, person3 instanceof Human);
		assertEquals(false, person3 instanceof Youth);
		assertEquals(false, person3 instanceof CentennialStudent);
		assertEquals(false, person3 instanceof Adult);

	}
	
	public void testCalculateCurrentAge() 
	{
		Adult bloggins;
		LocalDateTime testDate;
		LocalDateTime currentDate = LocalDateTime.now();

		testDate = currentDate.minusYears(40).minusMonths(1).minusDays(3);
		
		bloggins = new Adult("Bill", "Bloggins", Gender.MALE, testDate.getYear(), testDate.getMonthValue(), testDate.getDayOfMonth(), "RCN", "Sailor");		
		assertEquals(40, bloggins.calculateCurrentAgeInYears());

		testDate = currentDate.minusYears(40).minusDays(1);
		
		bloggins = new Adult("Bill", "Bloggins", Gender.MALE, testDate.getYear(), testDate.getMonthValue(), testDate.getDayOfMonth(), "RCN", "Sailor");
		assertEquals(40, bloggins.calculateCurrentAgeInYears());

		testDate = currentDate.minusYears(40);
		
		bloggins = new Adult("Bill", "Bloggins", Gender.MALE, testDate.getYear(), testDate.getMonthValue(), testDate.getDayOfMonth(), "RCN", "Sailor");	
		assertEquals(40, bloggins.calculateCurrentAgeInYears());

		testDate = currentDate.minusYears(40).plusMonths(1);
	
		bloggins = new Adult("Bill", "Bloggins", Gender.MALE, testDate.getYear(), testDate.getMonthValue(), testDate.getDayOfMonth(), "RCN", "Sailor");	
		assertEquals(39, bloggins.calculateCurrentAgeInYears());
		
		testDate = currentDate.minusYears(40).plusDays(1);
		
		bloggins = new Adult("Bill", "Bloggins", Gender.MALE, testDate.getYear(), testDate.getMonthValue(), testDate.getDayOfMonth(), "RCN", "Sailor");		
		assertEquals(39, bloggins.calculateCurrentAgeInYears());

		testDate = currentDate.minusYears(40).plusMonths(1).minusDays(3);
		
		bloggins = new Adult("Bill", "Bloggins", Gender.MALE, testDate.getYear(), testDate.getMonthValue(), testDate.getDayOfMonth(), "RCN", "Sailor");	
		assertEquals(39, bloggins.calculateCurrentAgeInYears());
	
	}
	
	public void testPublicIntroduction() 
	{
		createHumans();
		
		Introducer introducer = new Introducer();
		System.out.println(introducer.createPublicIntroduction(Alan));
		System.out.println(introducer.createPublicIntroduction(Ada));
		System.out.println(introducer.createPublicIntroduction(Steve));
		System.out.println(introducer.createPublicIntroduction(Ayan));		
	}

}//end class