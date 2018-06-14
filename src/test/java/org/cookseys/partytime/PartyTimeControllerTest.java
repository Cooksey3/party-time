//package org.cookseys.partytime;
//
//import static org.mockito.Mockito.when;
//
//import java.util.Collections;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//public class PartyTimeControllerTest {
//
//	@InjectMocks
//	private PartyTimeController underTest;
//	
//	@Mock
//	private GuestRepository guestRepo;
//
//	@Mock
//	private Guest guest;
//
//	@Before
//	public void setup() {
//		MockitoAnnotations.initMocks(this);
//	}
//	
//	@Test
//	public void shouldRetrieveGuests() {
//		when(guestRepo.findAll()).thenReturn(Collections.singleton(guest));
//		Iterable<Guest> result = underTest.findGuests();
//	}
//	
//}
