


class c10115630 {
public static MyHelperClass logger;
//public MyHelperClass logger;

    public static boolean copyDataToNewTable(EboContext p_eboctx, String srcTableName, String destTableName, String where, boolean log, int mode) throws boRuntimeException {
        srcTableName = srcTableName.toUpperCase();
        destTableName = destTableName.toUpperCase();
        Connection cn = null;
        Connection cndef = null;
        boolean ret = false;
        try {
            boolean srcexists = false;
            boolean destexists = false;
            final InitialContext ic = new InitialContext();
            cn =(Connection)(Object) p_eboctx.getConnectionData();
            cndef =(Connection)(Object) p_eboctx.getConnectionDef();
            PreparedStatement pstm =(PreparedStatement)(Object) cn.prepareStatement("SELECT TABLE_NAME FROM USER_TABLES WHERE TABLE_NAME=?");
            pstm.setString(1, srcTableName);
            ResultSet rslt =(ResultSet)(Object) pstm.executeQuery();
            if ((boolean)(Object)rslt.next()) {
                srcexists = true;
            }
            rslt.close();
            pstm.setString(1, destTableName);
            rslt =(ResultSet)(Object) pstm.executeQuery();
            if ((boolean)(Object)rslt.next()) {
                destexists = true;
            }
            if (!destexists) {
                rslt.close();
                pstm.close();
                pstm =(PreparedStatement)(Object) cn.prepareStatement("SELECT VIEW_NAME FROM USER_VIEWS WHERE VIEW_NAME=?");
                pstm.setString(1, destTableName);
                rslt =(ResultSet)(Object) pstm.executeQuery();
                if ((boolean)(Object)rslt.next()) {
                    CallableStatement cstm =(CallableStatement)(Object) cn.prepareCall("DROP VIEW " + destTableName);
                    cstm.execute();
                    cstm.close();
                }
            }
            rslt.close();
            pstm.close();
            if (srcexists && !destexists) {
                if (log) {
                    MyHelperClass LoggerMessageLocalizer = new MyHelperClass();
                    logger.finest(LoggerMessageLocalizer.getMessage("CREATING_AND_COPY_DATA_FROM") + " [" + srcTableName + "] " + LoggerMessageLocalizer.getMessage("TO") + " [" + destTableName + "]");
                }
                CallableStatement cstm =(CallableStatement)(Object) cn.prepareCall("CREATE TABLE " + destTableName + " AS SELECT * FROM " + srcTableName + " " + (((where != null) && (where.length() > 0)) ? (" WHERE " + where) : ""));
                cstm.execute();
                cstm.close();
                if (log) {
                    MyHelperClass LoggerMessageLocalizer = new MyHelperClass();
                    logger.finest(LoggerMessageLocalizer.getMessage("UPDATING_NGTDIC"));
                }
                cn.commit();
                ret = true;
            } else if (srcexists && destexists) {
                if (log) {
                    MyHelperClass LoggerMessageLocalizer = new MyHelperClass();
                    logger.finest(LoggerMessageLocalizer.getMessage("COPY_DATA_FROM") + " [" + srcTableName + "] " + LoggerMessageLocalizer.getMessage("TO") + "  [" + destTableName + "]");
                }
                PreparedStatement pstm2 =(PreparedStatement)(Object) cn.prepareStatement("SELECT COLUMN_NAME FROM USER_TAB_COLUMNS WHERE TABLE_NAME = ? ");
                pstm2.setString(1, destTableName);
                ResultSet rslt2 =(ResultSet)(Object) pstm2.executeQuery();
                StringBuffer fields = new StringBuffer();
                PreparedStatement pstm3 =(PreparedStatement)(Object) cn.prepareStatement("SELECT COLUMN_NAME FROM USER_TAB_COLUMNS WHERE TABLE_NAME = ? and COLUMN_NAME=?");
                while ((boolean)(Object)rslt2.next()) {
                    pstm3.setString(1, srcTableName);
                    pstm3.setString(2,(String)(Object) rslt2.getString(1));
                    ResultSet rslt3 =(ResultSet)(Object) pstm3.executeQuery();
                    if ((boolean)(Object)rslt3.next()) {
                        if (fields.length() > 0) {
                            fields.append(',');
                        }
                        fields.append('"').append(rslt2.getString(1)).append('"');
                    }
                    rslt3.close();
                }
                pstm3.close();
                rslt2.close();
                pstm2.close();
                CallableStatement cstm;
                int recs = 0;
                if ((mode == 0) || (mode == 1)) {
                    cstm =(CallableStatement)(Object) cn.prepareCall("INSERT INTO " + destTableName + "( " + fields.toString() + " ) ( SELECT " + fields.toString() + " FROM " + srcTableName + " " + (((where != null) && (where.length() > 0)) ? (" WHERE " + where) : "") + ")");
                    recs =(int)(Object) cstm.executeUpdate();
                    cstm.close();
                    if (log) {
                        MyHelperClass LoggerMessageLocalizer = new MyHelperClass();
                        logger.finest(LoggerMessageLocalizer.getMessage("DONE") + " [" + recs + "] " + LoggerMessageLocalizer.getMessage("RECORDS_COPIED"));
                    }
                }
                cn.commit();
                ret = true;
            }
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception z) {
                throw new boRuntimeException("boBuildDB.moveTable", "BO-1304", z);
            }
            throw new boRuntimeException("boBuildDB.moveTable", "BO-1304", e);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
            try {
                cndef.close();
            } catch (Exception e) {
            }
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMessage(String o0){ return null; }
	public MyHelperClass finest(String o0){ return null; }
	public MyHelperClass finest(MyHelperClass o0){ return null; }}

class EboContext {

public MyHelperClass getConnectionData(){ return null; }
	public MyHelperClass getConnectionDef(){ return null; }}

class boRuntimeException extends Exception{
	public boRuntimeException(String errorMessage) { super(errorMessage); }
	boRuntimeException(){}
	boRuntimeException(String o0, String o1, Exception o2){}
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareCall(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class InitialContext {

}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class CallableStatement {

public MyHelperClass execute(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
