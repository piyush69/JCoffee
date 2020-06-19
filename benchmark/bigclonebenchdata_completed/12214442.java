
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12214442 {
public MyHelperClass escapeCharacters(MyHelperClass o0){ return null; }
public MyHelperClass Field;
	public MyHelperClass conn;
	public MyHelperClass executeMySQLGet(String o0){ return null; }

    public boolean saveTemplate(Template t) {
        try {
            MyHelperClass conn = new MyHelperClass();
            conn.setAutoCommit(false);
//            MyHelperClass conn = new MyHelperClass();
            Statement stmt =(Statement)(Object) conn.createStatement();
            String query;
            ResultSet rset;
            if (Integer.parseInt((String)(Object)executeMySQLGet("SELECT COUNT(*) FROM templates WHERE name='" + escapeCharacters(t.getName()) + "'")) != 0) return false;
            query = "select * from templates where templateid = " + t.getID();
            rset =(ResultSet)(Object) stmt.executeQuery(query);
            if ((boolean)(Object)rset.next()) {
                System.err.println("Updating already saved template is not supported!!!!!!");
                return false;
            } else {
                query = "INSERT INTO templates (name, parentid) VALUES ('" + escapeCharacters(t.getName()) + "', " + t.getParentID() + ")";
                try {
                    stmt.executeUpdate(query);
                } catch (UncheckedIOException e) {
//                    MyHelperClass conn = new MyHelperClass();
                    conn.rollback();
//                    MyHelperClass conn = new MyHelperClass();
                    conn.setAutoCommit(true);
                    e.printStackTrace();
                    return false;
                }
                int templateid = Integer.parseInt((String)(Object)executeMySQLGet("SELECT LAST_INSERT_ID()"));
                t.setID(templateid);
                LinkedList fields =(LinkedList)(Object) t.getFields();
                ListIterator iter =(ListIterator)(Object) fields.listIterator();
                Field f = null;
                PreparedStatement pstmt =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO templatefields(fieldtype, name, templateid, defaultvalue)" + "VALUES (?,?,?,?)");
                try {
                    while ((boolean)(Object)iter.hasNext()) {
                        f =(Field)(Object) iter.next();
                        if (f.getType() == Field.IMAGE) {
                            System.out.println("field is an image.");
                            byte data[] =(byte[])(Object) ((FieldDataImage)(FieldDataImage)(Object) f.getDefault()).getDataBytes();
                            pstmt.setBytes(4, data);
                        } else {
                            System.out.println("field is not an image");
                            String deflt =(String)(Object) (f.getDefault()).getData();
                            pstmt.setString(4, deflt);
                        }
                        pstmt.setInt(1, f.getType());
                        pstmt.setString(2,(String)(Object) f.getName());
                        pstmt.setInt(3, t.getID());
                        pstmt.execute();
                        f.setID(Integer.parseInt((String)(Object)executeMySQLGet("SELECT LAST_INSERT_ID()")));
                    }
                } catch (UncheckedIOException e) {
                    conn.rollback();
                    conn.setAutoCommit(true);
                    e.printStackTrace();
                    return false;
                }
            }
            conn.commit();
            conn.setAutoCommit(true);
        } catch (UncheckedIOException ex) {
            System.err.println("Error saving the Template");
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IMAGE;
public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getData(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Template {

public MyHelperClass getParentID(){ return null; }
	public MyHelperClass getFields(){ return null; }
	public MyHelperClass getID(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setID(int o0){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class LinkedList {

public MyHelperClass listIterator(){ return null; }}

class Field {

public MyHelperClass getType(){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setID(int o0){ return null; }}

class ListIterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass execute(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setBytes(int o0, byte[] o1){ return null; }}

class FieldDataImage {

public MyHelperClass getDataBytes(){ return null; }}
