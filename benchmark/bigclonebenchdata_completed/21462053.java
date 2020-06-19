import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21462053 {
public MyHelperClass closeStatement(PreparedStatement o0){ return null; }
public MyHelperClass getResourceDataTableName(){ return null; }
	public MyHelperClass logExpression(String o0){ return null; }
	public MyHelperClass getResourceTableName(){ return null; }
	public MyHelperClass returnConnection(){ return null; }

    public int deleteRecord(Publisher publisher, MmdQueryCriteria criteria) throws Throwable, Exception {
        int nRows = 0;
        if (!publisher.getIsAdministrator()) {
            throw new ImsServiceException("DeleteRecordsRequest: not authorized.");
        }
        PreparedStatement st = null;
        ManagedConnection mc = returnC(ManagedConnection)(Object)onnection();
        Connection con = mc.getJdbcConnection();
        DatabaseMetaData dmt = con.getMetaData();
        String database = dmt.getDatabaseProductName().toLowerCase();
        boolean autoCommit = con.getAutoCommit();
        con.setAutoCommit(false);
        try {
            StringBuilder sbWhere = new StringBuilder();
            Map<String, Object> args = criteria.appendWherePhrase(null, sbWhere, publisher);
            StringBuilder sbData = new StringBuilder();
            if (database.contains("mysql")) {
                sbData.append(" DELETE ").append(getResourceDataTableName()).append(" FROM ").append(getResourceDataTableName());
                sbData.append(" LEFT JOIN ").append(getResourceTableName());
                sbData.append(" ON ").append(getResourceDataTableName()).append(".ID=").append(getResourceTableName()).append(".ID WHERE ").append(getResourceTableName()).append(".ID in (");
                sbData.append(" SELECT ID FROM ").append(getResourceTableName()).append(" ");
                if (sbWhere.length() > 0) {
                    sbData.append(" WHERE ").append(sbWhere.toString());
                }
                sbData.append(")");
            } else {
                sbData.append(" DELETE FROM ").append(getResourceDataTableName());
                sbData.append(" WHERE ").append(getResourceDataTableName()).append(".ID in (");
                sbData.append(" SELECT ID FROM ").append(getResourceTableName()).append(" ");
                if (sbWhere.length() > 0) {
                    sbData.append(" WHERE ").append(sbWhere.toString());
                }
                sbData.append(")");
            }
            st = con.prepareStatement(sbData.toString());
            criteria.applyArgs(st, 1, args);
            logExpression(sbData.toString());
            st.executeUpdate();
            StringBuilder sbSql = new StringBuilder();
            sbSql.append("DELETE FROM ").append(getResourceTableName()).append(" ");
            if (sbWhere.length() > 0) {
                sbSql.append(" WHERE ").append(sbWhere.toString());
            }
            closeStatement(st);
            st = con.prepareStatement(sbSql.toString());
            criteria.applyArgs(st, 1, args);
            logExpression(sbSql.toString());
            nRows = st.executeUpdate();
            con.commit();
        } catch (Exception ex) {
            con.rollback();
            throw ex;
        } finally {
            closeStatement(st);
            con.setAutoCommit(autoCommit);
        }
        return nRows;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Publisher {

public MyHelperClass getIsAdministrator(){ return null; }}

class MmdQueryCriteria {

public MyHelperClass applyArgs(PreparedStatement o0, int o1, Map<String o2, Object o3){ return null; }
	public MyHelperClass appendWherePhrase(Object o0, StringBuilder o1, Publisher o2){ return null; }}

class ImsServiceException extends Exception{
	public ImsServiceException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }}

class ManagedConnection {

public MyHelperClass getJdbcConnection(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getMetaData(){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }}

class DatabaseMetaData {

public MyHelperClass getDatabaseProductName(){ return null; }}
