


class c693644 {
public static MyHelperClass returnConnection(Connection o0){ return null; }
public static MyHelperClass getConnection(){ return null; }
//	public MyHelperClass returnConnection(Connection o0){ return null; }
//public MyHelperClass getConnection(){ return null; }

    public static void refreshSession(int C_ID) {
        Connection con = null;
        try {
            con =(Connection)(Object) getConnection();
            PreparedStatement updateLogin =(PreparedStatement)(Object) con.prepareStatement("UPDATE customer SET c_login = NOW(), c_expiration = DATE_ADD(NOW(), INTERVAL 2 HOUR) WHERE c_id = ?");
            updateLogin.setInt(1, C_ID);
            updateLogin.executeUpdate();
            con.commit();
            updateLogin.close();
            returnConnection(con);
        } catch (java.lang.Exception ex) {
            try {
                con.rollback();
                ex.printStackTrace();
            } catch (Exception se) {
                System.err.println("Transaction rollback failed.");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
