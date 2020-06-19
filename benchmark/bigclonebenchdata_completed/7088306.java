import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7088306 {
public MyHelperClass dbInsertName;
public MyHelperClass LDAPException;
	public MyHelperClass rdnField;
	public MyHelperClass tableName;
	public MyHelperClass LDAPModification;

    private void modifyEntry(ModifyInterceptorChain chain, DistinguishedName dn, ArrayList<LDAPModification> mods, Connection con) throws LDAPException {
        try {
            con.setAutoCommit(false);
            MyHelperClass JdbcInsert = new MyHelperClass();
            HashMap<String, String> ldap2db = (HashMap<String, String>)(HashMap<String,String>)(Object) chain.getRequest().get((int)(Object)JdbcInsert.MYVD_DB_LDAP2DB + (int)(Object)this.dbInsertName);
            Iterator<LDAPModification> it = mods.iterator();
            String sql = "UPDATE " + this.tableName + " SET ";
            while (it.hasNext()) {
                LDAPModification mod = it.next();
                if (mod.getOp() != LDAPModification.REPLACE) {
                    throw new LDAPException("Only modify replace allowed", LDAPException.OBJECT_CLASS_VIOLATION, "");
                }
                sql += ldap2db.get(mod.getAttribute().getName()) + "=? ";
            }
            sql += " WHERE " + this.rdnField + "=?";
            PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement(sql);
            it = mods.iterator();
            int i = 1;
            while (it.hasNext()) {
                LDAPModification mod = it.next();
                ps.setString(i,(String)(Object) mod.getAttribute().getStringValue());
                i++;
            }
            String uid =(String)(Object) ((RDN)(RDN)(Object) dn.getDN().getRDNs().get(0)).getValue();
            ps.setString(i, uid);
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
public MyHelperClass MYVD_DB_LDAP2DB;
	public MyHelperClass OPERATIONS_ERROR;
	public MyHelperClass OBJECT_CLASS_VIOLATION;
	public MyHelperClass REPLACE;
public MyHelperClass getRDNs(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getStringValue(){ return null; }}

class ModifyInterceptorChain {

public MyHelperClass getRequest(){ return null; }}

class DistinguishedName {

public MyHelperClass getDN(){ return null; }}

class LDAPModification {

public MyHelperClass getOp(){ return null; }
	public MyHelperClass getAttribute(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class LDAPException extends Exception{
	public LDAPException(String errorMessage) { super(errorMessage); }
	LDAPException(String o0, MyHelperClass o1, String o2, SQLException o3){}
	LDAPException(String o0, MyHelperClass o1, String o2){}
	LDAPException(){}
}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class RDN {

public MyHelperClass getValue(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
