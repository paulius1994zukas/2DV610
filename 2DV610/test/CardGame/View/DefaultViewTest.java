package CardGame.View;

//import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class DefaultViewTest {

	private IView sut;
	private PrintStream printStream;

	@Before
	public void setUp() throws Exception {
		printStream = mock(PrintStream.class);
		
		sut = new DefaultView(printStream);
	}

	@Test
	public void ShoudPrintMenu() {
		 sut.outputMainMenu();
		 
		 verify(printStream).println(DefaultView.MAIN_MENU);
	}
	
	@Test
	public void ShoudPrintQuitMessage() {	 
		 sut.outputQuitMessage();
		 
		 verify(printStream).println(DefaultView.QUIT_MESSAGE);
	}

}
