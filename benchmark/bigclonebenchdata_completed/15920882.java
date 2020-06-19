
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15920882 {
public MyHelperClass storePackagesAndClasses(API o0){ return null; }

    private void populateAPI(API api) {
        try {
            if ((boolean)(Object)api.isPopulated()) {
                MyHelperClass log = new MyHelperClass();
                log.traceln("Skipping API " + api.getName() + " (already populated)");
                return;
            }
            api.setPopulated(true);
            String sql = "update API set populated=1 where name=?";
            MyHelperClass conn = new MyHelperClass();
            PreparedStatement pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
            pstmt.setString(1, api.getName());
            pstmt.executeUpdate();
            pstmt.close();
            storePackagesAndClasses(api);
//            MyHelperClass conn = new MyHelperClass();
            conn.commit();
        } catch (UncheckedIOException ex) {
            MyHelperClass log = new MyHelperClass();
            log.error("Store (api: " + api.getName() + ") failed!");
            MyHelperClass DBUtils = new MyHelperClass();
            DBUtils.logSQLException((SQLException)(Object)ex);
//            MyHelperClass log = new MyHelperClass();
            log.error("Rolling back..");
            try {
                MyHelperClass conn = new MyHelperClass();
                conn.rollback();
            } catch (UncheckedIOException inner_ex) {
//                MyHelperClass log = new MyHelperClass();
                log.error("rollback failed!");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass traceln(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass logSQLException(SQLException o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class API {

public MyHelperClass isPopulated(){ return null; }
	public MyHelperClass setPopulated(boolean o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
