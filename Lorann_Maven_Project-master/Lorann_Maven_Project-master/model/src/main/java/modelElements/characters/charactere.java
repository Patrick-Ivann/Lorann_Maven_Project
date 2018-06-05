package modelElements.characters;

public interface charactere {
	
	void walk();
	void walkUp();
	void walkDown();
	void walkRight();
	void walkLeft();
	boolean collied();
	void isAlive();
	String getHeading();
	void 	setHeading(String heading);

}
