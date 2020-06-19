
import java.io.UncheckedIOException;


class c12469139 {
public MyHelperClass DriverManager;
	public MyHelperClass getProgram(ResultSet o0){ return null; }

    public Program createNewProgram(int projectID, String name, String description) throws AdaptationException {
        Program program = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            MyHelperClass CONN_STR = new MyHelperClass();
            connection =(Connection)(Object) DriverManager.getConnection(CONN_STR);
            connection.setAutoCommit(false);
            statement =(Statement)(Object) connection.createStatement();
            String query = "INSERT INTO Programs(projectID, name, " + "description, sourcePath) VALUES ( " + projectID + ", " + "'" + name + "', " + "'" + description + "', " + "'" + "[unknown]" + "')";
            MyHelperClass log = new MyHelperClass();
            log.debug("SQL Query:\n" + query);
            statement.executeUpdate(query);
            query = "SELECT * FROM Programs WHERE " + " projectID   =  " + projectID + "  AND " + " name        = '" + name + "' AND " + " description = '" + description + "'";
            resultSet =(ResultSet)(Object) statement.executeQuery(query);
            if (!(Boolean)(Object)resultSet.next()) {
                connection.rollback();
                String msg = "Attempt to create program failed";
//                MyHelperClass log = new MyHelperClass();
                log.error(msg);
                throw new AdaptationException(msg);
            }
            program =(Program)(Object) getProgram(resultSet);
            connection.commit();
        } catch (UncheckedIOException ex) {
            try {
                connection.rollback();
            } catch (Exception e) {
            }
            String msg = "SQLException in createNewProgram";
            MyHelperClass log = new MyHelperClass();
            log.error(msg,(SQLException)(Object) ex);
            throw new AdaptationException(msg,(SQLException)(Object) ex);
        } finally {
            try {
                resultSet.close();
            } catch (Exception ex) {
            }
            try {
                statement.close();
            } catch (Exception ex) {
            }
            try {
                connection.close();
            } catch (Exception ex) {
            }
        }
        return program;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass getConnection(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class Program {

}

class AdaptationException extends Exception{
	public AdaptationException(String errorMessage) { super(errorMessage); }
	AdaptationException(String o0, SQLException o1){}
	AdaptationException(){}
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
