package view;

import controller.IController;

public class View implements IView {
	
	IFenetre fenetre;
	
	/**
	 * displqy our frame
	 */
	public View() {

		fenetre = (IFenetre) new Fenetre();

	}

	/* (non-Javadoc)
	 * @see view.IView#getFenetre()
	 */
	public IFenetre getFenetre() {
		return fenetre;
	}

	/**
	 * @param fenetre
	 */
	public void setFenetre(Fenetre fenetre) {
		this.fenetre = (IFenetre) fenetre;
	}

	/* (non-Javadoc)
	 * @see view.IView#setController(controller.IController)
	 */
	public void setController(IController theController) {

		this.getFenetre().getJeu().setController(theController);
		
	}

	/* (non-Javadoc)
	 * @see view.IView#displayMessage(java.lang.String)
	 */
	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see view.IView#getJeu()
	 */
	@Override
	public IImagePanel getJeu() {
		// TODO Auto-generated method stub
		return null;
	}

}
