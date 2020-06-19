
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11506365 {
public MyHelperClass Logger;
	public MyHelperClass FileTool;
	public MyHelperClass language;
	public MyHelperClass StateSaver;
	public MyHelperClass MYSQL_SQL_SCHEMA_REPLACEMENT;
	public MyHelperClass JOptionPane;
	public MyHelperClass getConnection(){ return null; }

//    @Override
    public boolean setupDatabaseSchema() {
        MyHelperClass Configuration = new MyHelperClass();
        Configuration cfg =(Configuration)(Object) Configuration.getInstance();
        Connection con =(Connection)(Object) getConnection();
        if (null == con) return false;
        try {
            String sql =(String)(Object) FileTool.readFile(cfg.getProperty("database.sql.rootdir") + System.getProperty("file.separator") + cfg.getProperty("database.sql.mysql.setupschema"));
            sql = sql.replaceAll((String)(Object)MYSQL_SQL_SCHEMA_REPLACEMENT,(String)(Object) StateSaver.getInstance().getDatabaseSettings().getSchema());
            con.setAutoCommit(false);
            Statement stmt =(Statement)(Object) con.createStatement();
            String[] sqlParts = sql.split(";");
            for (String sqlPart : sqlParts) {
                if (sqlPart.trim().length() > 0) stmt.executeUpdate(sqlPart);
            }
            con.commit();
            JOptionPane.showMessageDialog(null, language.getProperty("database.messages.executionsuccess"), language.getProperty("dialog.information.title"), JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (UncheckedIOException e) {
            Logger.logException((SQLException)(Object)e);
        }
        try {
            if (con != null) con.rollback();
        } catch (UncheckedIOException e) {
            Logger.logException((SQLException)(Object)e);
        }
        JOptionPane.showMessageDialog(null, language.getProperty("database.messages.executionerror"), language.getProperty("dialog.error.title"), JOptionPane.ERROR_MESSAGE);
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass logException(SQLException o0){ return null; }
	public MyHelperClass getSchema(){ return null; }
	public MyHelperClass readFile(String o0){ return null; }
	public MyHelperClass showMessageDialog(Object o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass getDatabaseSettings(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Configuration {

public MyHelperClass getProperty(String o0){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
