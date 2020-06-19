
import java.io.UncheckedIOException;


class c23389978 {

    public static void importDocumentLines(Connection conn, String originDocumentID, String destinationDocumentID) throws SQLException {
        boolean defaultAutoCommit =(boolean)(Object) conn.getAutoCommit();
        String sqlQuery = "select ProductID,Description,PricePerUnit,Quantity,DiscountPCT,VATPCT,TotalNoVATPrice,TotalPrice from tbl_DocumentItem where DocumentID=?";
        String sqlInsert = "insert into tbl_DocumentItem (ProductID,Description,PricePerUnit,Quantity,DiscountPCT,VATPCT,TotalNoVATPrice,TotalPrice,DocumentID) values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            pstmt1 =(PreparedStatement)(Object) conn.prepareStatement(sqlQuery);
            pstmt2 =(PreparedStatement)(Object) conn.prepareStatement(sqlInsert);
            conn.setAutoCommit(false);
            pstmt1.setString(1, originDocumentID);
            ResultSet rs =(ResultSet)(Object) pstmt1.executeQuery();
            while ((boolean)(Object)rs.next()) {
                pstmt2.setInt(1, rs.getInt(1));
                pstmt2.setString(2,(String)(Object) rs.getString(2));
                pstmt2.setDouble(3, rs.getDouble(3));
                pstmt2.setDouble(4, rs.getDouble(4));
                pstmt2.setDouble(5, rs.getDouble(5));
                pstmt2.setDouble(6, rs.getDouble(6));
                pstmt2.setDouble(7, rs.getDouble(7));
                pstmt2.setDouble(8, rs.getDouble(8));
                pstmt2.setString(9, destinationDocumentID);
                pstmt2.executeUpdate();
            }
            rs.close();
            conn.commit();
        } catch (UncheckedIOException ex) {
            conn.rollback();
        } finally {
            conn.setAutoCommit(defaultAutoCommit);
            if (pstmt1 != null) pstmt1.close();
            if (pstmt2 != null) pstmt2.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setDouble(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass getDouble(int o0){ return null; }}
