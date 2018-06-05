package modelElements.staticElement;

import java.io.IOException;

import javax.imageio.ImageIO;

import model.IMapstuff;
import model.IModelElement;
import model.MapStuff;

public class Purse extends StaticElement implements IModelElement{

	public Purse(int x, int y) {
		// TODO Auto-generated constructor stub
		
		super(x, y);
		this.setX(x);
		this.setY(y);
		
		System.out.println(getX() + "fbkjsbfkjdsbkjfbdsbfkjdsbkfdjs" + getY());
		
		try {
			this.spritesIcon = ImageIO.read(this.getClass().getResourceAsStream("img/purse.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}

//	@Override
//	public void isAlive() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void die() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void sprite() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void unSetSprites() {
//		// TODO Auto-generated method stub
//		
//	}



	@Override
	public void unSetSprites(boolean b) {
		// TODO Auto-generated method stub
		
	}

	

	

	@Override
	public void sprite() {
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
