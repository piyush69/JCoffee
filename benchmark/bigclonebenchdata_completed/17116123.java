


class c17116123 {
public MyHelperClass usrIds;
	public MyHelperClass database;

    public void deleteAuthors() throws Exception {
        MyHelperClass proposalIds = new MyHelperClass();
        if (proposalIds.equals("") || usrIds.equals("")) throw new Exception("No proposal or author selected.");
//        MyHelperClass proposalIds = new MyHelperClass();
        String[] pids =(String[])(Object) proposalIds.split(",");
        MyHelperClass usrIds = new MyHelperClass();
        String[] uids =(String[])(Object) usrIds.split(",");
        int pnum = pids.length;
        int unum = uids.length;
        if (pnum == 0 || unum == 0) throw new Exception("No proposal or author selected.");
        int i, j;
        PreparedStatement prepStmt = null;
        try {
            MyHelperClass con = new MyHelperClass();
            con = database.getConnection();
//            MyHelperClass con = new MyHelperClass();
            con.setAutoCommit(false);
            String pStr = "delete from event where ACTION_ID='member added' AND PROPOSAL_ID=? AND SUBJECTUSR_ID=?";
//            MyHelperClass con = new MyHelperClass();
            prepStmt =(PreparedStatement)(Object) con.prepareStatement(pStr);
            for (i = 0; i < pnum; i++) {
                for (j = 0; j < unum; j++) {
                    MyHelperClass userId = new MyHelperClass();
                    if (!uids[j].equals(userId)) {
                        prepStmt.setString(1, pids[i]);
                        prepStmt.setString(2, uids[j]);
                        prepStmt.executeUpdate();
                    }
                }
            }
//            MyHelperClass con = new MyHelperClass();
            con.commit();
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
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
