
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4830851 {
public MyHelperClass logger;
	public MyHelperClass releaseConnection(Connection o0){ return null; }
public MyHelperClass Level;
	public MyHelperClass DebugPreparedStatement;
	public MyHelperClass getJvmInvocationsSchemaAndTableName(){ return null; }
	public MyHelperClass getCallElementsSchemaAndTableName(){ return null; }
	public MyHelperClass getCallPrincipalsSchemaAndTableName(){ return null; }
	public MyHelperClass getCallExceptionsSchemaAndTableName(){ return null; }
	public MyHelperClass getPersistenceEntityStatisticsSchemaAndTableName(){ return null; }
	public MyHelperClass getPersistenceQueryElementsSchemaAndTableName(){ return null; }
	public MyHelperClass getPersistenceEntityElementsSchemaAndTableName(){ return null; }
	public MyHelperClass getPersistenceQueryStatisticsSchemaAndTableName(){ return null; }
	public MyHelperClass getCallInvocationsSchemaAndTableName(){ return null; }
	public MyHelperClass getHttpSessionInvocationsSchemaAndTableName(){ return null; }
	public MyHelperClass getIdChache(){ return null; }
	public MyHelperClass getJvmElementsSchemaAndTableName(){ return null; }
	public MyHelperClass getHardDiskElementsSchemaAndTableName(){ return null; }
	public MyHelperClass getHttpSessionElementsSchemaAndTableName(){ return null; }
	public MyHelperClass getHardDiskInvocationsSchemaAndTableName(){ return null; }
	public MyHelperClass getConnection(){ return null; }

//    @Override
    protected void removeOrphansElements() throws DatabaseException {
        this.getIdChache().clear();
        final Connection connection =(Connection)(Object) this.getConnection();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement;
            preparedStatement =(PreparedStatement)(Object) DebugPreparedStatement.prepareStatement(connection, "DELETE " + this.getCallElementsSchemaAndTableName() + " FROM " + this.getCallElementsSchemaAndTableName() + " LEFT JOIN " + this.getCallInvocationsSchemaAndTableName() + " ON " + this.getCallElementsSchemaAndTableName() + ".element_id =  " + this.getCallInvocationsSchemaAndTableName() + ".element_id WHERE " + this.getCallInvocationsSchemaAndTableName() + ".element_id IS NULL");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            preparedStatement =(PreparedStatement)(Object) DebugPreparedStatement.prepareStatement(connection, "DELETE " + this.getCallExceptionsSchemaAndTableName() + " FROM " + this.getCallExceptionsSchemaAndTableName() + " LEFT JOIN " + this.getCallInvocationsSchemaAndTableName() + " ON " + this.getCallExceptionsSchemaAndTableName() + ".exception_id =  " + this.getCallInvocationsSchemaAndTableName() + ".exception_id WHERE " + this.getCallInvocationsSchemaAndTableName() + ".exception_id IS NULL");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            preparedStatement =(PreparedStatement)(Object) DebugPreparedStatement.prepareStatement(connection, "DELETE " + this.getCallPrincipalsSchemaAndTableName() + " FROM " + this.getCallPrincipalsSchemaAndTableName() + " LEFT JOIN " + this.getCallInvocationsSchemaAndTableName() + " ON " + this.getCallPrincipalsSchemaAndTableName() + ".principal_id =  " + this.getCallInvocationsSchemaAndTableName() + ".principal_id WHERE " + this.getCallInvocationsSchemaAndTableName() + ".principal_id IS NULL");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            preparedStatement =(PreparedStatement)(Object) DebugPreparedStatement.prepareStatement(connection, "DELETE " + this.getHttpSessionElementsSchemaAndTableName() + " FROM " + this.getHttpSessionElementsSchemaAndTableName() + " LEFT JOIN " + this.getHttpSessionInvocationsSchemaAndTableName() + " ON " + this.getHttpSessionElementsSchemaAndTableName() + ".element_id =  " + this.getHttpSessionInvocationsSchemaAndTableName() + ".element_id WHERE " + this.getHttpSessionInvocationsSchemaAndTableName() + ".element_id IS NULL");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            preparedStatement =(PreparedStatement)(Object) DebugPreparedStatement.prepareStatement(connection, "DELETE " + this.getJvmElementsSchemaAndTableName() + " FROM " + this.getJvmElementsSchemaAndTableName() + " LEFT JOIN " + this.getJvmInvocationsSchemaAndTableName() + " ON " + this.getJvmElementsSchemaAndTableName() + ".element_id =  " + this.getJvmInvocationsSchemaAndTableName() + ".element_id WHERE " + this.getJvmInvocationsSchemaAndTableName() + ".element_id IS NULL");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            preparedStatement =(PreparedStatement)(Object) DebugPreparedStatement.prepareStatement(connection, "DELETE " + this.getPersistenceEntityElementsSchemaAndTableName() + " FROM " + this.getPersistenceEntityElementsSchemaAndTableName() + " LEFT JOIN " + this.getPersistenceEntityStatisticsSchemaAndTableName() + " ON " + this.getPersistenceEntityElementsSchemaAndTableName() + ".element_id =  " + this.getPersistenceEntityStatisticsSchemaAndTableName() + ".element_id WHERE " + this.getPersistenceEntityStatisticsSchemaAndTableName() + ".element_id IS NULL ");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            preparedStatement =(PreparedStatement)(Object) DebugPreparedStatement.prepareStatement(connection, "DELETE " + this.getPersistenceQueryElementsSchemaAndTableName() + " FROM " + this.getPersistenceQueryElementsSchemaAndTableName() + " LEFT JOIN " + this.getPersistenceQueryStatisticsSchemaAndTableName() + " ON " + this.getPersistenceQueryElementsSchemaAndTableName() + ".element_id =  " + this.getPersistenceQueryStatisticsSchemaAndTableName() + ".element_id WHERE " + this.getPersistenceQueryStatisticsSchemaAndTableName() + ".element_id IS NULL ");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            preparedStatement =(PreparedStatement)(Object) DebugPreparedStatement.prepareStatement(connection, "DELETE " + this.getHardDiskElementsSchemaAndTableName() + " FROM " + this.getHardDiskElementsSchemaAndTableName() + " LEFT JOIN " + this.getHardDiskInvocationsSchemaAndTableName() + " ON " + this.getHardDiskElementsSchemaAndTableName() + ".element_id =  " + this.getHardDiskInvocationsSchemaAndTableName() + ".element_id WHERE " + this.getHardDiskInvocationsSchemaAndTableName() + ".element_id IS NULL ");
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
            throw new DatabaseException("Error cleaning database.",(SQLException)(Object) e);
        } finally {
            this.releaseConnection(connection);
        }
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass prepareStatement(Connection o0, String o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, SQLException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass clear(){ return null; }}

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

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
