package modelElements;

import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;

import model.IMapstuff;
import model.IModelElement;
import model.MapStuff;


public abstract class ModelElement implements IModelElement{
	
	
	private int x;
	private int y;
	private List<IModelElement> listObject; 
	private String classString;
	protected IMapstuff mapstuff;
	protected Image spritesIcon;
	

	

	

	


	public ModelElement(int x2, int y2) {

		setX(x2);
		setY(y2);
		//System.out.println(x2);

		setClassString((getClass().toString()));



		
	}
	
	public void setItOnTheMap(IModelElement  y) {
		this.mapstuff= (MapStuff) y;
	}



	public int getX() {
		return x;
	}

	public IMapstuff getMapstuff() {
		return mapstuff;
	}




	public void setMapstuff(IMapstuff mapstuff) {
		this.mapstuff = mapstuff;
	}




	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void addX(int x, int added) {
		this.x+=added;
		
	}
	
	
	
//	public un testNextPosition( int x, int y) {
//		System.out.println( "pk ça marche pas"+getListObject());
//		for (Interface2 object : getListObject()) {
//			System.out.println(object);
//			
//			if(((un) object).getX()==x && ((un) object).getY()==y ){
//				   return (un) object;
//				   } 
//			
//			
//			
//		}
//		return null;
//	}

	public String getClassString() {
		return classString;
	}

	public void setClassString(String classString) {
		this.classString = classString;
	}

	public Image getSpritesIcon() {
		return spritesIcon;
	}

	public void setSpritesIcon(Image spritesIcon) {
		this.spritesIcon = spritesIcon;
	}
	

	

}
