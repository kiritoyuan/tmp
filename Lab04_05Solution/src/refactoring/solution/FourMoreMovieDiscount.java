package refactoring.solution;

public class FourMoreMovieDiscount extends DiscountOrSurchage {
	private Rental rental;
	public FourMoreMovieDiscount(Movie movie, int daysRented, Rental rental) {
		super(movie, daysRented, rental);
		// TODO Auto-generated constructor stub
	}
	@Override 
	public double addDiscount() {
//		If a customer borrows more than 4 videos of any type in one transaction, an overall
//		discount of 10% will apply
		return rental.getCharge() * (1 - 0.1);
	}
}
