


class c10315160 {
public MyHelperClass logger;

    public void saveSharedFiles(List sfFiles) throws SQLException {
        MyHelperClass AppLayerDatabase = new MyHelperClass();
        Connection conn =(Connection)(Object) AppLayerDatabase.getInstance().getPooledConnection();
        try {
            conn.setAutoCommit(false);
            Statement s =(Statement)(Object) conn.createStatement();
            s.executeUpdate("DELETE FROM SHAREDFILES");
            s.close();
            s = null;
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO SHAREDFILES (" + "path,size,fnkey,sha,owner,comment,rating,keywords," + "lastuploaded,uploadcount,reflastsent,requestlastreceived,requestsreceivedcount,lastmodified) " + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            for (Iterator i =(Iterator)(Object) sfFiles.iterator();(boolean)(Object) i.hasNext(); ) {
                FrostSharedFileItem sfItem =(FrostSharedFileItem)(Object) i.next();
                int ix = 1;
                ps.setString(ix++, sfItem.getFile().getPath());
                ps.setLong(ix++, sfItem.getFileSize());
                ps.setString(ix++, sfItem.getChkKey());
                ps.setString(ix++, sfItem.getSha());
                ps.setString(ix++, sfItem.getOwner());
                ps.setString(ix++, sfItem.getComment());
                ps.setInt(ix++, sfItem.getRating());
                ps.setString(ix++, sfItem.getKeywords());
                ps.setLong(ix++, sfItem.getLastUploaded());
                ps.setInt(ix++, sfItem.getUploadCount());
                ps.setLong(ix++, sfItem.getRefLastSent());
                ps.setLong(ix++, sfItem.getRequestLastReceived());
                ps.setInt(ix++, sfItem.getRequestsReceived());
                ps.setLong(ix++, sfItem.getLastModified());
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
public MyHelperClass getPooledConnection(){ return null; }
	public MyHelperClass givePooledConnection(Connection o0){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Throwable o2){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class List {

public MyHelperClass iterator(){ return null; }}

class FrostSharedFileItem {

public MyHelperClass getSha(){ return null; }
	public MyHelperClass getOwner(){ return null; }
	public MyHelperClass getChkKey(){ return null; }
	public MyHelperClass getUploadCount(){ return null; }
	public MyHelperClass getRequestLastReceived(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getComment(){ return null; }
	public MyHelperClass getRequestsReceived(){ return null; }
	public MyHelperClass getLastUploaded(){ return null; }
	public MyHelperClass getRefLastSent(){ return null; }
	public MyHelperClass getRating(){ return null; }
	public MyHelperClass getKeywords(){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getFileSize(){ return null; }}

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

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}
