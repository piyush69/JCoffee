
import java.io.UncheckedIOException;


class c13893663 {

    public static int executeNoQuery(String strStatement) throws SQLException {
        MyDBConnection myc = new MyDBConnection();
        myc.init();
        Statement statement =(Statement)(Object) myc.getMyConnection().createStatement();
        try {
            int rows =(int)(Object) statement.executeUpdate(strStatement);
            myc.myConnection.commit();
            return rows;
        } catch (UncheckedIOException e) {
            myc.myConnection.rollback();
            throw new SQLException("rollback e close effettuato dopo " + e.getMessage());
        } finally {
            myc.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class MyDBConnection {
public MyHelperClass myConnection;
public MyHelperClass getMyConnection(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass init(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}
