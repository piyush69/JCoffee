


class c23186911 {
public MyHelperClass OvJdbcUtils;
	public MyHelperClass log;
	public MyHelperClass getDeleteSql(){ return null; }
	public MyHelperClass isNew(){ return null; }
	public MyHelperClass getPrimaryKey(){ return null; }

    public void delete(Connection conn, boolean commit) throws SQLException {
        PreparedStatement stmt = null;
        if ((boolean)(Object)isNew()) {
            String errorMessage = "Unable to delete non-persistent DAO '" + getClass().getName() + "'";
            if ((boolean)(Object)log.isErrorEnabled()) {
                log.error(errorMessage);
            }
            throw new SQLException(errorMessage);
        }
        try {
            stmt =(PreparedStatement)(Object) conn.prepareStatement(getDeleteSql());
            stmt.setObject(1, getPrimaryKey());
            int rowCount =(int)(Object) stmt.executeUpdate();
            if (rowCount != 1) {
                if (commit) {
                    conn.rollback();
                }
                String errorMessage = "Invalid number of rows changed!";
                if ((boolean)(Object)log.isErrorEnabled()) {
                    log.error(errorMessage);
                }
                throw new SQLException(errorMessage);
            } else if (commit) {
                conn.commit();
            }
        } finally {
            OvJdbcUtils.closeStatement(stmt);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

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

public MyHelperClass setObject(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
