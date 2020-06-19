


class c15495362 {
public MyHelperClass FileLogger;

    public int batchTransactionUpdate(List queryStrLisyt, Connection con) throws Exception {
        int ret = 0;
        Statement stmt;
        if (con != null) {
            con.setAutoCommit(false);
            stmt =(Statement)(Object) con.createStatement();
            try {
                stmt.executeUpdate("START TRANSACTION;");
                for (int i = 0; i < (int)(Object)queryStrLisyt.size(); i++) {
                    stmt.addBatch(queryStrLisyt.get(i));
                }
                int[] updateCounts =(int[])(Object) stmt.executeBatch();
                for (int i = 0; i < updateCounts.length; i++) {
                    MyHelperClass Statement = new MyHelperClass();
                    FileLogger.debug("batch update result:" + updateCounts[i] + ", Statement.SUCCESS_NO_INFO" + Statement.SUCCESS_NO_INFO);
//                    MyHelperClass Statement = new MyHelperClass();
                    if (updateCounts[i] == (int)(Object)Statement.SUCCESS_NO_INFO || updateCounts[i] > 0) {
                        ret++;
//                    MyHelperClass Statement = new MyHelperClass();
                    } else if (updateCounts[i] == (int)(Object)Statement.EXECUTE_FAILED) ;
                    {
                        throw new Exception("query failed, while process batch update");
                    }
                }
                con.commit();
            } catch (Exception e) {
                ret = 0;
                MyHelperClass FileLogger = new MyHelperClass();
                FileLogger.debug(e.getMessage());
                con.rollback();
            } finally {
                con.setAutoCommit(true);
                stmt.close();
            }
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SUCCESS_NO_INFO;
	public MyHelperClass EXECUTE_FAILED;
public MyHelperClass debug(String o0){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeBatch(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass addBatch(MyHelperClass o0){ return null; }}
