
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6489747 {
public static MyHelperClass QUERY_TIME_OUT;
//public MyHelperClass QUERY_TIME_OUT;
	public static MyHelperClass Table_Name;
	public static MyHelperClass CLogMgt;
	public static MyHelperClass nextID(Connection o0, int o1, boolean o2){ return null; }
public static MyHelperClass MSysConfig;
	public static MyHelperClass s_log;
	public static MyHelperClass Level;
//	public MyHelperClass Table_Name;
//	public MyHelperClass CLogMgt;
//	public MyHelperClass nextID(Connection o0, int o1, boolean o2){ return null; }
	public static MyHelperClass isExceptionCentralized(String o0){ return null; }
	public static MyHelperClass getNextOfficialID_HTTP(String o0){ return null; }
	public static MyHelperClass getNextProjectID_HTTP(String o0){ return null; }
public MyHelperClass USE_PROCEDURE;
	public MyHelperClass DB;
//	public MyHelperClass MSysConfig;
//	public MyHelperClass Level;
//	public MyHelperClass s_log;
//	public MyHelperClass isExceptionCentralized(String o0){ return null; }
//	public MyHelperClass getNextProjectID_HTTP(String o0){ return null; }
//	public MyHelperClass getNextOfficialID_HTTP(String o0){ return null; }

    public static int getNextID(int AD_Client_ID, String TableName, String trxName) {
        if (TableName == null || TableName.length() == 0) throw new IllegalArgumentException("TableName missing");
        int retValue = -1;
        MyHelperClass Ini = new MyHelperClass();
        boolean adempiereSys =(boolean)(Object) Ini.isPropertyBool(Ini.P_ADEMPIERESYS);
        if (adempiereSys && AD_Client_ID > 11) adempiereSys = false;
        MyHelperClass LOGLEVEL = new MyHelperClass();
        if ((boolean)(Object)CLogMgt.isLevel(LOGLEVEL)) s_log.log(LOGLEVEL, TableName + " - AdempiereSys=" + adempiereSys + " [" + trxName + "]");
        String selectSQL = null;
        MyHelperClass DB = new MyHelperClass();
        if ((boolean)(Object)DB.isPostgreSQL()) {
            selectSQL = "SELECT CurrentNext, CurrentNextSys, IncrementNo, AD_Sequence_ID " + "FROM AD_Sequence " + "WHERE Name=?" + " AND IsActive='Y' AND IsTableID='Y' AND IsAutoSequence='Y' " + " FOR UPDATE OF AD_Sequence ";
            boolean USE_PROCEDURE;// = new boolean();
            USE_PROCEDURE = false;
//        MyHelperClass DB = new MyHelperClass();
        } else if ((boolean)(Object)DB.isOracle()) {
            selectSQL = "SELECT CurrentNext, CurrentNextSys, IncrementNo, AD_Sequence_ID " + "FROM AD_Sequence " + "WHERE Name=?" + " AND IsActive='Y' AND IsTableID='Y' AND IsAutoSequence='Y' " + "FOR UPDATE";
            boolean USE_PROCEDURE;// = new boolean();
            USE_PROCEDURE = true;
        } else {
            selectSQL = "SELECT CurrentNext, CurrentNextSys, IncrementNo, AD_Sequence_ID " + "FROM AD_Sequence " + "WHERE Name=?" + " AND IsActive='Y' AND IsTableID='Y' AND IsAutoSequence='Y' ";
            boolean USE_PROCEDURE;// = new boolean();
            USE_PROCEDURE = false;
        }
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        for (int i = 0; i < 3; i++) {
            try {
//                MyHelperClass DB = new MyHelperClass();
                conn =(Connection)(Object) DB.getConnectionID();
                if (conn == null) return -1;
                MyHelperClass ResultSet = new MyHelperClass();
                pstmt =(PreparedStatement)(Object) conn.prepareStatement(selectSQL, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
                pstmt.setString(1, TableName);
                MyHelperClass USE_PROCEDURE = new MyHelperClass();
                if (!(Boolean)(Object)USE_PROCEDURE && (boolean)(Object)DB.getDatabase().isQueryTimeoutSupported()) pstmt.setQueryTimeout(QUERY_TIME_OUT);
                rs =(ResultSet)(Object) pstmt.executeQuery();
                MyHelperClass CLogMgt = new MyHelperClass();
                if ((boolean)(Object)CLogMgt.isLevelFinest()) s_log.finest("AC=" + conn.getAutoCommit() + ", RO=" + conn.isReadOnly() + " - Isolation=" + conn.getTransactionIsolation() + "(" + Connection.TRANSACTION_READ_COMMITTED + ") - RSType=" + pstmt.getResultSetType() + "(" + ResultSet.TYPE_SCROLL_SENSITIVE + "), RSConcur=" + pstmt.getResultSetConcurrency() + "(" + ResultSet.CONCUR_UPDATABLE + ")");
                if ((boolean)(Object)rs.next()) {
                    MyHelperClass Env = new MyHelperClass();
                    MTable table =(MTable)(Object) MTable.get(Env.getCtx(), TableName);
                    int AD_Sequence_ID =(int)(Object) rs.getInt(4);
                    boolean gotFromHTTP = false;
                    if (adempiereSys) {
                        MyHelperClass MSysConfig = new MyHelperClass();
                        String isUseCentralizedID =(String)(Object) MSysConfig.getValue("DICTIONARY_ID_USE_CENTRALIZED_ID", "Y");
                        if ((!isUseCentralizedID.equals("N")) && (!(Boolean)(Object)isExceptionCentralized(TableName))) {
                            retValue =(int)(Object) getNextOfficialID_HTTP(TableName);
                            if (retValue > 0) {
                                PreparedStatement updateSQL;
                                updateSQL =(PreparedStatement)(Object) conn.prepareStatement("UPDATE AD_Sequence SET CurrentNextSys = ? + 1 WHERE AD_Sequence_ID = ?");
                                try {
                                    updateSQL.setInt(1, retValue);
                                    updateSQL.setInt(2, AD_Sequence_ID);
                                    updateSQL.executeUpdate();
                                } finally {
                                    updateSQL.close();
                                }
                            }
                            gotFromHTTP = true;
                        }
                    }
                    boolean queryProjectServer = false;
                    if (table.getColumn("EntityType") != null) queryProjectServer = true;
                    if (!queryProjectServer && (boolean)(Object)Table_Name.equalsIgnoreCase(TableName)) queryProjectServer = true;
                    if (queryProjectServer && (adempiereSys) && (!(Boolean)(Object)isExceptionCentralized(TableName))) {
                        String isUseProjectCentralizedID =(String)(Object) MSysConfig.getValue("PROJECT_ID_USE_CENTRALIZED_ID", "N");
                        if (isUseProjectCentralizedID.equals("Y")) {
                            retValue =(int)(Object) getNextProjectID_HTTP(TableName);
                            if (retValue > 0) {
                                PreparedStatement updateSQL;
                                updateSQL =(PreparedStatement)(Object) conn.prepareStatement("UPDATE AD_Sequence SET CurrentNext = GREATEST(CurrentNext, ? + 1) WHERE AD_Sequence_ID = ?");
                                try {
                                    updateSQL.setInt(1, retValue);
                                    updateSQL.setInt(2, AD_Sequence_ID);
                                    updateSQL.executeUpdate();
                                } finally {
                                    updateSQL.close();
                                }
                            }
                            gotFromHTTP = true;
                        }
                    }
                    if (!gotFromHTTP) {
                        if ((boolean)(Object)USE_PROCEDURE) {
                            retValue =(int)(Object) nextID(conn, AD_Sequence_ID, adempiereSys);
                        } else {
                            PreparedStatement updateSQL;
                            int incrementNo =(int)(Object) rs.getInt(3);
                            if (adempiereSys) {
                                updateSQL =(PreparedStatement)(Object) conn.prepareStatement("UPDATE AD_Sequence SET CurrentNextSys = CurrentNextSys + ? WHERE AD_Sequence_ID = ?");
                                retValue =(int)(Object) rs.getInt(2);
                            } else {
                                updateSQL =(PreparedStatement)(Object) conn.prepareStatement("UPDATE AD_Sequence SET CurrentNext = CurrentNext + ? WHERE AD_Sequence_ID = ?");
                                retValue =(int)(Object) rs.getInt(1);
                            }
                            try {
                                updateSQL.setInt(1, incrementNo);
                                updateSQL.setInt(2, AD_Sequence_ID);
                                updateSQL.executeUpdate();
                            } finally {
                                updateSQL.close();
                            }
                        }
                    }
                    conn.commit();
                } else s_log.severe("No record found - " + TableName);
                break;
            } catch (Exception e) {
                s_log.log(Level.SEVERE, TableName + " - " + e.getMessage(), e);
                try {
                    if (conn != null) conn.rollback();
                } catch (UncheckedIOException e1) {
                }
            } finally {
                DB.close(rs, pstmt);
                pstmt = null;
                rs = null;
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (UncheckedIOException e) {
                    }
                    conn = null;
                }
            }
            Thread.yield();
        }
        return retValue;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TYPE_SCROLL_SENSITIVE;
	public MyHelperClass CONCUR_UPDATABLE;
	public MyHelperClass P_ADEMPIERESYS;
	public MyHelperClass SEVERE;
	public MyHelperClass TYPE_FORWARD_ONLY;
public MyHelperClass finest(String o0){ return null; }
	public MyHelperClass getDatabase(){ return null; }
	public MyHelperClass isLevel(MyHelperClass o0){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass close(ResultSet o0, PreparedStatement o1){ return null; }
	public MyHelperClass isOracle(){ return null; }
	public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass getValue(String o0, String o1){ return null; }
	public MyHelperClass isLevelFinest(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass isQueryTimeoutSupported(){ return null; }
	public MyHelperClass getCtx(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass isPropertyBool(MyHelperClass o0){ return null; }
	public MyHelperClass isPostgreSQL(){ return null; }
	public MyHelperClass getConnectionID(){ return null; }}

class Connection {
public static MyHelperClass TRANSACTION_READ_COMMITTED;
public MyHelperClass rollback(){ return null; }
	public MyHelperClass isReadOnly(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass prepareStatement(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass getTransactionIsolation(){ return null; }}

class PreparedStatement {

public MyHelperClass getResultSetConcurrency(){ return null; }
	public MyHelperClass setQueryTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass getResultSetType(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class MTable {

public static MyHelperClass get(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getColumn(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
