package org.cookseys.partytime;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class PartyTimeClassTest {
	
	@Test
	public void shouldCreatePartyDetailsClass() {
		PartyDetails underTest;
	}
	
	@Test
	public void shouldHaveNumberOfGuests() {
		PartyDetails underTest = new PartyDetails(1);
		
		int guests = underTest.getGuests();
		
		assertThat(guests, is(1));
	}
	
	@Test
	public void shouldHaveDifferentNumberOfGuests() {
		PartyDetails underTest = new PartyDetails(2);
		
		int guests = underTest.getGuests();
		
		assertThat(guests, is(2));
	}
	
}
