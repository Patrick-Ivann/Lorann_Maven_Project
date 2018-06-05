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
public class Boulder {

  

    /**
     * 
     */
    private static String user = "root";

    /**
     * 
     */
    private static String password = "Apex";

    /**
     * 
     */
    private static String url ;

    /**
     * 
     */
    private Connection connection;

    /**
     * 
     */
    protected CallableStatement query;

    /**
     * 
     */
    private static Boulder instance;





    /**
     * @throws ClassNotFoundException 
     * @throws SQLException 
     * 
     */
    public Boulder() {

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/dump"; // où se trouve la BDD jdbc:mysql://localhost:3306/
		String password = getPassword(); // le mdp ne doit pas etre en dure comme ça
		String user = getUser();
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			setConnection(connection = DriverManager.getConnection(url, user, password));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(getConnection() + "dans boulder");

    
    }

    /**
     * @param instance 
     * @return
     */
    private static void setInstance(Boulder instance) {

    	Boulder.instance = instance;
    	
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
    public static Boulder getInstanceB() {

    		if (Boulder.instance == null) {
    			
    			 synchronized(Boulder.class) {
    	              if (Boulder.instance == null) {
    	                Boulder.instance = new Boulder();
    	              }
    			 }
				
			}
    	
    	return Boulder.instance;
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
		Boulder.password = password;
	}

	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		Boulder.user = user;
	}

}