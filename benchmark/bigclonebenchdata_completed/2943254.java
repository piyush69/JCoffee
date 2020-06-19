


class c2943254 {
public MyHelperClass logger;

    public void saveDownloadFiles(List downloadFiles) throws SQLException {
        MyHelperClass AppLayerDatabase = new MyHelperClass();
        Connection conn =(Connection)(Object) AppLayerDatabase.getInstance().getPooledConnection();
        try {
            conn.setAutoCommit(false);
            Statement s =(Statement)(Object) conn.createStatement();
            s.executeUpdate("DELETE FROM DOWNLOADFILES");
            s.close();
            s = null;
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO DOWNLOADFILES " + "(name,targetpath,size,fnkey,enabled,state,downloadaddedtime,downloadstartedtime,downloadfinishedtime," + "retries,lastdownloadstoptime,gqid,filelistfilesha) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            for (Iterator i =(Iterator)(Object) downloadFiles.iterator();(boolean)(Object) i.hasNext(); ) {
                FrostDownloadItem dlItem = (FrostDownloadItem)(FrostDownloadItem)(Object) i.next();
                int ix = 1;
                ps.setString(ix++, dlItem.getFilename());
                ps.setString(ix++, dlItem.getTargetPath());
                ps.setLong(ix++,(int)(Object)(int[])(Object) (dlItem.getFileSize() == null ? 0 : dlItem.getFileSize().longValue()));
                ps.setString(ix++, dlItem.getKey());
                ps.setBoolean(ix++,(boolean)(Object)(boolean[])(Object) (dlItem.isEnabled() == null ? true : dlItem.isEnabled().booleanValue()));
                ps.setInt(ix++, dlItem.getState());
                ps.setLong(ix++,(int)(Object) dlItem.getDownloadAddedTime());
                ps.setLong(ix++,(int)(Object) dlItem.getDownloadStartedTime());
                ps.setLong(ix++,(int)(Object) dlItem.getDownloadFinishedTime());
                ps.setInt(ix++, dlItem.getRetries());
                ps.setLong(ix++,(int)(Object) dlItem.getLastDownloadStopTime());
                ps.setString(ix++, dlItem.getGqIdentifier());
                ps.setString(ix++, dlItem.getFileListFileObject() == null ? null : dlItem.getFileListFileObject().getSha());
                ps.executeUpdate();
            }
            ps.close();
            conn.commit();
            conn.setAutoCommit(true);
        } catch (Throwable t) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, "Exception during save", t);
            try {
                conn.rollback();
            } catch (Throwable t1) {
//                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.SEVERE, "Exception during rollback", t1);
            }
            try {
                conn.setAutoCommit(true);
            } catch (Throwable t1) {
            }
        } finally {
//            MyHelperClass AppLayerDatabase = new MyHelperClass();
            AppLayerDatabase.getInstance().givePooledConnection(conn);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getSha(){ return null; }
	public MyHelperClass getPooledConnection(){ return null; }
	public MyHelperClass givePooledConnection(Connection o0){ return null; }
	public MyHelperClass booleanValue(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Throwable o2){ return null; }
	public MyHelperClass longValue(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class List {

public MyHelperClass iterator(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setLong(int o0, int o1){ return null; }
	public MyHelperClass setBoolean(int o0, boolean o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, Object o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class FrostDownloadItem {

public MyHelperClass getFilename(){ return null; }
	public MyHelperClass getDownloadAddedTime(){ return null; }
	public MyHelperClass getTargetPath(){ return null; }
	public MyHelperClass isEnabled(){ return null; }
	public MyHelperClass getDownloadStartedTime(){ return null; }
	public MyHelperClass getDownloadFinishedTime(){ return null; }
	public MyHelperClass getLastDownloadStopTime(){ return null; }
	public MyHelperClass getFileListFileObject(){ return null; }
	public MyHelperClass getRetries(){ return null; }
	public MyHelperClass getGqIdentifier(){ return null; }
	public MyHelperClass getState(){ return null; }
	public MyHelperClass getKey(){ return null; }
	public MyHelperClass getFileSize(){ return null; }}
