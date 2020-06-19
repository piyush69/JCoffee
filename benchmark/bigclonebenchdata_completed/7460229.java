import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7460229 {
public MyHelperClass factory;
	public MyHelperClass close(DBOperation o0, PreparedStatement o1, ResultSet o2){ return null; }
public MyHelperClass name;
	public MyHelperClass strUpdateHighValue;

        private long getNextHighValue() throws Exception {
            Connection con = null;
            PreparedStatement psGetHighValue = null;
            PreparedStatement psUpdateHighValue = null;
            ResultSet rs = null;
            long high = -1L;
            int isolation = -1;
            MyHelperClass POOL_NAME = new MyHelperClass();
            DBOperation dbo =(DBOperation)(Object) factory.createDBOperation(POOL_NAME);
            try {
                con =(Connection)(Object) dbo.getConnection();
                MyHelperClass strGetHighValue = new MyHelperClass();
                psGetHighValue =(PreparedStatement)(Object) con.prepareStatement(strGetHighValue);
                psGetHighValue.setString(1, this.name);
                for (rs =(ResultSet)(Object) psGetHighValue.executeQuery();(boolean)(Object) rs.next(); ) {
                    high =(long)(Object) rs.getLong("high");
                }
                psUpdateHighValue =(PreparedStatement)(Object) con.prepareStatement(strUpdateHighValue);
                psUpdateHighValue.setLong(1, high + 1L);
                psUpdateHighValue.setString(2, this.name);
                psUpdateHighValue.executeUpdate();
            } catch (UncheckedIOException e) {
                if (con != null) {
                    con.rollback();
                }
                throw e;
            } finally {
                if (psUpdateHighValue != null) {
                    psUpdateHighValue.close();
                }
                close(dbo, psGetHighValue, rs);
            }
            return high;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createDBOperation(MyHelperClass o0){ return null; }}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getLong(String o0){ return null; }}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
