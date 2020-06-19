
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5410594 {
public MyHelperClass getRoomKey(){ return null; }

//    @Override
    public void insert(Connection conn) throws SQLException {
        PreparedStatement objectInsert = null;
        String sqlString = null;
        int newID = 0;
        try {
            conn.setAutoCommit(false);
            sqlString = "SELECT NEXTVAL(OBJ_SEQ) AS NEXTVAL";
            objectInsert =(PreparedStatement)(Object) conn.prepareStatement(sqlString);
            ResultSet r =(ResultSet)(Object) objectInsert.executeQuery(sqlString);
            newID =(int)(Object) r.getInt("NEXTVAL");
            sqlString = "INSERT INTO OBJECTS" + "(" + "OBJ_ID," + "OBJ_NAME," + "OBTY_CDE" + ")" + "VALUES" + "(" + "?," + "?," + "?" + ")" + "";
            objectInsert =(PreparedStatement)(Object) conn.prepareStatement(sqlString);
            objectInsert.setInt(1, newID);
            objectInsert.setString(2, getRoomKey());
            objectInsert.setString(3, "ROOM");
            objectInsert.executeUpdate();
            sqlString = "INSERT INTO ROOMS" + "(" + "";
            conn.commit();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            if (conn != null) {
                try {
                    System.err.print("Transaction is being rolled back");
                    conn.rollback();
                } catch (UncheckedIOException excep) {
                    excep.printStackTrace();
                }
            }
        } finally {
            if (objectInsert != null) {
                objectInsert.close();
            }
            conn.setAutoCommit(true);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class ResultSet {

public MyHelperClass getInt(String o0){ return null; }}
