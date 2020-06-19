import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16761836 {
public MyHelperClass setPrepareStatement(PreparedStatement o0, int o1, Timestamp o2){ return null; }
	public MyHelperClass setPrepareStatement(PreparedStatement o0, int o1, Integer o2){ return null; }
public MyHelperClass log;
	public MyHelperClass ResultSet;
	public MyHelperClass ErrorConstant;
	public MyHelperClass UserInfoFactory;
	public MyHelperClass dbConn;
	public MyHelperClass Utility;
	public MyHelperClass getNextPrimaryID(){ return null; }

    protected synchronized AbstractBaseObject insert(AbstractBaseObject obj) throws Throwable, ApplicationException {
        PreparedStatement preStat = null;
        StringBuffer sqlStat = new StringBuffer();
        DmsRelationalWord tmpDmsRelationalWord = (DmsRelationalWord) ((DmsRelationalWord)(DmsRelationalWord)(Object) obj).clone();
        MyHelperClass dbConn = new MyHelperClass();
        synchronized (dbConn) {
            try {
                Integer nextID =(Integer)(Object) getNextPrimaryID();
                Timestamp currTime =(Timestamp)(Object) Utility.getCurrentTimestamp();
                sqlStat.append("INSERT ");
                sqlStat.append("INTO   DMS_RELATIONAL_WORD(ID, RECORD_STATUS, UPDATE_COUNT, CREATOR_ID, CREATE_DATE, UPDATER_ID, UPDATE_DATE, WORD, PARENT_ID, TYPE) ");
                sqlStat.append("VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
                preStat =(PreparedStatement)(Object) dbConn.prepareStatement(sqlStat.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                setPrepareStatement(preStat, 1, nextID);
                setPrepareStatement(preStat, 2,(Timestamp)(Object) tmpDmsRelationalWord.getRecordStatus());
                setPrepareStatement(preStat, 3, new Integer(0));
                setPrepareStatement(preStat, 4,(Timestamp)(Object) tmpDmsRelationalWord.getCreatorID());
                setPrepareStatement(preStat, 5, currTime);
                setPrepareStatement(preStat, 6,(Timestamp)(Object) tmpDmsRelationalWord.getUpdaterID());
                setPrepareStatement(preStat, 7, currTime);
                if (tmpDmsRelationalWord.getWord() == null || "".equals(tmpDmsRelationalWord.getWord().trim())) {
                    return null;
                }
                setPrepareStatement(preStat, 8,(Timestamp)(Object) tmpDmsRelationalWord.getWord());
                setPrepareStatement(preStat, 9,(Timestamp)(Object) tmpDmsRelationalWord.getParentID());
                setPrepareStatement(preStat, 10,(Timestamp)(Object) tmpDmsRelationalWord.getType());
                preStat.executeUpdate();
                tmpDmsRelationalWord.setID(nextID);
                tmpDmsRelationalWord.setCreatorID(tmpDmsRelationalWord.getCreatorID());
                tmpDmsRelationalWord.setCreateDate(currTime);
                tmpDmsRelationalWord.setUpdaterID(tmpDmsRelationalWord.getUpdaterID());
                tmpDmsRelationalWord.setUpdateDate(currTime);
                tmpDmsRelationalWord.setUpdateCount(new Integer(0));
                tmpDmsRelationalWord.setCreatorName(UserInfoFactory.getUserFullName(tmpDmsRelationalWord.getCreatorID()));
                tmpDmsRelationalWord.setUpdaterName(UserInfoFactory.getUserFullName(tmpDmsRelationalWord.getUpdaterID()));
                dbConn.commit();
                return ((AbstractBaseObject)(Object)tmpDmsRelationalWord);
            } catch (Exception e) {
                try {
                    dbConn.rollback();
                } catch (Exception ee) {
                }
                log.error(e, e);
                throw new ApplicationException(ErrorConstant.DB_INSERT_ERROR, e);
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
public MyHelperClass DB_INSERT_ERROR;
	public MyHelperClass CONCUR_READ_ONLY;
	public MyHelperClass TYPE_SCROLL_INSENSITIVE;
public MyHelperClass trim(){ return null; }
	public MyHelperClass getUserFullName(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass error(Exception o0, Exception o1){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
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

class DmsRelationalWord {

public MyHelperClass setCreateDate(Timestamp o0){ return null; }
	public MyHelperClass setUpdaterID(MyHelperClass o0){ return null; }
	public MyHelperClass setUpdateCount(Integer o0){ return null; }
	public MyHelperClass setUpdateDate(Timestamp o0){ return null; }
	public MyHelperClass getParentID(){ return null; }
	public MyHelperClass getWord(){ return null; }
	public MyHelperClass setUpdaterName(MyHelperClass o0){ return null; }
	public MyHelperClass setCreatorName(MyHelperClass o0){ return null; }
	public MyHelperClass setCreatorID(MyHelperClass o0){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass getCreatorID(){ return null; }
	public MyHelperClass setID(Integer o0){ return null; }
	public MyHelperClass getUpdaterID(){ return null; }
	public MyHelperClass getRecordStatus(){ return null; }}
