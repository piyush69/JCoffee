
import java.io.UncheckedIOException;


class c12768281 {
public MyHelperClass Conn;
	public MyHelperClass pstmt3;
	public MyHelperClass transactions;
	public MyHelperClass prepared_stmt;
	public MyHelperClass verbose;
	public MyHelperClass pstmt4;
	public MyHelperClass pstmt2;
	public MyHelperClass pstmt1;
	public MyHelperClass pstmt5;
	public MyHelperClass incrementFailedTransactionCount(){ return null; }

        int doOne(int bid, int tid, int aid, int delta) {
            int aBalance = 0;
            MyHelperClass Conn = new MyHelperClass();
            if (Conn == null) {
                incrementFailedTransactionCount();
                return 0;
            }
            try {
                if ((boolean)(Object)prepared_stmt) {
                    pstmt1.setInt(1, delta);
                    pstmt1.setInt(2, aid);
                    pstmt1.executeUpdate();
                    pstmt1.clearWarnings();
                    pstmt2.setInt(1, aid);
                    ResultSet RS =(ResultSet)(Object) pstmt2.executeQuery();
                    pstmt2.clearWarnings();
                    while ((boolean)(Object)RS.next()) {
                        aBalance =(int)(Object) RS.getInt(1);
                    }
                    pstmt3.setInt(1, delta);
                    pstmt3.setInt(2, tid);
                    pstmt3.executeUpdate();
                    pstmt3.clearWarnings();
                    pstmt4.setInt(1, delta);
                    pstmt4.setInt(2, bid);
                    pstmt4.executeUpdate();
                    pstmt4.clearWarnings();
                    pstmt5.setInt(1, tid);
                    pstmt5.setInt(2, bid);
                    pstmt5.setInt(3, aid);
                    pstmt5.setInt(4, delta);
                    pstmt5.executeUpdate();
                    pstmt5.clearWarnings();
                } else {
                    Statement Stmt =(Statement)(Object) Conn.createStatement();
                    String Query = "UPDATE accounts ";
                    Query += "SET     Abalance = Abalance + " + delta + " ";
                    Query += "WHERE   Aid = " + aid;
                    int res =(int)(Object) Stmt.executeUpdate(Query);
                    Stmt.clearWarnings();
                    Query = "SELECT Abalance ";
                    Query += "FROM   accounts ";
                    Query += "WHERE  Aid = " + aid;
                    ResultSet RS =(ResultSet)(Object) Stmt.executeQuery(Query);
                    Stmt.clearWarnings();
                    while ((boolean)(Object)RS.next()) {
                        aBalance =(int)(Object) RS.getInt(1);
                    }
                    Query = "UPDATE tellers ";
                    Query += "SET    Tbalance = Tbalance + " + delta + " ";
                    Query += "WHERE  Tid = " + tid;
                    Stmt.executeUpdate(Query);
                    Stmt.clearWarnings();
                    Query = "UPDATE branches ";
                    Query += "SET    Bbalance = Bbalance + " + delta + " ";
                    Query += "WHERE  Bid = " + bid;
                    Stmt.executeUpdate(Query);
                    Stmt.clearWarnings();
                    Query = "INSERT INTO history(Tid, Bid, Aid, delta) ";
                    Query += "VALUES (";
                    Query += tid + ",";
                    Query += bid + ",";
                    Query += aid + ",";
                    Query += delta + ")";
                    Stmt.executeUpdate(Query);
                    Stmt.clearWarnings();
                    Stmt.close();
                }
                if ((boolean)(Object)transactions) {
                    Conn.commit();
                }
                return aBalance;
            } catch (Exception E) {
                if ((boolean)(Object)verbose) {
                    System.out.println("Transaction failed: " + E.getMessage());
                    E.printStackTrace();
                }
                incrementFailedTransactionCount();
                if ((boolean)(Object)transactions) {
                    try {
                        Conn.rollback();
                    } catch (UncheckedIOException E1) {
                    }
                }
            }
            return 0;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass clearWarnings(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class Statement {

public MyHelperClass clearWarnings(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
