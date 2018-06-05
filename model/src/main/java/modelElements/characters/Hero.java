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


	public void checkIfencountersomething(int x, int y){ // les x et y sont les next
		
		//System.out.println( this.maps+"fdsfds");

		if (maps.testNextPosition(x, y) != null) {

			IModelElement hittedornot = this.maps.testNextPosition(x, y);
			
			System.out.println(((ModelElement) hittedornot).getClassString() + "das le checkif ");


			switch (((ModelElement) hittedornot).getClassString()) {



			case "trois": // wall
				
				System.out.println("on a tapé du trois");
				break;


			case "un": // energy
				
				System.out.println("on a tapé du un");


				// on passe le state de l'energy  à true et on enleve de la map

				break;

			case "doors":	//doors
				// si on a de l'energie on lance une méthode d'ouverture et si o en  a pas on lance la méthode de fin de jeu
				
				System.out.println("on a tapé du deux");

				
				break;

			case "vilain": // Vilain
				
				System.out.println("on a tapé du vilain");


				break;

			} 
		}else {
			this.setX(x);
			this.setY(y);
			System.out.println(getX() + "getX à la fin du checkifencounter genre si on est là c'est qu'on bouge et le getY" + getY());

		}

	}

	
	public void registerWorld(MapStuff stuff) {
		this.maps=stuff;
		((MapStuff) this.maps).setHero(this);
	}


public int lastposition() {
	return storedPositionHero.get(storedPositionHero.lastKey());
}



/*public void fire(){
	getMapstuff().shootGivenCoordAndHeading(getX(), getY(), getHeading());
}*/

@Override
public void walk() {
	// TODO Auto-generated method stub

}

@Override
public void walkUp() {
	// TODO Auto-generated method stub

	this.checkIfencountersomething((this.getY() - 1), (this.getX()) );
	System.out.println(this.getY() + " y dans le walkup");
	//this.setHasMoved();
	//this.storedPositionHero.put((this.getY() - 1), this.getX());
	this.setHeading("up");


}









@Override
public void walkDown() {

	this.checkIfencountersomething(this.getX(), this.getY()+1);
	//this.setHasMoved();
	//this.storedPositionHero.put((this.getY() + 1), this.getX());
	this.setHeading("down");
	System.out.println(this.getY() + " Y dans le walkdown");



}

@Override
public void walkRight() {

	this.checkIfencountersomething(this.getX()+1, this.getY());

	this.setX(this.getX() + 1);
	System.out.println(getX() + "X dans le walkright");
	this.setHasMoved();
	//this.storedPositionHero.put((this.getY()), this.getX()+1);
	this.setHeading("right");





}

@Override
public void walkLeft() {

	this.checkIfencountersomething(this.getX()+1, this.getY());
	this.setX(this.getX() - 1);
	System.out.println(getX() + "X dans le  walkleft");
	//this.setHasMoved();
	//this.storedPositionHero.put((this.getY()), this.getX()-1);
	this.setHeading("left");
	


}

@Override
public boolean collied() {
	return this.stateLife = false;
	// TODO Auto-generated method stub

}


@Override
public void isAlive() {
	// TODO Auto-generated method stub

}




public boolean isStateLife() {
	return stateLife;
}

public void setHasMoved() {
	// TODO Auto-generated method stub



}


public void setTheGivenObjectOntheMap1(MapStuff mapS) {
	// TODO Auto-generated method stub
	
}


@Override
public void sprite() {
	// TODO Auto-generated method stub
	
}




@Override
public void unSetSprites(boolean b) {
	// TODO Auto-generated method stub
	
}


public String getHeading() {
	return heading;
}


public void setHeading(String heading) {
	this.heading = heading;
}


public int getTypeMob() {
	return typeMob;
}


public void setTypeMob(int typeMob) {
	this.typeMob = typeMob;
}


@Override
public void setMaps(IMapstuff maps) {
	
	this.maps = maps;
	
}


@Override
public MapStuff getMaps() {
	// TODO Auto-generated method stub
	return null;
}




@Override
public void registerWorld(IMapstuff maps) {
	// TODO Auto-generated method stub
	
}




@Override
public void fire() {
	// TODO Auto-generated method stub
	
}


@Override
public void setTheGivenObjectOntheMap(IMapstuff mapS) {
	// TODO Auto-generated method stub
	
}















}
