import java.io.*;
import java.lang.*;
import java.util.*;



class c17083703 {
public MyHelperClass ConnectionProviderFactory;

    public void savaRolePerm(String roleid, Collection role_perm_collect) throws DAOException, SQLException {
        ConnectionProvider cp = null;
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        MyHelperClass PrivilegeFactory = new MyHelperClass();
        PrivilegeFactory factory =(PrivilegeFactory)(Object) PrivilegeFactory.getInstance();
        Operation op =(Operation)(Object) factory.createOperation();
        try {
            MyHelperClass Constants = new MyHelperClass();
            cp =(ConnectionProvider)(Object) ConnectionProviderFactory.getConnectionProvider(Constants.DATA_SOURCE);
            conn =(Connection)(Object) cp.getConnection();
            try {
                MyHelperClass DEL_ROLE_PERM = new MyHelperClass();
                pstmt =(PreparedStatement)(Object) conn.prepareStatement(DEL_ROLE_PERM);
                pstmt.setString(1, roleid);
                pstmt.executeUpdate();
            } catch (Exception e) {
            }
            if ((role_perm_collect == null) || (role_perm_collect.size() == 0)) {
                return;
            } else {
                conn.setAutoCommit(false);
                MyHelperClass ADD_ROLE_PERM = new MyHelperClass();
                pstmt =(PreparedStatement)(Object) conn.prepareStatement(ADD_ROLE_PERM);
                Iterator role_perm_ir = role_perm_collect.iterator();
                while (role_perm_ir.hasNext()) {
                    RolePermission rolePerm = (RolePermission) role_perm_ir.next();
                    pstmt.setString(1, String.valueOf(rolePerm.getRoleid()));
                    pstmt.setString(2, String.valueOf(rolePerm.getResourceid()));
                    pstmt.setString(3, String.valueOf(rolePerm.getResopid()));
                    pstmt.executeUpdate();
                }
                conn.commit();
                conn.setAutoCommit(true);
            }
        } catch (Exception e) {
            conn.rollback();
            throw new DAOException();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (Exception e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DATA_SOURCE;
public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getConnectionProvider(MyHelperClass o0){ return null; }}

class DAOException extends Exception{
	public DAOException(String errorMessage) { super(errorMessage); }
	DAOException(){}
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ConnectionProvider {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class ResultSet {

}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }}

class PrivilegeFactory {

public MyHelperClass createOperation(){ return null; }}

class Operation {

}

class RolePermission {

public MyHelperClass getRoleid(){ return null; }
	public MyHelperClass getResopid(){ return null; }
	public MyHelperClass getResourceid(){ return null; }}
