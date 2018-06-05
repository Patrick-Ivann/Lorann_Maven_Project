package model.DAO_;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 * 
 */
public class BoulderDashBDDConnector {

  

    /**
     * 
     */
    private static String user = "root";

    /**
     * 
     */
    private static String password = "password";

    /**
     * 
     */
    private static String url ;

    /**
     * 
     */
    protected Connection connection;

    /**
     * 
     */
    protected CallableStatement query;

    /**
     * 
     */
    private static BoulderDashBDDConnector instance;





    /**
     * @throws ClassNotFoundException 
     * @throws SQLException 
     * 
     */
    private void BoulderDashBDDConnector() throws ClassNotFoundException, SQLException {

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/dump"; // où se trouve la BDD jdbc:mysql://localhost:3306/
		String password = getPassword(); // le mdp ne doit pas etre en dure comme ça
		String user = getUser();
		
		Class.forName(driver);




		setConnection(connection = DriverManager.getConnection(url, user, password));
		System.out.println("dqfsqfsqfsdf");

    
    }

    /**
     * @param instance 
     * @return
     */
    private static void setInstance(BoulderDashBDDConnector instance) {

    	BoulderDashBDDConnector.instance = instance;
    	
    }

//    /**
//     * 
//     */
//    private void open() {
//        // TODO implement here
//    }
//
//    /**
//     * @param query 
//     * @return
//     */
//    public ResultSet executeQuery(String query) {
//        // TODO implement here
//        return null;
//    }
//
//    /**
//     * @param query 
//     * @return
//     */
//    public CallableStatement prepareCall(String query) {
//        // TODO implement here
//        return null;
//    }
//
//    /**
//     * @param query 
//     * @return
//     */
//    public int executeUpdate(String query) {
//        // TODO implement here
//        return 0;
//    }

    /**
     * @return
     */
    public static BoulderDashBDDConnector getInstance() {

    		if (BoulderDashBDDConnector.instance == null) {
    			
    			 synchronized(BoulderDashBDDConnector.class) {
    	              if (BoulderDashBDDConnector.instance == null) {
    	                BoulderDashBDDConnector.instance = new BoulderDashBDDConnector();
    	              }
    			 }
				
			}
    	
    	return BoulderDashBDDConnector.instance;
    }

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public CallableStatement getQuery() {
		return query;
	}

	public void setStatement(CallableStatement query) {
		this.query = query;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		BoulderDashBDDConnector.password = password;
	}

	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		BoulderDashBDDConnector.user = user;
	}

}