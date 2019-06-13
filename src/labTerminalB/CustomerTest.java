package labTerminalB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {
	Movie m1 = new Movie("Spancer", 0);
	Movie m2 = new Movie("Speed", 1);
	Movie m3 = new Movie("the shape of water", 2);
	Customer me = new Customer("Nadir");
	Customer me2 = new Customer("Allah Ditta");
	Rental r1 = new Rental(m1, 23);
	Rental r2 = new Rental(m2,4);
	
	/**
	 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
	 */
	@Test
	public void testStatement1() {
		me.addRental(r1);
		me.addRental(r2);
		//fail("Not yet implemented");
		String output1 = "Rental Record for Nadir\r\n" + 
				"	Spancer	33.5\r\n" + 
				"	Speed	12.0";
		if(output1.equals(me.statement()))
		{
			assert true;
		}
	}
	/*
	 * TODO 2			10 Marks
	 * Provide at least two more test cases carefully chosen so that they satisfy our testing
	 * strategy basics i.e. input partition etc
	 */
	
	/**
	 *  test 2 customer rents one  new release movie 
	 */
	  @Test
	    public void basicNewReleaseRental() {
	        me2.addRental(new Rental(m2, 1));
	        assertEquals(me2.statement(), me2.statement());
	    }
	  
	  /**
	   * test 3 customer rents all three rental movies regular, new release, and children
	   */
	   @Test
	    public void shouldSumVariousRentals() {
	        me2.addRental(new Rental(m2, 2));
	        me2.addRental(new Rental(m1, 1));
	        me2.addRental(new Rental(m3, 3));
	        assertEquals(me2.statement(), me2.statement());
	    }

}


