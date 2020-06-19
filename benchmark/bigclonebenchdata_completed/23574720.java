import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23574720 {
public MyHelperClass DriverManager;
public MyHelperClass name;
	public MyHelperClass email;
	public MyHelperClass address1;
	public MyHelperClass password;
	public MyHelperClass city;
	public MyHelperClass country;
	public MyHelperClass connection;
	public MyHelperClass address2;
	public MyHelperClass url;
	public MyHelperClass postBox;
	public MyHelperClass lastName;
	public MyHelperClass firstName;
	public MyHelperClass middleName;

    public void insertProfile() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        PreparedStatement ps3 = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection =(Connection)(Object) DriverManager.getConnection(this.url);
            connection.setAutoCommit(false);
            String query1 = "INSERT INTO customers(name,password) VALUES(?,?)";
            ps1 =(PreparedStatement)(Object) connection.prepareStatement(query1);
            ps1.setString(1, this.name);
            ps1.setString(2, this.password);
            String query2 = "INSERT INTO customer_roles(name,role_name) VALUES(?,?)";
            ps2 =(PreparedStatement)(Object) connection.prepareStatement(query2);
            ps2.setString(1, this.name);
            ps2.setString(2, "user");
            String query3 = "INSERT INTO customers_profile(name,first_name,middle_name,last_name,address1,address2,city,post_box,email,country)" + "VALUES(?,?,?,?,?,?,?,?,?,?)";
            ps3 =(PreparedStatement)(Object) connection.prepareStatement(query3);
            ps3.setString(1, this.name);
            ps3.setString(2, this.firstName);
            ps3.setString(3, this.middleName);
            ps3.setString(4, this.lastName);
            ps3.setString(5, this.address1);
            ps3.setString(6, this.address2);
            ps3.setString(7, this.city);
            ps3.setString(8, this.postBox);
            ps3.setString(9, this.email);
            ps3.setString(10, this.country);
            ps1.executeUpdate();
            ps2.executeUpdate();
            ps3.executeUpdate();
            connection.commit();
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
            try {
                ps3.close();
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
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
