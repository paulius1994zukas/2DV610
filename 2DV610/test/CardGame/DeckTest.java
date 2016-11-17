package CardGame;

//import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldReturnGetM_deck() {
		Deck deck = mock(Deck.class);
		
		deck.getM_deck();
		
		verify(deck).getM_deck();
	}

}
