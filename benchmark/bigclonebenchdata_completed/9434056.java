
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9434056 {
public MyHelperClass s_compostionCache;
public MyHelperClass getDeleteSql(MyHelperClass o0){ return null; }

//        @Override
        void execute(Connection conn, Component parent, String context, ProgressMonitor progressBar, ProgressWrapper progressWrapper) throws Exception {
            Statement statement = null;
            try {
                conn.setAutoCommit(false);
                statement =(Statement)(Object) conn.createStatement();
                MyHelperClass m_compositionId = new MyHelperClass();
                String deleteSql =(String)(Object) getDeleteSql(m_compositionId);
                statement.executeUpdate(deleteSql);
                conn.commit();
//                MyHelperClass m_compositionId = new MyHelperClass();
                s_compostionCache.delete(new Integer((int)(Object)m_compositionId));
            } catch (UncheckedIOException ex) {
                try {
                    conn.rollback();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
                throw ex;
            } finally {
                if (statement != null) {
                    statement.close();
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass delete(Integer o0){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Component {

}

class ProgressMonitor {

}

class ProgressWrapper {

}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
