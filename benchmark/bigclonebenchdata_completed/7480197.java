
import java.io.UncheckedIOException;


class c7480197 {

        public static int simpleUpdate(String query) throws SQLException {
            Connection conn = null;
            Statement st = null;
            try {
                MyHelperClass dataSource = new MyHelperClass();
                conn =(Connection)(Object) dataSource.getConnection();
                st =(Statement)(Object) conn.createStatement();
                int res =(int)(Object) st.executeUpdate(query);
                conn.commit();
                return res;
            } catch (UncheckedIOException e) {
                try {
                    conn.rollback();
                } catch (Exception e1) {
                }
                throw e;
            } finally {
                try {
                    st.close();
                } catch (Exception e) {
                }
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}
