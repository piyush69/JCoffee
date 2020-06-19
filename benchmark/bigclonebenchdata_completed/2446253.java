import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2446253 {
public MyHelperClass logger;
	public MyHelperClass ORDERBY_BY_DELTA_VALUE;
	public MyHelperClass DatabaseConstants;
	public MyHelperClass getDataSourceHelper(){ return null; }
	public MyHelperClass getDataSource(){ return null; }

    private int renumberOrderBy(long tableID) throws Throwable, SnapInException {
        int count = 0;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con =(Connection)(Object) getDataSource().getConnection();
            con.setAutoCommit(false);
            stmt =(Statement)(Object) con.createStatement();
            StringBuffer query = new StringBuffer();
            query.append("SELECT ").append(DatabaseConstants.TableFieldName_JV_FIELDBEHAVIOR_ID).append(" FROM ").append(DatabaseConstants.TableName_JV_FIELDBEHAVIOR).append(" WHERE ").append(DatabaseConstants.TableFieldName_JV_FIELDBEHAVIOR_TABLEID).append(" = ").append(tableID).append(" ORDER BY ").append(DatabaseConstants.TableFieldName_JV_FIELDBEHAVIOR_ORDERBY);
            Vector rowIDVector = new Vector();
            rs =(ResultSet)(Object) stmt.executeQuery(query.toString());
            while ((boolean)(Object)rs.next()) {
                count++;
                rowIDVector.add(rs.getLong(DatabaseConstants.TableFieldName_JV_FIELDBEHAVIOR_ID) + "");
            }
            StringBuffer updateString = new StringBuffer();
            updateString.append("UPDATE ").append(DatabaseConstants.TableName_JV_FIELDBEHAVIOR).append(" SET ").append(DatabaseConstants.TableFieldName_JV_FIELDBEHAVIOR_ORDERBY).append(" = ? WHERE ").append(DatabaseConstants.TableFieldName_JV_FIELDBEHAVIOR_ID).append(" = ?");
            PreparedStatement pstmt =(PreparedStatement)(Object) con.prepareStatement(updateString.toString());
            int orderByValue =(int)(Object) ORDERBY_BY_DELTA_VALUE;
            Enumeration en = rowIDVector.elements();
            while (en.hasMoreElements()) {
                pstmt.setInt(1, orderByValue);
                pstmt.setString(2, en.nextElement().toString());
                orderByValue += (int)(Object)ORDERBY_BY_DELTA_VALUE;
                pstmt.executeUpdate();
            }
            con.setAutoCommit(true);
            if (pstmt != null) {
                pstmt.close();
            }
//         } catch (java.sql.ArithmeticException e) {
            if (con == null) {
                logger.error("java.sql.SQLException", e);
            } else {
                try {
                    logger.error("Transaction is being rolled back.");
                    con.rollback();
                    con.setAutoCommit(true);
//                 } catch (java.sql.ArrayIndexOutOfBoundsException e2) {
                    logger.error("java.sql.SQLException", e2);
                }
            }
        } catch (Exception e) {
            logger.error("Error occured during RenumberOrderBy", e);
        } finally {
            getDataSourceHelper().releaseResources(con, stmt, rs);
        }
        return count;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TableFieldName_JV_FIELDBEHAVIOR_ORDERBY;
	public MyHelperClass TableName_JV_FIELDBEHAVIOR;
	public MyHelperClass TableFieldName_JV_FIELDBEHAVIOR_ID;
	public MyHelperClass TableFieldName_JV_FIELDBEHAVIOR_TABLEID;
public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass releaseResources(Connection o0, Statement o1, ResultSet o2){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class SnapInException extends Exception{
	public SnapInException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getLong(MyHelperClass o0){ return null; }
	public MyHelperClass next(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
