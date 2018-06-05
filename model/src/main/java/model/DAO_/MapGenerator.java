package model.DAO_;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.IModelElement;
import modelElements.ModelElement;
import modelElements.characters.Hero;
import modelElements.characters.Vilain;
import modelElements.staticElement.BallSolid;
import modelElements.staticElement.Crystal;
import modelElements.staticElement.Doors;
import modelElements.staticElement.Purse;
import modelElements.staticElement.wall.HorizontalWall;
import modelElements.staticElement.wall.VerticalWall;



public class MapGenerator extends MapDao{
	
	public ArrayList<IModelElement> listObject = new ArrayList<IModelElement>();

	protected MapGenerator mapGenerator;
	private String mapFromBdd;
	private int x;
	private int y;

	private int u;

	private int longueur;


	public MapGenerator( String query, int id){
		



		
		try {
			this.mapFromBdd = executeQuery(query, id).getString(1);
			this.setMapFromBdd(mapFromBdd);
			System.out.println(getMapFromBdd() + "dqdsdqsdsqdqd");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.mapgeneratorReading(getMapFromBdd());
		

			
		
	}
	
	
	MapGenerator( String query){

	    
		try {
			this.mapFromBdd = executeQuery(query).getString("mapStructure");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		



		
		this.mapgeneratorReading(mapFromBdd);

			
		
	}


	// peut eter le foutre dans un list 

	     public MapGenerator() {
		// TODO Auto-generated constructor stub
	}


	     public ArrayList<IModelElement>  mapgeneratorReading (String mapFromBdd){
	    	 
	 		mapGenerator = new MapGenerator();
			setMapGenerator(mapGenerator);
		    
		   
	    char mapFromBDDChar[] = mapFromBdd.toCharArray(); 
	    
		

	    
		
		System.out.println(getMapGenerator() + " String de getMapGenerator");

	   mapFromBdd.length();

	     	this.x = 0;
	     	this.y = 0; 

	  
	     for (char c : mapFromBDDChar)
	        
	        {

	    	
	    	/*Lorann='X'		Path='_'	Retour à la ligne='/'

			Sort='S'		Spawn:'&'	Purse='P'

			Ball Energi='E'		Ball='B'	Ennemi='W'

			Bone vertical='V'	Door='|'

			Bone horizontal='H'*/
	    	
	       switch (c) { //mapFromBdd.charAt(i)

	            case 'V':
	            			
	            			
	            			listObject.add(new VerticalWall(this.x,this.y));
	    	                //System.err.println("un donc -" + y + "y et X" + x );
	                x++;

	                break;

	            case 'H':
	            			listObject.add( new HorizontalWall(this.x,this.y));
	    	              //  System.err.println("trois donc c" + y + "y et X" + x);
	                x++;


	                break;

	            case 'P':

	            			listObject.add(new Purse(x,y));
	    	            //    System.err.println("deux donc " +  "-"+ y + "y et X" + x);

	            			x++;

	                
	                break;

	            case '|':

	                		listObject.add(new Doors(x,y));
	    	          //      System.err.println("un donc |" + "- "+ y + " y et X" + x);

	                x++;

	                
	                break;
	                
	            case 'E':

	                listObject.add( new Crystal(this.x,this.y));
	                //System.err.println("deux donc E -"+ y + " y et X" + x);

	                x++;

	                
	                break;
	                
	            case 'B':

	                listObject.add(new BallSolid(x,y));
	               // System.err.println("un donc B - "+ y + "y" + x);
	               x++;

	                
	                break;
	                
	            case 'S':

	                listObject.add(new Purse(x,y));
	               // System.err.println("un donc B - "+ y + "y" + x);
	               x++;

	                
	                break;
	                
	            case '&':

	                listObject.add(new Hero(x,y));
	               // System.err.println("un donc B - "+ y + "y" + x);
	               x++;

	                
	                break;
	                
	            case 'W':

	                listObject.add(new Vilain(x,y));
	               // System.err.println("un donc B - "+ y + "y" + x);
	               x++;

	                
	                break;


	            case '/': // le logo retour 
	            	
	            	System.out.println("retour");


	            
	                x=0; 
	                y++;


	                break;
	        
	            default:

	            	x++;

	                break;
	            

	                
	            
	        }
	      


//	        for (IModelElement temp : listObject) {
//				
//			//	if (temp instanceof trois ) {
////					System.out.println( ((trois) temp).getX() + "X u Y" + ((trois) temp).getY() );
//				}
			

	    }
	      
	      
	      
	       this.setListObject(listObject);
	       System.out.println(getListObject() + "getlistobject");
		return listObject;


	}

		
	     



		public MapGenerator getMapGenerator() {
			return mapGenerator;
		}


		public void setMapGenerator(MapGenerator mapGenerator) {
			this.mapGenerator = mapGenerator;
		}


		public String getMapFromBdd() {
			return mapFromBdd;
		}


		public void setMapFromBdd(String mapFromBdd) {
			this.mapFromBdd = mapFromBdd;
		}


		public ArrayList<IModelElement> getListObject() {
			return listObject;
		}


		public void setListObject(ArrayList<IModelElement> listObject) {
			this.listObject = listObject;
		}

		
}
