
import java.io.UncheckedIOException;


class c23400221 {
public MyHelperClass getSelfDefinePath(MyHelperClass o0, String o1, Connection o2, PreparedStatement o3, ResultSet o4){ return null; }
public MyHelperClass selfDefineDelete(String[] o0, Connection o1, PreparedStatement o2){ return null; }
	public MyHelperClass close(ResultSet o0, Object o1, PreparedStatement o2, Connection o3, DBOperation o4){ return null; }
public MyHelperClass log;
	public MyHelperClass createDBOperation(){ return null; }

    public void delete(Channel channel) throws Exception {
        DBOperation dbo = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            dbo =(DBOperation)(Object) createDBOperation();
            connection =(Connection)(Object) dbo.getConnection();
            connection.setAutoCommit(false);
            String[] selfDefinePath =(String[])(Object) getSelfDefinePath(channel.getPath(), "1", connection, preparedStatement, resultSet);
            selfDefineDelete(selfDefinePath, connection, preparedStatement);
            String sqlStr = "delete from t_ip_channel where channel_path=?";
            preparedStatement =(PreparedStatement)(Object) connection.prepareStatement(sqlStr);
            preparedStatement.setString(1, channel.getPath());
            preparedStatement.executeUpdate();
            sqlStr = "delete from t_ip_channel_order where channel_order_site = ?";
            preparedStatement.setString(1, channel.getPath());
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (UncheckedIOException ex) {
            connection.rollback();
            log.error("ɾ��Ƶ��ʧ�ܣ�channelPath=" + channel.getPath(),(SQLException)(Object) ex);
            throw ex;
        } finally {
            close(resultSet, null, preparedStatement, connection, dbo);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, SQLException o1){ return null; }}

class Channel {

public MyHelperClass getPath(){ return null; }}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
