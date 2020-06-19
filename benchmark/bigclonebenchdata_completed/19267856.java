import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19267856 {

    public static void updateTableData(Connection dest, TableMetaData tableMetaData, Row r) throws Throwable, Exception {
        PreparedStatement ps = null;
        try {
            dest.setAutoCommit(false);
            String sql = "UPDATE " + tableMetaData.getSchema() + "." + tableMetaData.getTableName() + " SET ";
            for (String columnName :(String[])(Object) (Object[])(Object)tableMetaData.getColumnsNames()) {
                sql += columnName + " = ? ,";
            }
            sql = sql.substring(0, sql.length() - 1);
            sql += " WHERE ";
            for (String pkColumnName :(String[])(Object) (Object[])(Object)tableMetaData.getPkColumns()) {
                sql += pkColumnName + " = ? AND ";
            }
            sql = sql.substring(0, sql.length() - 4);
            System.out.println("UPDATE: " + sql);
            ps =(PreparedStatement)(Object) dest.prepareStatement(sql);
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
                    ps.setObject(param, r.getRowData().get(columnName));
                }
                param++;
            }
            for (String pkColumnName :(String[])(Object) (Object[])(Object)tableMetaData.getPkColumns()) {
                ps.setObject(param, r.getRowData().get(pkColumnName));
                param++;
            }
            if ((int)(Object)ps.executeUpdate() != 1) {
                dest.rollback();
                throw new Exception("Erro no update");
            }
            ps.clearParameters();
            dest.commit();
            dest.setAutoCommit(true);
        } finally {
            if (ps != null) ps.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class TableMetaData {

public MyHelperClass getPkColumns(){ return null; }
	public MyHelperClass getColumnsTypes(){ return null; }
	public MyHelperClass getColumnsNames(){ return null; }
	public MyHelperClass getTableName(){ return null; }
	public MyHelperClass getSchema(){ return null; }}

class Row {

public MyHelperClass getRowData(){ return null; }}

class PreparedStatement {

public MyHelperClass clearParameters(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setBytes(int o0, byte[] o1){ return null; }
	public MyHelperClass setObject(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }}

class OracleConnection {

}

class BLOB {

BLOB(){}
	BLOB(OracleConnection o0, byte[] o1){}}

class OraclePreparedStatement {

public MyHelperClass setBLOB(int o0, BLOB o1){ return null; }
	public MyHelperClass setStringForClob(int o0, String o1){ return null; }}
