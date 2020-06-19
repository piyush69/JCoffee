


class c3767539 {

//    @Test
    public void pk() throws Exception {
        MyHelperClass s = new MyHelperClass();
        Connection conn =(Connection)(Object) s.getConnection();
        conn.setAutoCommit(false);
        PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement("insert into t_test(t_name,t_cname,t_data,t_date,t_double) values(?,?,?,?,?)");
        for (int i = 10; i < 20; ++i) {
            ps.setString(1, "name-" + i);
            ps.setString(2, "cname-" + i);
            ps.setBlob(3, null);
            ps.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
            ps.setNull(5, java.sql.Types.DOUBLE);
            ps.executeUpdate();
        }
        conn.rollback();
        conn.setAutoCommit(true);
        ps.close();
        conn.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(){ return null; }}

class Test {

}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setTimestamp(int o0, Timestamp o1){ return null; }
	public MyHelperClass setBlob(int o0, Object o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setNull(int o0, int o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Timestamp {

Timestamp(){}
	Timestamp(long o0){}}
