


class c22331867 {

    protected void removeMessage(ReplicationMessage message) {
        MyHelperClass logger = new MyHelperClass();
        logger.info(String.format("remove replication message: %d", message.getId()));
        ConnectionProvider cp = null;
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass portalDao = new MyHelperClass();
            SessionFactoryImplementor impl = (SessionFactoryImplementor)(SessionFactoryImplementor)(Object) portalDao.getSessionFactory();
            cp =(ConnectionProvider)(Object) impl.getConnectionProvider();
            conn =(Connection)(Object) cp.getConnection();
            conn.setAutoCommit(false);
            ps =(PreparedStatement)(Object) conn.prepareStatement("delete from light_replication_message where id=?");
            ps.setLong(1, message.getId());
            ps.executeUpdate();
            conn.commit();
            ps.close();
            conn.close();
        } catch (Exception e) {
            try {
                conn.rollback();
                ps.close();
                conn.close();
            } catch (Exception se) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSessionFactory(){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class ReplicationMessage {

public MyHelperClass getId(){ return null; }}

class ConnectionProvider {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SessionFactoryImplementor {

public MyHelperClass getConnectionProvider(){ return null; }}
