import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17408417 {
public MyHelperClass DF;
public MyHelperClass getJdbcTemplate(){ return null; }
	public MyHelperClass getSegquence(String o0){ return null; }

    public MsgRecvInfo[] recvMsg(MsgRecvReq msgRecvReq) throws Throwable, SQLException {
        String updateSQL = " update dyhikemomessages set receive_id = ?, receive_Time = ?  where mo_to =? and receive_id =0  limit 20";
        String selectSQL = " select MOMSG_ID,mo_from,mo_to,create_time,mo_content from dyhikemomessages where receive_id =?  ";
        String insertSQL = " insert into t_receive_history select * from dyhikemomessages  where receive_id =?  ";
        String deleteSQL = " delete from dyhikemomessages where receive_id =? ";
        MyHelperClass Logger = new MyHelperClass();
        Logger logger =(Logger)(Object) Logger.getLogger(this.getClass());
        ArrayList msgInfoList = new ArrayList();
        String mo_to =(String)(Object) msgRecvReq.getAuthInfo().getUserName();
        MsgRecvInfo[] msgInfoArray = new MsgRecvInfo[0];
        String receiveTime =(String)(Object) DF.format(new Date());
        logger.debug("recvMsgNew1");
        Connection conn = null;
        try {
            int receiveID =(int)(Object) this.getSegquence("receiveID");
            conn =(Connection)(Object) this.getJdbcTemplate().getDataSource().getConnection();
            conn.setAutoCommit(false);
            PreparedStatement pstmt =(PreparedStatement)(Object) conn.prepareStatement(updateSQL);
            pstmt.setInt(1, receiveID);
            pstmt.setString(2, receiveTime);
            pstmt.setString(3, mo_to);
            int recordCount =(int)(Object) pstmt.executeUpdate();
            logger.info(recordCount + " record(s) got");
            if (recordCount > 0) {
                pstmt =(PreparedStatement)(Object) conn.prepareStatement(selectSQL);
                pstmt.setInt(1, receiveID);
                ResultSet rs =(ResultSet)(Object) pstmt.executeQuery();
                while ((boolean)(Object)rs.next()) {
                    MsgRecvInfo msg = new MsgRecvInfo();
                    msg.setDestMobile(rs.getString("mo_to"));
                    msg.setRecvAddi(rs.getString("mo_to"));
                    msg.setSendAddi(rs.getString("MO_FROM"));
                    msg.setContent(rs.getString("mo_content"));
                    msg.setRecvDate(rs.getString("create_time"));
                    msgInfoList.add(msg);
                }
                msgInfoArray = (MsgRecvInfo[]) msgInfoList.toArray(new MsgRecvInfo[msgInfoList.size()]);
                pstmt =(PreparedStatement)(Object) conn.prepareStatement(insertSQL);
                pstmt.setInt(1, receiveID);
                pstmt.execute();
                pstmt =(PreparedStatement)(Object) conn.prepareStatement(deleteSQL);
                pstmt.setInt(1, receiveID);
                pstmt.execute();
                conn.commit();
            }
            logger.debug("recvMsgNew2");
            return msgInfoArray;
        } catch (ArithmeticException e) {
            conn.rollback();
            throw e;
        } finally {
            if (conn != null) {
                conn.setAutoCommit(true);
                conn.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLogger(Class o0){ return null; }
	public MyHelperClass format(Date o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass getDataSource(){ return null; }}

class MsgRecvReq {

public MyHelperClass getAuthInfo(){ return null; }}

class MsgRecvInfo {

public MyHelperClass setDestMobile(MyHelperClass o0){ return null; }
	public MyHelperClass setContent(MyHelperClass o0){ return null; }
	public MyHelperClass setRecvAddi(MyHelperClass o0){ return null; }
	public MyHelperClass setRecvDate(MyHelperClass o0){ return null; }
	public MyHelperClass setSendAddi(MyHelperClass o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Logger {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass execute(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class ResultSet {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass next(){ return null; }}
