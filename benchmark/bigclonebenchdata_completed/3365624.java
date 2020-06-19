import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3365624 {

    private void updateService(int nodeID, String interfaceIP, int serviceID, String notifyFlag) throws Throwable, ServletException {
        Connection connection = null;
        final DBUtils d = new DBUtils(getClass());
        try {
            MyHelperClass Vault = new MyHelperClass();
            connection = Vault.getDbConnection();
            d.watch(connection);
            MyHelperClass UPDATE_SERVICE = new MyHelperClass();
            PreparedStatement stmt = connection.prepareStatement(UPDATE_SERVICE);
            d.watch(stmt);
            stmt.setString(1, notifyFlag);
            stmt.setInt(2, nodeID);
            stmt.setString(3, interfaceIP);
            stmt.setInt(4, serviceID);
            stmt.executeUpdate();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException sqlEx) {
                throw new ServletException("Couldn't roll back update to service " + serviceID + " on interface " + interfaceIP + " notify as " + notifyFlag + " in the database.", sqlEx);
            }
            throw new ServletException("Error when updating to service " + serviceID + " on interface " + interfaceIP + " notify as " + notifyFlag + " in the database.", e);
        } finally {
            d.cleanUp();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDbConnection(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
	ServletException(){}
	ServletException(String o0, SQLException o1){}
}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }}

class DBUtils {

DBUtils(Class<CAP#1> o0){}
	DBUtils(){}
	public MyHelperClass watch(PreparedStatement o0){ return null; }
	public MyHelperClass watch(Connection o0){ return null; }
	public MyHelperClass cleanUp(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
