
import java.io.UncheckedIOException;


class c18192940 {
public static MyHelperClass updatePortafoglio(Connection o0, double o1, int o2, int o3){ return null; }
	public static MyHelperClass insertPortafoglio(Connection o0, int o1, double o2, int o3){ return null; }
//public MyHelperClass insertPortafoglio(Connection o0, int o1, double o2, int o3){ return null; }
//	public MyHelperClass updatePortafoglio(Connection o0, double o1, int o2, int o3){ return null; }

    public static void nuovoAcquisto(int quantita, Date d, double price, int id) throws SQLException {
        MyDBConnection c = new MyDBConnection();
        c.init();
        Connection conn =(Connection)(Object) c.getMyConnection();
        MyHelperClass insertAcquisto = new MyHelperClass();
        PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement(insertAcquisto);
        ps.setInt(1, quantita);
        ps.setDate(2, d);
        ps.setDouble(3, price);
        ps.setInt(4, id);
        ps.executeUpdate();
        double newPrice = price;
        int newQ = quantita;
        MyHelperClass queryPrezzo = new MyHelperClass();
        ResultSet rs =(ResultSet)(Object) MyDBConnection.executeQuery(queryPrezzo.replace("?", "" + id), conn);
        if ((boolean)(Object)rs.next()) {
            int oldQ =(int)(Object) rs.getInt(1);
            double oldPrice =(double)(Object) rs.getDouble(2);
            newQ = quantita + oldQ;
            newPrice = (oldPrice * oldQ + price * quantita) / newQ;
            updatePortafoglio(conn, newPrice, newQ, id);
        } else insertPortafoglio(conn, id, newPrice, newQ);
        try {
            conn.commit();
        } catch (UncheckedIOException e) {
            conn.rollback();
            throw new SQLException("Effettuato rollback dopo " + e.getMessage());
        } finally {
            c.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replace(String o0, String o1){ return null; }}

class Date {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class MyDBConnection {

public MyHelperClass getMyConnection(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass init(){ return null; }
	public static MyHelperClass executeQuery(MyHelperClass o0, Connection o1){ return null; }}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setDouble(int o0, double o1){ return null; }
	public MyHelperClass setDate(int o0, Date o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getDouble(int o0){ return null; }}
