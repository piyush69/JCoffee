
import java.io.UncheckedIOException;


class c2659799 {

    private void duplicateIndices(Connection scon, Connection dcon, String table) {
        try {
            String idx_name, idx_att, query;
            ResultSet idxs =(ResultSet)(Object) scon.getMetaData().getIndexInfo(null, null, table, false, false);
            Statement stmt =(Statement)(Object) dcon.createStatement();
            while ((boolean)(Object)idxs.next()) {
                idx_name =(String)(Object) idxs.getString(6);
                idx_att =(String)(Object) idxs.getString(9);
                idx_name += "_" + idx_att + "_idx";
                MyHelperClass logger = new MyHelperClass();
                logger.debug("Creating index " + idx_name);
                query = "CREATE INDEX " + idx_name + " ON " + table + "(" + idx_att + ")";
                stmt.executeUpdate(query);
                dcon.commit();
            }
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Unable to copy indices " + e);
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

public MyHelperClass fatal(SQLException o0){ return null; }
	public MyHelperClass getIndexInfo(Object o0, Object o1, String o2, boolean o3, boolean o4){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass getMetaData(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class ResultSet {

public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
