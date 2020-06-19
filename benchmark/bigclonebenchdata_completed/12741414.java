


class c12741414 {
public MyHelperClass getPortalDao(){ return null; }

        private void saveMessage(String server, Message message, byte[] bytes) throws Exception {
            ConnectionProvider cp = null;
            Connection conn = null;
            PreparedStatement ps = null;
            try {
                SessionFactoryImplementor impl = (SessionFactoryImplementor)(SessionFactoryImplementor)(Object) getPortalDao().getSessionFactory();
                cp =(ConnectionProvider)(Object) impl.getConnectionProvider();
                conn =(Connection)(Object) cp.getConnection();
                conn.setAutoCommit(false);
                long orgId = 0;
                String className = "";
                long classId = 0;
                if ((Entity)(Object)message.getBody() instanceof Entity) {
                    Entity entity = (Entity)(Entity)(Object) message.getBody();
                    orgId =(long)(Object) entity.getOrgId();
                    className = entity.getClass().getName();
                    classId =(long)(Object) entity.getId();
                }
                ps =(PreparedStatement)(Object) conn.prepareStatement("insert into light_replication_message (orgId,server,event,className,classId,message,createDate) values(?,?,?,?,?,?,?);");
                ps.setLong(1, orgId);
                ps.setString(2, server);
                ps.setString(3, message.getEvent().toString());
                ps.setString(4, className);
                ps.setLong(5, classId);
                ps.setBytes(6, bytes);
                ps.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
                ps.executeUpdate();
                conn.commit();
                ps.close();
                conn.close();
            } catch (Exception e) {
                conn.rollback();
                ps.close();
                conn.close();
                e.printStackTrace();
                throw new Exception(e);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSessionFactory(){ return null; }}

class Message {

public MyHelperClass getEvent(){ return null; }
	public MyHelperClass getBody(){ return null; }}

class ConnectionProvider {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass setBytes(int o0, byte[] o1){ return null; }
	public MyHelperClass setTimestamp(int o0, Timestamp o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class SessionFactoryImplementor {

public MyHelperClass getConnectionProvider(){ return null; }}

class Entity {

public MyHelperClass getId(){ return null; }
	public MyHelperClass getOrgId(){ return null; }}

class Timestamp {

Timestamp(){}
	Timestamp(long o0){}}
