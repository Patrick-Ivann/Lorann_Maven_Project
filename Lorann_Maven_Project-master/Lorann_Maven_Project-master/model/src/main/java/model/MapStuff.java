package model;

import java.util.ArrayList;
import java.util.List;

import modelElements.ModelElement;

public class MapStuff implements Imaps, IMapstuff {

	ArrayList<IModelElement> listObject;
	private IHero hero; 
	
	/**
	 * 
	 * @param listObject
	 */
	public MapStuff(ArrayList<IModelElement> listObject) {

		 MapStuff mapS=this;
		this.listObject = listObject ;
		
		for(IModelElement object:this.listObject){
			object.setTheGivenObjectOntheMap(mapS);
			object.setMaps(mapS);
			
		   }
	
	}
	
	
	/* 
	 * Find the n
	 * @see model.IMapstuff#testNextPosition(int, int)
	 */
	public IModelElement testNextPosition( int x, int y) {
		//System.out.println( "pk ça marche pas "+ getListObject());
		for (IModelElement object : listObject) {
			//System.out.println(object + "dans la test");
			
			if(((ModelElement) object).getX()==x && ((ModelElement) object).getY()==y ){
				   return (ModelElement) object;
				   
				   } 
			
			
			
		}
		return null;
	}

	/*public void play(){
		for(IModelElement object:listObject){
			object.move();
		    }
	    }*/
	
	/* (non-Javadoc)
	 * @see model.IMapstuff#getListObject()
	 */
	public ArrayList<IModelElement> getListObject() {
		return listObject;
	}

	/* (non-Javadoc)
	 * @see model.IMapstuff#setListObject(java.util.ArrayList)
	 */
	public void setListObject(ArrayList<IModelElement> listObject) {
		this.listObject = listObject;
	}

	/* (non-Javadoc)
	 * @see model.IMapstuff#getHero()
	 */
	public IHero getHero() {
		return hero;
	}

	/* (non-Javadoc)
	 * @see model.IMapstuff#setHero(model.IHero)
	 */
	public void setHero(IHero hero){
	this.hero=hero;
	}

	
	/* (non-Javadoc)
	 * @see model.IMapstuff#test(java.lang.String)
	 */
	public void test(String string) {

		for (IModelElement iModelElement : getListObject()) {

			if (iModelElement instanceof IHero ) {

				setHero((IHero) iModelElement);
				getHero().setMaps(this);
				//System.out.println(getHero() + "getHero dans la fonction test dans mapStuff");
				System.out.println(getHero().getX() + "dans la fonction test on retourne le X hero ainsi que le y" +getHero().getY() );
			}
		}

		switch (string)
		{
		case "left" : //q



			this.getHero().walkLeft();
			System.out.println("lefftttt invoke dans test");


			break;

		case "up" : // z

			this.getHero().walkUp();
			System.out.println("up invoke dans test");



			break;

		case "down" : //s
			getHero().walkDown();
			System.out.println("down invoke dans down");


			break;

		case "right" :  //d
			getHero().walkRight();
			System.out.println("right ivoke dans test");



			break;


		case "shoot" : // space
			//this.shootGivenCoordAndHeading(getHero().getX(), getHero().getY(), getHero().getHeading());


			break;
		}


	}

	
	/* (non-Javadoc)
	 * @see model.IMapstuff#shootGivenCoordAndHeading(int, int, java.lang.String)
	 */
	public void shootGivenCoordAndHeading(int x, int y, String heading) {


		for (IModelElement object : getListObject()) {
			System.out.println(object + "dans la shoot");

			if(object instanceof IHero) {
				this.hero = (IHero) object;
			}

			if (object instanceof IBullet) {

				this.hero.setX(x);
				this.hero.setY(y);

				switch (heading) {
				case "left":
					((IBullet) object).checkCollisions(x-1,y);
					break;
				case "right":
					((IBullet) object).checkCollisions(x+1,y);
					break;
				case "up":
					((IBullet) object).checkCollisions(x,y-1);
					break;
				case "down":
					((IBullet) object).checkCollisions(x, y + 1);
					break;


				default:
					break;
				}




			}
		}
	}
}
