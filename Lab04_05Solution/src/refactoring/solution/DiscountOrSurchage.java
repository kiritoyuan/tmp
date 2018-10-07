package refactoring.solution;

public abstract class DiscountOrSurchage extends Rental {
	private Rental rental;
	public DiscountOrSurchage(Movie movie, int daysRented, Rental rental) {
		super(movie, daysRented);
		this.rental = rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}
	@Override
	public double addDiscount() {
		return rental.getCharge();
	}
}
