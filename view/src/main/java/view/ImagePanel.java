package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Timer;

import javax.swing.JPanel;

import controller.IController;
import model.IModelElement;


public class ImagePanel extends JPanel implements KeyListener, IImagePanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5638319131711774994L;
	JPanel j = new JPanel();
	Fenetre f;
	

	Timer time;
	
	
	private ArrayList<IModelElement> listobject;
	private IController controller;
	
	


	ArrayList<IModelElement> listePleine;
	
	
	
	  /**
	   * Paint in our Frame 
	 * @param f_jeu
	 */
	public ImagePanel(Fenetre f_jeu) {
		  this.f = f_jeu;
		  
		 
		  this.paint(getGraphics());
	  }
	  
	  
	  
	  

	/* 
	 * Load all image and give their x and y 
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		super.paint(g);
		
		this.setBackground(Color.BLACK);
		
		try {
			for(IModelElement m: listePleine ){
				 g.drawImage(((IModelElement) m).getSpritesIcon(), 
						 ((IModelElement)  m).getX()*32,
						 ((IModelElement) m).getX()*32,
						 this);
			 }
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		
		
		}
	
	
	  /* 
	   * Display all character stocked in the ArrayList
	 * @see view.IImagePanel#givenArraYListOfAllobjectCurrentlyOntheMapRefresh(java.util.ArrayList)
	 */
	public void givenArraYListOfAllobjectCurrentlyOntheMapRefresh(ArrayList <IModelElement> listobj) {	 
		   this.setListobject(listobj); 
			listePleine = new ArrayList<IModelElement>(listobject);
			  this.repaint(); 
		   }
		
	

	 
	/* 
	 * Detection of the key which is pressed to allow movement
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
    public final void keyPressed(final KeyEvent keyEvent) {
		
	
		 if(getController() != null) {
			  getController().givenKeyCodeTriggerActionOnModel(keyEvent.getKeyChar());
			
			}
	}
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent arg0) {

		

	}



	/* (non-Javadoc)
	 * @see view.IImagePanel#getListobject()
	 */
	public ArrayList<IModelElement> getListobject() {
		return listobject;
	}



	/* (non-Javadoc)
	 * @see view.IImagePanel#setListobject(java.util.ArrayList)
	 */
	public void setListobject(ArrayList<IModelElement> listobject) {
		this.listobject = listobject;
	}



	/* (non-Javadoc)
	 * @see view.IImagePanel#getController()
	 */
	public IController getController() {
		return controller;
	}



	/* (non-Javadoc)
	 * @see view.IImagePanel#setController(controller.IController)
	 */
	public void setController(IController controller) {
		this.controller = controller;
	}
	  
	  
	  

}
	
