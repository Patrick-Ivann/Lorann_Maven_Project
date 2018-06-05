package modelElements.staticElement;

import java.io.IOException;

import javax.imageio.ImageIO;

import model.IMapstuff;
import model.IModelElement;

public class BallSolid extends StaticElement implements IModelElement{

	/**
	 * @param x
	 * @param y
	 */
	public BallSolid(int x, int y) {
		
		super(x, y);
		
		this.setX(x);
		this.setY(y);
		
		System.out.println(System.getProperty("user.dir"));
		
		try {
			this.spritesIcon = ImageIO.read(this.getClass().getResourceAsStream("img/bone.png"));
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
	 * @see model.IModelElement#setTheGivenObjectOntheMap(model.IMapstuff)
	 */
	@Override
	public void setTheGivenObjectOntheMap(IMapstuff mapS) {
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
	 * @see model.IModelElement#setMaps(model.IMapstuff)
	 */
	@Override
	public void setMaps(IMapstuff maps) {
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
}
