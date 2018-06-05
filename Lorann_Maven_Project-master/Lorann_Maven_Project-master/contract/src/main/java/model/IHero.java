package model;

public interface IHero {
	
	void checkIfencountersomething(int x, int y);
	void registerWorld(IMapstuff maps);
	int lastposition();
	void fire();
	void setMaps(IMapstuff mapStuff);
	void walkRight();
	void walkDown();
	void walkUp();
	void walkLeft();
	int getX();
	int getY();
	void setX(int x);
	void setY(int y);

}
