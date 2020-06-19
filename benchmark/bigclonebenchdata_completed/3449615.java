
import java.io.UncheckedIOException;


class c3449615 {
public MyHelperClass DriverManager;
	public MyHelperClass getProgramMessageSymbol(ResultSet o0){ return null; }

    public ProgramMessageSymbol addProgramMessageSymbol(int programID, String name, byte[] bytecode) throws AdaptationException {
        ProgramMessageSymbol programMessageSymbol = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        ResultSet resultSet = null;
        InputStream stream =(InputStream)(Object) new ByteArrayInputStream(bytecode);
        try {
            String query = "INSERT INTO ProgramMessageSymbols(programID, name, " + "bytecode) VALUES ( ?, ?, ? )";
            MyHelperClass CONN_STR = new MyHelperClass();
            connection =(Connection)(Object) DriverManager.getConnection(CONN_STR);
            preparedStatement =(PreparedStatement)(Object) connection.prepareStatement(query);
            preparedStatement.setInt(1, programID);
            preparedStatement.setString(2, name);
            preparedStatement.setBinaryStream(3, stream, bytecode.length);
            MyHelperClass log = new MyHelperClass();
            log.info("INSERT INTO ProgramMessageSymbols(programID, name, " + "bytecode) VALUES (" + programID + ", '" + name + "', " + "<bytecode>)");
            preparedStatement.executeUpdate();
            statement =(Statement)(Object) connection.createStatement();
            query = "SELECT * FROM ProgramMessageSymbols WHERE " + "programID =  " + programID + " AND " + "name      = '" + name + "'";
            resultSet =(ResultSet)(Object) statement.executeQuery(query);
            if (!(Boolean)(Object)resultSet.next()) {
                connection.rollback();
                String msg = "Attempt to add program message symbol failed.";
//                MyHelperClass log = new MyHelperClass();
                log.error(msg);
                ;
                throw new AdaptationException(msg);
            }
            programMessageSymbol =(ProgramMessageSymbol)(Object) getProgramMessageSymbol(resultSet);
            connection.commit();
        } catch (UncheckedIOException ex) {
            try {
                connection.rollback();
            } catch (Exception e) {
            }
            String msg = "SQLException in addProgramMessageSymbol";
            MyHelperClass log = new MyHelperClass();
            log.error(msg,(SQLException)(Object) ex);
            throw new AdaptationException(msg,(SQLException)(Object) ex);
        } finally {
            try {
                resultSet.close();
            } catch (Exception ex) {
            }
            try {
                preparedStatement.close();
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
        return programMessageSymbol;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass getConnection(MyHelperClass o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class ProgramMessageSymbol {

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
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setBinaryStream(int o0, InputStream o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class InputStream {

}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
