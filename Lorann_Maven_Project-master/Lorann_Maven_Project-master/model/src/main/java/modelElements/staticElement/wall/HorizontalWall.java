package modelElements.staticElement.wall;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.IMapstuff;
import model.MapStuff;

public class HorizontalWall extends Wall{
	
	public HorizontalWall(int x, int y) {

		super(x, y);
		// TODO Auto-generated constructor stub
				this.setX(x);
				this.setY(y);
				try {
					spritesIcon = ImageIO.read(this.getClass().getResourceAsStream("../img/horizontal_bone.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

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
	public MapStuff getMaps() {
		// TODO Auto-generated method stub
		return null;
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
