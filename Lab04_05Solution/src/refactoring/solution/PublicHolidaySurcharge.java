package refactoring.solution;

public class PublicHolidaySurcharge extends DiscountOrSurchage {
	private Rental rental;
	public PublicHolidaySurcharge(Movie movie, int daysRented, Rental rental) {
		super(movie, daysRented, rental);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double addDiscount() {
		//All movies borrowed during the public holiday period (e.g. Easter, Christmas) will incur an
		//additional 10% surcharge
		return rental.getCharge() * (1 + 0.1);
	}
}
