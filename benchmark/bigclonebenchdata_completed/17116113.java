


class c17116113 {
public MyHelperClass database;

    public void deleteSingle(String tbName, String idFld, String id) throws Exception {
        String tmp = "";
        PreparedStatement prepStmt = null;
        try {
            if (tbName == null || tbName.length() == 0 || id == null || id.length() == 0) throw new Exception("Invalid parameter");
            MyHelperClass con = new MyHelperClass();
            con = database.getConnection();
            String delSQL = "delete from " + tbName + " where " + idFld + "='" + id + "'";
//            MyHelperClass con = new MyHelperClass();
            con.setAutoCommit(false);
//            MyHelperClass con = new MyHelperClass();
            prepStmt =(PreparedStatement)(Object) con.prepareStatement(delSQL);
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
