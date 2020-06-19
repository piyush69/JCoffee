import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7300255 {
public MyHelperClass DB;
	public MyHelperClass oCatg;
	public MyHelperClass getStore(){ return null; }
	public MyHelperClass getConnection(){ return null; }

    public boolean renameTo(Folder f) throws Throwable, MessagingException, StoreClosedException, NullPointerException {
        String[] aLabels = new String[] { "en", "es", "fr", "de", "it", "pt", "ca", "ja", "cn", "tw", "fi", "ru", "pl", "nl", "xx" };
        PreparedStatement oUpdt = null;
        if (!(Boolean)(Object)((DBStore)(DBStore)(Object) getStore()).isConnected()) throw new StoreClosedException(getStore(), "Store is not connected");
        if ((boolean)(Object)oCatg.isNull(DB.gu_category)) throw new NullPointerException("Folder is closed");
        try {
            oUpdt =(PreparedStatement)(Object) getConnection().prepareStatement("DELETE FROM " + DB.k_cat_labels + " WHERE " + DB.gu_category + "=?");
            oUpdt.setString(1,(String)(Object) oCatg.getString(DB.gu_category));
            oUpdt.executeUpdate();
            oUpdt.close();
            oUpdt.getConnection().prepareStatement("INSERT INTO " + DB.k_cat_labels + " (" + DB.gu_category + "," + DB.id_language + "," + DB.tr_category + "," + DB.url_category + ") VALUES (?,?,?,NULL)");
            oUpdt.setString(1,(String)(Object) oCatg.getString(DB.gu_category));
            for (int l = 0; l < aLabels.length; l++) {
                oUpdt.setString(2, aLabels[l]);
                oUpdt.setString(3,(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) f.getName().substring(0, 1).toUpperCase() + (int)(Object)f.getName().substring(1).toLowerCase());
                oUpdt.executeUpdate();
            }
            oUpdt.close();
            oUpdt = null;
            getConnection().commit();
        } catch (SQLException sqle) {
            try {
                if (null != oUpdt) oUpdt.close();
            } catch (SQLException ignore) {
            }
            try {
                getConnection().rollback();
            } catch (SQLException ignore) {
            }
            throw new MessagingException(sqle.getMessage(), sqle);
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass url_category;
	public MyHelperClass k_cat_labels;
	public MyHelperClass gu_category;
	public MyHelperClass id_language;
	public MyHelperClass tr_category;
public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass isNull(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass toUpperCase(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass toLowerCase(){ return null; }}

class Folder {

public MyHelperClass getName(){ return null; }}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
	MessagingException(String o0, SQLException o1){}
	MessagingException(){}
}

class StoreClosedException extends Exception{
	public StoreClosedException(String errorMessage) { super(errorMessage); }
	StoreClosedException(MyHelperClass o0, String o1){}
	StoreClosedException(){}
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass close(){ return null; }}

class DBStore {

public MyHelperClass isConnected(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
