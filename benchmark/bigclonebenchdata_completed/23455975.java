
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23455975 {
public MyHelperClass size(){ return null; }
	public MyHelperClass getName(){ return null; }
public MyHelperClass PoolManager;
	public MyHelperClass iterator(){ return null; }
public MyHelperClass logDebugEnabled;
	public MyHelperClass log;
	public MyHelperClass getId(){ return null; }

    public synchronized boolean storePipeline() {
        MyHelperClass logDebugEnabled = new MyHelperClass();
        if ((boolean)(Object)logDebugEnabled) log.debug("Storing pipeline " + this.getName() + " with " + this.size() + " elements");
        boolean retVal = false;
        Connection conn = null;
        try {
            MyHelperClass JukeXTrackStore = new MyHelperClass();
            conn =(Connection)(Object) PoolManager.getInstance().getConnection(JukeXTrackStore.DB_NAME);
            conn.setAutoCommit(false);
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement("DELETE from PipelineBlackboard where pipelineid=" + this.getId());
            int rowCount =(int)(Object) ps.executeUpdate();
            if ((boolean)(Object)logDebugEnabled) log.debug("Removed old data (" + rowCount + " rows)");
            TrackSourcePipelineElement pe = null;
            Iterator i =(Iterator)(Object) this.iterator();
            while ((boolean)(Object)i.hasNext()) {
                pe = (TrackSourcePipelineElement)(TrackSourcePipelineElement)(Object) i.next();
                retVal =(boolean)(Object) pe.storeState(conn);
                if (!retVal) {
                    break;
                }
            }
            if (retVal) {
                conn.commit();
            } else {
                conn.rollback();
            }
            conn.setAutoCommit(true);
        } catch (UncheckedIOException se) {
            try {
                conn.rollback();
            } catch (UncheckedIOException ignore) {
            }
            log.error("Encountered an exception whilst storing the configuration for a pipeline element");
        } finally {
            try {
                conn.close();
            } catch (UncheckedIOException ignore) {
            }
        }
        return retVal;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DB_NAME;
public MyHelperClass getConnection(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }}

class TrackSourcePipelineElement {

public MyHelperClass storeState(Connection o0){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
