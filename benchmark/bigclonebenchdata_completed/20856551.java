import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20856551 {
public MyHelperClass customer_id;
	public MyHelperClass ResultSet;
	public MyHelperClass DB2SQLStatements;
	public MyHelperClass session;

    public synchronized void checkout() throws SQLException, InterruptedException {
        Connection con =(Connection)(Object) this.session.open();
        con.setAutoCommit(false);
        String sql_stmt =(String)(Object) DB2SQLStatements.shopping_cart_getAll(this.customer_id);
        Statement stmt =(Statement)(Object) con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet res =(ResultSet)(Object) stmt.executeQuery(sql_stmt);
        res.last();
        int rowcount =(int)(Object) res.getRow();
        res.beforeFirst();
        ShoppingCartItem[] resArray = new ShoppingCartItem[rowcount];
        int i = 0;
        while ((boolean)(Object)res.next()) {
            resArray[i] = new ShoppingCartItem();
            resArray[i].setCustomer_id(res.getInt("customer_id"));
            resArray[i].setDate_start(res.getDate("date_start"));
            resArray[i].setDate_stop(res.getDate("date_stop"));
            resArray[i].setRoom_type_id(res.getInt("room_type_id"));
            resArray[i].setNumtaken(res.getInt("numtaken"));
            resArray[i].setTotal_price(res.getInt("total_price"));
            i++;
        }
        this.wait(4000);
        try {
            for (int j = 0; j < rowcount; j++) {
                sql_stmt =(String)(Object) DB2SQLStatements.room_date_update(resArray[j]);
                stmt =(Statement)(Object) con.createStatement();
                stmt.executeUpdate(sql_stmt);
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            con.rollback();
        }
        for (int j = 0; j < rowcount; j++) {
            System.out.println(j);
            sql_stmt =(String)(Object) DB2SQLStatements.booked_insert(resArray[j], 2);
            stmt =(Statement)(Object) con.createStatement();
            stmt.executeUpdate(sql_stmt);
        }
        sql_stmt =(String)(Object) DB2SQLStatements.shopping_cart_deleteAll(this.customer_id);
        stmt =(Statement)(Object) con.createStatement();
        stmt.executeUpdate(sql_stmt);
        con.commit();
        this.session.close(con);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONCUR_READ_ONLY;
	public MyHelperClass TYPE_SCROLL_INSENSITIVE;
public MyHelperClass shopping_cart_getAll(MyHelperClass o0){ return null; }
	public MyHelperClass booked_insert(ShoppingCartItem o0, int o1){ return null; }
	public MyHelperClass shopping_cart_deleteAll(MyHelperClass o0){ return null; }
	public MyHelperClass open(){ return null; }
	public MyHelperClass room_date_update(ShoppingCartItem o0){ return null; }
	public MyHelperClass close(Connection o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(MyHelperClass o0, MyHelperClass o1){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass last(){ return null; }
	public MyHelperClass beforeFirst(){ return null; }
	public MyHelperClass getDate(String o0){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass getRow(){ return null; }}

class ShoppingCartItem {

public MyHelperClass setNumtaken(MyHelperClass o0){ return null; }
	public MyHelperClass setRoom_type_id(MyHelperClass o0){ return null; }
	public MyHelperClass setCustomer_id(MyHelperClass o0){ return null; }
	public MyHelperClass setTotal_price(MyHelperClass o0){ return null; }
	public MyHelperClass setDate_stop(MyHelperClass o0){ return null; }
	public MyHelperClass setDate_start(MyHelperClass o0){ return null; }}
