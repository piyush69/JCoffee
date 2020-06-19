import java.io.*;
import java.lang.*;
import java.util.*;



class c18506484 {
public MyHelperClass NULL;
public MyHelperClass sqlError;
	public MyHelperClass getAllOptions(){ return null; }
	public MyHelperClass getTitle(){ return null; }

    private int addPollToDB(DataSource database) {
        int pollid = -2;
        Connection con = null;
        try {
            con =(Connection)(Object) database.getConnection();
            con.setAutoCommit(false);
            String add = "insert into polls" + " values( ?, ?, ?, ?)";
            PreparedStatement prepStatement =(PreparedStatement)(Object) con.prepareStatement(add);
            MyHelperClass selectedCourse = new MyHelperClass();
            prepStatement.setString(1, selectedCourse.getAdmin());
//            MyHelperClass selectedCourse = new MyHelperClass();
            prepStatement.setString(2, selectedCourse.getCourseId());
            prepStatement.setString(3, getTitle());
            prepStatement.setInt(4, 0);
            prepStatement.executeUpdate();
            String findNewID = "select max(pollid) from polls";
            prepStatement =(PreparedStatement)(Object) con.prepareStatement(findNewID);
            ResultSet newID =(ResultSet)(Object) prepStatement.executeQuery();
            pollid = -2;
            while ((boolean)(Object)newID.next()) {
                pollid =(int)(Object) newID.getInt(1);
            }
            if (pollid == -2) {
                boolean sqlError =(boolean)(Object) NULL; //new boolean();
                this.sqlError =(MyHelperClass)(Object) true;
                throw new Exception();
            }
            String[] options =(String[])(Object) getAllOptions();
            for (int i = 0; i < 4; i++) {
                String insertOption = "insert into polloptions values ( ?, ?, ? )";
                prepStatement =(PreparedStatement)(Object) con.prepareStatement(insertOption);
                prepStatement.setString(1, options[i]);
                prepStatement.setInt(2, 0);
                prepStatement.setInt(3, pollid);
                prepStatement.executeUpdate();
            }
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
        return pollid;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

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

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
