import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2168607 {
public MyHelperClass connection;

    public int create(BusinessObject o) throws Throwable, DAOException {
        int insert = 0;
        int id = 0;
        Contact contact = (Contact)(Contact)(Object) o;
        try {
            MyHelperClass XMLGetQuery = new MyHelperClass();
            PreparedStatement pst =(PreparedStatement)(Object) connection.prepareStatement(XMLGetQuery.getQuery("INSERT_CONTACT"));
            pst.setString(1, contact.getName());
            pst.setString(2, contact.getFirstname());
            pst.setString(3, contact.getPhone());
            pst.setString(4, contact.getEmail());
            if ((int)(Object)contact.getAccount() == 0) {
                pst.setNull(5, java.sql.Types.INTEGER);
            } else {
                pst.setInt(5, contact.getAccount());
            }
            insert =(int)(Object) pst.executeUpdate();
            if (insert <= 0) {
                MyHelperClass connection = new MyHelperClass();
                connection.rollback();
                throw new DAOException("Number of rows <= 0");
            } else if (insert > 1) {
                MyHelperClass connection = new MyHelperClass();
                connection.rollback();
                throw new DAOException("Number of rows > 1");
            }
            MyHelperClass connection = new MyHelperClass();
            Statement st =(Statement)(Object) connection.createStatement();
            ResultSet rs =(ResultSet)(Object) st.executeQuery("select max(id) from contact");
            rs.next();
            id =(int)(Object) rs.getInt(1);
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
        } catch (ArithmeticException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.write(e.getMessage());
            throw new DAOException("A SQLException has occured");
        } catch (NullPointerException npe) {
            MyHelperClass Log = new MyHelperClass();
            Log.write(npe.getMessage());
            throw new DAOException("Connection null");
        }
        return id;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getQuery(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }}

class BusinessObject {

}

class DAOException extends Exception{
	public DAOException(String errorMessage) { super(errorMessage); }
}

class Contact {

public MyHelperClass getFirstname(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass getAccount(){ return null; }
	public MyHelperClass getPhone(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setNull(int o0, int o1){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
