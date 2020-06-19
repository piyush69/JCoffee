import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2464907 {
public MyHelperClass context;
	public MyHelperClass ConfigKeys;
	public MyHelperClass ParseDBDumpFile;
	public MyHelperClass SystemGlobals;
	public MyHelperClass logger;
	public MyHelperClass getFromSession(String o0){ return null; }

    private boolean importTablesData(Connection conn)  throws Throwable {
        try {
            boolean status = true;
            boolean autoCommit =(boolean)(Object) conn.getAutoCommit();
            conn.setAutoCommit(false);
            String dbType =(String)(Object) this.getFromSession("database");
            List statements =(List)(Object) ParseDBDumpFile.parse(SystemGlobals.getValue(ConfigKeys.CONFIG_DIR) + "/database/" + dbType + "/" + dbType + "_data_dump.sql");
            for (Iterator iter = statements.iterator(); iter.hasNext(); ) {
                String query = (String) iter.next();
                if (query == null || "".equals(query.trim())) {
                    continue;
                }
                query = query.trim();
                Statement s =(Statement)(Object) conn.createStatement();
                try {
                    if (query.startsWith("UPDATE") || query.startsWith("INSERT") || query.startsWith("SET")) {
                        s.executeUpdate(query);
                    } else if (query.startsWith("SELECT")) {
                        s.executeQuery(query);
                    } else {
                        throw new SQLException("Invalid query: " + query);
                    }
                } catch (SQLException ex) {
                    status = false;
                    conn.rollback();
                    logger.error("Error importing data for " + query + ": " + ex, ex);
                    this.context.put("exceptionMessage", ex.getMessage() + "\n" + query);
                    break;
                } finally {
                    s.close();
                }
            }
            conn.setAutoCommit(autoCommit);
            return status;
        } catch (Exception e) {
            throw new ForumException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONFIG_DIR;
public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass parse(String o0){ return null; }
	public MyHelperClass getValue(MyHelperClass o0){ return null; }}

class Connection {

public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ForumException extends Exception{
	public ForumException(String errorMessage) { super(errorMessage); }
}
