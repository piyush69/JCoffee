
import java.io.UncheckedIOException;


class c2659798 {
public MyHelperClass getCreateTableCommand(ResultSet o0, ResultSet o1){ return null; }

    private void duplicateTable(Connection scon, Connection dcon, String table) {
        MyHelperClass logger = new MyHelperClass();
        logger.debug("Duplicating table " + table);
        Statement creTab, stmt;
        ResultSet tuples, columns, keys;
        int c;
        String insert = "";
        PreparedStatement insTup;
        try {
            columns =(ResultSet)(Object) scon.getMetaData().getColumns(null, null, table, null);
            keys =(ResultSet)(Object) scon.getMetaData().getPrimaryKeys(null, null, table);
            creTab =(Statement)(Object) dcon.createStatement();
            creTab.execute(getCreateTableCommand(columns, keys));
            MyHelperClass ResultSet = new MyHelperClass();
            stmt =(Statement)(Object) scon.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            stmt.setFetchSize(50);
            tuples =(ResultSet)(Object) stmt.executeQuery("SELECT * FROM " + table);
            c =(int)(Object) tuples.getMetaData().getColumnCount();
            insert = "INSERT INTO " + table + " VALUES(";
            for (int j = 1; j <= c; j++) insert += "?,";
            insert = insert.substring(0, insert.length() - 1) + ")";
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("Insert pattern " + insert);
            insTup =(PreparedStatement)(Object) dcon.prepareStatement(insert);
            while ((boolean)(Object)tuples.next()) {
                for (int j = 1; j <= c; j++) insTup.setObject(j, tuples.getObject(j));
                insTup.executeUpdate();
            }
            dcon.commit();
        } catch (Exception e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("Unable to copy table " + table + ": " + e);
            try {
                dcon.rollback();
            } catch (UncheckedIOException e1) {
//                MyHelperClass logger = new MyHelperClass();
                logger.fatal((SQLException)(Object)e1);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONCUR_READ_ONLY;
	public MyHelperClass TYPE_FORWARD_ONLY;
public MyHelperClass fatal(SQLException o0){ return null; }
	public MyHelperClass getColumns(Object o0, Object o1, String o2, Object o3){ return null; }
	public MyHelperClass getColumnCount(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getPrimaryKeys(Object o0, Object o1, String o2){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getMetaData(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass setFetchSize(int o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getObject(int o0){ return null; }
	public MyHelperClass getMetaData(){ return null; }
	public MyHelperClass next(){ return null; }}

class PreparedStatement {

public MyHelperClass setObject(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
