import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5607440 {
public MyHelperClass DriverManager;
public MyHelperClass cart;
	public MyHelperClass jdbcURL;

    public void updateShoppingBean(String userId) {
        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection =(Connection)(Object) DriverManager.getConnection(this.jdbcURL);
            connection.setAutoCommit(false);
            String preparedQuery = "INSERT INTO dbComputerShopping.order(name,product_id,quantity,date,status)VALUES(?,?,?,?,?)";
            preparedStatement1 =(PreparedStatement)(Object) connection.prepareStatement(preparedQuery);
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String orderDate =(String)(Object) format.format(date);
            Iterator iterator =(Iterator)(Object) this.cart.iterator();
            Object[] shoppingInfo = null;
            while (iterator.hasNext()) {
                shoppingInfo = (Object[]) iterator.next();
                ProductBean product = (ProductBean) shoppingInfo[0];
                int quantity = (Integer) shoppingInfo[1];
                preparedStatement1.setString(1, userId);
                preparedStatement1.setInt(2,(int)(Object) product.getId());
                preparedStatement1.setInt(3, quantity);
                preparedStatement1.setString(4, orderDate);
                preparedStatement1.setString(5, "confirmed");
                preparedStatement1.executeUpdate();
            }
            Object[] cartInfo = null;
            preparedQuery = "UPDATE components SET quantity=quantity-? WHERE comp_id=?";
            preparedStatement2 =(PreparedStatement)(Object) connection.prepareStatement(preparedQuery);
            for (Iterator i =(Iterator)(Object) this.cart.iterator(); i.hasNext(); ) {
                cartInfo = (Object[]) i.next();
                ProductBean product = (ProductBean) cartInfo[0];
                int quantity = (Integer) cartInfo[1];
                ProductListBean productList = new ProductListBean(jdbcURL);
                ArrayList components =(ArrayList)(Object) productList.getComponents(product.getId());
                for (Iterator j = components.iterator(); j.hasNext(); ) {
                    ComponentBean component = (ComponentBean) j.next();
                    preparedStatement2.setInt(1, quantity);
                    preparedStatement2.setInt(2,(int)(Object) component.getId());
                    preparedStatement2.executeUpdate();
                }
            }
            connection.commit();
        } catch (Exception ex) {
            try {
                connection.rollback();
            } catch (UncheckedIOException e) {
            }
        } finally {
            try {
                connection.close();
            } catch (UncheckedIOException ex) {
            }
            try {
                preparedStatement1.close();
            } catch (UncheckedIOException ex) {
            }
            try {
                preparedStatement2.close();
            } catch (UncheckedIOException ex) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(MyHelperClass o0){ return null; }
	public MyHelperClass iterator(){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass format(Date o0){ return null; }}

class ProductBean {

public MyHelperClass getId(){ return null; }}

class ProductListBean {

ProductListBean(MyHelperClass o0){}
	ProductListBean(){}
	public MyHelperClass getComponents(MyHelperClass o0){ return null; }}

class ComponentBean {

public MyHelperClass getId(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
