
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22717352 {

    public void add(AddInterceptorChain chain, Entry entry, LDAPConstraints constraints) throws LDAPException {
        MyHelperClass JdbcInsert = new MyHelperClass();
        Connection con = (Connection)(Connection)(Object) chain.getRequest().get(JdbcInsert.MYVD_DB_CON + "LDAPBaseServer");
        if (con == null) {
            MyHelperClass LDAPException = new MyHelperClass();
            throw new LDAPException("Operations Error", LDAPException.OPERATIONS_ERROR, "No Database Connection");
        }
        try {
            con.setAutoCommit(false);
//            MyHelperClass JdbcInsert = new MyHelperClass();
            HashMap db2ldap = (HashMap)(HashMap)(Object) chain.getRequest().get(JdbcInsert.MYVD_DB_DB2LDAP + "LDAPBaseServer");
            PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement("INSERT INTO USERS (id,firstname,lastname,username) VALUES (?,?,?,?)");
            ps.setInt(1, 5);
            ps.setString(2,(String)(Object) entry.getEntry().getAttribute(db2ldap.get("firstname")).getStringValue());
            ps.setString(3,(String)(Object) entry.getEntry().getAttribute(db2ldap.get("lastname")).getStringValue());
            ps.setString(4,(String)(Object) entry.getEntry().getAttribute(db2ldap.get("username")).getStringValue());
            ps.executeUpdate();
            ps.close();
            ps =(PreparedStatement)(Object) con.prepareStatement("SELECT id FROM LOCATIONS WHERE name=?");
            PreparedStatement inst =(PreparedStatement)(Object) con.prepareStatement("INSERT INTO LOCATIONMAP (person,location) VALUES (?,?)");
            LDAPAttribute l =(LDAPAttribute)(Object) entry.getEntry().getAttribute(db2ldap.get("name"));
            if (l == null) {
                con.rollback();
                MyHelperClass LDAPException = new MyHelperClass();
                throw new LDAPException("Location is required", LDAPException.OBJECT_CLASS_VIOLATION, "Location is required");
            }
            String[] vals =(String[])(Object) l.getStringValueArray();
            for (int i = 0; i < vals.length; i++) {
                ps.setString(1, vals[i]);
                ResultSet rs =(ResultSet)(Object) ps.executeQuery();
                if (!(Boolean)(Object)rs.next()) {
                    con.rollback();
                    MyHelperClass LDAPException = new MyHelperClass();
                    throw new LDAPException("Location " + vals[i] + " does not exist", LDAPException.OBJECT_CLASS_VIOLATION, "Location " + vals[i] + " does not exist");
                }
                inst.setInt(1, 5);
                inst.setInt(2,(int)(Object) rs.getInt("id"));
                inst.executeUpdate();
            }
            ps.close();
            inst.close();
            con.commit();
        } catch (UncheckedIOException e) {
            try {
                con.rollback();
            } catch (UncheckedIOException e1) {
                MyHelperClass LDAPException = new MyHelperClass();
                throw new LDAPException("Could not add entry or rollback transaction", LDAPException.OPERATIONS_ERROR, e.toString(),(SQLException)(Object) e);
            }
            MyHelperClass LDAPException = new MyHelperClass();
            throw new LDAPException("Could not add entry", LDAPException.OPERATIONS_ERROR, e.toString(),(SQLException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MYVD_DB_CON;
	public MyHelperClass OBJECT_CLASS_VIOLATION;
	public MyHelperClass OPERATIONS_ERROR;
	public MyHelperClass MYVD_DB_DB2LDAP;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass getStringValue(){ return null; }}

class AddInterceptorChain {

public MyHelperClass getRequest(){ return null; }}

class Entry {

public MyHelperClass getEntry(){ return null; }}

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

public MyHelperClass get(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class LDAPAttribute {

public MyHelperClass getStringValueArray(){ return null; }}

class ResultSet {

public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
