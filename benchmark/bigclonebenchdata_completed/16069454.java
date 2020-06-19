


class c16069454 {
public MyHelperClass FidoDataSource;

    public int add(WebService ws) throws FidoDatabaseException {
        try {
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;
            try {
                String sql = "insert into WebServices (MethodName, ServiceURI) " + "values ('" + ws.getMethodName() + "', '" + ws.getServiceURI() + "')";
                conn =(Connection)(Object) FidoDataSource.getConnection();
                conn.setAutoCommit(false);
                stmt =(Statement)(Object) conn.createStatement();
                stmt.executeUpdate(sql);
                int id;
                sql = "select currval('webservices_webserviceid_seq')";
                rs =(ResultSet)(Object) stmt.executeQuery(sql);
                if ((boolean)(Object)rs.next() == false) throw new SQLException("No rows returned from select currval() query"); else id =(int)(Object) rs.getInt(1);
                PreparedStatement pstmt =(PreparedStatement)(Object) conn.prepareStatement("insert into WebServiceParams " + "(WebServiceId, Position, ParameterName, Type) " + "values (?, ?, ?, ?)");
                pstmt.setInt(1, id);
                pstmt.setInt(2, 0);
                pstmt.setString(3, null);
                pstmt.setInt(4,(int)(Object) ws.getReturnType());
                pstmt.executeUpdate();
                for (Iterator it =(Iterator)(Object) ws.parametersIterator();(boolean)(Object) it.hasNext(); ) {
                    WebServiceParameter param = (WebServiceParameter)(WebServiceParameter)(Object) it.next();
                    pstmt.setInt(2,(int)(Object) param.getPosition());
                    pstmt.setString(3, param.getName());
                    pstmt.setInt(4,(int)(Object) param.getType());
                    pstmt.executeUpdate();
                }
                conn.commit();
                return id;
            } catch (SQLException e) {
                if (conn != null) conn.rollback();
                throw e;
            } finally {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new FidoDatabaseException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(){ return null; }}

class WebService {

public MyHelperClass getMethodName(){ return null; }
	public MyHelperClass parametersIterator(){ return null; }
	public MyHelperClass getReturnType(){ return null; }
	public MyHelperClass getServiceURI(){ return null; }}

class FidoDatabaseException extends Exception{
	public FidoDatabaseException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, Object o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class WebServiceParameter {

public MyHelperClass getPosition(){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass getName(){ return null; }}
