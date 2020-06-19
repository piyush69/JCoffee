import java.io.*;
import java.lang.*;
import java.util.*;



class c23400223 {
public MyHelperClass getSelfDefinePath(String o0, String o1, Connection o2, PreparedStatement o3, ResultSet o4){ return null; }
	public MyHelperClass selfDefineAdd(String[] o0, Channel o1, Connection o2, PreparedStatement o3){ return null; }
	public MyHelperClass close(ResultSet o0, Object o1, PreparedStatement o2, Connection o3, DBOperation o4){ return null; }
	public MyHelperClass selfDefineDelete(String[] o0, Connection o1, PreparedStatement o2){ return null; }
public MyHelperClass log;
	public MyHelperClass Const;
	public MyHelperClass Types;
	public MyHelperClass createDBOperation(){ return null; }

    public void update(Channel channel) throws Exception {
        DBOperation dbo = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String exp =(String)(Object) channel.getExtendParent();
        String path =(String)(Object) channel.getPath();
        try {
            String sqlStr = "UPDATE t_ip_channel SET id=?,name=?,description=?,ascii_name=?,site_id=?,type=?,data_url=?,template_id=?,use_status=?,order_no=?,style=?,creator=?,create_date=?,refresh_flag=?,page_num=? where channel_path=?";
            dbo =(DBOperation)(Object) createDBOperation();
            connection =(Connection)(Object) dbo.getConnection();
            connection.setAutoCommit(false);
            String[] selfDefinePath =(String[])(Object) getSelfDefinePath(path, exp, connection, preparedStatement, resultSet);
            selfDefineDelete(selfDefinePath, connection, preparedStatement);
            selfDefineAdd(selfDefinePath, channel, connection, preparedStatement);
            preparedStatement =(PreparedStatement)(Object) connection.prepareStatement(sqlStr);
            preparedStatement.setInt(1, channel.getChannelID());
            preparedStatement.setString(2, channel.getName());
            preparedStatement.setString(3, channel.getDescription());
            preparedStatement.setString(4, channel.getAsciiName());
            preparedStatement.setInt(5, channel.getSiteId());
            preparedStatement.setString(6, channel.getChannelType());
            preparedStatement.setString(7, channel.getDataUrl());
            if (channel.getTemplateId() == null || channel.getTemplateId().trim().equals("")) preparedStatement.setNull(8, Types.INTEGER); else preparedStatement.setInt(8,(MyHelperClass)(Object) Integer.parseInt((String)(Object)channel.getTemplateId()));
            preparedStatement.setString(9, channel.getUseStatus());
            preparedStatement.setInt(10, channel.getOrderNo());
            preparedStatement.setString(11, channel.getStyle());
            preparedStatement.setInt(12, channel.getCreator());
            preparedStatement.setTimestamp(13, (Timestamp)(Timestamp)(Object) channel.getCreateDate());
            preparedStatement.setString(14, channel.getRefresh());
            preparedStatement.setInt(15, channel.getPageNum());
            preparedStatement.setString(16, channel.getPath());
            preparedStatement.executeUpdate();
            connection.commit();
            int resID =(int)(Object) channel.getChannelID() + (int)(Object)Const.CHANNEL_TYPE_RES;
            StructResource sr = new StructResource();
            sr.setResourceID(Integer.toString(resID));
            sr.setOperateID(Integer.toString(1));
            sr.setOperateTypeID(Const.OPERATE_TYPE_ID);
            sr.setTypeID(Const.RES_TYPE_ID);
            StructAuth sa =(StructAuth)(Object) (new AuthorityManager().getExternalAuthority(sr));
            int authID =(int)(Object) sa.getAuthID();
            if (authID == 0) {
                String resName =(String)(Object) channel.getName();
                int resTypeID =(int)(Object) Const.RES_TYPE_ID;
                int operateTypeID =(int)(Object) Const.OPERATE_TYPE_ID;
                String remark = "";
                AuthorityManager am = new AuthorityManager();
                am.createExtResource(Integer.toString(resID), resName, resTypeID, operateTypeID, remark);
            }
        } catch (UncheckedIOException ex) {
            connection.rollback();
            log.error("����Ƶ��ʧ�ܣ�channelPath=" + channel.getPath());
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

public MyHelperClass getRefresh(){ return null; }
	public MyHelperClass getOrderNo(){ return null; }
	public MyHelperClass getChannelType(){ return null; }
	public MyHelperClass getAsciiName(){ return null; }
	public MyHelperClass getUseStatus(){ return null; }
	public MyHelperClass getPageNum(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getDataUrl(){ return null; }
	public MyHelperClass getExtendParent(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getChannelID(){ return null; }
	public MyHelperClass getCreator(){ return null; }
	public MyHelperClass getName(){ return null; }
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

class StructResource {

public MyHelperClass setTypeID(MyHelperClass o0){ return null; }
	public MyHelperClass setOperateTypeID(MyHelperClass o0){ return null; }
	public MyHelperClass setResourceID(String o0){ return null; }
	public MyHelperClass setOperateID(String o0){ return null; }}

class StructAuth {

public MyHelperClass getAuthID(){ return null; }}

class AuthorityManager {

public MyHelperClass getExternalAuthority(StructResource o0){ return null; }
	public MyHelperClass createExtResource(String o0, String o1, int o2, int o3, String o4){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
