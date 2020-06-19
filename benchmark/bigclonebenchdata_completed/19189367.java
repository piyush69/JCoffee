
import java.io.UncheckedIOException;


class c19189367 {

    public void insert() throws Exception {
        MyHelperClass DbUtil = new MyHelperClass();
        Connection con =(Connection)(Object) DbUtil.connectToDb();
        PreparedStatement pStmt = null;
        try {
            MyHelperClass Constants = new MyHelperClass();
            pStmt =(PreparedStatement)(Object) con.prepareStatement("INSERT INTO " + Constants.TABLENAME + " (name,phone,address)" + " values(?,?,?)");
            con.setAutoCommit(false);
            MyHelperClass name = new MyHelperClass();
            pStmt.setString(1, name);
            MyHelperClass phone = new MyHelperClass();
            pStmt.setString(2, phone);
            MyHelperClass address = new MyHelperClass();
            pStmt.setString(3, address);
            int j =(int)(Object) pStmt.executeUpdate();
            con.commit();
        } catch (Exception ex) {
            try {
                con.rollback();
            } catch (UncheckedIOException sqlex) {
                sqlex.printStackTrace(System.out);
            }
            throw ex;
        } finally {
            try {
                pStmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TABLENAME;
public MyHelperClass connectToDb(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
