import java.io.*;
import java.lang.*;
import java.util.*;



class c3021780 {

    private Integer getInt(String sequence) throws NoSuchSequenceException {
        Connection conn = null;
        PreparedStatement read = null;
        PreparedStatement write = null;
        boolean success = false;
        try {
            MyHelperClass ds = new MyHelperClass();
            conn =(Connection)(Object) ds.getConnection();
            conn.setTransactionIsolation(conn.TRANSACTION_REPEATABLE_READ);
            conn.setAutoCommit(false);
            MyHelperClass SELECT_SQL = new MyHelperClass();
            read =(PreparedStatement)(Object) conn.prepareStatement(SELECT_SQL);
            read.setString(1, sequence);
            ResultSet readRs =(ResultSet)(Object) read.executeQuery();
            if (!(Boolean)(Object)readRs.next()) {
                throw new NoSuchSequenceException();
            }
            int currentSequenceId =(int)(Object) readRs.getInt(1);
            int currentSequenceValue =(int)(Object) readRs.getInt(2);
            Integer currentSequenceValueInteger = new Integer(currentSequenceValue);
            MyHelperClass UPDATE_SQL = new MyHelperClass();
            write =(PreparedStatement)(Object) conn.prepareStatement(UPDATE_SQL);
            write.setInt(1, currentSequenceValue + 1);
            write.setInt(2, currentSequenceId);
            int rowsAffected =(int)(Object) write.executeUpdate();
            if (rowsAffected == 1) {
                success = true;
                return currentSequenceValueInteger;
            } else {
                MyHelperClass logger = new MyHelperClass();
                logger.error("Something strange has happened.  The row count was not 1, but was " + rowsAffected);
                return currentSequenceValueInteger;
            }
        } catch (UncheckedIOException sqle) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Table based id generation failed : ");
//            MyHelperClass logger = new MyHelperClass();
            logger.error(sqle.getMessage());
            return new Integer(0);
        } finally {
            if (read != null) {
                try {
                    read.close();
                } catch (Exception e) {
                }
            }
            if (write != null) {
                try {
                    write.close();
                } catch (Exception e) {
                }
            }
            if (conn != null) {
                try {
                    if (success) {
                        conn.commit();
                    } else {
                        conn.rollback();
                    }
                    conn.close();
                } catch (Exception e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class NoSuchSequenceException extends Exception{
	public NoSuchSequenceException(String errorMessage) { super(errorMessage); }
	NoSuchSequenceException(){}
}

class Connection {
public MyHelperClass TRANSACTION_REPEATABLE_READ;
public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass setTransactionIsolation(MyHelperClass o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
