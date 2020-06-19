
import java.io.UncheckedIOException;


class c21181542 {
public MyHelperClass closeStatement(PreparedStatement o0){ return null; }
	public MyHelperClass checkPermission(DTSPermission o0, String o1){ return null; }
public MyHelperClass conn;
	public MyHelperClass ROLE_TYPE_TABLE_KEY;
	public MyHelperClass ApelMsgHandler;
	public MyHelperClass Connection;
	public MyHelperClass getDAO(){ return null; }
	public MyHelperClass isRoleTypeUsed(int o0, int o1){ return null; }
	public MyHelperClass getGID(int o0, int o1){ return null; }
	public MyHelperClass fetchRightIdentityReferences(int o0, int o1){ return null; }
	public MyHelperClass fetchParentReferences(int o0, int o1){ return null; }

    public boolean deleteRoleType(int id, int namespaceId, boolean removeReferencesInRoleTypes, DTSPermission permit) throws SQLException, PermissionException, DTSValidationException {
        checkPermission(permit, String.valueOf(namespaceId));
        boolean exist =(boolean)(Object) isRoleTypeUsed(namespaceId, id);
        if (exist) {
            throw new DTSValidationException((String)(Object)ApelMsgHandler.getInstance().getMsg("DTS-0034"));
        }
        if (!removeReferencesInRoleTypes) {
            StringBuffer msgBuf = new StringBuffer();
            DTSTransferObject[] objects =(DTSTransferObject[])(Object) fetchRightIdentityReferences(namespaceId, id);
            if (objects.length > 0) {
                msgBuf.append("Role Type is Right Identity in one or more Role Types.");
            }
            objects =(DTSTransferObject[])(Object) fetchParentReferences(namespaceId, id);
            if (objects.length > 0) {
                if (msgBuf.length() > 0) {
                    msgBuf.append("\n");
                }
                msgBuf.append("Role Type is Parent of one or more Role Types.");
            }
            if (msgBuf.length() > 0) {
                throw new DTSValidationException(msgBuf.toString());
            }
        }
        String sqlRightId =(String)(Object) getDAO().getStatement(ROLE_TYPE_TABLE_KEY, "DELETE_RIGHT_IDENTITY_REF");
        String sqlParent =(String)(Object) getDAO().getStatement(ROLE_TYPE_TABLE_KEY, "DELETE_PARENT_REF");
        String sql =(String)(Object) getDAO().getStatement(ROLE_TYPE_TABLE_KEY, "DELETE");
        PreparedStatement pstmt = null;
        boolean success = false;
        long typeGid =(long)(Object) getGID(namespaceId, id);
        conn.setAutoCommit(false);
        int defaultLevel =(int)(Object) conn.getTransactionIsolation();
        conn.setTransactionIsolation((int)(Object)Connection.TRANSACTION_READ_COMMITTED);
        try {
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(sqlRightId);
            pstmt.setLong(1, typeGid);
            pstmt.executeUpdate();
            pstmt.close();
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(sqlParent);
            pstmt.setLong(1, typeGid);
            pstmt.executeUpdate();
            pstmt.close();
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
            pstmt.setLong(1, typeGid);
            int count =(int)(Object) pstmt.executeUpdate();
            success = (count == 1);
            conn.commit();
        } catch (UncheckedIOException e) {
            conn.rollback();
            throw e;
        } finally {
            conn.setTransactionIsolation(defaultLevel);
            conn.setAutoCommit(true);
            closeStatement(pstmt);
        }
        return success;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TRANSACTION_READ_COMMITTED;
public MyHelperClass setTransactionIsolation(int o0){ return null; }
	public MyHelperClass getStatement(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getTransactionIsolation(){ return null; }
	public MyHelperClass getMsg(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class DTSPermission {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PermissionException extends Exception{
	public PermissionException(String errorMessage) { super(errorMessage); }
}

class DTSValidationException extends Exception{
	public DTSValidationException(String errorMessage) { super(errorMessage); }
}

class DTSTransferObject {

}

class PreparedStatement {

public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
