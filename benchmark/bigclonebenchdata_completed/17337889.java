
import java.io.UncheckedIOException;


class c17337889 {
public MyHelperClass getCon(){ return null; }
	public MyHelperClass checkUser(String o0, String o1){ return null; }

    public int register(String name, String password, String email, String addr, String contactNo) {
        int uid = 0;
        int result = -1;
        try {
            getCon().setAutoCommit(false);
            if (!(Boolean)(Object)checkUser(name, password)) {
                PreparedStatement pstmt =(PreparedStatement)(Object) getCon().prepareStatement("insert into user(uname, upass, uemail, uaddr, ucontact)" + " values (?,?,?,?,?)");
                pstmt.setString(1, name);
                pstmt.setString(2, password);
                pstmt.setString(3, email);
                pstmt.setString(4, addr);
                pstmt.setString(5, contactNo);
                int num =(int)(Object) pstmt.executeUpdate();
                if (num == 1) {
                    ResultSet rs =(ResultSet)(Object) pstmt.getGeneratedKeys();
                    if ((boolean)(Object)rs.next()) {
                        result =(int)(Object) rs.getInt(1);
                    }
                }
            } else {
                result = -1;
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            result = -1;
            try {
                System.out.println("Transaction roll back due to errors");
                getCon().rollback();
            } catch (Exception ex) {
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass getGeneratedKeys(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
