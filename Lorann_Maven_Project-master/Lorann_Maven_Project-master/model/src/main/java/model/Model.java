package model;

import java.util.ArrayList;

import model.DAO_.Boulder;
import model.DAO_.MapGenerator;

public class Model {
	
	MapStuff mapStuff;
	MapGenerator mapGen;
	MapGenerator mapGenuse;
	private ArrayList<IModelElement> mapStuffObject;
	
	
	
	
	/**
	 * Generate our map 
	 * @param idMap
	 */
	public Model(int idMap){

		Boulder boul;
		
		boul = new Boulder(); // connector
	
		MapGenerator mapGenuse;

		mapGenuse = new MapGenerator(); 
		setMapGenuse(new MapGenerator());
		MapGenerator mapGen = new MapGenerator(mapGenuse.getSqlMapById(), idMap);
		this.mapStuff = new MapStuff(mapGen.getListObject());
		this.mapStuffObject = getMapStuff().listObject;
	
	}

	/**
	 * @return
	 */
	public MapGenerator getMapGen() {
		return mapGen;
	}

	/**
	 * @param mapGen
	 */
	public void setMapGen(MapGenerator mapGen) {
		this.mapGen = mapGen;
	}

	/**
	 * @return
	 */
	public MapGenerator getMapGenuse() {
		return mapGenuse;
	}

	/**
	 * @param mapGenuse
	 */
	public void setMapGenuse(MapGenerator mapGenuse) {
		this.mapGenuse = mapGenuse;
	}

	/**
	 * @return
	 */
	public MapStuff getMapStuff() {
		return mapStuff;
	}

	/**
	 * @param mapStuff
	 */
	public void setMapStuff(MapStuff mapStuff) {
		this.mapStuff = mapStuff;
	}

	/**
	 * @return
	 */
	public ArrayList<IModelElement> getMapStuffObject() {
		return mapStuffObject;
	}

	/**
	 * @param mapStuffObject
	 */
	public void setMapStuffObject(ArrayList<IModelElement> mapStuffObject) {
		this.mapStuffObject = mapStuffObject;
	}
	

}
