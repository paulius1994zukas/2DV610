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
	public void ShoudPrintMenu() {
		 PrintStream printStream = mock(PrintStream.class);
		 
		 sut = new DefaultView(printStream);
		 sut.outputMainMenu();
		 
		 verify(printStream).println(DefaultView.MAIN_MENU);
	}

}
