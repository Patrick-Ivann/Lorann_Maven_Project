package modelElements.staticElement;

import java.io.IOException;

import javax.imageio.ImageIO;

import model.IMapstuff;
import model.MapStuff;

public class Doors extends StaticElement {
	
	public Doors(int x, int y) {

		super(x, y);
		this.setX(x);
		this.setY(y);
		try {
				this.spritesIcon = ImageIO.read(this.getClass().getResourceAsStream("img/gate_closed.png"));
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
