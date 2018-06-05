package view;

import java.util.ArrayList;

import controller.IController;
import model.IModelElement;

public interface IImagePanel {
	
	
	void givenArraYListOfAllobjectCurrentlyOntheMapRefresh(ArrayList<IModelElement> list);

	ArrayList<IModelElement> getListobject();
	void setListobject(ArrayList<IModelElement> list);
	IController getController();
	void setController(IController controller);
	
	
	

}
