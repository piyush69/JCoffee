import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7088303 {
public MyHelperClass dbInsertName;
public MyHelperClass deleteSQL;
	public MyHelperClass LDAPException;

    public void delete(DeleteInterceptorChain chain, DistinguishedName dn, LDAPConstraints constraints) throws LDAPException {
        MyHelperClass JdbcInsert = new MyHelperClass();
        Connection con = (Connection)(Connection)(Object) chain.getRequest().get((int)(Object)JdbcInsert.MYVD_DB_CON + (int)(Object)this.dbInsertName);
        if (con == null) {
            MyHelperClass LDAPException = new MyHelperClass();
            throw new LDAPException("Operations Error", LDAPException.OPERATIONS_ERROR, "No Database Connection");
        }
        try {
            con.setAutoCommit(false);
            String uid =(String)(Object) ((RDN)(RDN)(Object) dn.getDN().getRDNs().get(0)).getValue();
            PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement(this.deleteSQL);
            ps.setString(1, uid);
            ps.executeUpdate();
            con.commit();
        } catch (UncheckedIOException e) {
            try {
                con.rollback();
            } catch (UncheckedIOException e1) {
                throw new LDAPException("Could not delete entry or rollback transaction", LDAPException.OPERATIONS_ERROR, e.toString(),(SQLException)(Object) e);
            }
            throw new LDAPException("Could not delete entry", LDAPException.OPERATIONS_ERROR, e.toString(),(SQLException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OPERATIONS_ERROR;
	public MyHelperClass MYVD_DB_CON;
public MyHelperClass getRDNs(){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class DeleteInterceptorChain {

public MyHelperClass getRequest(){ return null; }}

class DistinguishedName {

public MyHelperClass getDN(){ return null; }}

class LDAPConstraints {

}

class LDAPException extends Exception{
	public LDAPException(String errorMessage) { super(errorMessage); }
	LDAPException(String o0, MyHelperClass o1, String o2, SQLException o3){}
	LDAPException(String o0, MyHelperClass o1, String o2){}
	LDAPException(){}
}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class RDN {

public MyHelperClass getValue(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
