
import java.io.UncheckedIOException;


class c7296597 {
public MyHelperClass close(Connection o0, Statement o1, Object o2, boolean o3){ return null; }
public MyHelperClass Level;
	public MyHelperClass LOGGER;
	public MyHelperClass createConnection(){ return null; }
	public MyHelperClass getRenderer(){ return null; }

    public void create() {
        MyHelperClass OrmHandler = new MyHelperClass();
        Connection conn =(Connection)(Object) OrmHandler.getInstance().getSession().getConnection(this);
        Statement stat = null;
        StringBuilder sql = new StringBuilder(256);
        try {
            getRenderer().printCreateDatabase(this, sql);
            conn =(Connection)(Object) createConnection();
            stat =(Statement)(Object) conn.createStatement();
            stat.executeUpdate(sql.toString());
            conn.commit();
            if ((boolean)(Object)LOGGER.isLoggable(Level.INFO)) {
                LOGGER.info(sql.toString());
            }
        } catch (Throwable e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (UncheckedIOException ex) {
                    LOGGER.log(Level.WARNING, "Can't rollback DB" + toString(),(IllegalStateException)(Object) ex);
                }
            }
            throw new IllegalArgumentException("Statement error:\n" + sql, e);
        } finally {
            try {
                close(conn, stat, null, true);
            } catch (IllegalStateException ex) {
                LOGGER.log(Level.WARNING, "Can't rollback DB" + toString(), ex);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
	public MyHelperClass WARNING;
public MyHelperClass log(MyHelperClass o0, String o1, IllegalStateException o2){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getConnection(c7296597 o0){ return null; }
	public MyHelperClass getSession(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass printCreateDatabase(c7296597 o0, StringBuilder o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, SQLException o2){ return null; }
	public MyHelperClass isLoggable(MyHelperClass o0){ return null; }}

class Connection {

public MyHelperClass createStatement(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
