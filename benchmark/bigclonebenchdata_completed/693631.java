import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c693631 {
public static MyHelperClass returnConnection(Connection o0){ return null; }
public static MyHelperClass getConnection(){ return null; }
//	public MyHelperClass returnConnection(Connection o0){ return null; }
//public MyHelperClass getConnection(){ return null; }

    public static void adminUpdate(int i_id, double cost, String image, String thumbnail)  throws Throwable {
        Connection con = null;
        try {
            MyHelperClass tmpAdmin = new MyHelperClass();
            tmpAdmin++;
//            MyHelperClass tmpAdmin = new MyHelperClass();
            String name = "$tmp_admin" + tmpAdmin;
            con =(Connection)(Object) getConnection();
            PreparedStatement related1 =(PreparedStatement)(Object) con.prepareStatement("CREATE TEMPORARY TABLE " + name + " TYPE=HEAP SELECT o_id FROM orders ORDER BY o_date DESC LIMIT 10000");
            related1.executeUpdate();
            related1.close();
            PreparedStatement related2 =(PreparedStatement)(Object) con.prepareStatement("SELECT ol2.ol_i_id, SUM(ol2.ol_qty) AS sum_ol FROM order_line ol, order_line ol2, " + name + " t " + "WHERE ol.ol_o_id = t.o_id AND ol.ol_i_id = ? AND ol2.ol_o_id = t.o_id AND ol2.ol_i_id <> ? " + "GROUP BY ol2.ol_i_id ORDER BY sum_ol DESC LIMIT 0,5");
            related2.setInt(1, i_id);
            related2.setInt(2, i_id);
            ResultSet rs =(ResultSet)(Object) related2.executeQuery();
            int[] related_items = new int[5];
            int counter = 0;
            int last = 0;
            while ((boolean)(Object)rs.next()) {
                last =(int)(Object) rs.getInt(1);
                related_items[counter] = last;
                counter++;
            }
            for (int i = counter; i < 5; i++) {
                last++;
                related_items[i] = last;
            }
            rs.close();
            related2.close();
            PreparedStatement related3 =(PreparedStatement)(Object) con.prepareStatement("DROP TABLE " + name);
            related3.executeUpdate();
            related3.close();
            PreparedStatement statement =(PreparedStatement)(Object) con.prepareStatement("UPDATE item SET i_cost = ?, i_image = ?, i_thumbnail = ?, i_pub_date = CURRENT_DATE(), " + " i_related1 = ?, i_related2 = ?, i_related3 = ?, i_related4 = ?, i_related5 = ? WHERE i_id = ?");
            statement.setDouble(1, cost);
            statement.setString(2, image);
            statement.setString(3, thumbnail);
            statement.setInt(4, related_items[0]);
            statement.setInt(5, related_items[1]);
            statement.setInt(6, related_items[2]);
            statement.setInt(7, related_items[3]);
            statement.setInt(8, related_items[4]);
            statement.setInt(9, i_id);
            statement.executeUpdate();
            con.commit();
            statement.close();
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
public int tmpAdmin;
}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setDouble(int o0, double o1){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
