package CardGame.Controller;

import CardGame.View.IView;

public class CardGame {
	
	private IView view;

	public CardGame(IView view) {
		this.view = view;
	}

	public void play() {
		view.outputMainMenu();
		view.getInput();
		view.outputQuitMessage();
	}

}
