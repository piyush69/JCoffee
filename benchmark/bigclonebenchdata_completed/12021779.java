import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12021779 {
public MyHelperClass Object;
public MyHelperClass defaultInterval;
	public MyHelperClass INS_NEXT_KEY;
	public MyHelperClass INS_NAME;
	public MyHelperClass INSERT_SEQ;
	public MyHelperClass nextSeed;
	public MyHelperClass nextId;
	public MyHelperClass INS_UPDATE;
	public MyHelperClass INS_INTERVAL;
	public MyHelperClass interval;
	public MyHelperClass dataSourceName;
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass getName(){ return null; }

    private void insert() throws Throwable, SQLException, NamingException {
        Logger logger =(Logger)(Object) getLogger();
        if ((boolean)(Object)logger.isDebugEnabled()) {
            logger.debug("enter - " + getClass().getName() + ".insert()");
        }
        try {
            if ((boolean)(Object)logger.isInfoEnabled()) {
                logger.info("insert(): Create new sequencer record for " + getName());
            }
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try {
                InitialContext ctx = new InitialContext();
                DataSource ds = (DataSource)(DataSource)(Object) ctx.lookup(dataSourceName);
                conn =(Connection)(Object) ds.getConnection();
                conn.setReadOnly(false);
                stmt =(PreparedStatement)(Object) conn.prepareStatement(INSERT_SEQ);
                stmt.setString(INS_NAME, getName());
                stmt.setLong(INS_NEXT_KEY,(int)(Object) defaultInterval * 2);
                stmt.setLong(INS_INTERVAL, defaultInterval);
                stmt.setLong(INS_UPDATE, System.currentTimeMillis());
                try {
                    if ((int)(Object)stmt.executeUpdate() != 1) {
                        nextId =(MyHelperClass)(Object)(long)(Object)(MyHelperClass)(Object)(long)(Object)(MyHelperClass)(Object)(long)(Object)(MyHelperClass)(Object)(long)(Object)(MyHelperClass)(Object) -1L;
                        logger.warn("insert(): Failed to create sequencer entry for " + getName() + " (no error message)");
                    } else if ((boolean)(Object)logger.isInfoEnabled()) {
                        nextId = defaultInterval;
                        nextSeed =(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) defaultInterval * 2;
                        interval = defaultInterval;
                        logger.info("insert(): First ID will be " + nextId);
                    }
                } catch (SQLException e) {
                    logger.warn("insert(): Error inserting row into database, possible concurrency issue: " + e.getMessage());
                    if ((boolean)(Object)logger.isDebugEnabled()) {
                        e.printStackTrace();
                    }
                    nextId =(MyHelperClass)(Object)(long)(Object)(MyHelperClass)(Object)(long)(Object)(MyHelperClass)(Object)(long)(Object)(MyHelperClass)(Object)(long)(Object)(MyHelperClass)(Object) -1L;
                }
                if (!(Boolean)(Object)conn.getAutoCommit()) {
                    conn.commit();
                }
            } finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException ignore) {
                    }
                }
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException ignore) {
                    }
                }
                if (conn != null) {
                    if (!(Boolean)(Object)conn.getAutoCommit()) {
                        try {
                            conn.rollback();
                        } catch (SQLException ignore) {
                        }
                    }
                    try {
                        conn.close();
                    } catch (SQLException ignore) {
                    }
                }
            }
        } finally {
            if ((boolean)(Object)logger.isDebugEnabled()) {
                logger.debug("exit - " + getClass().getName() + ".insert()");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class NamingException extends Exception{
	public NamingException(String errorMessage) { super(errorMessage); }
}

class Logger {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass isInfoEnabled(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setReadOnly(boolean o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass setLong(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setLong(MyHelperClass o0, long o1){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }}

class InitialContext {

public MyHelperClass lookup(MyHelperClass o0){ return null; }}

class DataSource {

public MyHelperClass getConnection(){ return null; }}
