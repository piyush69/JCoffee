import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19127300 {
public MyHelperClass timeKeeper;
	public MyHelperClass queryContext;
	public MyHelperClass customMatcher;
	public MyHelperClass inMemMaster;
	public MyHelperClass thePreparedStatementSQL;
	public MyHelperClass RowStatusHelper;
	public MyHelperClass getLastRowIdInResultTable(long o0, int o1){ return null; }

    public QueryOutput run() throws Throwable, Exception {
        boolean success = false;
        QueryOutput output = null;
        MyHelperClass correlator = new MyHelperClass();
        if (correlator != null || inMemMaster != null || customMatcher != null) {
            MyHelperClass inMemMaster = new MyHelperClass();
            List<Object[]> rows = inMemMaster == null ? (correlator == null ? customMatcher.onCycleEnd() : correlator.onCycleEnd()) : inMemMaster.onCycleEnd();
            if (rows.isEmpty()) {
                success = true;
                return null;
            }
            output =(QueryOutput)(Object) new DirectQueryOutput(rows);
        } else {
            MyHelperClass connection = new MyHelperClass();
            connection = queryContext.createConnection();
            try {
//                MyHelperClass connection = new MyHelperClass();
                connection.setAutoCommit(false);
                MyHelperClass Connection = new MyHelperClass();
                connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
                MyHelperClass thePreparedStatement = new MyHelperClass();
                thePreparedStatement = connection.prepareStatement(thePreparedStatementSQL);
                MyHelperClass statusAndPositions = new MyHelperClass();
                RowStatusHelper.setStatusValues(statusAndPositions, thePreparedStatement, queryContext.getRunCount());
                MyHelperClass lastRowIdInsertedNow = new MyHelperClass();
                long newResultIdsAfter =(long)(Object) lastRowIdInsertedNow;
//                MyHelperClass thePreparedStatement = new MyHelperClass();
                int rows =(int)(Object) thePreparedStatement.executeUpdate();
                if (rows <= 0) {
                    success = true;
                    return null;
                }
//                MyHelperClass lastRowIdInsertedNow = new MyHelperClass();
                lastRowIdInsertedNow = getLastRowIdInResultTable(newResultIdsAfter, rows);
//                MyHelperClass lastRowIdInsertedNow = new MyHelperClass();
                output =(QueryOutput)(Object) new DBQueryOutput(newResultIdsAfter, lastRowIdInsertedNow, rows, timeKeeper.getTimeMsecs());
                success = true;
            } finally {
//                MyHelperClass connection = new MyHelperClass();
                if (connection != null) {
                    if (success) {
//                        MyHelperClass connection = new MyHelperClass();
                        connection.commit();
                    } else {
//                        MyHelperClass connection = new MyHelperClass();
                        connection.rollback();
                    }
                }
            }
        }
        return output;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TRANSACTION_READ_UNCOMMITTED;
public MyHelperClass setStatusValues(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass onCycleEnd(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass createConnection(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass getRunCount(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setTransactionIsolation(MyHelperClass o0){ return null; }
	public MyHelperClass getTimeMsecs(){ return null; }}

class QueryOutput {

}

class DirectQueryOutput {

DirectQueryOutput(List<Object[]> o0){}
	DirectQueryOutput(){}}

class DBQueryOutput {

DBQueryOutput(){}
	DBQueryOutput(long o0, MyHelperClass o1, int o2, MyHelperClass o3){}}
