
import java.io.UncheckedIOException;


class c18458055 {

    public synchronized int executeCommand(Vector pvStatement) throws Exception {
        int ret = 0, i = 0;
        Statement stmt = null;
        String temp = "";
        try {
            MyHelperClass oConexion = new MyHelperClass();
            oConexion.setAutoCommit(false);
//            MyHelperClass oConexion = new MyHelperClass();
            stmt =(Statement)(Object) oConexion.createStatement();
            for (i = 0; i < (int)(Object)pvStatement.size(); i++) {
                temp = (String)(String)(Object) pvStatement.elementAt(i);
                ret += (int)(Object)stmt.executeUpdate(temp);
            }
//            MyHelperClass oConexion = new MyHelperClass();
            oConexion.commit();
        } catch (UncheckedIOException e) {
            MyHelperClass oConexion = new MyHelperClass();
            oConexion.rollback();
            throw e;
        } finally {
            stmt.close();
            stmt = null;
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Vector {

public MyHelperClass size(){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
