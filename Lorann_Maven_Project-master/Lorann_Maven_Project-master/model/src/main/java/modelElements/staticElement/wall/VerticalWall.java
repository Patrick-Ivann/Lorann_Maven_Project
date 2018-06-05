package modelElements.staticElement.wall;

import java.io.IOException;

import javax.imageio.ImageIO;

import model.IMapstuff;
import model.MapStuff;

public class VerticalWall extends Wall {
	
	/**
	 * load Vertical wall and place it
	 * @param x
	 * @param y
	 */
	public VerticalWall(int x, int y) {

		super(x, y);
		this.setX(x);
		this.setY(y);
		try {
			this.spritesIcon = ImageIO.read(this.getClass().getResourceAsStream("../img/vertical_bone.png"));
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

}
