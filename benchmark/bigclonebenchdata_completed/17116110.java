


class c17116110 {
public MyHelperClass database;

    public void deleteProposal(String id) throws Exception {
        String tmp = "";
        PreparedStatement prepStmt = null;
        try {
            if (id == null || id.length() == 0) throw new Exception("Invalid parameter");
            MyHelperClass con = new MyHelperClass();
            con = database.getConnection();
            String delProposal = "delete from proposal where PROPOSAL_ID='" + id + "'";
//            MyHelperClass con = new MyHelperClass();
            prepStmt =(PreparedStatement)(Object) con.prepareStatement(delProposal);
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
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
