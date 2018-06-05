package view;

import controller.IController;

public class View implements IView {
	
	IFenetre fenetre;
	
	public View() {

		fenetre = (IFenetre) new Fenetre();

	}

	public IFenetre getFenetre() {
		return fenetre;
	}

	public void setFenetre(Fenetre fenetre) {
		this.fenetre = (IFenetre) fenetre;
	}

	public void setController(IController theController) {

		this.getFenetre().getJeu().setController(theController);
		
	}

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IImagePanel getJeu() {
		// TODO Auto-generated method stub
		return null;
	}

}
