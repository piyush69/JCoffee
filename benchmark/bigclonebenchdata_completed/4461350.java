import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4461350 {

        private boolean doCSVImport(String tableName, final boolean hasHeader)  throws Throwable {
            StringBuffer sql = new StringBuffer();
            sql.append("INSERT INTO ");
            sql.append(tableName + "(");
            MyHelperClass colNames = new MyHelperClass();
            for (int i = 0; i < (int)(Object)colNames.size(); i++) {
//                MyHelperClass colNames = new MyHelperClass();
                sql.append("" + colNames.get(i) + ",");
            }
            sql.setLength(sql.length() - 1);
            sql.append(") VALUES( ");
//            MyHelperClass colNames = new MyHelperClass();
            for (int i = 0; i < (int)(Object)colNames.size(); i++) {
                sql.append("?,");
            }
            sql.setLength(sql.length() - 1);
            sql.append(")");
            Connection conn = null;
            int lineNumber = 0;
            int colNumber = 0;
            String line[] = null;
            try {
                MyHelperClass DBExplorer = new MyHelperClass();
                conn =(Connection)(Object) DBExplorer.getConnection(false);
                conn.setAutoCommit(false);
                PreparedStatement pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql.toString());
                MyHelperClass csvData = new MyHelperClass();
                for (; lineNumber < (int)(Object)csvData.size(); lineNumber++) {
                    if (hasHeader && lineNumber == 0) continue;
                    MyHelperClass dlg = new MyHelperClass();
                    dlg.UpdateProgressBar(lineNumber);
                    MyHelperClass cancel = new MyHelperClass();
                    if ((boolean)(Object)cancel) {
                        break;
                    }
//                    MyHelperClass csvData = new MyHelperClass();
                    line = (String[])(String[])(Object) csvData.get(lineNumber);
                    pstmt.clearParameters();
                    MyHelperClass colTypes = new MyHelperClass();
                    for (colNumber = 0; colNumber < (int)(Object)colTypes.size(); colNumber++) {
                        MyHelperClass colNullAllowed = new MyHelperClass();
                        if (line[colNumber].equals("") && colNullAllowed.get(colNumber).toString().equals("true")) {
                            MyHelperClass colTypeInt = new MyHelperClass();
                            pstmt.setNull(colNumber + 1, Integer.parseInt(colTypeInt.get(colNumber).toString()));
                        } else {
                            MyHelperClass colTypeInt = new MyHelperClass();
                            pstmt.setObject(colNumber + 1, line[colNumber], Integer.parseInt(colTypeInt.get(colNumber).toString()));
                        }
                    }
                    pstmt.executeUpdate();
                }
                MyHelperClass cancel = new MyHelperClass();
                if ((boolean)(Object)cancel) conn.rollback(); else conn.commit();
                conn.setAutoCommit(true);
                conn.close();
                conn = null;
                MyHelperClass dialog = new MyHelperClass();
                dialog.getDisplay().asyncExec(new Runnable() {

                    public void run() {
                        MyHelperClass cancel = new MyHelperClass();
                        if (!(Boolean)(Object)cancel) {
                            MyHelperClass title = new MyHelperClass();
                            MyHelperClass maxsize = new MyHelperClass();
                            MyHelperClass dlg = new MyHelperClass();
                            dlg.showMessage(title, "Imported " + maxsize + " rows successfully.");
                            MyHelperClass statusLabel = new MyHelperClass();
                            statusLabel.setText("Import complete.");
                        } else {
                            MyHelperClass dlg = new MyHelperClass();
                            dlg.UpdateProgressBar(0);
                            MyHelperClass statusLabel = new MyHelperClass();
                            statusLabel.setText("Import aborted.");
                        }
                    }
                });
                return true;
            } catch (final Exception e) {
                if (conn != null) try {
                    conn.rollback();
                } catch (UncheckedIOException e1) {
                    e1.printStackTrace();
                }
                MyHelperClass dialog = new MyHelperClass();
                dialog.getDisplay().asyncExec(new Runnable() {

                    public void run() {
                        MyHelperClass statusLabel = new MyHelperClass();
                        statusLabel.setText("Import failed");
                        MyHelperClass title = new MyHelperClass();
                        MyHelperClass dlg = new MyHelperClass();
                        dlg.showError(title, e.getMessage());
//                        MyHelperClass dlg = new MyHelperClass();
                        dlg.UpdateProgressBar(0);
                    }
                });
                return false;
            } finally {
                if (conn != null) try {
                    conn.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass showError(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass asyncExec( Runnable o0){ return null; }
	public MyHelperClass UpdateProgressBar(int o0){ return null; }
	public MyHelperClass getDisplay(){ return null; }
	public MyHelperClass asyncExec(){ return null; }
	public MyHelperClass getConnection(boolean o0){ return null; }
	public MyHelperClass showMessage(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass clearParameters(){ return null; }
	public MyHelperClass setObject(int o0, String o1, int o2){ return null; }
	public MyHelperClass setNull(int o0, int o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
