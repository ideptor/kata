package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import original.Customer;
import original.Movie;
import original.Rental;

class TestCustomer {

	@Test
	void test_movie() {
		
		// given
		
		String title = "title";
		int priceCode = Movie.REGULAR;
		
		// when
		Movie movie = new Movie(title, priceCode);
		
		// then
		assertThat(movie.getPriceCode(), is(priceCode));
		assertThat(movie.getTitle(), is(title));
		
	}
	
	@Test
	void test_movie_set_price_code() {
		// given
		
		String title = "title";
		int newPriceCode = Movie.CHILDRENS;
		Movie movie = new Movie(title, Movie.NEW_RELEASE);
		
		// when
		movie.setPriceCode(newPriceCode);
		
		// then
		assertThat(movie.getPriceCode(), is(newPriceCode));
		
	}
	
	@Test
	void test_rental() {
		//given
		int daysRented = 1;
		Movie movie = new Movie("title", 1);
		
		// when
		Rental rental = new Rental(movie, daysRented);
		
		// then
		assertThat(rental.getDaysRented(), is(daysRented));
		assertThat(rental.getMovie(), is(movie));
	}
	@Test
	void test_create_customer() {
		
		// given
		String name = "name";
		Customer customer = new Customer(name);
		
		Movie[] movies = {
					new Movie("title1", Movie.REGULAR),
					new Movie("title2", Movie.NEW_RELEASE),
					new Movie("title3", Movie.CHILDRENS), };
		
		// when
		int days=2;
		for(Movie movie:movies) {
			Rental rental = new Rental(movie, ++days);
			customer.addRental(rental);
System.out.println(days);			
		}
		
		// then
		assertThat(customer.getName(), is(name));
		System.out.println(customer.statement());
		
	}

}
