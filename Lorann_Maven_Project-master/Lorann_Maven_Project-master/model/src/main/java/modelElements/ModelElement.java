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
	

	

	

	


	/**
	 * @param x2
	 * @param y2
	 */
	public ModelElement(int x2, int y2) {

		setX(x2);
		setY(y2);
		//System.out.println(x2);

		setClassString((getClass().toString()));

		
	}
	
	/**
	 * @param y
	 */
	public void setItOnTheMap(IModelElement  y) {
		this.mapstuff= (MapStuff) y;
	}



	/* (non-Javadoc)
	 * @see model.IModelElement#getX()
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return
	 */
	public IMapstuff getMapstuff() {
		return mapstuff;
	}


	/**
	 * @param mapstuff
	 */
	public void setMapstuff(IMapstuff mapstuff) {
		this.mapstuff = mapstuff;
	}

	/**
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * @param x
	 * @param added
	 */
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

	/**
	 * @return
	 */
	public String getClassString() {
		return classString;
	}

	/**
	 * @param classString
	 */
	public void setClassString(String classString) {
		this.classString = classString;
	}

	/* (non-Javadoc)
	 * @see model.IModelElement#getSpritesIcon()
	 */
	public Image getSpritesIcon() {
		return spritesIcon;
	}

	/**
	 * @param spritesIcon
	 */
	public void setSpritesIcon(Image spritesIcon) {
		this.spritesIcon = spritesIcon;
	}
	

	

}
