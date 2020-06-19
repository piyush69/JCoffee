
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c659091 {

    public static void main(String args[]) {
        String url = "jdbc:mySubprotocol:myDataSource";
        Connection con = null;
        Statement stmt;
        PreparedStatement updateSales;
        PreparedStatement updateTotal;
        String updateString = "update COFFEES " + "set SALES = ? where COF_NAME = ?";
        String updateStatement = "update COFFEES " + "set TOTAL = TOTAL + ? where COF_NAME = ?";
        String query = "select COF_NAME, SALES, TOTAL from COFFEES";
        try {
            Class.forName("myDriver.ClassName");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }
        try {
            MyHelperClass DriverManager = new MyHelperClass();
            con =(Connection)(Object) DriverManager.getConnection(url, "myLogin", "myPassword");
            updateSales =(PreparedStatement)(Object) con.prepareStatement(updateString);
            updateTotal =(PreparedStatement)(Object) con.prepareStatement(updateStatement);
            int[] salesForWeek = { 175, 150, 60, 155, 90 };
            String[] coffees = { "Colombian", "French_Roast", "Espresso", "Colombian_Decaf", "French_Roast_Decaf" };
            int len = coffees.length;
            con.setAutoCommit(false);
            for (int i = 0; i < len; i++) {
                updateSales.setInt(1, salesForWeek[i]);
                updateSales.setString(2, coffees[i]);
                updateSales.executeUpdate();
                updateTotal.setInt(1, salesForWeek[i]);
                updateTotal.setString(2, coffees[i]);
                updateTotal.executeUpdate();
                con.commit();
            }
            con.setAutoCommit(true);
            updateSales.close();
            updateTotal.close();
            stmt =(Statement)(Object) con.createStatement();
            ResultSet rs =(ResultSet)(Object) stmt.executeQuery(query);
            while ((boolean)(Object)rs.next()) {
                String c =(String)(Object) rs.getString("COF_NAME");
                int s =(int)(Object) rs.getInt("SALES");
                int t =(int)(Object) rs.getInt("TOTAL");
                System.out.println(c + "     " + s + "    " + t);
            }
            stmt.close();
            con.close();
        } catch (UncheckedIOException ex) {
            System.err.println("SQLException: " + ex.getMessage());
            if (con != null) {
                try {
                    System.err.print("Transaction is being ");
                    System.err.println("rolled back");
                    con.rollback();
                } catch (UncheckedIOException excep) {
                    System.err.print("SQLException: ");
                    System.err.println(excep.getMessage());
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(String o0, String o1, String o2){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
