import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7300250 {
public MyHelperClass NULL;
public MyHelperClass READ_WRITE;
	public MyHelperClass MODE_BLOB;
	public MyHelperClass MODE_MBOX;
public MyHelperClass iOpenMode;
	public MyHelperClass DebugFile;
	public MyHelperClass sFolderDir;
	public MyHelperClass oCatg;
	public MyHelperClass DB;
	public MyHelperClass ResultSet;
	public MyHelperClass Gadgets;
	public MyHelperClass oConn;
	public MyHelperClass getStore(){ return null; }
	public MyHelperClass getCategory(){ return null; }
	public MyHelperClass getConnection(){ return null; }

    public void open(int mode) throws Throwable, MessagingException {
        MyHelperClass READ_ONLY = new MyHelperClass();
        final int ALL_OPTIONS =(int)(Object) READ_ONLY | (int)(Object)READ_WRITE | (int)(Object)MODE_MBOX | (int)(Object)MODE_BLOB;
        MyHelperClass DebugFile = new MyHelperClass();
        if ((boolean)(Object)DebugFile.trace) {
//            MyHelperClass DebugFile = new MyHelperClass();
            DebugFile.writeln("DBFolder.open(" + String.valueOf(mode) + ")");
//            MyHelperClass DebugFile = new MyHelperClass();
            DebugFile.incIdent();
        }
//        MyHelperClass READ_ONLY = new MyHelperClass();
        if ((0 == (mode & (int)(Object)READ_ONLY)) && (0 == (mode & (int)(Object)READ_WRITE))) {
//            MyHelperClass DebugFile = new MyHelperClass();
            if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
            throw new MessagingException("Folder must be opened in either READ_ONLY or READ_WRITE mode");
        } else if (ALL_OPTIONS != (mode | ALL_OPTIONS)) {
//            MyHelperClass DebugFile = new MyHelperClass();
            if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
            throw new MessagingException("Invalid DBFolder open() option mode");
        } else {
            MyHelperClass MODE_MBOX = new MyHelperClass();
            if ((0 == (mode & (int)(Object)MODE_MBOX)) && (0 == (mode & (int)(Object)MODE_BLOB))) mode = mode | (int)(Object)MODE_MBOX;
            int iOpenMode =(int)(Object) NULL; //new int();
            iOpenMode = mode;
            MyHelperClass oConn = new MyHelperClass();
            oConn = ((DBStore)(DBStore)(Object) getStore()).getConnection();
//            MyHelperClass iOpenMode = new MyHelperClass();
            if ((iOpenMode & (int)(Object)MODE_MBOX) != 0) {
                String sFolderUrl;
                try {
                    sFolderUrl =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) Gadgets.chomp(getStore().getURLName().getFile(), File.separator) + (int)(Object)oCatg.getPath(oConn);
                    if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("mail folder directory is " + sFolderUrl);
                    if (sFolderUrl.startsWith("file://")) sFolderDir =(MyHelperClass)(Object) sFolderUrl.substring(7); else sFolderDir =(MyHelperClass)(Object) sFolderUrl;
                } catch (SQLException sqle) {
                    iOpenMode =(int)(Object)(MyHelperClass)(Object) 0;
                    oConn = null;
                    if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
                    throw new MessagingException(sqle.getMessage(), sqle);
                }
                try {
                    File oDir = new File((String)(Object)sFolderDir);
                    if (!oDir.exists()) {
                        FileSystem oFS = new FileSystem();
                        oFS.mkdirs(sFolderUrl);
                    }
                } catch (IOException ioe) {
                    iOpenMode =(int)(Object)(MyHelperClass)(Object) 0;
                    oConn = null;
                    if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
                    throw new MessagingException(ioe.getMessage(), ioe);
                } catch (SecurityException se) {
                    iOpenMode =(int)(Object)(MyHelperClass)(Object) 0;
                    oConn = null;
                    if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
                    throw new MessagingException(se.getMessage(), se);
                } catch (Exception je) {
                    iOpenMode =(int)(Object)(MyHelperClass)(Object) 0;
                    oConn = null;
                    if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
                    throw new MessagingException(je.getMessage(), je);
                }
//                JDCConnection oConn = getConnection();
                PreparedStatement oStmt = null;
                ResultSet oRSet = null;
                boolean bHasFilePointer;
                try {
                    oStmt =(PreparedStatement)(Object) oConn.prepareStatement("SELECT NULL FROM " + DB.k_x_cat_objs + " WHERE " + DB.gu_category + "=? AND " + DB.id_class + "=15", ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                    oStmt.setString(1, getCategory().getString(DB.gu_category));
                    oRSet =(ResultSet)(Object) oStmt.executeQuery();
                    bHasFilePointer =(boolean)(Object) oRSet.next();
                    oRSet.close();
                    oRSet = null;
                    oStmt.close();
                    oStmt = null;
                    if (!bHasFilePointer) {
                        oConn.setAutoCommit(false);
                        Product oProd = new Product();
                        oProd.put(DB.gu_owner, oCatg.getString(DB.gu_owner));
                        oProd.put(DB.nm_product, oCatg.getString(DB.nm_category));
                        oProd.store((JDCConnection)(Object)oConn);
                        ProductLocation oLoca = new ProductLocation();
                        oLoca.put(DB.gu_product, oProd.getString(DB.gu_product));
                        oLoca.put(DB.gu_owner, oCatg.getString(DB.gu_owner));
                        oLoca.put(DB.pg_prod_locat, 1);
                        oLoca.put(DB.id_cont_type, 1);
                        oLoca.put(DB.id_prod_type, "MBOX");
                        oLoca.put(DB.len_file, 0);
                        oLoca.put(DB.xprotocol, "file://");
                        oLoca.put(DB.xhost, "localhost");
                        oLoca.put(DB.xpath, Gadgets.chomp(sFolderDir, File.separator));
                        oLoca.put(DB.xfile, oCatg.getString(DB.nm_category) + ".mbox");
                        oLoca.put(DB.xoriginalfile, oCatg.getString(DB.nm_category) + ".mbox");
                        oLoca.store((JDCConnection)(Object)oConn);
                        oStmt =(PreparedStatement)(Object) oConn.prepareStatement("INSERT INTO " + DB.k_x_cat_objs + " (" + DB.gu_category + "," + DB.gu_object + "," + DB.id_class + ") VALUES (?,?,15)");
                        oStmt.setString(1, oCatg.getString(DB.gu_category));
                        oStmt.setString(2, oProd.getString(DB.gu_product));
                        oStmt.executeUpdate();
                        oStmt.close();
                        oStmt = null;
                        oConn.commit();
                    }
                } catch (SQLException sqle) {
                    if ((boolean)(Object)DebugFile.trace) {
                        DebugFile.writeln("SQLException " + sqle.getMessage());
                        DebugFile.decIdent();
                    }
                    if (oStmt != null) {
                        try {
                            oStmt.close();
                        } catch (SQLException ignore) {
                        }
                    }
                    if (oConn != null) {
                        try {
                            oConn.rollback();
                        } catch (SQLException ignore) {
                        }
                    }
                    throw new MessagingException(sqle.getMessage(), sqle);
                }
            } else {
                sFolderDir = null;
            }
            if ((boolean)(Object)DebugFile.trace) {
                DebugFile.decIdent();
                String sMode = "";
                if ((iOpenMode & (int)(Object)READ_WRITE) != 0) sMode += " READ_WRITE ";
                if ((iOpenMode & (int)(Object)READ_ONLY) != 0) sMode += " READ_ONLY ";
                if ((iOpenMode & (int)(Object)MODE_BLOB) != 0) sMode += " MODE_BLOB ";
                if ((iOpenMode & (int)(Object)MODE_MBOX) != 0) sMode += " MODE_MBOX ";
                DebugFile.writeln("End DBFolder.open() :");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass id_prod_type;
	public MyHelperClass gu_object;
	public MyHelperClass gu_product;
	public MyHelperClass nm_category;
	public MyHelperClass xfile;
	public MyHelperClass pg_prod_locat;
	public MyHelperClass id_cont_type;
	public MyHelperClass xhost;
	public MyHelperClass gu_owner;
	public MyHelperClass CONCUR_READ_ONLY;
	public MyHelperClass xpath;
	public MyHelperClass xprotocol;
	public MyHelperClass TYPE_FORWARD_ONLY;
	public MyHelperClass gu_category;
	public MyHelperClass xoriginalfile;
	public MyHelperClass trace;
	public MyHelperClass k_x_cat_objs;
	public MyHelperClass len_file;
	public MyHelperClass nm_product;
	public MyHelperClass id_class;
public MyHelperClass getFile(){ return null; }
	public MyHelperClass getPath(MyHelperClass o0){ return null; }
	public MyHelperClass chomp(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass incIdent(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass decIdent(){ return null; }
	public MyHelperClass writeln(String o0){ return null; }
	public MyHelperClass getURLName(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
	MessagingException(String o0, Exception o1){}
	MessagingException(String o0, IOException o1){}
	MessagingException(String o0, SQLException o1){}
	MessagingException(){}
	MessagingException(String o0, SecurityException o1){}
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class JDCConnection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class Product {

public MyHelperClass store(JDCConnection o0){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }}

class ProductLocation {

public MyHelperClass store(JDCConnection o0){ return null; }
	public MyHelperClass put(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass put(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }}

class DBStore {

public MyHelperClass getConnection(){ return null; }}
