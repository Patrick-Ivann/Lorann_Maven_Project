package model;

import java.awt.Image;

public interface IModelElement {

	void setTheGivenObjectOntheMap(IMapstuff mapS);

	void sprite();

	void unSetSprites(boolean b);
	
	IMapstuff getMaps();

	void setMaps(IMapstuff maps);

	Image getSpritesIcon();

	int getX();
	
	

	

	
	
}
