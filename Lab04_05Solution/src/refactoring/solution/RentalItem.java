package refactoring.solution;

public class RentalItem extends Rental {

	private Movie _movie;
	private int _daysRented;
	
	public RentalItem(Movie movie, int daysRented) {
		super(movie, daysRented);
		// TODO Auto-generated constructor stub
	}


	
	@Override
	public double getCharge() {
		return _movie.getCharge(_daysRented);
	}

	
}
