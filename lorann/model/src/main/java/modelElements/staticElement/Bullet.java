package modelElements.staticElement;

import model.IBullet;
import model.IMapstuff;
import model.IModelElement;
import model.MapStuff;
import modelElements.ModelElement;
import modelElements.characters.Hero;
import modelElements.characters.Vilain;

public class Bullet extends ModelElement implements IBullet {

	private String heading;
	private String opposedHeading;

	public Bullet(int x2, int y2) {
		super(x2, y2);
		
	}

	public  boolean checkCollisions(int i, int y) {

			IModelElement collision = this.getMapstuff().testNextPosition(i, y);
			if (collision == null) {
				this.setX(i);
				this.setY(y);
				return false;
			} else if (collision instanceof Vilain) {
				collision.unSetSprites(true);
				
				this.setHeading(opposedHeading(getHeading())); 

			} else if (collision instanceof Hero) {
				collision.unSetSprites(true);

				return false;
			} else {
				this.setHeading(opposedHeading(getHeading())); 
			}
			return true;
		}
	
	
	

	public String getOpposedHeading() {
		return opposedHeading;
	}

	public void setOpposedHeading(String opposedHeading) {
		this.opposedHeading = opposedHeading;
	}

	public String opposedHeading(String heading) {
	
	    switch (heading) {
	    case "up":
	        setOpposedHeading("down");
	        return ("down");
	
	    case "down":
	
	        setOpposedHeading("up");
	        return("up");
	    case "left":
	
	        setOpposedHeading("right");
	        return ("right");
	
	
	
	    case "right":
	                setOpposedHeading("left");
	                return("left");
	
	    default:
	        return null;
	    }
	
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	@Override
	public void setTheGivenObjectOntheMap(IMapstuff mapS) {
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


	@Override
	public IMapstuff getMaps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMaps(IMapstuff maps) {
		// TODO Auto-generated method stub
		
	}
	

}
