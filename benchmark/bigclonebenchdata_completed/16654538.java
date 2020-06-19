import java.io.*;
import java.lang.*;
import java.util.*;



class c16654538 {
public MyHelperClass log;
	public MyHelperClass classnamefield;
	public MyHelperClass reffield;

    public void setTypeRefs(Connection conn) {
        MyHelperClass table = new MyHelperClass();
        log.traceln("\tProcessing " + table + " references..");
        try {
//            MyHelperClass table = new MyHelperClass();
            String query = " select distinct c.id, c.qualifiedname from " + table + ", CLASSTYPE c " + " where " + table + "." + reffield + " is null and " + table + "." + classnamefield + " = c.qualifiedname";
            PreparedStatement pstmt =(PreparedStatement)(Object) conn.prepareStatement(query);
            long start = new Date().getTime();
            ResultSet rset =(ResultSet)(Object) pstmt.executeQuery();
            long queryTime = new Date().getTime() - start;
            MyHelperClass log = new MyHelperClass();
            log.debug("query time: " + queryTime + " ms");
//            MyHelperClass table = new MyHelperClass();
            String update = "update " + table + " set " + reffield + "=? where " + classnamefield + "=? and " + reffield + " is null";
            PreparedStatement pstmt2 =(PreparedStatement)(Object) conn.prepareStatement(update);
            int n = 0;
            start = new Date().getTime();
            while ((boolean)(Object)rset.next()) {
                n++;
                pstmt2.setInt(1, rset.getInt(1));
                pstmt2.setString(2, rset.getString(2));
                pstmt2.executeUpdate();
            }
            queryTime = new Date().getTime() - start;
//            MyHelperClass log = new MyHelperClass();
            log.debug("total update time: " + queryTime + " ms");
//            MyHelperClass log = new MyHelperClass();
            log.debug("number of times through loop: " + n);
//            MyHelperClass log = new MyHelperClass();
            if (n > 0) log.debug("avg update time: " + (queryTime / n) + " ms");
            pstmt2.close();
            rset.close();
            pstmt.close();
            conn.commit();
//            MyHelperClass table = new MyHelperClass();
            log.verbose("Updated (committed) " + table + " references");
        } catch (UncheckedIOException ex) {
            MyHelperClass log = new MyHelperClass();
            log.error("Internal Reference Update Failed!");
            MyHelperClass DBUtils = new MyHelperClass();
            DBUtils.logSQLException((SQLException)(Object)ex);
//            MyHelperClass log = new MyHelperClass();
            log.error("Rolling back..");
            try {
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

public MyHelperClass traceln(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass logSQLException(SQLException o0){ return null; }
	public MyHelperClass verbose(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
