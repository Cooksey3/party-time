package org.cookseys.partytime;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GuestTest {
	
	private Guest underTest = new Guest("Bilbo", "Baggins", 18);
	
	@Test
	public void shouldGetFirstName() {
		String firstName = underTest.getFirstName();
		
		assertThat("Bilbo", is(firstName));
	}
	
	@Test
	public void shouldGetLastName() {
		String lastName = underTest.getLastName();
		
		assertThat("Baggins", is(lastName));
	}
	
	@Test
	public void shouldGetNumberOfGuests() {
		Integer number = underTest.getAge();
		
		assertThat(18, is(number));
	}
}
