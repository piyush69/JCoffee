


class c17116111 {
public MyHelperClass database;

    public void deleteType(String id) throws Exception {
        String tmp = "";
        PreparedStatement prepStmt = null;
        try {
            if (id == null || id.length() == 0) throw new Exception("Invalid parameter");
            MyHelperClass con = new MyHelperClass();
            con = database.getConnection();
            String delType = "delete from type where TYPE_ID='" + id + "'";
//            MyHelperClass con = new MyHelperClass();
            con.setAutoCommit(false);
//            MyHelperClass con = new MyHelperClass();
            prepStmt =(PreparedStatement)(Object) con.prepareStatement("delete from correlation where TYPE_ID='" + id + "' OR CORRELATEDTYPE_ID='" + id + "'");
            prepStmt.executeUpdate();
//            MyHelperClass con = new MyHelperClass();
            prepStmt =(PreparedStatement)(Object) con.prepareStatement("delete from composition where TYPE_ID='" + id + "'");
            prepStmt.executeUpdate();
//            MyHelperClass con = new MyHelperClass();
            prepStmt =(PreparedStatement)(Object) con.prepareStatement("delete from distribution where TYPE_ID='" + id + "'");
            prepStmt.executeUpdate();
//            MyHelperClass con = new MyHelperClass();
            prepStmt =(PreparedStatement)(Object) con.prepareStatement("delete from typename where TYPE_ID='" + id + "'");
            prepStmt.executeUpdate();
//            MyHelperClass con = new MyHelperClass();
            prepStmt =(PreparedStatement)(Object) con.prepareStatement("delete from typereference where TYPE_ID='" + id + "'");
            prepStmt.executeUpdate();
//            MyHelperClass con = new MyHelperClass();
            prepStmt =(PreparedStatement)(Object) con.prepareStatement("delete from plot where TYPE_ID='" + id + "'");
            prepStmt.executeUpdate();
//            MyHelperClass con = new MyHelperClass();
            prepStmt =(PreparedStatement)(Object) con.prepareStatement(delType);
            prepStmt.executeUpdate();
//            MyHelperClass con = new MyHelperClass();
            con.commit();
            prepStmt.close();
//            MyHelperClass con = new MyHelperClass();
            con.close();
        } catch (Exception e) {
            MyHelperClass con = new MyHelperClass();
            if (!(Boolean)(Object)con.isClosed()) {
//                MyHelperClass con = new MyHelperClass();
                con.rollback();
                prepStmt.close();
//                MyHelperClass con = new MyHelperClass();
                con.close();
            }
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isClosed(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
