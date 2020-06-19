


class c9837647 {
public MyHelperClass Log;
	public MyHelperClass getConnection(){ return null; }

    private long newIndex(String indexname) {
        Connection con = null;
        ResultSet rs = null;
        Statement stm = null;
        StringBuffer sql = new StringBuffer();
        indexname = indexname.trim().toUpperCase();
        try {
            long index = -1;
            synchronized (FormularContextPersistensImpl.class) {
                con =(Connection)(Object) getConnection();
                stm =(Statement)(Object) con.createStatement();
                if ((con != null) && (stm != null)) {
                    con.setAutoCommit(false);
                    sql = new StringBuffer();
                    sql.append("SELECT * FROM INDX_EC WHERE INDX_NAME='");
                    sql.append(indexname);
                    sql.append("' FOR UPDATE");
                    rs =(ResultSet)(Object) stm.executeQuery(sql.toString());
                    if ((rs != null) && (boolean)(Object)rs.next()) {
                        sql = new StringBuffer();
                        index =(int)(Object) rs.getLong("INDX_WERT") + 1;
                        sql.append("UPDATE INDX_EC SET INDX_WERT = ");
                        sql.append(index);
                        sql.append(" WHERE INDX_NAME='");
                        sql.append(indexname);
                        sql.append("'");
                        rs.close();
                        rs = null;
                        if ((int)(Object)stm.executeUpdate(sql.toString()) == 1) {
                            con.commit();
                        } else {
                            con.rollback();
                            index = -1;
                        }
                    } else {
                        sql = new StringBuffer();
                        sql.append("INSERT INTO INDX_EC (INDX_NAME, INDX_WERT) VALUES('");
                        sql.append(indexname);
                        sql.append("', ");
                        sql.append(1);
                        sql.append(")");
                        if ((int)(Object)stm.executeUpdate(sql.toString()) == 1) {
                            con.commit();
                            index = 1;
                        } else {
                            con.rollback();
                        }
                    }
                }
            }
            return index;
        } catch (Exception e) {
            Log.getLogger().error("Error during execute SQL-Statement: " + sql.toString(), e);
            return -1;
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception ignore) {
                }
            }
            if (stm != null) {
                try {
                    stm.close();
                } catch (Exception ignore) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (Exception ignore) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getLogger(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class ResultSet {

public MyHelperClass getLong(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class FormularContextPersistensImpl {

}
