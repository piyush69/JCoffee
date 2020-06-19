
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14212319 {
public MyHelperClass LOGGER;
	public MyHelperClass UPDATE_ITEM_STATEMENT;
	public MyHelperClass SELECT_ITEM_STATEMENT;
	public MyHelperClass closeConnection(){ return null; }
	public MyHelperClass getConnection(){ return null; }

//    @Override
    public String resolveItem(String oldJpgFsPath) throws DatabaseException {
        if (oldJpgFsPath == null || "".equals(oldJpgFsPath)) throw new NullPointerException("oldJpgFsPath");
        try {
            getConnection().setAutoCommit(false);
        } catch (UncheckedIOException e) {
            LOGGER.warn("Unable to set autocommit off",(SQLException)(Object) e);
        }
        PreparedStatement statement = null;
        String ret = null;
        try {
            statement =(PreparedStatement)(Object) getConnection().prepareStatement(SELECT_ITEM_STATEMENT);
            statement.setString(1, oldJpgFsPath);
            ResultSet rs =(ResultSet)(Object) statement.executeQuery();
            int i = 0;
            int id = -1;
            int rowsAffected = 0;
            while ((boolean)(Object)rs.next()) {
                id =(int)(Object) rs.getInt("id");
                ret =(String)(Object) rs.getString("imageFile");
                i++;
            }
            if (id != -1 && (boolean)(Object)new File(ret).exists()) {
                statement =(PreparedStatement)(Object) getConnection().prepareStatement(UPDATE_ITEM_STATEMENT);
                statement.setInt(1, id);
                rowsAffected =(int)(Object) statement.executeUpdate();
            } else {
                return null;
            }
            if (rowsAffected == 1) {
                getConnection().commit();
                LOGGER.debug("DB has been updated.");
            } else {
                getConnection().rollback();
                LOGGER.error("DB has not been updated -> rollback!");
            }
        } catch (UncheckedIOException e) {
            LOGGER.error((SQLException)(Object)e);
        } finally {
            closeConnection();
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, SQLException o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class DatabaseException extends Exception{
	public DatabaseException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}
