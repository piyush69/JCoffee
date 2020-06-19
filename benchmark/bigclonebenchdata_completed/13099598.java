
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13099598 {

    public void deleteUser(String userID) throws XregistryException {
        try {
            MyHelperClass Utils = new MyHelperClass();
            userID =(String)(Object) Utils.canonicalizeDN(userID);
            MyHelperClass context = new MyHelperClass();
            Connection connection =(Connection)(Object) context.createConnection();
            connection.setAutoCommit(false);
            try {
                MyHelperClass DELETE_USER_SQL_MAIN = new MyHelperClass();
                PreparedStatement statement1 =(PreparedStatement)(Object) connection.prepareStatement(DELETE_USER_SQL_MAIN);
                statement1.setString(1, userID);
                statement1.executeUpdate();
                MyHelperClass DELETE_USER_SQL_DEPEND = new MyHelperClass();
                PreparedStatement statement2 =(PreparedStatement)(Object) connection.prepareStatement(DELETE_USER_SQL_DEPEND);
                statement2.setString(1, userID);
                statement2.executeUpdate();
                connection.commit();
                MyHelperClass groups = new MyHelperClass();
                Collection groupList =(Collection)(Object) groups.values();
                for (Group group :(Group[])(Object) (Object[])(Object)groupList) {
                    group.removeUser(userID);
                }
                MyHelperClass log = new MyHelperClass();
                log.info("Delete User " + userID);
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

public MyHelperClass closeConnection(Connection o0){ return null; }
	public MyHelperClass createConnection(){ return null; }
	public MyHelperClass values(){ return null; }
	public MyHelperClass canonicalizeDN(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }}

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

class Collection {

}

class Group {

public MyHelperClass removeUser(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
