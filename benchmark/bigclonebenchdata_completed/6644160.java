


class c6644160 {
public MyHelperClass logger;

    public void saveHiddenNames(HashSet names) throws SQLException {
        MyHelperClass AppLayerDatabase = new MyHelperClass();
        Connection conn =(Connection)(Object) AppLayerDatabase.getInstance().getPooledConnection();
        PreparedStatement ps = null;
        try {
            conn.setAutoCommit(false);
            Statement stmt =(Statement)(Object) conn.createStatement();
            stmt.executeUpdate("DELETE FROM HIDDENBOARDNAMES");
            stmt.close();
            stmt = null;
            ps =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO HIDDENBOARDNAMES (boardname) VALUES (?)");
            for (Iterator i =(Iterator)(Object) names.iterator();(boolean)(Object) i.hasNext(); ) {
                String bName = (String)(String)(Object) i.next();
                ps.setString(1, bName);
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
            try {
                if (ps != null) ps.close();
            } catch (Throwable t1) {
            }
            ;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getPooledConnection(){ return null; }
	public MyHelperClass givePooledConnection(Connection o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Throwable o2){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class HashSet {

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

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}
