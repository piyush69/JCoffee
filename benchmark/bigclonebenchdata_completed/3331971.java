
import java.io.UncheckedIOException;


class c3331971 {
public MyHelperClass accessibility;
	public MyHelperClass userId;
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getTags(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getRequestCycle(){ return null; }

    protected void onSubmit() {
        try {
            Connection conn =(Connection)(Object) ((JdbcRequestCycle)(JdbcRequestCycle)(Object) getRequestCycle()).getConnection();
            String sql = "insert into entry (author, accessibility) values(?,?)";
            PreparedStatement pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
            pstmt.setInt(1, userId);
            pstmt.setInt(2, accessibility.getId());
            pstmt.executeUpdate();
            ResultSet insertedEntryIdRs =(ResultSet)(Object) pstmt.getGeneratedKeys();
            insertedEntryIdRs.next();
            int insertedEntryId =(int)(Object) insertedEntryIdRs.getInt(1);
            sql = "insert into revisions (title, entry, content, tags," + " revision_remark) values(?,?,?,?,?)";
            PreparedStatement pstmt2 =(PreparedStatement)(Object) conn.prepareStatement(sql);
            pstmt2.setString(1, getTitle());
            pstmt2.setInt(2, insertedEntryId);
            pstmt2.setString(3, getContent());
            pstmt2.setString(4, getTags());
            pstmt2.setString(5, "newly added");
            int insertCount =(int)(Object) pstmt2.executeUpdate();
            if (insertCount > 0) {
                info("Successfully added one new record.");
            } else {
                conn.rollback();
                info("Addition of one new record failed.");
            }
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getId(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class JdbcRequestCycle {

public MyHelperClass getConnection(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass getGeneratedKeys(){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
