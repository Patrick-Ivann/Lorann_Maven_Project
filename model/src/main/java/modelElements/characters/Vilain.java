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
	
	

	public void isAlive() {
		// TODO Auto-generated method stub
		
	}

	public void die() {
		// TODO Auto-generated method stub
		
	}

	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void walkUp() {
		
		
		this.given2CoordononateCheckIfencountersomethingElseMoveTheCharactere(this.getX(), this.getY()-1);

		// this.setY(this.getY() - 1);
		 
	        //this.setHasMoved();
	        //this.positionVilain[this.positionVilain.length+1] = this.setY(this.getY() - 1);
			this.setHeading("up");

	        this.positionVilain1.put((this.getY() - 1), this.getX());
		
	}



	@Override
	public void walkDown() {
		// TODO Auto-generated method stub
		
		//this.setY(this.getY() + 1);
		this.given2CoordononateCheckIfencountersomethingElseMoveTheCharactere(this.getX(), this.getY()+1);

	   // this.setHasMoved();
        this.positionVilain1.put((this.getY() + 1), this.getX());
		this.setHeading("down");


		
	}



	@Override
	public void walkRight() {
		// TODO Auto-generated method stub
		
		
		this.given2CoordononateCheckIfencountersomethingElseMoveTheCharactere(this.getX()+1, this.getY());

	    //this.setHasMoved();
        this.positionVilain1.put((this.getY()), this.getX()+1);
		this.setHeading("right");


		
		
		
	}



	@Override
	public void walkLeft() {
		// TODO Auto-generated method stub
		
		this.given2CoordononateCheckIfencountersomethingElseMoveTheCharactere(this.getX()+1, this.getY());

		//this.setX(this.getX() - 1);
	   // this.setHasMoved();
	    
        this.positionVilain1.put((this.getY()), this.getX()-1);
        
		this.setHeading("left");


	}



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

	








	
	
	public String getHeading() {
		return Heading;
	}



	public void setHeading(String heading) {
		Heading = heading;
	}


	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(int x) {

		this.x = x ;
	}

	@Override
	public int getY() {

		return this.y;
	}

	@Override
	public void setY(int y) {

		this.y = y ;

	}


	public int getTypeMob() {
		return typeMob;
	}

	public void setTypeMob(int typeMob) {
		this.typeMob = typeMob;
	}



	@Override
	public boolean collied() {
		// TODO Auto-generated method stub
		return false;
	}



	



	@Override
	public void sprite() {
		// TODO Auto-generated method stub
		
	}



	



	@Override
	public void unSetSprites(boolean b) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public IMapstuff getMaps() {
		// TODO Auto-generated method stub
		return mapstuff;
	}



	@Override
	public void setTheGivenObjectOntheMap(IMapstuff mapS) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setMaps(IMapstuff maps) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public int lastposition() {
		// TODO Auto-generated method stub
		return 0;
	}



	

	
	
	

}
