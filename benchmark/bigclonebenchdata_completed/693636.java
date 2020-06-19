


class c693636 {
public static MyHelperClass returnConnection(Connection o0){ return null; }
public static MyHelperClass Sequence;
	public static MyHelperClass getConnection(){ return null; }
//	public MyHelperClass returnConnection(Connection o0){ return null; }
//public MyHelperClass Sequence;
//	public MyHelperClass getConnection(){ return null; }

    public static int createEmptyCart() {
        int SHOPPING_ID = 0;
        Connection con = null;
        try {
            con =(Connection)(Object) getConnection();
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
        try {
            PreparedStatement insert_cart = null;
            SHOPPING_ID = Integer.parseInt((String)(Object)Sequence.getSequenceNumber("shopping_cart"));
            insert_cart =(PreparedStatement)(Object) con.prepareStatement("INSERT INTO shopping_cart (sc_id, sc_time) VALUES ( ? , NOW() )");
            insert_cart.setInt(1, SHOPPING_ID);
            insert_cart.executeUpdate();
            con.commit();
            insert_cart.close();
            returnConnection(con);
        } catch (java.lang.Exception ex) {
            try {
                con.rollback();
                ex.printStackTrace();
            } catch (Exception se) {
                System.err.println("Transaction rollback failed.");
            }
        }
        return SHOPPING_ID;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSequenceNumber(String o0){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
