
import java.io.UncheckedIOException;


class c1586662 {

    int doOne(int bid, int tid, int aid, int delta) {
        int aBalance = 0;
        MyHelperClass Conn = new MyHelperClass();
        if (Conn == null) {
            MyHelperClass bench = new MyHelperClass();
            bench.incrementFailedTransactionCount();
            return 0;
        }
        try {
            MyHelperClass Benchmark = new MyHelperClass();
            if ((boolean)(Object)Benchmark.prepared_stmt) {
                MyHelperClass pstmt1 = new MyHelperClass();
                pstmt1.setInt(1, delta);
//                MyHelperClass pstmt1 = new MyHelperClass();
                pstmt1.setInt(2, aid);
//                MyHelperClass pstmt1 = new MyHelperClass();
                pstmt1.executeUpdate();
//                MyHelperClass pstmt1 = new MyHelperClass();
                pstmt1.clearWarnings();
                MyHelperClass pstmt2 = new MyHelperClass();
                pstmt2.setInt(1, aid);
//                MyHelperClass pstmt2 = new MyHelperClass();
                ResultSet RS =(ResultSet)(Object) pstmt2.executeQuery();
//                MyHelperClass pstmt2 = new MyHelperClass();
                pstmt2.clearWarnings();
                while ((boolean)(Object)RS.next()) {
                    aBalance =(int)(Object) RS.getInt(1);
                }
                MyHelperClass pstmt3 = new MyHelperClass();
                pstmt3.setInt(1, delta);
//                MyHelperClass pstmt3 = new MyHelperClass();
                pstmt3.setInt(2, tid);
//                MyHelperClass pstmt3 = new MyHelperClass();
                pstmt3.executeUpdate();
//                MyHelperClass pstmt3 = new MyHelperClass();
                pstmt3.clearWarnings();
                MyHelperClass pstmt4 = new MyHelperClass();
                pstmt4.setInt(1, delta);
//                MyHelperClass pstmt4 = new MyHelperClass();
                pstmt4.setInt(2, bid);
//                MyHelperClass pstmt4 = new MyHelperClass();
                pstmt4.executeUpdate();
//                MyHelperClass pstmt4 = new MyHelperClass();
                pstmt4.clearWarnings();
                MyHelperClass pstmt5 = new MyHelperClass();
                pstmt5.setInt(1, tid);
//                MyHelperClass pstmt5 = new MyHelperClass();
                pstmt5.setInt(2, bid);
//                MyHelperClass pstmt5 = new MyHelperClass();
                pstmt5.setInt(3, aid);
//                MyHelperClass pstmt5 = new MyHelperClass();
                pstmt5.setInt(4, delta);
//                MyHelperClass pstmt5 = new MyHelperClass();
                pstmt5.executeUpdate();
//                MyHelperClass pstmt5 = new MyHelperClass();
                pstmt5.clearWarnings();
            } else {
//                MyHelperClass Conn = new MyHelperClass();
                Statement Stmt =(Statement)(Object) Conn.createStatement();
                String Query = "UPDATE accounts";
                Query += " SET Abalance = Abalance + " + delta;
                Query += " WHERE Aid = " + aid;
                int res =(int)(Object) Stmt.executeUpdate(Query);
                Stmt.clearWarnings();
                Query = "SELECT Abalance";
                Query += " FROM accounts";
                Query += " WHERE Aid = " + aid;
                ResultSet RS =(ResultSet)(Object) Stmt.executeQuery(Query);
                Stmt.clearWarnings();
                while ((boolean)(Object)RS.next()) {
                    aBalance =(int)(Object) RS.getInt(1);
                }
                Query = "UPDATE tellers";
                Query += " SET Tbalance = Tbalance + " + delta;
                Query += " WHERE Tid = " + tid;
                Stmt.executeUpdate(Query);
                Stmt.clearWarnings();
                Query = "UPDATE branches";
                Query += " SET Bbalance = Bbalance + " + delta;
                Query += " WHERE Bid = " + bid;
                Stmt.executeUpdate(Query);
                Stmt.clearWarnings();
                Query = "INSERT INTO history(Tid, Bid, Aid, delta)";
                Query += " VALUES (";
                Query += tid + ",";
                Query += bid + ",";
                Query += aid + ",";
                Query += delta + ")";
                Stmt.executeUpdate(Query);
                Stmt.clearWarnings();
                Stmt.close();
            }
//            MyHelperClass Benchmark = new MyHelperClass();
            if ((boolean)(Object)Benchmark.transactions) {
//                MyHelperClass Conn = new MyHelperClass();
                Conn.commit();
            }
            return aBalance;
        } catch (java.lang.Exception e) {
            MyHelperClass Benchmark = new MyHelperClass();
            if ((boolean)(Object)Benchmark.verbose) {
                System.out.println("Transaction failed: " + e.getMessage());
                e.printStackTrace();
            }
            MyHelperClass bench = new MyHelperClass();
            bench.incrementFailedTransactionCount();
//            MyHelperClass Benchmark = new MyHelperClass();
            if ((boolean)(Object)Benchmark.transactions) {
                try {
//                    MyHelperClass Conn = new MyHelperClass();
                    Conn.rollback();
                } catch (UncheckedIOException e1) {
                }
            }
        }
        return 0;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass transactions;
	public MyHelperClass prepared_stmt;
	public MyHelperClass verbose;
public MyHelperClass clearWarnings(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass incrementFailedTransactionCount(){ return null; }
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
