
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22717359 {
public MyHelperClass getId(DistinguishedName o0, Connection o1){ return null; }

    public void modify(ModifyInterceptorChain chain, DistinguishedName dn, ArrayList mods, LDAPConstraints constraints) throws LDAPException {
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
            Iterator it =(Iterator)(Object) mods.iterator();
            String uid =(String)(Object) ((RDN)(RDN)(Object) dn.getDN().getRDNs().get((String)(Object)0)).getValue();
            int id =(int)(Object) this.getId(dn, con);
            while ((boolean)(Object)it.hasNext()) {
                LDAPModification mod =(LDAPModification)(Object) it.next();
                MyHelperClass LDAPModification = new MyHelperClass();
                if (mod.getOp() == LDAPModification.REPLACE) {
                    String attributeName =(String)(Object) mod.getAttribute().getName();
                    if (attributeName.equals(db2ldap.get("first")) || attributeName.equals(db2ldap.get("last"))) {
                        PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement("UPDATE USERS SET " + (attributeName.equals(db2ldap.get("first")) ? "first" : "last") + "=? WHERE username=?");
                        ps.setString(1,(String)(Object) mod.getAttribute().getStringValue());
                        ps.setString(2, uid);
                        ps.executeUpdate();
                        ps.close();
                    } else if (attributeName.equals(db2ldap.get("username"))) {
                        MyHelperClass LDAPException = new MyHelperClass();
                        throw new LDAPException("Can not modify the rdn", LDAPException.NOT_ALLOWED_ON_RDN, "Can not perform modify");
                    } else if (attributeName.equals(db2ldap.get("name"))) {
                        PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement("DELETE FROM locationmap WHERE person=?");
                        ps.setInt(1, id);
                        ps.executeUpdate();
                        ps.close();
                        ps =(PreparedStatement)(Object) con.prepareStatement("INSERT INTO locationmap (person,location) VALUES (?,?)");
                        PreparedStatement pssel =(PreparedStatement)(Object) con.prepareStatement("SELECT id FROM LOCATIONS WHERE name=?");
                        String[] vals =(String[])(Object) mod.getAttribute().getStringValueArray();
                        for (int i = 0; i < vals.length; i++) {
                            pssel.setString(1, vals[i]);
                            ResultSet rs =(ResultSet)(Object) pssel.executeQuery();
                            if (!(Boolean)(Object)rs.next()) {
                                con.rollback();
                                MyHelperClass LDAPException = new MyHelperClass();
                                throw new LDAPException("Location " + vals[i] + " does not exist", LDAPException.OBJECT_CLASS_VIOLATION, "Location " + vals[i] + " does not exist");
                            }
                            int lid =(int)(Object) rs.getInt("id");
                            ps.setInt(1, id);
                            ps.setInt(2, lid);
                            ps.executeUpdate();
                        }
                        ps.close();
                        pssel.close();
                    }
//                MyHelperClass LDAPModification = new MyHelperClass();
                } else if (mod.getOp() == LDAPModification.DELETE) {
                    if (mod.getAttribute().getName().equals(db2ldap.get("name"))) {
                        String[] vals =(String[])(Object) mod.getAttribute().getStringValueArray();
                        if (vals.length == 0) {
                            PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement("DELETE FROM locationmap WHERE person=?");
                            ps.setInt(1, id);
                            ps.executeUpdate();
                            ps.close();
                        } else {
                            PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement("DELETE FROM locationmap WHERE person=? and location=?");
                            PreparedStatement pssel =(PreparedStatement)(Object) con.prepareStatement("SELECT id FROM LOCATIONS WHERE name=?");
                            for (int i = 0; i < vals.length; i++) {
                                pssel.setString(1, vals[i]);
                                ResultSet rs =(ResultSet)(Object) pssel.executeQuery();
                                if (!(Boolean)(Object)rs.next()) {
                                    con.rollback();
                                    MyHelperClass LDAPException = new MyHelperClass();
                                    throw new LDAPException("Location " + vals[i] + " does not exist", LDAPException.OBJECT_CLASS_VIOLATION, "Location " + vals[i] + " does not exist");
                                }
                                int lid =(int)(Object) rs.getInt("id");
                                ps.setInt(1, id);
                                ps.setInt(2, lid);
                                ps.executeUpdate();
                            }
                            ps.close();
                            pssel.close();
                        }
                    } else {
                        MyHelperClass LDAPException = new MyHelperClass();
                        throw new LDAPException("Can not delete attribute " + mod.getAttribute().getName(), LDAPException.INVALID_ATTRIBUTE_SYNTAX, "");
                    }
//                MyHelperClass LDAPModification = new MyHelperClass();
                } else if (mod.getOp() == LDAPModification.ADD) {
                    if (mod.getAttribute().getName().equals(db2ldap.get("name"))) {
                        String[] vals =(String[])(Object) mod.getAttribute().getStringValueArray();
                        PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement("INSERT INTO locationmap (person,location) VALUES (?,?)");
                        PreparedStatement pssel =(PreparedStatement)(Object) con.prepareStatement("SELECT id FROM LOCATIONS WHERE name=?");
                        for (int i = 0; i < vals.length; i++) {
                            pssel.setString(1, vals[i]);
                            ResultSet rs =(ResultSet)(Object) pssel.executeQuery();
                            if (!(Boolean)(Object)rs.next()) {
                                con.rollback();
                                MyHelperClass LDAPException = new MyHelperClass();
                                throw new LDAPException("Location " + vals[i] + " does not exist", LDAPException.OBJECT_CLASS_VIOLATION, "Location " + vals[i] + " does not exist");
                            }
                            int lid =(int)(Object) rs.getInt("id");
                            ps.setInt(1, id);
                            ps.setInt(2, lid);
                            ps.executeUpdate();
                        }
                        ps.close();
                        pssel.close();
                    } else {
                        MyHelperClass LDAPException = new MyHelperClass();
                        throw new LDAPException("Can not delete attribute " + mod.getAttribute().getName(), LDAPException.INVALID_ATTRIBUTE_SYNTAX, "");
                    }
                }
            }
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
public MyHelperClass NOT_ALLOWED_ON_RDN;
	public MyHelperClass MYVD_DB_CON;
	public MyHelperClass INVALID_ATTRIBUTE_SYNTAX;
	public MyHelperClass OBJECT_CLASS_VIOLATION;
	public MyHelperClass REPLACE;
	public MyHelperClass OPERATIONS_ERROR;
	public MyHelperClass ADD;
	public MyHelperClass DELETE;
	public MyHelperClass MYVD_DB_DB2LDAP;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getRDNs(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getStringValueArray(){ return null; }
	public MyHelperClass getStringValue(){ return null; }}

class ModifyInterceptorChain {

public MyHelperClass getRequest(){ return null; }}

class DistinguishedName {

public MyHelperClass getDN(){ return null; }}

class ArrayList {

public MyHelperClass iterator(){ return null; }}

class LDAPModification {

public MyHelperClass getAttribute(){ return null; }
	public MyHelperClass getOp(){ return null; }}

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

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class RDN {

public MyHelperClass getValue(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class ResultSet {

public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
