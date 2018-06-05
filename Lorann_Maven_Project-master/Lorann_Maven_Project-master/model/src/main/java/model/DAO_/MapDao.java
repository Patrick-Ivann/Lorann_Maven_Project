package model.DAO_;

public class MapDao extends AbstractDao {
	
	
	
	
	
	private String sqlMapById;
	private String sqlMapByName;
	private String sqlAllMap;
	
	public MapDao() {

		setSqlAllMap("{CALL findAllMap()}");
		setSqlMapById("{CALL findMapById(?)}");
		setSqlMapByName("{CALL findMapByName(?)}");
	}
	
	public String getSqlMapById() {
		return sqlMapById;
	}
	public String getSqlMapByName() {
		return sqlMapByName;
	}
	public String getSqlAllMap() {
		return sqlAllMap;
	}
	
	

	
	
public void setSqlAllMap(String sqlAllMap) {
	this.sqlAllMap = sqlAllMap;
}


public void setSqlMapById(String sqlMapById) {
	this.sqlMapById = sqlMapById;
}

public void setSqlMapByName(String sqlMapByName) {
	this.sqlMapByName = sqlMapByName;
}


	
	

}
