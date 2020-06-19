import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23574721 {
public MyHelperClass DriverManager;
public MyHelperClass name;
	public MyHelperClass email;
	public MyHelperClass address1;
	public MyHelperClass city;
	public MyHelperClass password;
	public MyHelperClass country;
	public MyHelperClass connection;
	public MyHelperClass address2;
	public MyHelperClass url;
	public MyHelperClass postBox;
	public MyHelperClass lastName;
	public MyHelperClass firstName;
	public MyHelperClass middleName;

    public void updateProfile() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection =(Connection)(Object) DriverManager.getConnection(this.url);
            connection.setAutoCommit(false);
            String query2 = "UPDATE customers SET password=? WHERE name=?";
            String query3 = "UPDATE customers_profile " + "SET first_name=?,middle_name=?,last_name=?,address1=?" + ",address2=?,city=?,post_box=?,email=?,country=? WHERE name=?";
            ps1 =(PreparedStatement)(Object) connection.prepareStatement(query3);
            ps2 =(PreparedStatement)(Object) connection.prepareStatement(query2);
            ps1.setString(1, this.firstName);
            ps1.setString(2, this.middleName);
            ps1.setString(3, this.lastName);
            ps1.setString(4, this.address1);
            ps1.setString(5, this.address2);
            ps1.setString(6, this.city);
            ps1.setString(7, this.postBox);
            ps1.setString(8, this.email);
            ps1.setString(9, this.country);
            ps1.setString(10, this.name);
            ps2.setString(1, this.password);
            ps2.setString(2, this.name);
            ps1.executeUpdate();
            ps2.executeUpdate();
        } catch (Exception ex) {
            connection.rollback();
        } finally {
            try {
                this.connection.close();
            } catch (Exception ex) {
            }
            try {
                ps1.close();
            } catch (Exception ex) {
            }
            try {
                ps2.close();
            } catch (Exception ex) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }
	public MyHelperClass getConnection(MyHelperClass o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
