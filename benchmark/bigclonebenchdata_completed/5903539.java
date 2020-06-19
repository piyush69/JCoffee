
import java.io.UncheckedIOException;


class c5903539 {
public MyHelperClass Search;
	public MyHelperClass dbi;
	public MyHelperClass sequenceName;
	public MyHelperClass sequenceTable;
	public MyHelperClass current(){ return null; }

    public int next() {
        int sequenceValue =(int)(Object) current();
        try {
            Update update =(Update)(Object) dbi.getUpdate();
            update.setTableName(sequenceTable);
            update.assignValue("SEQUENCE_VALUE", --sequenceValue);
            Search search = new Search();
            search.addAttributeCriteria(sequenceTable, "SEQUENCE_NAME", Search.EQUAL, sequenceName);
            update.where(search);
            int affectedRows =(int)(Object) dbi.getConnection().createStatement().executeUpdate(update.toString());
            if (affectedRows == 1) {
                dbi.getConnection().commit();
            } else {
                dbi.getConnection().rollback();
            }
        } catch (UncheckedIOException sqle) {
            System.err.println("SQLException occurred in current(): " + sqle.getMessage());
        }
        return sequenceValue;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EQUAL;
public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getUpdate(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Update {

public MyHelperClass assignValue(String o0, int o1){ return null; }
	public MyHelperClass setTableName(MyHelperClass o0){ return null; }
	public MyHelperClass where(Search o0){ return null; }}

class Search {

public MyHelperClass addAttributeCriteria(MyHelperClass o0, String o1, MyHelperClass o2, MyHelperClass o3){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
