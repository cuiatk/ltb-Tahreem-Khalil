package labTerminalB;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
		private String _name;
		private Vector<Rental> _rentals = new Vector<Rental>();
		public Customer (String name){
			_name = name;
		};
		public void addRental(Rental arg) {
			_rentals.addElement(arg);
		}
		public String getName (){
			return _name;
		};
		
		/*
		 * TODO 4		20 Marks
		 * Identify the bad smells in the statement method and refactor the code
		 * In case you add a new method also provide specifications for new method
		 * after refactoring all test cases must still be passed
		 * Commit after each change and include a meaningful message about the change you made
		 * e.g. Method Move methodName();
		 * 
		 */
		
		/**
		 * TODO 3		10 Marks
		 * Provide suitable specification for statement method 
		 * 
		 * this method is doing three specific tasks
		 * 1- its calculating the total rent for the movies that the customer is renting
		 * 2- its calculating the total frequent renter points (customer erans a point on each movie he rents) for the customer every movie
		 * 3- last but not least this method is displaying all the information of customer i.e. total rent amount, frequent renter points,
		 * money owned, and details of movies. 
		 * 
		 * its takes no parameter
		 * @return returns a string containing the calculation details
		 */
		public String statement() {
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			
			Rental each = (Rental) rentals.nextElement();
			//double thisAmount = each.getTotalAmount();
			// add frequent renter points
			//show figures for this rental
			result += "\t" + each.getMovie().getTitle()+ "\t" +
					String.valueOf(each.getTotalAmount()) + "\n";
		}
		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) +
				"\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints())
		+
		" frequent renter points";
		return result;
	}
		
		private double getTotalCharge() {
			 double result = 0;
			 Enumeration<Rental> rentals = _rentals.elements();
			 while (rentals.hasMoreElements()) {
			 Rental each = (Rental) rentals.nextElement();
			 result += each.getTotalAmount();
			 }
			 return result;
			 }


		private int getTotalFrequentRenterPoints(){
			 int result = 0;
			 Enumeration<Rental> rentals = _rentals.elements();
			 while (rentals.hasMoreElements()) {
			 Rental each = (Rental) rentals.nextElement();
			 result += each.getFrequentRenterPoints();
			 }
			 return result;
			 }}


