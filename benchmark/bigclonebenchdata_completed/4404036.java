


class c4404036 {

    public static void main(String[] argv) {
        ComboPooledDataSource cpds = null;
        Connection c = null;
        try {
            cpds = new ComboPooledDataSource();
            cpds.setDriverClass("org.postgresql.Driver");
            cpds.setJdbcUrl("jdbc:postgresql://localhost/c3p0-test");
            cpds.setUser("swaldman");
            cpds.setPassword("test");
            cpds.setMinPoolSize(5);
            cpds.setAcquireIncrement(5);
            cpds.setMaxPoolSize(20);
            c =(Connection)(Object) cpds.getConnection();
            c.setAutoCommit(false);
            Statement stmt =(Statement)(Object) c.createStatement();
            stmt.executeUpdate("CREATE TABLE pwtest_table (col1 char(5), col2 char(5))");
            ResultSet rs =(ResultSet)(Object) stmt.executeQuery("SELECT * FROM pwtest_table");
            System.err.println("rs: " + rs);
            System.err.println("rs.getStatement(): " + rs.getStatement());
            System.err.println("rs.getStatement().getConnection(): " + rs.getStatement().getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (c != null) c.rollback();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (cpds != null) cpds.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(){ return null; }}

class ComboPooledDataSource {

public MyHelperClass setUser(String o0){ return null; }
	public MyHelperClass setAcquireIncrement(int o0){ return null; }
	public MyHelperClass setPassword(String o0){ return null; }
	public MyHelperClass setMinPoolSize(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setMaxPoolSize(int o0){ return null; }
	public MyHelperClass setDriverClass(String o0){ return null; }
	public MyHelperClass setJdbcUrl(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getStatement(){ return null; }}
