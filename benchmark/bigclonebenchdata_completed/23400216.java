import java.io.*;
import java.lang.*;
import java.util.*;



class c23400216 {
public MyHelperClass selfDefineAdd(String[] o0, Channel o1, Connection o2, PreparedStatement o3){ return null; }
	public MyHelperClass close(ResultSet o0, Object o1, PreparedStatement o2, Connection o3, DBOperation o4){ return null; }
public MyHelperClass log;
	public MyHelperClass Const;
	public MyHelperClass Types;
	public MyHelperClass createDBOperation(){ return null; }

    public void add(Channel channel) throws Exception {
        String sqlStr = null;
        DBOperation dbo = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            sqlStr = "insert into t_ip_channel (id,name,description,ascii_name,channel_path,site_id,type,data_url,template_id,use_status,order_no,style,creator,create_date,refresh_flag,page_num) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            dbo =(DBOperation)(Object) createDBOperation();
            connection =(Connection)(Object) dbo.getConnection();
            connection.setAutoCommit(false);
            String[] path = new String[1];
            path[0] =(String)(Object) channel.getPath();
            selfDefineAdd(path, channel, connection, preparedStatement);
            preparedStatement =(PreparedStatement)(Object) connection.prepareStatement(sqlStr);
            preparedStatement.setInt(1, channel.getChannelID());
            preparedStatement.setString(2, channel.getName());
            preparedStatement.setString(3, channel.getDescription());
            preparedStatement.setString(4, channel.getAsciiName());
            preparedStatement.setString(5, channel.getPath());
            preparedStatement.setInt(6, channel.getSiteId());
            preparedStatement.setString(7, channel.getChannelType());
            preparedStatement.setString(8, channel.getDataUrl());
            if (channel.getTemplateId() == null || channel.getTemplateId().trim().equals("")) preparedStatement.setNull(9, Types.INTEGER); else preparedStatement.setInt(9,(MyHelperClass)(Object) Integer.parseInt((String)(Object)channel.getTemplateId()));
            preparedStatement.setString(10, channel.getUseStatus());
            preparedStatement.setInt(11, channel.getOrderNo());
            preparedStatement.setString(12, channel.getStyle());
            preparedStatement.setInt(13, channel.getCreator());
            preparedStatement.setTimestamp(14, (Timestamp)(Timestamp)(Object) channel.getCreateDate());
            preparedStatement.setString(15, channel.getRefPath());
            preparedStatement.setInt(16, channel.getPageNum());
            preparedStatement.executeUpdate();
            connection.commit();
            int operateTypeID =(int)(Object) Const.OPERATE_TYPE_ID;
            int resID =(int)(Object) channel.getChannelID() + (int)(Object)Const.CHANNEL_TYPE_RES;
            String resName =(String)(Object) channel.getName();
            int resTypeID =(int)(Object) Const.RES_TYPE_ID;
            String remark = "";
            AuthorityManager am = new AuthorityManager();
            am.createExtResource(Integer.toString(resID), resName, resTypeID, operateTypeID, remark);
        } catch (UncheckedIOException ex) {
            connection.rollback();
            log.error("���Ƶ��ʱSql�쳣��ִ����䣺" + sqlStr);
            throw ex;
        } finally {
            close(resultSet, null, preparedStatement, connection, dbo);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OPERATE_TYPE_ID;
	public MyHelperClass INTEGER;
	public MyHelperClass CHANNEL_TYPE_RES;
	public MyHelperClass RES_TYPE_ID;
public MyHelperClass trim(){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class Channel {

public MyHelperClass getOrderNo(){ return null; }
	public MyHelperClass getChannelType(){ return null; }
	public MyHelperClass getAsciiName(){ return null; }
	public MyHelperClass getUseStatus(){ return null; }
	public MyHelperClass getPageNum(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getDataUrl(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getChannelID(){ return null; }
	public MyHelperClass getCreator(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getRefPath(){ return null; }
	public MyHelperClass getSiteId(){ return null; }
	public MyHelperClass getCreateDate(){ return null; }
	public MyHelperClass getStyle(){ return null; }
	public MyHelperClass getTemplateId(){ return null; }}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setNull(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setTimestamp(int o0, Timestamp o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }}

class ResultSet {

}

class Timestamp {

}

class AuthorityManager {

public MyHelperClass createExtResource(String o0, String o1, int o2, int o3, String o4){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
