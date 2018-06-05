package model;

import java.util.ArrayList;

public interface IMapstuff {

	void test(String string);

	IModelElement testNextPosition(int i, int y);
	ArrayList<IModelElement>	getListObject();
	void setListObject(ArrayList<IModelElement> list);
	IHero getHero();
	void setHero(IHero hero);
	void shootGivenCoordAndHeading(int x, int y, String heading);
	
	

}
