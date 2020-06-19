


class c20265649 {

    public static void setFinishedFlag(String ip, String port, String user, String dbname, String password, int flag) throws Exception {
        String sql = "update flag set flag = " + flag;
        MyHelperClass CubridDBCenter = new MyHelperClass();
        Connection conn =(Connection)(Object) CubridDBCenter.getConnection(ip, port, dbname, user, password);
        System.out.println("====:::===" + ip);
        Statement stmt = null;
        try {
            conn.setAutoCommit(false);
            stmt =(Statement)(Object) conn.createStatement();
            stmt.executeUpdate(sql);
            conn.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            conn.rollback();
            throw ex;
        } finally {
            stmt.close();
            conn.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(String o0, String o1, String o2, String o3, String o4){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}
