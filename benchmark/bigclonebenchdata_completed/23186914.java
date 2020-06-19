


class c23186914 {
public MyHelperClass setValues(PreparedStatement o0){ return null; }
public MyHelperClass OvJdbcUtils;
	public MyHelperClass primaryKey;
	public MyHelperClass log;
	public MyHelperClass OvUuid;
	public MyHelperClass createNewPrimaryKey(){ return null; }
	public MyHelperClass getUpdateSql(){ return null; }
	public MyHelperClass isNew(){ return null; }
	public MyHelperClass isValid(){ return null; }
	public MyHelperClass getInsertSql(){ return null; }

    public void save(Connection conn, boolean commit) throws SQLException {
        PreparedStatement stmt = null;
        if (!(Boolean)(Object)isValid()) {
            String errorMessage = "Unable to save invalid DAO '" + getClass().getName() + "'!";
            if ((boolean)(Object)log.isErrorEnabled()) {
                log.error(errorMessage);
            }
            throw new SQLException(errorMessage);
        }
        try {
            if ((boolean)(Object)isNew()) {
                primaryKey = createNewPrimaryKey();
                stmt =(PreparedStatement)(Object) conn.prepareStatement(getInsertSql());
            } else {
                stmt =(PreparedStatement)(Object) conn.prepareStatement(getUpdateSql());
            }
            setValues(stmt);
            int rowCount =(int)(Object) stmt.executeUpdate();
            if (rowCount != 1) {
                primaryKey = OvUuid.NULL_UUID;
                if (commit) {
                    conn.rollback();
                }
                String errorMessage = "Invalid number of rows changed!";
                if ((boolean)(Object)log.isErrorEnabled()) {
                    log.error(errorMessage);
                }
                throw new SQLException(errorMessage);
            } else {
                if (commit) {
                    conn.commit();
                }
            }
        } finally {
            OvJdbcUtils.closeStatement(stmt);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NULL_UUID;
public MyHelperClass closeStatement(PreparedStatement o0){ return null; }
	public MyHelperClass isErrorEnabled(){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }}
