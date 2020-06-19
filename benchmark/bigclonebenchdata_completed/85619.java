
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c85619 {
public MyHelperClass con;
	public MyHelperClass delUserStocks(String o0, String o1){ return null; }
	public MyHelperClass getUser(String o0){ return null; }

    public void delUser(User user) throws SQLException, IOException, ClassNotFoundException {
        String dbUserID;
        String stockSymbol;
        MyHelperClass con = new MyHelperClass();
        Statement stmt =(Statement)(Object) con.createStatement();
        try {
//            MyHelperClass con = new MyHelperClass();
            con.setAutoCommit(false);
            dbUserID =(String)(Object) user.getUserID();
            if (getUser(dbUserID) != null) {
                ResultSet rs1 =(ResultSet)(Object) stmt.executeQuery("SELECT userID, symbol " + "FROM UserStocks WHERE userID = '" + dbUserID + "'");
                while ((boolean)(Object)rs1.next()) {
                    try {
                        stockSymbol =(String)(Object) rs1.getString("symbol");
                        delUserStocks(dbUserID, stockSymbol);
                    } catch (UncheckedIOException ex) {
                        throw new SQLException("Deletion of user stock holding failed: " + ex.getMessage());
                    }
                }
                try {
                    stmt.executeUpdate("DELETE FROM Users WHERE " + "userID = '" + dbUserID + "'");
                } catch (UncheckedIOException ex) {
                    throw new SQLException("User deletion failed: " + ex.getMessage());
                }
            } else throw new IOException("User not found in database - cannot delete.");
            try {
                con.commit();
            } catch (UncheckedIOException ex) {
                throw new SQLException("Transaction commit failed: " + ex.getMessage());
            }
        } catch (SQLException ex) {
            try {
                con.rollback();
            } catch (UncheckedIOException sqx) {
                throw new SQLException("Transaction failed then rollback failed: " + sqx.getMessage());
            }
            throw new SQLException("Transaction failed; was rolled back: " + ex.getMessage());
        }
        stmt.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class User {

public MyHelperClass getUserID(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getString(String o0){ return null; }}
