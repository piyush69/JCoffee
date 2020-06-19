


class c22411381 {
public MyHelperClass close(ResultSet o0){ return null; }
public MyHelperClass LogEntry;
	public MyHelperClass sqlImpl(){ return null; }

    public PTask stop(PTask task, SyrupConnection con) throws Exception {
        PreparedStatement s = null;
        ResultSet result = null;
        try {
            s =(PreparedStatement)(Object) con.prepareStatementFromCache(sqlImpl().sqlStatements().checkWorkerStatement());
            s.setString(1, task.key());
            result =(ResultSet)(Object) s.executeQuery();
            con.commit();
            if ((boolean)(Object)result.next()) {
                String url =(String)(Object) result.getString("worker");
                InputStream i = null;
                try {
                    Object b = new URL(url).getContent();
                    if (b instanceof InputStream) {
                        i = (InputStream) b;
                        byte[] bb = new byte[256];
                        int ll =(int)(Object) i.read(bb);
                        String k = new String(bb, 0, ll);
                        if (k.equals(task.key())) {
                            return task;
                        }
                    }
                } catch (Exception e) {
                } finally {
                    if (i != null) {
                        i.close();
                    }
                }
                PreparedStatement s2 = null;
                s2 =(PreparedStatement)(Object) con.prepareStatementFromCache(sqlImpl().sqlStatements().resetWorkerStatement());
                s2.setString(1, task.key());
                s2.executeUpdate();
                task =(PTask)(Object) sqlImpl().queryFunctions().readPTask(task.key(), con);
                sqlImpl().loggingFunctions().log(task.key(), LogEntry.STOPPED, con);
                con.commit();
            }
        } finally {
            con.rollback();
            close(result);
        }
        return task;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STOPPED;
public MyHelperClass sqlStatements(){ return null; }
	public MyHelperClass queryFunctions(){ return null; }
	public MyHelperClass log(MyHelperClass o0, MyHelperClass o1, SyrupConnection o2){ return null; }
	public MyHelperClass resetWorkerStatement(){ return null; }
	public MyHelperClass checkWorkerStatement(){ return null; }
	public MyHelperClass readPTask(MyHelperClass o0, SyrupConnection o1){ return null; }
	public MyHelperClass loggingFunctions(){ return null; }}

class PTask {

public MyHelperClass key(){ return null; }}

class SyrupConnection {

public MyHelperClass prepareStatementFromCache(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass getContent(){ return null; }}
