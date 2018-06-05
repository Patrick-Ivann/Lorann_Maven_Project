package model.DAO_;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractDao extends Boulder {






	public ResultSet executeQuery (String queryLiteral, int i){
		
		
		System.out.println(getConnection() + "dans abstract");
		
		try {
			query = getConnection().prepareCall(queryLiteral);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			query.setInt(1, i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			query.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet result = null;
		try {
			result = query.getResultSet();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			result.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		

	}
	
	
public ResultSet executeQuery (String literal){
		
		try {
			query = getConnection().prepareCall( literal);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			query.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet result = null;
		try {
			result = query.getResultSet();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			result.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		

	}





public boolean create() {

	return false;

}

public boolean read() {

	return false;

}
	

public boolean update() {

	return false;
}

public boolean delete() {
	return false;
	// TODO Auto-generated method stub

}
	
	
	
	
/*	
	public int executeUpdate(final String query) {
		try {
			return this.query.executeUpdate(query, query.RETURN_GENERATED_KEYS);
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}*/

}
