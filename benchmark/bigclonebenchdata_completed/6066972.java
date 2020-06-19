import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6066972 {
public MyHelperClass getColumnDefinition(MyHelperClass o0){ return null; }
public MyHelperClass MessageDialog;
	public MyHelperClass I18N;
	public MyHelperClass getProfile(){ return null; }
	public MyHelperClass exportRecordSet(DataRecordSet o0, Connection o1, String o2){ return null; }

//    @Override
    public void run()  throws Throwable {
        MyHelperClass Display = new MyHelperClass();
        Shell currentShell =(Shell)(Object) Display.getCurrent().getActiveShell();
        MyHelperClass DMManager = new MyHelperClass();
        if (DMManager.getInstance().getOntology() == null) return;
//        MyHelperClass DMManager = new MyHelperClass();
        DataRecordSet data =(DataRecordSet)(Object) DMManager.getInstance().getOntology().getDataView().dataset();
        InputDialog input = new InputDialog(currentShell, I18N.getString("vikamine.dtp.title"), I18N.getString("vikamine.dtp.export.tablename"), data.getRelationName(), null);
        input.open();
        String tablename =(String)(Object) input.getValue();
        if (tablename == null) return;
        this.getProfile().connect();
        IManagedConnection mc =(IManagedConnection)(Object) this.getProfile().getManagedConnection("java.sql.Connection");
        java.sql.Connection sql = (java.sql.Connection) mc.getConnection().getRawConnection();
        try {
            sql.setAutoCommit(false);
            DatabaseMetaData dbmd =(DatabaseMetaData)(Object) sql.getMetaData();
            ResultSet tables =(ResultSet)(Object) dbmd.getTables(null, null, tablename, new String[] { "TABLE" });
            if ((boolean)(Object)tables.next()) {
                if (!(Boolean)(Object)MessageDialog.openConfirm(currentShell, I18N.getString("vikamine.dtp.title"), I18N.getString("vikamine.dtp.export.overwriteTable"))) return;
                Statement statement =(Statement)(Object) sql.createStatement();
                statement.executeUpdate("DROP TABLE " + tablename);
                statement.close();
            }
            String createTableQuery = null;
            for (int i = 0; i < (int)(Object)data.getNumAttributes(); i++) {
//                MyHelperClass DMManager = new MyHelperClass();
                if ((boolean)(Object)DMManager.getInstance().getOntology().isIDAttribute(data.getAttribute(i))) continue;
                if (createTableQuery == null) createTableQuery = ""; else createTableQuery += ",";
                createTableQuery += getColumnDefinition(data.getAttribute(i));
            }
            Statement statement =(Statement)(Object) sql.createStatement();
            statement.executeUpdate("CREATE TABLE " + tablename + "(" + createTableQuery + ")");
            statement.close();
            exportRecordSet(data,(Connection)(Object) sql, tablename);
            sql.commit();
            sql.setAutoCommit(true);
            MessageDialog.openInformation(currentShell, I18N.getString("vikamine.dtp.title"), I18N.getString("vikamine.dtp.export.successful"));
        } catch (UncheckedIOException e) {
            try {
                sql.rollback();
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
            MessageDialog.openError(currentShell, I18N.getString("vikamine.dtp.title"), I18N.getString("vikamine.dtp.export.failed"));
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConfirm(Shell o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getActiveShell(){ return null; }
	public MyHelperClass getDataView(){ return null; }
	public MyHelperClass openError(Shell o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getCurrent(){ return null; }
	public MyHelperClass isIDAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getRawConnection(){ return null; }
	public MyHelperClass openInformation(Shell o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass dataset(){ return null; }
	public MyHelperClass getOntology(){ return null; }
	public MyHelperClass getManagedConnection(String o0){ return null; }}

class Shell {

}

class DataRecordSet {

public MyHelperClass getRelationName(){ return null; }
	public MyHelperClass getAttribute(int o0){ return null; }
	public MyHelperClass getNumAttributes(){ return null; }}

class InputDialog {

InputDialog(){}
	InputDialog(Shell o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, Object o4){}
	public MyHelperClass getValue(){ return null; }
	public MyHelperClass open(){ return null; }}

class IManagedConnection {

public MyHelperClass getConnection(){ return null; }}

class DatabaseMetaData {

public MyHelperClass getTables(Object o0, Object o1, String o2, String[] o3){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

}
