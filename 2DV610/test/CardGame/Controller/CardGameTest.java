package CardGame.Controller;

//import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import CardGame.View.DefaultView;
import CardGame.View.IView;

public class CardGameTest {

	private CardGame sut;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldShowMenu() {
		IView view = mock(DefaultView.class);
		
		sut = new CardGame(view);
		sut.play();
		
		verify(view).outputMainMenu();
		verify(view).outputQuitMessage();
	}

}
