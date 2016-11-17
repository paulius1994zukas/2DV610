package CardGame.Controller;

//import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import CardGame.View.DefaultView;
import CardGame.View.IView;

public class CardGameTest {

	private CardGame sut;
	private IView view;

	@Before
	public void setUp() throws Exception {
		view = mock(DefaultView.class);
		
		sut = new CardGame(view);		
		sut.play();
	}

	@Test
	public void shouldShowMenu() {		
		verify(view).outputMainMenu();
	}
	
	@Test
	public void shouldShowQuitMessage() {
		verify(view).outputQuitMessage();
	}
	
	@Test
	public void shouldWaitForInput() {
		verify(view).getInput();
	}

}
