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
		        case 'q' : //q
		        			    		//System.out.println("qqqqqqqqq");
		        			    		//this.model.getMapStuff().test();
		        			    		//System.out.println(this.model.getMapStuff().getHero());
		        			    		

		    		//this.model.getMapStuff().getHero().walkLeft();
		    		
		    		this.model.getMapStuff().test("left");

		            
		            break;
		            
		        case 'z' : // z
		            
//		    		this.model.getMapStuff().getHero().walkUp();
		    		
		    		this.model.getMapStuff().test("up");


		        	
		            break;
		            
		        case 's' : //s
		    		///this.model.getMapStuff().getHero().walkDown();
		    		
		    		this.model.getMapStuff().test("down");

		            
		            break;
		            
		        case 'd' :  //d
		    		//this.model.getMapStuff().getHero().walkRight();
		    		
		    		this.model.getMapStuff().test("right");


		        	
		            break;

		            
		        case ' ' : // space
		    		//this.model.getMapStuff().getHero().walkLeft();;
		        	
		    		this.model.getMapStuff().test("shoot");


		        	
		            break;
		}
	}
	


//	public void givenListofObjectSendThemTotheviewForRefresh (ArrayList<IModelElement> listobj) {
//		
//		vue.getFenetre().getJeu().givenArraYListOfAllobjectCurrentlyOntheMapRefresh(listobj);    
//	}
	
	
	
	public void  setTheGameUpq(){
	
		while(true) {
			
		
					//this.givenListofObjectSendThemTotheviewForRefresh((getModel().getMapGen().getListObject()));
						//setListobj( getModel().getMapGenuse().mapgeneratorReading(getModel().getMapGenuse().getMapFromBdd()));

			//System.out.println(getListobj());
			//getModel().getMapGen().getListObject();

			//vue.getFenetre().getJeu().givenArraYListOfAllobjectCurrentlyOntheMapRefresh(getModel().getMapGenuse().mapgeneratorReading(getModel().getMapGenuse().getMapFromBdd()));    

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
