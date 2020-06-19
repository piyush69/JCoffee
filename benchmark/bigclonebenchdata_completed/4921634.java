import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4921634 {
public MyHelperClass connection;

    public int update(BusinessObject o) throws Throwable, DAOException {
        int update = 0;
        Item item = (Item)(Item)(Object) o;
        try {
            MyHelperClass XMLGetQuery = new MyHelperClass();
            PreparedStatement pst =(PreparedStatement)(Object) connection.prepareStatement(XMLGetQuery.getQuery("UPDATE_ITEM"));
            pst.setString(1, item.getDescription());
            pst.setDouble(2, item.getUnit_price());
            pst.setInt(3, item.getQuantity());
            pst.setDouble(4, item.getVat());
            pst.setInt(5, item.getIdProject());
            if ((int)(Object)item.getIdBill() == 0) pst.setNull(6, java.sql.Types.INTEGER); else pst.setInt(6, item.getIdBill());
            pst.setInt(7, item.getIdCurrency());
            pst.setInt(8, item.getId());
            System.out.println("item => " + item.getDescription() + " " + item.getUnit_price() + " " + item.getQuantity() + " " + item.getVat() + " " + item.getIdProject() + " " + item.getIdBill() + " " + item.getIdCurrency() + " " + item.getId());
            update =(int)(Object) pst.executeUpdate();
            if (update <= 0) {
                MyHelperClass connection = new MyHelperClass();
                connection.rollback();
                throw new DAOException("Number of rows <= 0");
            } else if (update > 1) {
                MyHelperClass connection = new MyHelperClass();
                connection.rollback();
                throw new DAOException("Number of rows > 1");
            }
            MyHelperClass connection = new MyHelperClass();
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
        return update;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getQuery(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }}

class BusinessObject {

}

class DAOException extends Exception{
	public DAOException(String errorMessage) { super(errorMessage); }
}

class Item {

public MyHelperClass getUnit_price(){ return null; }
	public MyHelperClass getVat(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getIdBill(){ return null; }
	public MyHelperClass getIdCurrency(){ return null; }
	public MyHelperClass getQuantity(){ return null; }
	public MyHelperClass getIdProject(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setNull(int o0, int o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setDouble(int o0, MyHelperClass o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
