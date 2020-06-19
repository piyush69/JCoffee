
import java.io.UncheckedIOException;


class c21817955 {
public MyHelperClass factory;
	public MyHelperClass close(DBOperation o0, PreparedStatement o1, ResultSet o2){ return null; }

    public void movePrior(String[] showOrder, String[] orgID, String targetShowOrder, String targetOrgID) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet result = null;
        int moveCount = showOrder.length;
        MyHelperClass POOL_NAME = new MyHelperClass();
        DBOperation dbo =(DBOperation)(Object) factory.createDBOperation(POOL_NAME);
        MyHelperClass Common = new MyHelperClass();
        String strQuery = "select show_order from " + Common.ORGANIZE_TABLE + " where show_order=" + showOrder[moveCount - 1] + " and organize_id= '" + orgID[moveCount - 1] + "'";
        try {
            con =(Connection)(Object) dbo.getConnection();
            con.setAutoCommit(false);
            ps =(PreparedStatement)(Object) con.prepareStatement(strQuery);
            result =(ResultSet)(Object) ps.executeQuery();
            int maxOrderNo = 0;
            if ((boolean)(Object)result.next()) {
                maxOrderNo =(int)(Object) result.getInt(1);
            }
            String[] sqls = new String[moveCount + 1];
//            MyHelperClass Common = new MyHelperClass();
            sqls[0] = "update " + Common.ORGANIZE_TABLE + " set show_order=" + maxOrderNo + " where show_order=" + targetShowOrder + " and organize_id= '" + targetOrgID + "'";
            for (int i = 0; i < showOrder.length; i++) {
//                MyHelperClass Common = new MyHelperClass();
                sqls[i + 1] = "update " + Common.ORGANIZE_TABLE + " set show_order=show_order-1" + " where show_order=" + showOrder[i] + " and organize_id= '" + orgID[i] + "'";
            }
            for (int j = 0; j < sqls.length; j++) {
                ps =(PreparedStatement)(Object) con.prepareStatement(sqls[j]);
                int resultCount =(int)(Object) ps.executeUpdate();
                if (resultCount != 1) {
                    throw new CesSystemException("Organize.movePrior(): ERROR Inserting data " + "in T_SYS_ORGANIZE update !! resultCount = " + resultCount);
                }
            }
            con.commit();
        } catch (UncheckedIOException se) {
            if (con != null) {
                con.rollback();
            }
            throw new CesSystemException("Organize.movePrior(): SQLException while mov organize order " + " :\n\t" + se);
        } finally {
            con.setAutoCommit(true);
            close(dbo, ps, result);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ORGANIZE_TABLE;
public MyHelperClass createDBOperation(MyHelperClass o0){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class CesSystemException extends Exception{
	public CesSystemException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
