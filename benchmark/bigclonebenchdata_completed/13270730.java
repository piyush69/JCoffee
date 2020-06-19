
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13270730 {

    public void removeResource(String resourceID, String sql, String[] keys) throws XregistryException {
        try {
            MyHelperClass globalContext = new MyHelperClass();
            Connection connection =(Connection)(Object) globalContext.createConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = null;
            try {
                statement =(PreparedStatement)(Object) connection.prepareStatement(sql);
                for (int i = 0; i < keys.length; i++) {
                    statement.setString(i + 1, keys[i]);
                }
                statement.executeUpdate();
                MyHelperClass DELETE_RESOURCE_SQL = new MyHelperClass();
                statement =(PreparedStatement)(Object) connection.prepareStatement(DELETE_RESOURCE_SQL);
                statement.setString(1, resourceID);
                statement.executeUpdate();
                MyHelperClass log = new MyHelperClass();
                log.info("Execuate SQL " + statement);
                connection.commit();
            } catch (UncheckedIOException e) {
                connection.rollback();
                throw new XregistryException((String)(Object)e);
            } finally {
                try {
                    statement.close();
                    connection.setAutoCommit(true);
//                    MyHelperClass globalContext = new MyHelperClass();
                    globalContext.closeConnection(connection);
                } catch (UncheckedIOException e) {
                    throw new XregistryException((String)(Object)e);
                }
            }
        } catch (UncheckedIOException e) {
            throw new XregistryException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createConnection(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass closeConnection(Connection o0){ return null; }}

class XregistryException extends Exception{
	public XregistryException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
