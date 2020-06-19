
import java.io.UncheckedIOException;


class c21186038 {
public MyHelperClass DriverManager;
	public MyHelperClass getProject(ResultSet o0){ return null; }

    public Project deleteProject(int projectID) throws AdaptationException {
        Project project = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM Projects WHERE id = " + projectID;
            MyHelperClass CONN_STR = new MyHelperClass();
            connection =(Connection)(Object) DriverManager.getConnection(CONN_STR);
            statement =(Statement)(Object) connection.createStatement();
            resultSet =(ResultSet)(Object) statement.executeQuery(query);
            if (!(Boolean)(Object)resultSet.next()) {
                connection.rollback();
                String msg = "Attempt to delete project failed.";
                MyHelperClass log = new MyHelperClass();
                log.error(msg);
                throw new AdaptationException(msg);
            }
            project =(Project)(Object) getProject(resultSet);
            query = "DELETE FROM Projects WHERE id = " + projectID;
            statement.executeUpdate(query);
            connection.commit();
        } catch (UncheckedIOException ex) {
            try {
                connection.rollback();
            } catch (Exception e) {
            }
            String msg = "SQLException in deleteProject";
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
        return project;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass getConnection(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class Project {

}

class AdaptationException extends Exception{
	public AdaptationException(String errorMessage) { super(errorMessage); }
	AdaptationException(String o0, SQLException o1){}
	AdaptationException(){}
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass rollback(){ return null; }
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
