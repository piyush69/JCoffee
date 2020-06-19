


class c22331869 {

    protected void syncMessages(Message message) {
        MyHelperClass Event = new MyHelperClass();
        if (message.getEvent() == Event.CONNECT || message.getEvent() == Event.SYNC_DONE) return;
        MyHelperClass logger = new MyHelperClass();
        logger.info(String.format("remove stale replication messages: %s", message.toString()));
        String className = "";
        long classId = 0;
        if ((Entity)(Object)message.getBody() instanceof Entity) {
            Entity entity = (Entity)(Entity)(Object) message.getBody();
            className = entity.getClass().getName();
            classId =(long)(Object) entity.getId();
        }
        ConnectionProvider cp = null;
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass portalDao = new MyHelperClass();
            SessionFactoryImplementor impl = (SessionFactoryImplementor)(SessionFactoryImplementor)(Object) portalDao.getSessionFactory();
            cp =(ConnectionProvider)(Object) impl.getConnectionProvider();
            conn =(Connection)(Object) cp.getConnection();
            conn.setAutoCommit(false);
            ps =(PreparedStatement)(Object) conn.prepareStatement("delete from light_replication_message where event=? and className=? and classId=?");
            ps.setString(1, message.getEvent().toString());
            ps.setString(2, className);
            ps.setLong(3, classId);
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
public MyHelperClass CONNECT;
	public MyHelperClass SYNC_DONE;
public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getSessionFactory(){ return null; }}

class Message {

public MyHelperClass getEvent(){ return null; }
	public MyHelperClass getBody(){ return null; }}

class Entity {

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

public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SessionFactoryImplementor {

public MyHelperClass getConnectionProvider(){ return null; }}
