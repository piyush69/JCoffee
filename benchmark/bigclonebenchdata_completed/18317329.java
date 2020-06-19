
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18317329 {
public MyHelperClass deleteComponents(Connection o0, int o1){ return null; }

        private void delete(Connection conn, int itemId) throws SQLException {
            Statement statement = null;
            try {
                conn.setAutoCommit(false);
                deleteComponents(conn, itemId);
                statement =(Statement)(Object) conn.createStatement();
                StringBuffer sqlBuff = new StringBuffer("DELETE FROM ");
                MyHelperClass m_dbItemName = new MyHelperClass();
                sqlBuff.append(m_dbItemName);
                sqlBuff.append(" WHERE ");
                MyHelperClass m_dbItemIdFieldColName = new MyHelperClass();
                sqlBuff.append(m_dbItemIdFieldColName);
                sqlBuff.append(" = ");
                sqlBuff.append(Integer.toString(itemId));
                String sql = sqlBuff.toString();
                statement.executeUpdate(sql);
                conn.commit();
            } catch (UncheckedIOException ex) {
                try {
                    conn.rollback();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
                throw ex;
            } finally {
                if (statement != null) {
                    statement.close();
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}
