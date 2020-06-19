import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c21837100 {
public MyHelperClass DriverManager;
public MyHelperClass productId;
	public MyHelperClass componentId;
	public MyHelperClass jdbcURL;

    public void saveMapping() throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection)(Connection)(Object) DriverManager.getConnection(this.jdbcURL);
            connection.setAutoCommit(false);
            String query = "INSERT INTO mapping(product_id, comp_id, count) VALUES(?,?,?)";
            ps = (PreparedStatement)(PreparedStatement)(Object) connection.prepareStatement(query);
            ps.setInt(1, this.productId);
            ps.setInt(2, this.componentId);
            ps.setInt(3, 1);
            ps.executeUpdate();
        } catch (Exception ex) {
            connection.rollback();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
            }
            try {
                ps.close();
            } catch (Exception ex) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(MyHelperClass o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
