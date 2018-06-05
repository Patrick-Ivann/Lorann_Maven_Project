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
	
	
	
	  public ImagePanel(Fenetre f_jeu) {
		  this.f = f_jeu;
		  
		 // this.setBackground(Color.BLACK);
		  this.paint(getGraphics());
	  }
	  
	  
	  
	  

	public void paint(Graphics g) {
		super.paint(g);
		//time = new Timer();
		this.setBackground(Color.BLACK);
		
		try {
			//System.out.println(this.listePleine.size() + "size de la liste dans la méthode paint");
			for(IModelElement m: listePleine ){
				 g.drawImage(((IModelElement) m).getSpritesIcon(), 
						 ((IModelElement)  m).getX()*32,
						 ((IModelElement) m).getX()*32,
						 this);
			 }
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		//System.out.println("sqdgsqhgdhgsq");
		
			 /*
		 	
		*/
		
		}
	
	
	  public void givenArraYListOfAllobjectCurrentlyOntheMapRefresh(ArrayList <IModelElement> listobj) {	 
		   this.setListobject(listobj); 
		   
		//System.out.println(listobj + "dans la vues");
		   
		   
		 /*for (IModelElement lookHero : listobj) {
			
			if (lookHero instanceof Hero) {
				
				
				System.out.println("yrfvqsvfhsdvfuhsqugfyqg");
			}
			
		}*/

			listePleine = new ArrayList<IModelElement>(listobject);
			//System.out.println(listePleine.size());
			   this.repaint(); 
		   }
		
	
//	private static Move Movement(final int pressed) {
//        Move userOrder;
//        switch (pressed) {
//            case KeyEvent.VK_RIGHT:
//                userOrder = Move.RIGHT;
//                break;
//            case KeyEvent.VK_LEFT:
//                userOrder = Move.LEFT;
//                break;
//            case KeyEvent.VK_UP:
//                userOrder = Move.UP;
//                break;
//            case KeyEvent.VK_DOWN:
//                userOrder = Move.DOWN;
//                break;
//            case KeyEvent.VK_F:
//                userOrder = Move.FIRE;
//                break;
//            default:
//                userOrder = Move.INOP;
//                break;
//        }
//        return userOrder;
//    }
//  
	 
	@Override
    public final void keyPressed(final KeyEvent keyEvent) {
		
		
		//this.getController().givenKeyCodeTriggerActionOnModel(keyEvent.getKeyCode());

		 if(getController() != null) {
			  getController().givenKeyCodeTriggerActionOnModel(keyEvent.getKeyChar());
			  //System.out.println(keyEvent.getKeyChar());
			}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

		

	}



	public ArrayList<IModelElement> getListobject() {
		return listobject;
	}



	public void setListobject(ArrayList<IModelElement> listobject) {
		this.listobject = listobject;
	}



	public IController getController() {
		return controller;
	}



	public void setController(IController controller) {
		this.controller = controller;
	}
	  
	  
	  

}
	
