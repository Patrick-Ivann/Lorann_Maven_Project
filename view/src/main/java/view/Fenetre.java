package view;

import javax.swing.JFrame;

public class Fenetre extends JFrame {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
ImagePanel jeu;
JFrame f ;
	
	
	
	public Fenetre() {
		
		

		f = new JFrame();
		f.setTitle("Lorann Game");
		f.setSize(700,700);
		f.setResizable(false);
	    f.setLocationRelativeTo(null);	
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

	    jeu = new ImagePanel(this);
	  
	    f.addKeyListener(jeu);

	    f.setContentPane(jeu);
	    f.setVisible(true);
	    
		
	   
	}



	public ImagePanel getJeu() {
		return jeu;
	}



	public void setJeu(ImagePanel jeu) {
		this.jeu = jeu;
	}



	public JFrame getF() {
		return f;
	}



	public void setF(JFrame f) {
		this.f = f;
	}

	
		
	
	

}
