package CardGame.View;

//import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class DefaultViewTest {

	private IView sut;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOutputMainMenu() {
		 PrintStream printStream = mock(PrintStream.class);
		 
		 sut = new DefaultView(printStream);
		 sut.outputMainMenu();
		 
		 verify(printStream).println("Menu:\n 1. Higher, 2. Lower, 3. Quit");
	}

}
