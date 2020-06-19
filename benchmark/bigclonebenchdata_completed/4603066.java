import java.io.*;
import java.lang.*;
import java.util.*;



class c4603066 {
public MyHelperClass buildUser(Map o0){ return null; }

    public User createUser(Map userData) throws HamboFatalException {
        DBConnection con = null;
        try {
            MyHelperClass DBServiceManager = new MyHelperClass();
            con =(DBConnection)(Object) DBServiceManager.allocateConnection();
            con.setAutoCommit(false);
            MyHelperClass HamboUser = new MyHelperClass();
            String userId = (String) userData.get(HamboUser.USER_ID);
            String sql = "insert into user_UserAccount " + "(userid,firstname,lastname,street,zipcode,city," + "province,country,email,cellph,gender,password," + "language,timezn,birthday,datecreated,lastlogin," + "disabled,wapsigned,ldapInSync,offerings,firstcb) " + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement(sql);
            ps.setString(1, userId);
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(2, (String) userData.get(HamboUser.FIRST_NAME));
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(3, (String) userData.get(HamboUser.LAST_NAME));
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(4, (String) userData.get(HamboUser.STREET_ADDRESS));
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(5, (String) userData.get(HamboUser.ZIP_CODE));
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(6, (String) userData.get(HamboUser.CITY));
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(7, (String) userData.get(HamboUser.STATE));
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(8, (String) userData.get(HamboUser.COUNTRY));
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(9, (String) userData.get(HamboUser.EXTERNAL_EMAIL_ADDRESS));
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(10, (String) userData.get(HamboUser.MOBILE_NUMBER));
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(11, (String) userData.get(HamboUser.GENDER));
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(12, (String) userData.get(HamboUser.PASSWORD));
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(13, (String) userData.get(HamboUser.LANGUAGE));
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(14, (String) userData.get(HamboUser.TIME_ZONE));
//            MyHelperClass HamboUser = new MyHelperClass();
            java.sql.Date date = (java.sql.Date) userData.get(HamboUser.BIRTHDAY);
            MyHelperClass Types = new MyHelperClass();
            if (date != null) ps.setDate(15, date); else ps.setNull(15, Types.DATE);
//            MyHelperClass HamboUser = new MyHelperClass();
            date = (java.sql.Date) userData.get(HamboUser.CREATED);
//            MyHelperClass Types = new MyHelperClass();
            if (date != null) ps.setDate(16, date); else ps.setNull(16, Types.DATE);
//            MyHelperClass HamboUser = new MyHelperClass();
            date = (java.sql.Date) userData.get(HamboUser.LAST_LOGIN);
//            MyHelperClass Types = new MyHelperClass();
            if (date != null) ps.setDate(17, date); else ps.setNull(17, Types.DATE);
//            MyHelperClass HamboUser = new MyHelperClass();
            Boolean bool = (Boolean) userData.get(HamboUser.DISABLED);
            MyHelperClass UserAccountInfo = new MyHelperClass();
            if (bool != null) ps.setBoolean(18, bool.booleanValue()); else ps.setBoolean(18,(boolean)(Object) UserAccountInfo.DEFAULT_DISABLED);
//            MyHelperClass HamboUser = new MyHelperClass();
            bool = (Boolean) userData.get(HamboUser.WAP_ACCOUNT);
//            MyHelperClass UserAccountInfo = new MyHelperClass();
            if (bool != null) ps.setBoolean(19, bool.booleanValue()); else ps.setBoolean(19,(boolean)(Object) UserAccountInfo.DEFAULT_WAP_ACCOUNT);
//            MyHelperClass HamboUser = new MyHelperClass();
            bool = (Boolean) userData.get(HamboUser.LDAP_IN_SYNC);
//            MyHelperClass UserAccountInfo = new MyHelperClass();
            if (bool != null) ps.setBoolean(20, bool.booleanValue()); else ps.setBoolean(20,(boolean)(Object) UserAccountInfo.DEFAULT_LDAP_IN_SYNC);
//            MyHelperClass HamboUser = new MyHelperClass();
            bool = (Boolean) userData.get(HamboUser.OFFERINGS);
//            MyHelperClass UserAccountInfo = new MyHelperClass();
            if (bool != null) ps.setBoolean(21, bool.booleanValue()); else ps.setBoolean(21,(boolean)(Object) UserAccountInfo.DEFAULT_OFFERINGS);
//            MyHelperClass HamboUser = new MyHelperClass();
            ps.setString(22, (String) userData.get(HamboUser.COBRANDING_ID));
            con.executeUpdate(ps, null);
            MyHelperClass DBUtil = new MyHelperClass();
            ps =(PreparedStatement)(Object) con.prepareStatement((String)(Object)DBUtil.getQueryCurrentOID(con, "user_UserAccount", "newoid"));
            ResultSet rs =(ResultSet)(Object) con.executeQuery(ps, null);
            if ((boolean)(Object)rs.next()) {
                OID newOID = new OID(rs.getBigDecimal("newoid").doubleValue());
//                MyHelperClass HamboUser = new MyHelperClass();
                userData.put(HamboUser.OID, newOID);
            }
            con.commit();
        } catch (Exception ex) {
            if (con != null) try {
                con.rollback();
            } catch (UncheckedIOException sqlex) {
            }
            MyHelperClass MSG_INSERT_FAILED = new MyHelperClass();
            throw new HamboFatalException(MSG_INSERT_FAILED, ex);
        } finally {
            if (con != null) try {
                con.reset();
            } catch (UncheckedIOException ex) {
            }
            if (con != null) con.release();
        }
        return(User)(Object) buildUser(userData);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_WAP_ACCOUNT;
	public MyHelperClass ZIP_CODE;
	public MyHelperClass DISABLED;
	public MyHelperClass WAP_ACCOUNT;
	public MyHelperClass PASSWORD;
	public MyHelperClass MOBILE_NUMBER;
	public MyHelperClass GENDER;
	public MyHelperClass OFFERINGS;
	public MyHelperClass STATE;
	public MyHelperClass USER_ID;
	public MyHelperClass DEFAULT_DISABLED;
	public MyHelperClass FIRST_NAME;
	public MyHelperClass COBRANDING_ID;
	public MyHelperClass LAST_NAME;
	public MyHelperClass CREATED;
	public MyHelperClass STREET_ADDRESS;
	public MyHelperClass LDAP_IN_SYNC;
	public MyHelperClass TIME_ZONE;
	public MyHelperClass CITY;
	public MyHelperClass DATE;
	public MyHelperClass LAST_LOGIN;
	public MyHelperClass COUNTRY;
	public MyHelperClass DEFAULT_OFFERINGS;
	public MyHelperClass DEFAULT_LDAP_IN_SYNC;
	public MyHelperClass OID;
	public MyHelperClass LANGUAGE;
	public MyHelperClass BIRTHDAY;
	public MyHelperClass EXTERNAL_EMAIL_ADDRESS;
public MyHelperClass allocateConnection(){ return null; }
	public MyHelperClass doubleValue(){ return null; }
	public MyHelperClass getQueryCurrentOID(DBConnection o0, String o1, String o2){ return null; }}

class User {

}

class HamboFatalException extends Exception{
	public HamboFatalException(String errorMessage) { super(errorMessage); }
	HamboFatalException(MyHelperClass o0, Exception o1){}
	HamboFatalException(){}
}

class DBConnection {

public MyHelperClass executeUpdate(PreparedStatement o0, Object o1){ return null; }
	public MyHelperClass reset(){ return null; }
	public MyHelperClass release(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass executeQuery(PreparedStatement o0, Object o1){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setDate(int o0, Date o1){ return null; }
	public MyHelperClass setBoolean(int o0, boolean o1){ return null; }
	public MyHelperClass setNull(int o0, MyHelperClass o1){ return null; }}

class ResultSet {

public MyHelperClass getBigDecimal(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class OID {

OID(){}
	OID(MyHelperClass o0){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
