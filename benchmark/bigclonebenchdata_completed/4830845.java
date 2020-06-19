
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4830845 {
public MyHelperClass logger;
	public MyHelperClass releaseConnection(Connection o0){ return null; }
public MyHelperClass DefaultDatabaseHandler;
	public MyHelperClass Level;
	public MyHelperClass DebugPreparedStatement;
	public MyHelperClass getCallElementsSchemaAndTableName(){ return null; }
	public MyHelperClass getCallPrincipalsSchemaAndTableName(){ return null; }
	public MyHelperClass getCallInvocationsSchemaAndTableName(){ return null; }
	public MyHelperClass getConnection(){ return null; }

//    @Override
    public synchronized void deleteCallStatistics(Integer elementId, String contextName, String category, String project, String name, Date dateFrom, Date dateTo, Boolean extractException, String principal) throws DatabaseException {
        final Connection connection =(Connection)(Object) this.getConnection();
        try {
            connection.setAutoCommit(false);
            String queryString = "DELETE " + this.getCallInvocationsSchemaAndTableName() + " FROM " + this.getCallInvocationsSchemaAndTableName() + " INNER JOIN " + this.getCallElementsSchemaAndTableName() + " ON " + this.getCallElementsSchemaAndTableName() + ".element_id =  " + this.getCallInvocationsSchemaAndTableName() + ".element_id ";
            if (principal != null) {
                queryString = queryString + "LEFT JOIN " + this.getCallPrincipalsSchemaAndTableName() + " ON " + this.getCallInvocationsSchemaAndTableName() + ".principal_id = " + this.getCallPrincipalsSchemaAndTableName() + ".principal_id ";
            }
            queryString = queryString + "WHERE ";
            if (elementId != null) {
                queryString = queryString + this.getCallElementsSchemaAndTableName() + ".elementId = ? AND ";
            }
            if (contextName != null) {
                queryString = queryString + this.getCallElementsSchemaAndTableName() + ".context_name LIKE ? AND ";
            }
            if ((category != null)) {
                queryString = queryString + this.getCallElementsSchemaAndTableName() + ".category LIKE ? AND ";
            }
            if ((project != null)) {
                queryString = queryString + this.getCallElementsSchemaAndTableName() + ".project LIKE ? AND ";
            }
            if ((name != null)) {
                queryString = queryString + this.getCallElementsSchemaAndTableName() + ".name LIKE ? AND ";
            }
            if (dateFrom != null) {
                queryString = queryString + this.getCallInvocationsSchemaAndTableName() + ".start_timestamp >= ? AND ";
            }
            if (dateTo != null) {
                queryString = queryString + this.getCallInvocationsSchemaAndTableName() + ".start_timestamp <= ? AND ";
            }
            if (principal != null) {
                queryString = queryString + this.getCallPrincipalsSchemaAndTableName() + ".principal_name LIKE ? AND ";
            }
            if (extractException != null) {
                if (extractException.booleanValue()) {
                    queryString = queryString + this.getCallInvocationsSchemaAndTableName() + ".exception_id IS NOT NULL AND ";
                } else {
                    queryString = queryString + this.getCallInvocationsSchemaAndTableName() + ".exception_id IS NULL AND ";
                }
            }
            queryString =(String)(Object) DefaultDatabaseHandler.removeOrphanWhereAndAndFromSelect(queryString);
            final PreparedStatement preparedStatement =(PreparedStatement)(Object) DebugPreparedStatement.prepareStatement(connection, queryString);
            int indexCounter = 1;
            if (elementId != null) {
                preparedStatement.setLong(indexCounter, elementId.longValue());
                indexCounter = indexCounter + 1;
            }
            if (contextName != null) {
                preparedStatement.setString(indexCounter, contextName);
                indexCounter = indexCounter + 1;
            }
            if ((category != null)) {
                preparedStatement.setString(indexCounter, category);
                indexCounter = indexCounter + 1;
            }
            if ((project != null)) {
                preparedStatement.setString(indexCounter, project);
                indexCounter = indexCounter + 1;
            }
            if ((name != null)) {
                preparedStatement.setString(indexCounter, name);
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
            if (principal != null) {
                preparedStatement.setString(indexCounter, principal);
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
            throw new DatabaseException("Error deleting call statistics.",(SQLException)(Object) e);
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

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass setTimestamp(int o0, Timestamp o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class Timestamp {

Timestamp(MyHelperClass o0){}
	Timestamp(){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
