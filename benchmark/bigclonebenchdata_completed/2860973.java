import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2860973 {
public MyHelperClass NULL;
public MyHelperClass explainQuery(Connection o0, String o1){ return null; }
	public MyHelperClass descQuery(Connection o0, String o1){ return null; }
public MyHelperClass action;
	public MyHelperClass updateCount;
	public MyHelperClass ide;
	public MyHelperClass stmt;
	public MyHelperClass result;
	public MyHelperClass resultsAvailable;
	public MyHelperClass cleanUp(){ return null; }

    public void executeQuery(Connection connection, String query)  throws Throwable {
        MyHelperClass action = new MyHelperClass();
        action = null;
        int updateCount =(int)(Object) NULL; //new int();
        updateCount = 0;
        boolean resultsAvailable =(boolean)(Object) NULL; //new boolean();
        resultsAvailable = false;
        boolean metaAvailable =(boolean)(Object) NULL; //new boolean();
        metaAvailable = false;
        boolean planAvailable =(boolean)(Object) NULL; //new boolean();
        planAvailable = false;
        if (connection == null) {
            MyHelperClass ide = new MyHelperClass();
            ide.setStatus("not connected");
            return;
        }
        cleanUp();
        try {
            ide.setStatus("Executing query");
            stmt = connection.createStatement();
            if (query.toLowerCase().startsWith("select")) {
                result = stmt.executeQuery(query);
                resultsAvailable =(boolean)(Object)(MyHelperClass)(Object) true;
                action =(MyHelperClass)(Object) "select";
            } else if (query.toLowerCase().startsWith("update")) {
                updateCount =(int)(Object) stmt.executeUpdate(query);
                action =(MyHelperClass)(Object) "update";
            } else if (query.toLowerCase().startsWith("delete")) {
                updateCount =(int)(Object) stmt.executeUpdate(query);
                action =(MyHelperClass)(Object) "delete";
            } else if (query.toLowerCase().startsWith("insert")) {
                updateCount =(int)(Object) stmt.executeUpdate(query);
                action =(MyHelperClass)(Object) "insert";
            } else if (query.toLowerCase().startsWith("commit")) {
                connection.commit();
                action =(MyHelperClass)(Object) "commit";
            } else if (query.toLowerCase().startsWith("rollback")) {
                connection.rollback();
                action =(MyHelperClass)(Object) "rollback";
            } else if (query.toLowerCase().startsWith("create")) {
                updateCount =(int)(Object) stmt.executeUpdate(query);
                action =(MyHelperClass)(Object) "create";
            } else if (query.toLowerCase().startsWith("drop")) {
                updateCount =(int)(Object) stmt.executeUpdate(query);
                action =(MyHelperClass)(Object) "drop";
            } else if (query.toLowerCase().startsWith("desc ")) {
                String objectName = query.substring(query.indexOf(' '), query.length());
                query = "select * from (" + objectName + ") where rownum < 1";
                descQuery(connection, query);
            } else if (query.toLowerCase().startsWith("explain plan for ")) {
                explainQuery(connection, query);
            } else {
                result = stmt.executeQuery(query);
                resultsAvailable =(boolean)(Object)(MyHelperClass)(Object) true;
                action =(MyHelperClass)(Object) "select";
            }
            ide.setStatus("executed query");
        } catch (Exception e) {
            ide.setStatus(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setStatus(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class Connection {

public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }}
