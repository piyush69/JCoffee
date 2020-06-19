import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18432299 {
public MyHelperClass getClassifyDAO(){ return null; }
	public MyHelperClass getConceptGID(ConceptRef o0, int o1){ return null; }
public MyHelperClass conn;
	public MyHelperClass toSQLException(Exception o0, String o1){ return null; }
	public MyHelperClass deleteCycleError(int o0){ return null; }
	public MyHelperClass deleteEqError(int o0){ return null; }

    private String addEqError(EquivalencyException e, int namespaceId) throws Throwable, SQLException {
        List l = Arrays.asList(e.getListOfEqErrors());
        int size = l.size();
        MyHelperClass TABLE_KEY = new MyHelperClass();
        String sql =(String)(Object) getClassifyDAO().getStatement(TABLE_KEY, "ADD_CLASSIFY_EQ_ERROR");
        PreparedStatement ps = null;
        MyHelperClass conn = new MyHelperClass();
        conn.setAutoCommit(false);
        try {
            deleteCycleError(namespaceId);
            deleteEqError(namespaceId);
            long conceptGID1 = -1;
            long conceptGID2 = -1;
            ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            for (int i = 0; i < l.size(); i++) {
                EqError error = (EqError) l.get(i);
                ConceptRef ref1 =(ConceptRef)(Object) error.getConcept1();
                ConceptRef ref2 =(ConceptRef)(Object) error.getConcept2();
                conceptGID1 =(long)(Object) getConceptGID(ref1, namespaceId);
                conceptGID2 =(long)(Object) getConceptGID(ref2, namespaceId);
                ps.setLong(1, conceptGID1);
                ps.setLong(2, conceptGID2);
                ps.setInt(3, namespaceId);
                int result =(int)(Object) ps.executeUpdate();
                if (result == 0) {
                    throw new SQLException("unable to add eq error: " + sql);
                }
            }
            conn.commit();
            return "EquivalencyException: Concept: " + conceptGID1 + " namespaceId: " + namespaceId + " conceptGID2: " + conceptGID2 + ((size > 1) ? "...... more" : "");
        } catch (SQLException sqle) {
            conn.rollback();
            throw sqle;
        } catch (Exception ex) {
            conn.rollback();
            throw(Throwable)(Object) toSQLException(ex, "cannot add eq errors");
        } finally {
            conn.setAutoCommit(true);
            if (ps != null) {
                ps.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass getStatement(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class EquivalencyException extends Exception{
	public EquivalencyException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class EqError {

public MyHelperClass getConcept2(){ return null; }
	public MyHelperClass getConcept1(){ return null; }}

class ConceptRef {

}
