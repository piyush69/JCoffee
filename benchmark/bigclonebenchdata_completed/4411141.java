import java.io.*;
import java.lang.*;
import java.util.*;



class c4411141 {
public MyHelperClass checkDupDoc(String o0, Connection o1){ return null; }
public MyHelperClass selectedCourse;
	public MyHelperClass homePage;
	public MyHelperClass sqlError;
	public MyHelperClass getLink(){ return null; }
	public MyHelperClass getTitle(){ return null; }
	public MyHelperClass findTypeOfDoc(String o0){ return null; }
	public MyHelperClass getTimeStamp(){ return null; }
	public MyHelperClass getText(){ return null; }

    private void addDocToDB(String action, DataSource database) {
        String typeOfDoc =(String)(Object) findTypeOfDoc(action).trim().toLowerCase();
        Connection con = null;
        try {
            con =(Connection)(Object) database.getConnection();
            con.setAutoCommit(false);
            checkDupDoc(typeOfDoc, con);
            String add = "insert into " + typeOfDoc + " values( ?, ?, ?, ?, ?, ?, ? )";
            PreparedStatement prepStatement =(PreparedStatement)(Object) con.prepareStatement(add);
            prepStatement.setString(1, selectedCourse.getCourseId());
            prepStatement.setString(2, selectedCourse.getAdmin());
            prepStatement.setTimestamp(3, getTimeStamp());
            prepStatement.setString(4, getLink());
            prepStatement.setString(5, homePage.getUser());
            prepStatement.setString(6, getText());
            prepStatement.setString(7, getTitle());
            prepStatement.executeUpdate();
            prepStatement.close();
            con.commit();
        } catch (Exception e) {
            sqlError =(MyHelperClass)(Object) true;
            e.printStackTrace();
            if (con != null) try {
                con.rollback();
            } catch (Exception logOrIgnore) {
            }
            try {
                throw e;
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } finally {
            if (con != null) try {
                con.close();
            } catch (Exception logOrIgnore) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getUser(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass getAdmin(){ return null; }
	public MyHelperClass getCourseId(){ return null; }}

class DataSource {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setTimestamp(int o0, MyHelperClass o1){ return null; }}
