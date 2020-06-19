
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3767762 {
public MyHelperClass log;
	public MyHelperClass getConnection(){ return null; }

//    @Override
    public int deleteStatement(String sql) {
        Statement statement = null;
        try {
            statement =(Statement)(Object) getConnection().createStatement();
            int result =(int)(Object) statement.executeUpdate(sql.toString());
            if (result == 0) log.warn(sql + " result row count is 0");
            getConnection().commit();
            return result;
        } catch (UncheckedIOException e) {
            try {
                getConnection().rollback();
            } catch (UncheckedIOException e1) {
                log.error(e1.getMessage(),(SQLException)(Object) e1);
            }
            log.error(e.getMessage(),(SQLException)(Object) e);
            throw new RuntimeException();
        } finally {
            try {
                statement.close();
                getConnection().close();
            } catch (UncheckedIOException e) {
                log.error(e.getMessage(),(SQLException)(Object) e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
