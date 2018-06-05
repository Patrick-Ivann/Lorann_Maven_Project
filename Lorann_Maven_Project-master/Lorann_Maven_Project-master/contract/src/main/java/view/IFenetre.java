package view;

import javax.swing.JFrame;

public interface IFenetre {
	
	IImagePanel getJeu();
	void setJeu(IImagePanel ff);
	JFrame getF();
	void setF(JFrame ff);
	void setVisible(boolean b);

}
