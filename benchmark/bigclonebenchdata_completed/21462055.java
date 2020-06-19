import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21462055 {
public MyHelperClass queryFileIdentifiers(StringSet o0){ return null; }
	public MyHelperClass closeStatement(PreparedStatement o0){ return null; }
public MyHelperClass cswRemoteRepository;
	public MyHelperClass getResourceDataTableName(){ return null; }
	public MyHelperClass logExpression(String o0){ return null; }
	public MyHelperClass getCatalogIndexAdapter(){ return null; }
	public MyHelperClass returnConnection(){ return null; }

    public int unindexRecord(String uuid) throws Throwable, SQLException, CatalogIndexException {
        Connection con = null;
        boolean autoCommit = true;
        PreparedStatement st = null;
        int nRows = 0;
        StringSet fids = new StringSet();
        MyHelperClass cswRemoteRepository = new MyHelperClass();
        if ((boolean)(Object)cswRemoteRepository.isActive()) {
            StringSet uuids = new StringSet();
            uuids.add(uuid);
            fids =(StringSet)(Object) queryFileIdentifiers(uuids);
        }
        try {
            con = returnC(Connection)(Object)onnection().getJdbcConnection();
            autoCommit =(boolean)(Object) con.getAutoCommit();
            con.setAutoCommit(false);
            String sSql = "DELETE FROM " + getResourceDataTableName() + " WHERE DOCUUID=?";
            logExpression(sSql);
            st =(PreparedStatement)(Object) con.prepareStatement(sSql);
            st.setString(1, uuid);
            nRows =(int)(Object) st.executeUpdate();
            con.commit();
        } catch (SQLException ex) {
            if (con != null) {
                con.rollback();
            }
            throw ex;
        } finally {
            closeStatement(st);
            if (con != null) {
                con.setAutoCommit(autoCommit);
            }
        }
        CatalogIndexAdapter indexAdapter =(CatalogIndexAdapter)(Object) getCatalogIndexAdapter();
        if (indexAdapter != null) {
            indexAdapter.deleteDocument(uuid);
            if ((boolean)(Object)cswRemoteRepository.isActive()) {
                if ((int)(Object)fids.size() > 0) cswRemoteRepository.onRecordsDeleted(fids);
            }
        }
        return nRows;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isActive(){ return null; }
	public MyHelperClass onRecordsDeleted(StringSet o0){ return null; }
	public MyHelperClass getJdbcConnection(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class CatalogIndexException extends Exception{
	public CatalogIndexException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class StringSet {

public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class CatalogIndexAdapter {

public MyHelperClass deleteDocument(String o0){ return null; }}
