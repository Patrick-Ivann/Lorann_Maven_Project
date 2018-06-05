package model;

public interface IBullet {
	String getOpposedHeading();
	void setOpposedHeading(String heading);
	String opposedHeading(String heading);
	String getHeading();
	void setHeading(String heading );
	boolean checkCollisions(int x, int y);
	
	
}
