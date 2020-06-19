
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4830850 {
public MyHelperClass logger;
	public MyHelperClass releaseConnection(Connection o0){ return null; }
public MyHelperClass DefaultDatabaseHandler;
	public MyHelperClass Level;
	public MyHelperClass DebugPreparedStatement;
	public MyHelperClass getHardDiskElementsSchemaAndTableName(){ return null; }
	public MyHelperClass getHardDiskInvocationsSchemaAndTableName(){ return null; }
	public MyHelperClass getConnection(){ return null; }

//    @Override
    public synchronized void deleteHardDiskStatistics(String contextName, String path, Date dateFrom, Date dateTo) throws DatabaseException {
        final Connection connection =(Connection)(Object) this.getConnection();
        try {
            connection.setAutoCommit(false);
            String queryString = "DELETE " + this.getHardDiskInvocationsSchemaAndTableName() + " FROM " + this.getHardDiskInvocationsSchemaAndTableName() + " INNER JOIN " + this.getHardDiskElementsSchemaAndTableName() + " ON " + this.getHardDiskElementsSchemaAndTableName() + ".element_id =  " + this.getHardDiskInvocationsSchemaAndTableName() + ".element_id WHERE ";
            if (contextName != null) {
                queryString = queryString + " context_name LIKE ? AND ";
            }
            if (path != null) {
                queryString = queryString + " path LIKE ? AND ";
            }
            if (dateFrom != null) {
                queryString = queryString + " start_timestamp >= ? AND ";
            }
            if (dateTo != null) {
                queryString = queryString + " start_timestamp <= ? AND ";
            }
            queryString =(String)(Object) DefaultDatabaseHandler.removeOrphanWhereAndAndFromSelect(queryString);
            final PreparedStatement preparedStatement =(PreparedStatement)(Object) DebugPreparedStatement.prepareStatement(connection, queryString);
            int indexCounter = 1;
            if (contextName != null) {
                preparedStatement.setString(indexCounter, contextName);
                indexCounter = indexCounter + 1;
            }
            if (path != null) {
                preparedStatement.setString(indexCounter, path);
                indexCounter = indexCounter + 1;
            }
            if (dateFrom != null) {
                preparedStatement.setTimestamp(indexCounter, new Timestamp(dateFrom.getTime()));
                indexCounter = indexCounter + 1;
            }
            if (dateTo != null) {
                preparedStatement.setTimestamp(indexCounter, new Timestamp(dateTo.getTime()));
                indexCounter = indexCounter + 1;
            }
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.commit();
        } catch (final UncheckedIOException e) {
            try {
                connection.rollback();
            } catch (final UncheckedIOException ex) {
                logger.log(Level.SEVERE, "Transaction rollback error.",(SQLException)(Object) ex);
            }
            logger.log(Level.SEVERE, e.getMessage());
            throw new DatabaseException("Error deleting disk statistics.",(SQLException)(Object) e);
        } finally {
            this.releaseConnection(connection);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass prepareStatement(Connection o0, String o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, SQLException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass removeOrphanWhereAndAndFromSelect(String o0){ return null; }}

class Date {

public MyHelperClass getTime(){ return null; }}

class DatabaseException extends Exception{
	public DatabaseException(String errorMessage) { super(errorMessage); }
	DatabaseException(String o0, SQLException o1){}
	DatabaseException(){}
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setTimestamp(int o0, Timestamp o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Timestamp {

Timestamp(MyHelperClass o0){}
	Timestamp(){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
