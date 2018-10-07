package refactoring.solution;

public class SchoolHolidayDiscount extends DiscountOrSurchage {
	private Rental rental;
	public SchoolHolidayDiscount(Movie movie, int daysRented, Rental rental) {
		super(movie, daysRented, rental);
		// TODO Auto-generated constructor stub
	}
	@Override 
	public double addDiscount() {
		//All REGULAR and CLASSIC movies borrowed during the school holiday period will receive a
		//25% discount
		return rental.getCharge() * (1 - 0.25);
	}
}
