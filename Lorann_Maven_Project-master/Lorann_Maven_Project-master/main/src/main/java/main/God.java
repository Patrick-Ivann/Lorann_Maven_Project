package main;

import controller.Controller;
import model.IModel;
import model.Model;
import view.IView;
import view.View;

public class God {
	
	public God() {

		IView theView 			= new View();
		
		
		IModel theModel 			= (IModel) new Model(4);
		

		Controller theController = new Controller(theModel, theView, theModel.getMapStuffObject());
		
		
		
		System.out.println(theModel.getMapStuffObject());
		
		
		theView.setController(theController);      

		theController.setTheGameUpq();
		theView.getFenetre().setVisible(true);
		

		
				
		
	}
	

}
