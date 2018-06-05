package modelElements.characters;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import model.IMapstuff;
import model.IVilain;
import model.MapStuff;
import modelElements.ModelElement;

public class Vilain extends ModelElement implements charactere, IVilain {
	private boolean stateLife;
	private int typeMob ;
	private BufferedImage spritesIcon;
	//int positionVilain [];
	private HashMap<Integer, Integer> positionVilain;
	private SortedMap<Integer, Integer> positionVilain1;
	
    NavigableMap <Integer,positions> multiplePoints= new TreeMap<>();
    NavigableMap <Integer,positions> multiplePointsVil= new TreeMap<>();
	private int y;
	private int x;
	private String Heading;
	private IMapstuff maps;
	
	/**
	 * load tHe sprite of the daemon and put in his x and y
	 * @param x
	 * @param y
	 */
	public Vilain(int x, int y) {
		
		super(x, y);
		
		this.setX(x);
		this.setY(y);
		
		try {
			this.spritesIcon = ImageIO.read(this.getClass().getResourceAsStream("img/monster_1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

	/* (non-Javadoc)
	 * @see modelElements.characters.charactere#isAlive()
	 */
	public void isAlive() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see model.IVilain#die()
	 */
	public void die() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see modelElements.characters.charactere#walk()
	 */
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
	

	/* (non-Javadoc)
	 * Make the Vilain move up
	 * @see modelElements.characters.charactere#walkUp()
	 */
	@Override
	public void walkUp() {
		
		
		this.given2CoordononateCheckIfencountersomethingElseMoveTheCharactere(this.getX(), this.getY()-1);

		// this.setY(this.getY() - 1);
		 
	        //this.setHasMoved();
	        //this.positionVilain[this.positionVilain.length+1] = this.setY(this.getY() - 1);
			this.setHeading("up");

	        this.positionVilain1.put((this.getY() - 1), this.getX());
		
	}



	/* (non-Javadoc)
	 * Make the Vilain move down
	 * @see modelElements.characters.charactere#walkDown()
	 */
	@Override
	public void walkDown() {
		// TODO Auto-generated method stub
		
		//this.setY(this.getY() + 1);
		this.given2CoordononateCheckIfencountersomethingElseMoveTheCharactere(this.getX(), this.getY()+1);

	   // this.setHasMoved();
        this.positionVilain1.put((this.getY() + 1), this.getX());
		this.setHeading("down");


		
	}



	/* (non-Javadoc)
	 * Make the Vilain move right
	 * @see modelElements.characters.charactere#walkRight()
	 */
	@Override
	public void walkRight() {
		// TODO Auto-generated method stub
		
		
		this.given2CoordononateCheckIfencountersomethingElseMoveTheCharactere(this.getX()+1, this.getY());

	    //this.setHasMoved();
        this.positionVilain1.put((this.getY()), this.getX()+1);
		this.setHeading("right");


		
		
		
	}



	/* (non-Javadoc)
	 * Make the Vilain move left
	 * @see modelElements.characters.charactere#walkLeft()
	 */
	@Override
	public void walkLeft() {
		// TODO Auto-generated method stub
		
		this.given2CoordononateCheckIfencountersomethingElseMoveTheCharactere(this.getX()+1, this.getY());

		//this.setX(this.getX() - 1);
	   // this.setHasMoved();
	    
        this.positionVilain1.put((this.getY()), this.getX()-1);
        
		this.setHeading("left");


	}



	/* (non-Javadoc)
	 * check if the Vilain can move and don't hit something
	 * @see model.IVilain#given2CoordononateCheckIfencountersomethingElseMoveTheCharactere(int, int)
	 */
	public void given2CoordononateCheckIfencountersomethingElseMoveTheCharactere(int x, int y){ // les x et y sont les next

		if (getMapstuff().testNextPosition(x, y) != null) {

			ModelElement hittedornot = (ModelElement) getMapstuff().testNextPosition(x, y);


			switch (hittedornot.getClassString()) {



			case "trois": // wall
				
				System.err.println("on a tapé du trois");
				break;


			case "un": // energy
				
				System.err.println("on a tapé du un");


				// on passe le state de l'energy  à true et on enleve de la map

				break;

			case "deux":	//doors
				// si on a de l'energie on lance une méthode d'ouverture et si o en  a pas on lance la méthode de fin de jeu
				
				System.err.println("on a tapé du deux");

				
				break;

			case "vilain": // Vilain
				
				System.err.println("on a tapé du vilain");


				break;

			} 
		}else {
			this.setX(x); 
			this.setY(y);
		}

	}

	
	
	/* (non-Javadoc)
	 * @see modelElements.characters.charactere#getHeading()
	 */
	public String getHeading() {
		return Heading;
	}



	/* (non-Javadoc)
	 * @see modelElements.characters.charactere#setHeading(java.lang.String)
	 */
	public void setHeading(String heading) {
		Heading = heading;
	}


	/* (non-Javadoc)
	 * @see modelElements.ModelElement#getX()
	 */
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see modelElements.ModelElement#setX(int)
	 */
	@Override
	public void setX(int x) {

		this.x = x ;
	}

	/* (non-Javadoc)
	 * @see modelElements.ModelElement#getY()
	 */
	@Override
	public int getY() {

		return this.y;
	}

	/* (non-Javadoc)
	 * @see modelElements.ModelElement#setY(int)
	 */
	@Override
	public void setY(int y) {

		this.y = y ;

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
	 * @see modelElements.characters.charactere#collied()
	 */
	@Override
	public boolean collied() {
		// TODO Auto-generated method stub
		return false;
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
	 * @see model.IModelElement#getMaps()
	 */
	@Override
	public IMapstuff getMaps() {
		// TODO Auto-generated method stub
		return mapstuff;
	}



	/* (non-Javadoc)
	 * @see model.IModelElement#setTheGivenObjectOntheMap(model.IMapstuff)
	 */
	@Override
	public void setTheGivenObjectOntheMap(IMapstuff mapS) {
		// TODO Auto-generated method stub
		
	}



	/* (non-Javadoc)
	 * @see model.IModelElement#setMaps(model.IMapstuff)
	 */
	@Override
	public void setMaps(IMapstuff maps) {
		// TODO Auto-generated method stub
		
	}



	/* (non-Javadoc)
	 * @see model.IVilain#lastposition()
	 */
	@Override
	public int lastposition() {
		// TODO Auto-generated method stub
		return 0;
	}


}
