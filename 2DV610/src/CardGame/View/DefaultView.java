package CardGame.View;

import java.io.PrintStream;

public class DefaultView implements IView {
	
	protected final static String MAIN_MENU = "Menu:\n 1. Higher, 2. Lower, 3. Quit";
	
	protected final static String QUIT_MESSAGE = "You have quit the game!";

	private PrintStream printStream;

	public DefaultView(PrintStream printStream) {
		// TODO Auto-generated constructor stub
		this.printStream = printStream;
	}

	@Override
	public void outputMainMenu() {
		// TODO Auto-generated method stub
		this.printStream.println(MAIN_MENU);
	}

	@Override
	public void outputQuitMessage() {
		this.printStream.println(QUIT_MESSAGE);
	}

	@Override
	public void getInput() {
		// TODO Auto-generated method stub
		
	}

}
