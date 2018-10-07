package refactoring.solution;

public abstract class Rental {
	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}

	int getFrequentRenterPoints() {
		
		 return _movie.getFrequentRenterPoints(_daysRented);
	}
	public double getCharge() {
		return _movie.getCharge(_daysRented); }
	
	public double addDiscount() {
		return 0.0;
	}
	public void add(Rental rental) {}
	public void remove(Rental rental) {}
	public Rental getChild(int i) { return null; }
}
