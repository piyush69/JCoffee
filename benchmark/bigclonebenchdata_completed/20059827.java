import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20059827 {
public MyHelperClass setPrepareStatement(PreparedStatement o0, int o1, Timestamp o2){ return null; }
	public MyHelperClass setPrepareStatement(PreparedStatement o0, int o1, Integer o2){ return null; }
public MyHelperClass log;
	public MyHelperClass sessionContainer;
	public MyHelperClass ResultSet;
	public MyHelperClass GlobalConstant;
	public MyHelperClass UserInfoFactory;
	public MyHelperClass dbConn;
	public MyHelperClass Utility;
	public MyHelperClass getNextPrimaryID(){ return null; }

    public synchronized AbstractBaseObject insert(AbstractBaseObject obj) throws Throwable, ApplicationException {
        PreparedStatement preStat = null;
        StringBuffer sqlStat = new StringBuffer();
        MailSetting tmpMailSetting = (MailSetting) ((MailSetting)(MailSetting)(Object) obj).clone();
        MyHelperClass dbConn = new MyHelperClass();
        synchronized (dbConn) {
            try {
                Integer nextID =(Integer)(Object) getNextPrimaryID();
                Timestamp currTime =(Timestamp)(Object) Utility.getCurrentTimestamp();
                sqlStat.append("INSERT ");
                sqlStat.append("INTO   MAIL_SETTING(ID, USER_RECORD_ID, PROFILE_NAME, MAIL_SERVER_TYPE, DISPLAY_NAME, EMAIL_ADDRESS, REMEMBER_PWD_FLAG, SPA_LOGIN_FLAG, INCOMING_SERVER_HOST, INCOMING_SERVER_PORT, INCOMING_SERVER_LOGIN_NAME, INCOMING_SERVER_LOGIN_PWD, OUTGOING_SERVER_HOST, OUTGOING_SERVER_PORT, OUTGOING_SERVER_LOGIN_NAME, OUTGOING_SERVER_LOGIN_PWD, PARAMETER_1, PARAMETER_2, PARAMETER_3, PARAMETER_4, PARAMETER_5, RECORD_STATUS, UPDATE_COUNT, CREATOR_ID, CREATE_DATE, UPDATER_ID, UPDATE_DATE) ");
                sqlStat.append("VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
                preStat =(PreparedStatement)(Object) dbConn.prepareStatement(sqlStat.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                setPrepareStatement(preStat, 1, nextID);
                setPrepareStatement(preStat, 2,(Timestamp)(Object) tmpMailSetting.getUserRecordID());
                setPrepareStatement(preStat, 3,(Timestamp)(Object) tmpMailSetting.getProfileName());
                setPrepareStatement(preStat, 4,(Timestamp)(Object) tmpMailSetting.getMailServerType());
                setPrepareStatement(preStat, 5,(Timestamp)(Object) tmpMailSetting.getDisplayName());
                setPrepareStatement(preStat, 6,(Timestamp)(Object) tmpMailSetting.getEmailAddress());
                setPrepareStatement(preStat, 7,(Timestamp)(Object) tmpMailSetting.getRememberPwdFlag());
                setPrepareStatement(preStat, 8,(Timestamp)(Object) tmpMailSetting.getSpaLoginFlag());
                setPrepareStatement(preStat, 9,(Timestamp)(Object) tmpMailSetting.getIncomingServerHost());
                setPrepareStatement(preStat, 10,(Timestamp)(Object) tmpMailSetting.getIncomingServerPort());
                setPrepareStatement(preStat, 11,(Timestamp)(Object) tmpMailSetting.getIncomingServerLoginName());
                setPrepareStatement(preStat, 12,(Timestamp)(Object) tmpMailSetting.getIncomingServerLoginPwd());
                setPrepareStatement(preStat, 13,(Timestamp)(Object) tmpMailSetting.getOutgoingServerHost());
                setPrepareStatement(preStat, 14,(Timestamp)(Object) tmpMailSetting.getOutgoingServerPort());
                setPrepareStatement(preStat, 15,(Timestamp)(Object) tmpMailSetting.getOutgoingServerLoginName());
                setPrepareStatement(preStat, 16,(Timestamp)(Object) tmpMailSetting.getOutgoingServerLoginPwd());
                setPrepareStatement(preStat, 17,(Timestamp)(Object) tmpMailSetting.getParameter1());
                setPrepareStatement(preStat, 18,(Timestamp)(Object) tmpMailSetting.getParameter2());
                setPrepareStatement(preStat, 19,(Timestamp)(Object) tmpMailSetting.getParameter3());
                setPrepareStatement(preStat, 20,(Timestamp)(Object) tmpMailSetting.getParameter4());
                setPrepareStatement(preStat, 21,(Timestamp)(Object) tmpMailSetting.getParameter5());
                setPrepareStatement(preStat, 22,(Timestamp)(Object) GlobalConstant.RECORD_STATUS_ACTIVE);
                setPrepareStatement(preStat, 23, new Integer(0));
                setPrepareStatement(preStat, 24,(Timestamp)(Object) sessionContainer.getUserRecordID());
                setPrepareStatement(preStat, 25, currTime);
                setPrepareStatement(preStat, 26,(Timestamp)(Object) sessionContainer.getUserRecordID());
                setPrepareStatement(preStat, 27, currTime);
                preStat.executeUpdate();
                tmpMailSetting.setID(nextID);
                tmpMailSetting.setCreatorID(sessionContainer.getUserRecordID());
                tmpMailSetting.setCreateDate(currTime);
                tmpMailSetting.setUpdaterID(sessionContainer.getUserRecordID());
                tmpMailSetting.setUpdateDate(currTime);
                tmpMailSetting.setUpdateCount(new Integer(0));
                tmpMailSetting.setCreatorName(UserInfoFactory.getUserFullName(tmpMailSetting.getCreatorID()));
                tmpMailSetting.setUpdaterName(UserInfoFactory.getUserFullName(tmpMailSetting.getUpdaterID()));
                dbConn.commit();
                return ((AbstractBaseObject)(Object)tmpMailSetting);
            } catch (SQLException sqle) {
                log.error(sqle, sqle);
            } catch (Exception e) {
                try {
                    dbConn.rollback();
                } catch (Exception ex) {
                }
                log.error(e, e);
            } finally {
                try {
                    preStat.close();
                } catch (Exception ignore) {
                } finally {
                    preStat = null;
                }
            }
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RECORD_STATUS_ACTIVE;
	public MyHelperClass CONCUR_READ_ONLY;
	public MyHelperClass TYPE_SCROLL_INSENSITIVE;
public MyHelperClass getUserRecordID(){ return null; }
	public MyHelperClass getUserFullName(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass error(Exception o0, Exception o1){ return null; }
	public MyHelperClass error(SQLException o0, SQLException o1){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass getCurrentTimestamp(){ return null; }}

class AbstractBaseObject {

}

class ApplicationException extends Exception{
	public ApplicationException(String errorMessage) { super(errorMessage); }
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
	public MyHelperClass setCreatorID(MyHelperClass o0){ return null; }
	public MyHelperClass getCreatorID(){ return null; }
	public MyHelperClass getOutgoingServerLoginPwd(){ return null; }
	public MyHelperClass getIncomingServerHost(){ return null; }
	public MyHelperClass getRememberPwdFlag(){ return null; }
	public MyHelperClass setCreateDate(Timestamp o0){ return null; }
	public MyHelperClass getOutgoingServerHost(){ return null; }
	public MyHelperClass getOutgoingServerPort(){ return null; }
	public MyHelperClass setUpdaterName(MyHelperClass o0){ return null; }
	public MyHelperClass setCreatorName(MyHelperClass o0){ return null; }
	public MyHelperClass setID(Integer o0){ return null; }
	public MyHelperClass getUpdaterID(){ return null; }
	public MyHelperClass getIncomingServerPort(){ return null; }
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

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
