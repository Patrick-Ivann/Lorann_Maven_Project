package controller;

import java.util.ArrayList;

import model.IModel;
import model.IModelElement;
import view.IView;

public class Controller implements IController {
	private IModel model;
	private IView   vue;
	private ArrayList<IModelElement> listobj;
	/**
	 * @param model
	 * @param vue
	 * Used to set values 
	 * declaration of the constructor : Controler
	 */
	public Controller(IModel model, IView vue, ArrayList<IModelElement> list) {

	
		this.setModel(model);
		this.setView(vue);
		this.setListobj(list);
		
		System.out.println(list +"fdsfdsf");
		

	}
	
	
	/**
	 * 
	 * @param keyCode
	 */
	public void givenKeyCodeTriggerActionOnModel(char keyChar) {

		
		switch (keyChar)
		{
		        case 'q' : //keypress q
		        			    		
		        			    		

		    		
		    		this.model.getMapStuff().test("left");

		            
		            break;
		            
		        case 'z' : //keypress z
		            
		    		
		    		this.model.getMapStuff().test("up");


		        	
		            break;
		            
		        case 's' : //keypress s
		    		
		    		this.model.getMapStuff().test("down");

		            
		            break;
		            
		        case 'd' :  //keypress d
		    		
		    		this.model.getMapStuff().test("right");


		        	
		            break;

		            
		        case ' ' : // keypress space
		        	
		    		this.model.getMapStuff().test("shoot");


		        	
		            break;
		}
	}
	
	public void  setTheGameUpq(){
	
		while(true) {

			vue.getFenetre().getJeu().givenArraYListOfAllobjectCurrentlyOntheMapRefresh(this.getListobj());
			
		}
		
	}
		
	public ArrayList<IModelElement> getListobj() {
		return listobj;
	}


	public void setListobj(ArrayList<IModelElement> listobj) {
		this.listobj = listobj;
	}


	public IModel getModel() {
		return model;
	}
	public void setModel(IModel model) {
		this.model = model;
	}
	public IView getView() {
		return vue;
	}
	public void setView(IView vue) {
		this.vue = vue;
	}

}
