import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19267854 {
public static MyHelperClass updateTableData(Connection o0, TableMetaData o1, Row o2){ return null; }
//public MyHelperClass updateTableData(Connection o0, TableMetaData o1, Row o2){ return null; }

    public static void insertTableData(Connection dest, TableMetaData tableMetaData) throws Throwable, Exception {
        PreparedStatement ps = null;
        try {
            dest.setAutoCommit(false);
            String sql = "INSERT INTO " + tableMetaData.getSchema() + "." + tableMetaData.getTableName() + " (";
            for (String columnName :(String[])(Object) (Object[])(Object)tableMetaData.getColumnsNames()) {
                sql += columnName + ",";
            }
            sql = sql.substring(0, sql.length() - 1);
            sql += ") VALUES (";
            for (String columnName :(String[])(Object) (Object[])(Object)tableMetaData.getColumnsNames()) {
                sql += "?" + ",";
            }
            sql = sql.substring(0, sql.length() - 1);
            sql += ")";
            MyHelperClass IOHelper = new MyHelperClass();
            IOHelper.writeInfo(sql);
            ps =(PreparedStatement)(Object) dest.prepareStatement(sql);
            for (Row r :(Row[])(Object) (Object[])(Object)tableMetaData.getData()) {
                try {
                    int param = 1;
                    for (String columnName :(String[])(Object) (Object[])(Object)tableMetaData.getColumnsNames()) {
                        if ((OracleConnection)(Object)dest instanceof OracleConnection) {
                            if ((boolean)(Object)tableMetaData.getColumnsTypes().get(columnName).equalsIgnoreCase("BLOB")) {
                                BLOB blob = new BLOB((OracleConnection)(OracleConnection)(Object) dest, (byte[])(byte[])(Object) r.getRowData().get(columnName));
                                ((OraclePreparedStatement)(OraclePreparedStatement)(Object) ps).setBLOB(param, blob);
                            } else if ((boolean)(Object)tableMetaData.getColumnsTypes().get(columnName).equalsIgnoreCase("CLOB")) {
                                ((OraclePreparedStatement)(OraclePreparedStatement)(Object) ps).setStringForClob(param, (String)(String)(Object) r.getRowData().get(columnName));
                            } else if ((boolean)(Object)tableMetaData.getColumnsTypes().get(columnName).equalsIgnoreCase("LONG")) {
                                ps.setBytes(param, (byte[])(byte[])(Object) r.getRowData().get(columnName));
                            }
                        } else {
//                            MyHelperClass IOHelper = new MyHelperClass();
                            IOHelper.writeInfo(columnName + " = " + r.getRowData().get(columnName));
                            ps.setObject(param, r.getRowData().get(columnName));
                        }
                        param++;
                    }
                    if ((int)(Object)ps.executeUpdate() != 1) {
                        dest.rollback();
                        updateTableData(dest, tableMetaData, r);
                    }
                } catch (Exception ex) {
                    try {
                        dest.rollback();
                        updateTableData(dest, tableMetaData, r);
                    } catch (Exception ex2) {
//                        MyHelperClass IOHelper = new MyHelperClass();
                        IOHelper.writeError("Error in update " + sql, ex2);
                    }
                }
                ps.clearParameters();
            }
            dest.commit();
            dest.setAutoCommit(true);
        } finally {
            if (ps != null) ps.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeInfo(String o0){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass writeError(String o0, Exception o1){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class TableMetaData {

public MyHelperClass getColumnsTypes(){ return null; }
	public MyHelperClass getColumnsNames(){ return null; }
	public MyHelperClass getTableName(){ return null; }
	public MyHelperClass getSchema(){ return null; }
	public MyHelperClass getData(){ return null; }}

class PreparedStatement {

public MyHelperClass clearParameters(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setBytes(int o0, byte[] o1){ return null; }
	public MyHelperClass setObject(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }}

class Row {

public MyHelperClass getRowData(){ return null; }}

class OracleConnection {

}

class BLOB {

BLOB(){}
	BLOB(OracleConnection o0, byte[] o1){}}

class OraclePreparedStatement {

public MyHelperClass setBLOB(int o0, BLOB o1){ return null; }
	public MyHelperClass setStringForClob(int o0, String o1){ return null; }}
