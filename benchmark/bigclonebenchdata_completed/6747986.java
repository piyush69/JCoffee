


class c6747986 {
public MyHelperClass logger;

    public void saveUploadFiles(List uploadFiles) throws SQLException {
        MyHelperClass AppLayerDatabase = new MyHelperClass();
        Connection conn =(Connection)(Object) AppLayerDatabase.getInstance().getPooledConnection();
        try {
            conn.setAutoCommit(false);
            Statement s =(Statement)(Object) conn.createStatement();
            s.executeUpdate("DELETE FROM UPLOADFILES");
            s.close();
            s = null;
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO UPLOADFILES (" + "path,size,fnkey,enabled,state," + "uploadaddedtime,uploadstartedtime,uploadfinishedtime,retries,lastuploadstoptime,gqid," + "sharedfilessha) " + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            for (Iterator i =(Iterator)(Object) uploadFiles.iterator();(boolean)(Object) i.hasNext(); ) {
                FrostUploadItem ulItem = (FrostUploadItem)(FrostUploadItem)(Object) i.next();
                int ix = 1;
                ps.setString(ix++, ulItem.getFile().getPath());
                ps.setLong(ix++, ulItem.getFileSize());
                ps.setString(ix++, ulItem.getKey());
                ps.setBoolean(ix++,(boolean)(Object)(boolean[])(Object) (ulItem.isEnabled() == null ? true : ulItem.isEnabled().booleanValue()));
                ps.setInt(ix++, ulItem.getState());
                ps.setLong(ix++, ulItem.getUploadAddedMillis());
                ps.setLong(ix++, ulItem.getUploadStartedMillis());
                ps.setLong(ix++, ulItem.getUploadFinishedMillis());
                ps.setInt(ix++, ulItem.getRetries());
                ps.setLong(ix++, ulItem.getLastUploadStopTimeMillis());
                ps.setString(ix++, ulItem.getGqIdentifier());
                ps.setString(ix++, (ulItem.getSharedFileItem() == null ? null : ulItem.getSharedFileItem().getSha()));
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
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Throwable o2){ return null; }
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

public MyHelperClass setBoolean(int o0, boolean o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, Object o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class FrostUploadItem {

public MyHelperClass getUploadAddedMillis(){ return null; }
	public MyHelperClass isEnabled(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getUploadStartedMillis(){ return null; }
	public MyHelperClass getUploadFinishedMillis(){ return null; }
	public MyHelperClass getState(){ return null; }
	public MyHelperClass getRetries(){ return null; }
	public MyHelperClass getKey(){ return null; }
	public MyHelperClass getLastUploadStopTimeMillis(){ return null; }
	public MyHelperClass getGqIdentifier(){ return null; }
	public MyHelperClass getSharedFileItem(){ return null; }
	public MyHelperClass getFileSize(){ return null; }}
