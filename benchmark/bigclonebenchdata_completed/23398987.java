
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23398987 {
public MyHelperClass getItemInsertStatement(InputQueueItem o0){ return null; }
public MyHelperClass SELECT_NUMBER_ITEMS_STATEMENT;
	public MyHelperClass LOGGER;
	public MyHelperClass DELETE_ALL_ITEMS_STATEMENT;
	public MyHelperClass closeConnection(){ return null; }
	public MyHelperClass getConnection(){ return null; }

//    @Override
    public void updateItems(List toUpdate) throws DatabaseException {
        if (toUpdate == null) throw new NullPointerException("toUpdate");
        try {
            getConnection().setAutoCommit(false);
        } catch (UncheckedIOException e) {
            LOGGER.warn("Unable to set autocommit off",(SQLException)(Object) e);
        }
        try {
            PreparedStatement deleteSt =(PreparedStatement)(Object) getConnection().prepareStatement(DELETE_ALL_ITEMS_STATEMENT);
            PreparedStatement selectCount =(PreparedStatement)(Object) getConnection().prepareStatement(SELECT_NUMBER_ITEMS_STATEMENT);
            ResultSet rs =(ResultSet)(Object) selectCount.executeQuery();
            rs.next();
            int totalBefore =(int)(Object) rs.getInt(1);
            int deleted =(int)(Object) deleteSt.executeUpdate();
            int updated = 0;
            for (InputQueueItem item :(InputQueueItem[])(Object) (Object[])(Object)toUpdate) {
                updated += (int)(Object)getItemInsertStatement(item).executeUpdate();
            }
            if (totalBefore == deleted && updated == (int)(Object)toUpdate.size()) {
                getConnection().commit();
                LOGGER.debug("DB has been updated. Queries: \"" + selectCount + "\" and \"" + deleteSt + "\".");
            } else {
                getConnection().rollback();
                LOGGER.error("DB has not been updated -> rollback! Queries: \"" + selectCount + "\" and \"" + deleteSt + "\".");
            }
        } catch (UncheckedIOException e) {
            LOGGER.error((SQLException)(Object)e);
        } finally {
            closeConnection();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, SQLException o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class List {

public MyHelperClass size(){ return null; }}

class InputQueueItem {

}

class DatabaseException extends Exception{
	public DatabaseException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
