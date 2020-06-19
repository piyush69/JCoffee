import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3177725 {
public MyHelperClass connection;
	public MyHelperClass instance;
	public MyHelperClass DriverManager;
	public MyHelperClass Platform;
	public MyHelperClass protocol;

    public  void DBAccess(String pathToDb)  throws Throwable {
        if (instance != null) {
            throw new IllegalStateException();
        }
        System.setProperty("derby.system.home", pathToDb);
        try {
            boolean exists = new File(pathToDb).exists();
            new EmbeddedDriver();
            Properties props = new Properties();
            if (exists) {
                connection = DriverManager.getConnection(protocol + "rmpDB;", props);
                connection.setAutoCommit(true);
                Statement statement =(Statement)(Object) connection.createStatement();
                try {
                } finally {
                    statement.close();
                }
            } else {
                connection = DriverManager.getConnection(protocol + "rmpDB;create=true", props);
                connection.setAutoCommit(true);
                URL url =(URL)(Object) Platform.getBundle("ru.spbu.dorms.geo.rmp").getResource("sql/createdb.sql");
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                StringBuilder query = new StringBuilder();
                for (String s = reader.readLine(); s != null; s = reader.readLine()) {
                    if (query.length() > 0) {
                        query.append('\n');
                    }
                    query.append(s);
                }
                reader.close();
                Statement statement =(Statement)(Object) connection.createStatement();
                try {
                    String[] statements = query.toString().split(";(\\s)*");
                    for (String s : statements) {
                        statement.execute(s);
                    }
                } finally {
                    statement.close();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        instance =(MyHelperClass)(Object) this;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(String o0, Properties o1){ return null; }
	public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass getBundle(String o0){ return null; }}

class EmbeddedDriver {

}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass execute(String o0){ return null; }}
