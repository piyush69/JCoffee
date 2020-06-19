
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13099597 {
public MyHelperClass log;

    public void deleteGroup(String groupID) throws XregistryException {
        try {
            MyHelperClass context = new MyHelperClass();
            Connection connection =(Connection)(Object) context.createConnection();
            connection.setAutoCommit(false);
            try {
                MyHelperClass DELETE_GROUP_SQL_MAIN = new MyHelperClass();
                PreparedStatement statement1 =(PreparedStatement)(Object) connection.prepareStatement(DELETE_GROUP_SQL_MAIN);
                statement1.setString(1, groupID);
                int updateCount =(int)(Object) statement1.executeUpdate();
                if (updateCount == 0) {
                    throw new XregistryException("Database is not updated, Can not find such Group " + groupID);
                }
                MyHelperClass cascadingDeletes = new MyHelperClass();
                if ((boolean)(Object)cascadingDeletes) {
                    MyHelperClass DELETE_GROUP_SQL_DEPEND = new MyHelperClass();
                    PreparedStatement statement2 =(PreparedStatement)(Object) connection.prepareStatement(DELETE_GROUP_SQL_DEPEND);
                    statement2.setString(1, groupID);
                    statement2.setString(2, groupID);
                    statement2.executeUpdate();
                }
                connection.commit();
                MyHelperClass groups = new MyHelperClass();
                groups.remove(groupID);
//                MyHelperClass cascadingDeletes = new MyHelperClass();
                log.info("Delete Group " + groupID + ((boolean)(Object)cascadingDeletes ? " with cascading deletes " : ""));
            } catch (UncheckedIOException e) {
                connection.rollback();
                throw new XregistryException((String)(Object)e);
            } finally {
//                MyHelperClass context = new MyHelperClass();
                context.closeConnection(connection);
            }
        } catch (UncheckedIOException e) {
            throw new XregistryException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createConnection(){ return null; }
	public MyHelperClass remove(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass closeConnection(Connection o0){ return null; }}

class XregistryException extends Exception{
	public XregistryException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
