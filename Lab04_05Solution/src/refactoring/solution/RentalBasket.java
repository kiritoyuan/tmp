package refactoring.solution;

import java.util.ArrayList;

public class RentalBasket extends Rental {
	private ArrayList<Rental>rentals = new ArrayList<Rental>();
	public RentalBasket(Movie movie, int daysRented) {
		super(movie, daysRented);
		// TODO Auto-generated constructor stub
	}
	//use the composite pattern to get the whole charge fees
	@Override
	public double getCharge() {
		double total = 0.0;
		for (Rental r : rentals) {
			total += r.getCharge();
		}
		return total;
	}
	@Override
	public void add(Rental rental) {
		rentals.add(rental);
	}

	@Override
	public void remove(Rental rental) {
		rentals.remove(rental);
	}

	@Override
	public Rental getChild(int i) {
			return rentals.get(i);
	}

}
