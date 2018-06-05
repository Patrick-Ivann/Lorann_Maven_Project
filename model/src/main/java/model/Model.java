package model;

import java.util.ArrayList;

import model.DAO_.Boulder;
import model.DAO_.MapGenerator;

public class Model {
	
	MapStuff mapStuff;
	MapGenerator mapGen;
	MapGenerator mapGenuse;
	private ArrayList<IModelElement> mapStuffObject;
	
	
	
	
	public Model(int idMap){
//		myMap = new MapCreator(mapnum);
//		myMap.createObjects();
//		this.world = new World(myMap.getObjects());
		
		
		
		Boulder boul;
//		BoulderDashBDDConnector.getInstance();
		
		boul = new Boulder(); // connector
	
		MapGenerator mapGenuse;


		mapGenuse = new MapGenerator(); 
		setMapGenuse(new MapGenerator());
		MapGenerator mapGen = new MapGenerator(mapGenuse.getSqlMapById(), idMap);
		this.mapStuff = new MapStuff(mapGen.getListObject());
		
		this.mapStuffObject = getMapStuff().listObject;
		//System.out.println(getMapStuff().listObject + "fdsfgdsfdsiugffsmpdiu");  //full.MapStuff@100fc185fdsfgdsfdsiugffsmpdiu

	}

	public MapGenerator getMapGen() {
		return mapGen;
	}

	public void setMapGen(MapGenerator mapGen) {
		this.mapGen = mapGen;
	}

	public MapGenerator getMapGenuse() {
		return mapGenuse;
	}

	public void setMapGenuse(MapGenerator mapGenuse) {
		this.mapGenuse = mapGenuse;
	}

	public MapStuff getMapStuff() {
		return mapStuff;
	}

	public void setMapStuff(MapStuff mapStuff) {
		this.mapStuff = mapStuff;
	}

	public ArrayList<IModelElement> getMapStuffObject() {
		return mapStuffObject;
	}

	public void setMapStuffObject(ArrayList<IModelElement> mapStuffObject) {
		this.mapStuffObject = mapStuffObject;
	}
	
	
	
	
	


}
