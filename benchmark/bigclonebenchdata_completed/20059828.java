import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20059828 {
public MyHelperClass setPrepareStatement(PreparedStatement o0, int o1, Timestamp o2){ return null; }
	public MyHelperClass setPrepareStatement(PreparedStatement o0, int o1, Integer o2){ return null; }

    public synchronized AbstractBaseObject update(AbstractBaseObject obj) throws Throwable, ApplicationException {
        PreparedStatement preStat = null;
        StringBuffer sqlStat = new StringBuffer();
        MailSetting tmpMailSetting = (MailSetting) ((MailSetting)(MailSetting)(Object) obj).clone();
        MyHelperClass dbConn = new MyHelperClass();
        synchronized (dbConn) {
            try {
                int updateCnt = 0;
                MyHelperClass Utility = new MyHelperClass();
                Timestamp currTime =(Timestamp)(Object) Utility.getCurrentTimestamp();
                sqlStat.append("UPDATE MAIL_SETTING ");
                sqlStat.append("SET  USER_RECORD_ID=?, PROFILE_NAME=?, MAIL_SERVER_TYPE=?, DISPLAY_NAME=?, EMAIL_ADDRESS=?, REMEMBER_PWD_FLAG=?, SPA_LOGIN_FLAG=?, INCOMING_SERVER_HOST=?, INCOMING_SERVER_PORT=?, INCOMING_SERVER_LOGIN_NAME=?, INCOMING_SERVER_LOGIN_PWD=?, OUTGOING_SERVER_HOST=?, OUTGOING_SERVER_PORT=?, OUTGOING_SERVER_LOGIN_NAME=?, OUTGOING_SERVER_LOGIN_PWD=?, PARAMETER_1=?, PARAMETER_2=?, PARAMETER_3=?, PARAMETER_4=?, PARAMETER_5=?, UPDATE_COUNT=?, UPDATER_ID=?, UPDATE_DATE=? ");
                sqlStat.append("WHERE  ID=? AND UPDATE_COUNT=? ");
                MyHelperClass ResultSet = new MyHelperClass();
                preStat =(PreparedStatement)(Object) dbConn.prepareStatement(sqlStat.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                setPrepareStatement(preStat, 1,(Timestamp)(Object) tmpMailSetting.getUserRecordID());
                setPrepareStatement(preStat, 2,(Timestamp)(Object) tmpMailSetting.getProfileName());
                setPrepareStatement(preStat, 3,(Timestamp)(Object) tmpMailSetting.getMailServerType());
                setPrepareStatement(preStat, 4,(Timestamp)(Object) tmpMailSetting.getDisplayName());
                setPrepareStatement(preStat, 5,(Timestamp)(Object) tmpMailSetting.getEmailAddress());
                setPrepareStatement(preStat, 6,(Timestamp)(Object) tmpMailSetting.getRememberPwdFlag());
                setPrepareStatement(preStat, 7,(Timestamp)(Object) tmpMailSetting.getSpaLoginFlag());
                setPrepareStatement(preStat, 8,(Timestamp)(Object) tmpMailSetting.getIncomingServerHost());
                setPrepareStatement(preStat, 9,(Timestamp)(Object) tmpMailSetting.getIncomingServerPort());
                setPrepareStatement(preStat, 10,(Timestamp)(Object) tmpMailSetting.getIncomingServerLoginName());
                setPrepareStatement(preStat, 11,(Timestamp)(Object) tmpMailSetting.getIncomingServerLoginPwd());
                setPrepareStatement(preStat, 12,(Timestamp)(Object) tmpMailSetting.getOutgoingServerHost());
                setPrepareStatement(preStat, 13,(Timestamp)(Object) tmpMailSetting.getOutgoingServerPort());
                setPrepareStatement(preStat, 14,(Timestamp)(Object) tmpMailSetting.getOutgoingServerLoginName());
                setPrepareStatement(preStat, 15,(Timestamp)(Object) tmpMailSetting.getOutgoingServerLoginPwd());
                setPrepareStatement(preStat, 16,(Timestamp)(Object) tmpMailSetting.getParameter1());
                setPrepareStatement(preStat, 17,(Timestamp)(Object) tmpMailSetting.getParameter2());
                setPrepareStatement(preStat, 18,(Timestamp)(Object) tmpMailSetting.getParameter3());
                setPrepareStatement(preStat, 19,(Timestamp)(Object) tmpMailSetting.getParameter4());
                setPrepareStatement(preStat, 20,(Timestamp)(Object) tmpMailSetting.getParameter5());
                setPrepareStatement(preStat, 21, new Integer((int)(Object)tmpMailSetting.getUpdateCount().intValue() + 1));
                MyHelperClass sessionContainer = new MyHelperClass();
                setPrepareStatement(preStat, 22,(Timestamp)(Object) sessionContainer.getUserRecordID());
                setPrepareStatement(preStat, 23, currTime);
                setPrepareStatement(preStat, 24,(Timestamp)(Object) tmpMailSetting.getID());
                setPrepareStatement(preStat, 25,(Timestamp)(Object) tmpMailSetting.getUpdateCount());
                updateCnt =(int)(Object) preStat.executeUpdate();
//                MyHelperClass dbConn = new MyHelperClass();
                dbConn.commit();
                if (updateCnt == 0) {
                    MyHelperClass ErrorConstant = new MyHelperClass();
                    throw new ApplicationException((String)(Object)ErrorConstant.DB_CONCURRENT_ERROR);
                } else {
//                    MyHelperClass sessionContainer = new MyHelperClass();
                    tmpMailSetting.setUpdaterID(sessionContainer.getUserRecordID());
                    tmpMailSetting.setUpdateDate(currTime);
                    tmpMailSetting.setUpdateCount(new Integer((int)(Object)tmpMailSetting.getUpdateCount().intValue() + 1));
                    MyHelperClass UserInfoFactory = new MyHelperClass();
                    tmpMailSetting.setCreatorName(UserInfoFactory.getUserFullName(tmpMailSetting.getCreatorID()));
//                    MyHelperClass UserInfoFactory = new MyHelperClass();
                    tmpMailSetting.setUpdaterName(UserInfoFactory.getUserFullName(tmpMailSetting.getUpdaterID()));
                    return ((AbstractBaseObject)(Object)tmpMailSetting);
                }
            } catch (Exception e) {
                try {
//                    MyHelperClass dbConn = new MyHelperClass();
                    dbConn.rollback();
                } catch (Exception ex) {
                }
                MyHelperClass log = new MyHelperClass();
                log.error(e, e);
                MyHelperClass ErrorConstant = new MyHelperClass();
                throw new ApplicationException(ErrorConstant.DB_UPDATE_ERROR, e);
            } finally {
                try {
                    preStat.close();
                } catch (Exception ignore) {
                } finally {
                    preStat = null;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DB_UPDATE_ERROR;
	public MyHelperClass CONCUR_READ_ONLY;
	public MyHelperClass DB_CONCURRENT_ERROR;
	public MyHelperClass TYPE_SCROLL_INSENSITIVE;
public MyHelperClass getUserRecordID(){ return null; }
	public MyHelperClass prepareStatement(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass getUserFullName(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass error(Exception o0, Exception o1){ return null; }
	public MyHelperClass intValue(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getCurrentTimestamp(){ return null; }}

class AbstractBaseObject {

}

class ApplicationException extends Exception{
	public ApplicationException(String errorMessage) { super(errorMessage); }
	ApplicationException(MyHelperClass o0, Exception o1){}
	ApplicationException(){}
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }}

class MailSetting {

public MyHelperClass getIncomingServerLoginPwd(){ return null; }
	public MyHelperClass getParameter2(){ return null; }
	public MyHelperClass setUpdaterID(MyHelperClass o0){ return null; }
	public MyHelperClass getEmailAddress(){ return null; }
	public MyHelperClass getSpaLoginFlag(){ return null; }
	public MyHelperClass getCreatorID(){ return null; }
	public MyHelperClass getOutgoingServerLoginPwd(){ return null; }
	public MyHelperClass getIncomingServerHost(){ return null; }
	public MyHelperClass getRememberPwdFlag(){ return null; }
	public MyHelperClass getOutgoingServerHost(){ return null; }
	public MyHelperClass getOutgoingServerPort(){ return null; }
	public MyHelperClass setUpdaterName(MyHelperClass o0){ return null; }
	public MyHelperClass getID(){ return null; }
	public MyHelperClass setCreatorName(MyHelperClass o0){ return null; }
	public MyHelperClass getUpdaterID(){ return null; }
	public MyHelperClass getIncomingServerPort(){ return null; }
	public MyHelperClass getUpdateCount(){ return null; }
	public MyHelperClass getParameter1(){ return null; }
	public MyHelperClass getParameter4(){ return null; }
	public MyHelperClass getParameter3(){ return null; }
	public MyHelperClass getIncomingServerLoginName(){ return null; }
	public MyHelperClass getUserRecordID(){ return null; }
	public MyHelperClass setUpdateDate(Timestamp o0){ return null; }
	public MyHelperClass getDisplayName(){ return null; }
	public MyHelperClass getOutgoingServerLoginName(){ return null; }
	public MyHelperClass getMailServerType(){ return null; }
	public MyHelperClass getProfileName(){ return null; }
	public MyHelperClass setUpdateCount(Integer o0){ return null; }
	public MyHelperClass getParameter5(){ return null; }}
