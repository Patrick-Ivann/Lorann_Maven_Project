package modelElements.staticElement;

import java.io.IOException;

import javax.imageio.ImageIO;

import model.IMapstuff;
import model.MapStuff;

public class Crystal  extends StaticElement {

	/**
	 * load the crystal and place 
	 * @param x
	 * @param y
	 */
	public Crystal(int x, int y) {
		
		super(x, y);

		this.setX(x);
		this.setY(y);
		try {
			this.spritesIcon = ImageIO.read(this.getClass().getResourceAsStream("img/crystal_ball.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	/* (non-Javadoc)
	 * @see model.IModelElement#sprite()
	 */
	@Override
	public void sprite() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see modelElements.ModelElement#getY()
	 */
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see modelElements.ModelElement#setY(int)
	 */
	@Override
	public void setY(int y) {
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

}
