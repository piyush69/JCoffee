
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22717356 {
public MyHelperClass getId(DistinguishedName o0, Connection o1){ return null; }

    public void delete(DeleteInterceptorChain chain, DistinguishedName dn, LDAPConstraints constraints) throws LDAPException {
        MyHelperClass JdbcInsert = new MyHelperClass();
        Connection con = (Connection)(Connection)(Object) chain.getRequest().get(JdbcInsert.MYVD_DB_CON + "LDAPBaseServer");
        if (con == null) {
            MyHelperClass LDAPException = new MyHelperClass();
            throw new LDAPException("Operations Error", LDAPException.OPERATIONS_ERROR, "No Database Connection");
        }
        try {
            con.setAutoCommit(false);
            int id =(int)(Object) getId(dn, con);
//            MyHelperClass JdbcInsert = new MyHelperClass();
            HashMap db2ldap = (HashMap)(HashMap)(Object) chain.getRequest().get(JdbcInsert.MYVD_DB_DB2LDAP + "LDAPBaseServer");
            PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement("DELETE FROM users WHERE id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            ps =(PreparedStatement)(Object) con.prepareStatement("DELETE FROM locationmap WHERE person=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            con.commit();
        } catch (UncheckedIOException e) {
            try {
                con.rollback();
            } catch (UncheckedIOException e1) {
                MyHelperClass LDAPException = new MyHelperClass();
                throw new LDAPException("Could not delete entry or rollback transaction", LDAPException.OPERATIONS_ERROR, e.toString(),(SQLException)(Object) e);
            }
            MyHelperClass LDAPException = new MyHelperClass();
            throw new LDAPException("Could not delete entry", LDAPException.OPERATIONS_ERROR, e.toString(),(SQLException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MYVD_DB_DB2LDAP;
	public MyHelperClass OPERATIONS_ERROR;
	public MyHelperClass MYVD_DB_CON;
public MyHelperClass get(String o0){ return null; }}

class DeleteInterceptorChain {

public MyHelperClass getRequest(){ return null; }}

class DistinguishedName {

}

class LDAPConstraints {

}

class LDAPException extends Exception{
	public LDAPException(String errorMessage) { super(errorMessage); }
	LDAPException(String o0, MyHelperClass o1, String o2, SQLException o3){}
	LDAPException(String o0, MyHelperClass o1, String o2){}
	LDAPException(){}
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class HashMap {

}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
