package modelElements.characters;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.SortedMap;
import javax.imageio.ImageIO;

import model.IHero;
import model.IMapstuff;
import model.IModelElement;
import model.MapStuff;
import modelElements.ModelElement;

public class Hero extends ModelElement implements charactere, IHero {




	private boolean stateLife;
	int typeMob ;
	SortedMap<Integer, Integer> storedPositionHero;

	private BufferedImage spritesIcon;	
	private String heading;
	private IMapstuff maps;



	/**
	 * Load our hero
	 * @param x
	 * @param y
	 */
	public Hero(int x, int y) {

		super(x+15, y+5);
		System.out.println(x +" instanciation" + y);
		
		this.setX(15);
		this.setY(5);
		System.out.println(getX()+ "X du hero depuis le constucteur et le Y" + getY());
		

		//this.setX(x);
		//this.setY(y);
		
		this.setClassString(this.getClassString());

		stateLife = true;

		try {
			spritesIcon = ImageIO.read(this.getClass().getResourceAsStream("img/lorann_br.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setTypeMob(666);


	}


	/* (non-Javadoc)
	 * Check collision for Hero
	 * @see model.IHero#checkIfencountersomething(int, int)
	 */
	public void checkIfencountersomething(int x, int y){ // the x and the y are the next
		

		if (maps.testNextPosition(x, y) != null) {

			IModelElement hittedornot = this.maps.testNextPosition(x, y);
			
			System.out.println(((ModelElement) hittedornot).getClassString() + "in the checkif ");


			switch (((ModelElement) hittedornot).getClassString()) {



			case "wall": 
				
				System.out.println("we hit the wall");
				break;


			case "energy":
				
				System.out.println("onwe hit the energy");

				// on passe le state de l'energy  à true et on enleve de la map

				break;

			case "doors":
				// si on a de l'energie on lance une méthode d'ouverture et si o en  a pas on lance la méthode de fin de jeu
				
				System.out.println("we hit the doors");

				
				break;

			case "vilain": // Vilain
				
				System.out.println("we hit the vilain");


				break;

			} 
		}else {
			this.setX(x);
			this.setY(y);
			System.out.println(getX() + "getX à la fin du checkifencounter genre si on est là c'est qu'on bouge et le getY" + getY());

		}

	}

	
	/**
	 * @param stuff
	 */
	public void registerWorld(MapStuff stuff) {
		this.maps=stuff;
		((MapStuff) this.maps).setHero(this);
	}


/* (non-Javadoc)
 * @see model.IHero#lastposition()
 */
public int lastposition() {
	return storedPositionHero.get(storedPositionHero.lastKey());
}




/* (non-Javadoc)
 * @see modelElements.characters.charactere#walk()
 */
@Override
public void walk() {
	// TODO Auto-generated method stub

}

/* (non-Javadoc)
 * Move Up
 * @see modelElements.characters.charactere#walkUp()
 */
@Override
public void walkUp() {
	// TODO Auto-generated method stub

	this.checkIfencountersomething((this.getY() - 1), (this.getX()) );
	System.out.println(this.getY() + " y in the walkup");
	this.setHeading("up");


}


/* (non-Javadoc)
 * Move Down
 * @see modelElements.characters.charactere#walkDown()
 */
@Override
public void walkDown() {

	this.checkIfencountersomething(this.getX(), this.getY()+1);
	this.setHeading("down");
	System.out.println(this.getY() + " Y in the walkdown");



}

/* (non-Javadoc)
 * Move Right
 * @see modelElements.characters.charactere#walkRight()
 */
@Override
public void walkRight() {

	this.checkIfencountersomething(this.getX()+1, this.getY());

	this.setX(this.getX() + 1);
	System.out.println(getX() + "X in the walkright");
	this.setHasMoved();
	this.setHeading("right");





}

/* (non-Javadoc)
 * Move left
 * @see modelElements.characters.charactere#walkLeft()
 */
@Override
public void walkLeft() {

	this.checkIfencountersomething(this.getX()+1, this.getY());
	this.setX(this.getX() - 1);
	System.out.println(getX() + "X in the walkleft");
	this.setHeading("left");
	


}

/* (non-Javadoc)
 * @see modelElements.characters.charactere#collied()
 */
@Override
public boolean collied() {
	return this.stateLife = false;
	// TODO Auto-generated method stub

}


/* (non-Javadoc)
 * @see modelElements.characters.charactere#isAlive()
 */
@Override
public void isAlive() {
	// TODO Auto-generated method stub

}




/**
 * @return
 */
public boolean isStateLife() {
	return stateLife;
}

/**
 * 
 */
public void setHasMoved() {
	// TODO Auto-generated method stub



}


/**
 * @param mapS
 */
public void setTheGivenObjectOntheMap1(MapStuff mapS) {
	// TODO Auto-generated method stub
	
}


/* (non-Javadoc)
 * @see model.IModelElement#sprite()
 */
@Override
public void sprite() {
	// TODO Auto-generated method stub
	
}




/* (non-Javadoc)
 * @see model.IModelElement#unSetSprites(boolean)
 */
@Override
public void unSetSprites(boolean b) {
	// TODO Auto-generated method stub
	
}


/* (non-Javadoc)
 * @see modelElements.characters.charactere#getHeading()
 */
public String getHeading() {
	return heading;
}


/* (non-Javadoc)
 * @see modelElements.characters.charactere#setHeading(java.lang.String)
 */
public void setHeading(String heading) {
	this.heading = heading;
}


/**
 * @return
 */
public int getTypeMob() {
	return typeMob;
}


/**
 * @param typeMob
 */
public void setTypeMob(int typeMob) {
	this.typeMob = typeMob;
}


/* (non-Javadoc)
 * @see model.IModelElement#setMaps(model.IMapstuff)
 */
@Override
public void setMaps(IMapstuff maps) {
	
	this.maps = maps;
	
}


/* (non-Javadoc)
 * @see model.IModelElement#getMaps()
 */
@Override
public MapStuff getMaps() {
	// TODO Auto-generated method stub
	return null;
}




/* (non-Javadoc)
 * @see model.IHero#registerWorld(model.IMapstuff)
 */
@Override
public void registerWorld(IMapstuff maps) {
	// TODO Auto-generated method stub
	
}




/* (non-Javadoc)
 * @see model.IHero#fire()
 */
@Override
public void fire() {
	// TODO Auto-generated method stub
	
}


/* (non-Javadoc)
 * @see model.IModelElement#setTheGivenObjectOntheMap(model.IMapstuff)
 */
@Override
public void setTheGivenObjectOntheMap(IMapstuff mapS) {
	// TODO Auto-generated method stub
	
}



}
