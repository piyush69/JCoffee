
import java.io.UncheckedIOException;


class c8328527 {
public MyHelperClass close(Object o0, Object o1, PreparedStatement o2, Connection o3, DBOperation o4){ return null; }
public MyHelperClass log;
	public MyHelperClass createDBOperation(){ return null; }

    public void insertJobLog(String userId, String[] checkId, String checkType, String objType) throws Exception {
        DBOperation dbo = null;
        Connection connection = null;
        PreparedStatement preStm = null;
        String sql = "insert into COFFICE_JOBLOG_CHECKAUTH (USER_ID,CHECK_ID,CHECK_TYPE,OBJ_TYPE) values (?,?,?,?)";
        String cleanSql = "delete from COFFICE_JOBLOG_CHECKAUTH where " + "user_id = '" + userId + "' and check_type = '" + checkType + "' and obj_type = '" + objType + "'";
        try {
            dbo =(DBOperation)(Object) createDBOperation();
            connection =(Connection)(Object) dbo.getConnection();
            connection.setAutoCommit(false);
            preStm =(PreparedStatement)(Object) connection.prepareStatement(cleanSql);
            int dCount =(int)(Object) preStm.executeUpdate();
            String sHaveIns = ",";
            preStm =(PreparedStatement)(Object) connection.prepareStatement(sql);
            for (int j = 0; j < checkId.length; j++) {
                if (sHaveIns.indexOf("," + checkId[j] + ",") < 0) {
                    preStm.setInt(1, Integer.parseInt(userId));
                    preStm.setInt(2, Integer.parseInt(checkId[j]));
                    preStm.setInt(3, Integer.parseInt(checkType));
                    preStm.setInt(4, Integer.parseInt(objType));
                    preStm.executeUpdate();
                    sHaveIns += checkId[j] + ",";
                }
            }
            connection.commit();
        } catch (Exception ex) {
            log.debug((new Date().toString()) + " ������Ȩ��ʧ��! ");
            try {
                connection.rollback();
            } catch (UncheckedIOException e) {
                throw e;
            }
            throw ex;
        } finally {
            close(null, null, preStm, connection, dbo);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Date {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
