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

	/**
	 * @param x2
	 * @param y2
	 */
	public Bullet(int x2, int y2) {
		super(x2, y2);
		
	}

	/* (non-Javadoc)
	 * @see model.IBullet#checkCollisions(int, int)
	 */
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
	
	
	

	/* (non-Javadoc)
	 * @see model.IBullet#getOpposedHeading()
	 */
	public String getOpposedHeading() {
		return opposedHeading;
	}

	/* (non-Javadoc)
	 * @see model.IBullet#setOpposedHeading(java.lang.String)
	 */
	public void setOpposedHeading(String opposedHeading) {
		this.opposedHeading = opposedHeading;
	}

	/* (non-Javadoc)
	 * make the spell 
	 * @see model.IBullet#opposedHeading(java.lang.String)
	 */
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

	/* (non-Javadoc)
	 * @see model.IBullet#getHeading()
	 */
	public String getHeading() {
		return heading;
	}

	/* (non-Javadoc)
	 * @see model.IBullet#setHeading(java.lang.String)
	 */
	public void setHeading(String heading) {
		this.heading = heading;
	}

	/* (non-Javadoc)
	 * @see model.IModelElement#setTheGivenObjectOntheMap(model.IMapstuff)
	 */
	@Override
	public void setTheGivenObjectOntheMap(IMapstuff mapS) {
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
	 * @see model.IModelElement#getMaps()
	 */
	@Override
	public IMapstuff getMaps() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see model.IModelElement#setMaps(model.IMapstuff)
	 */
	@Override
	public void setMaps(IMapstuff maps) {
		// TODO Auto-generated method stub
		
	}
	

}
