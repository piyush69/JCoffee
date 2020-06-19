import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12214439 {
public MyHelperClass escapeCharacters(MyHelperClass o0){ return null; }
public MyHelperClass conn;
	public MyHelperClass executeMySQLGet(String o0){ return null; }

    public boolean saveNote(NoteData n)  throws Throwable {
        String query;
        try {
            MyHelperClass conn = new MyHelperClass();
            conn.setAutoCommit(false);
            Statement stmt = null;
            ResultSet rset = null;
//            MyHelperClass conn = new MyHelperClass();
            stmt =(Statement)(Object) conn.createStatement();
            query = "select * from notes where noteid = " + n.getID();
            rset =(ResultSet)(Object) stmt.executeQuery(query);
            if ((boolean)(Object)rset.next()) {
                query = "UPDATE notes SET title = '" + escapeCharacters(n.getTitle()) + "', keywords = '" + escapeCharacters(n.getKeywords()) + "' WHERE noteid = " + n.getID();
                try {
                    stmt.executeUpdate(query);
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
//                    MyHelperClass conn = new MyHelperClass();
                    conn.rollback();
//                    MyHelperClass conn = new MyHelperClass();
                    conn.setAutoCommit(true);
                    return false;
                }
                LinkedList<FieldData> fields =(LinkedList<FieldData>)(Object) n.getFields();
                ListIterator<FieldData> iter = fields.listIterator(0);
                FieldData f = null;
//                MyHelperClass conn = new MyHelperClass();
                PreparedStatement pstmt =(PreparedStatement)(Object) conn.prepareStatement("UPDATE fielddata SET data = ? WHERE noteid = ? AND fieldid = ?");
                try {
                    while (iter.hasNext()) {
                        f = iter.next();
                        if ((FieldDataImage)(Object)f instanceof FieldDataImage) {
                            System.out.println("field is an image.");
                            pstmt.setBytes(1, ((FieldDataImage)(FieldDataImage)(Object) f).getDataBytes());
                        } else {
                            System.out.println("field is not an image");
                            pstmt.setString(1, f.getData());
                        }
                        pstmt.setInt(2, n.getID());
                        pstmt.setInt(3, f.getID());
                        pstmt.execute();
                    }
                } catch (UncheckedIOException e) {
//                    MyHelperClass conn = new MyHelperClass();
                    conn.rollback();
//                    MyHelperClass conn = new MyHelperClass();
                    conn.setAutoCommit(true);
                    e.printStackTrace();
                    return false;
                }
                query = "DELETE FROM links WHERE (note1id = " + n.getID() + " OR note2id = " + n.getID() + ")";
                try {
                    stmt.execute(query);
                } catch (UncheckedIOException e) {
//                    MyHelperClass conn = new MyHelperClass();
                    conn.rollback();
//                    MyHelperClass conn = new MyHelperClass();
                    conn.setAutoCommit(true);
                    e.printStackTrace();
                    return false;
                }
                Vector<Link> associations =(Vector<Link>)(Object) n.getAssociations();
                ListIterator<Link> itr = associations.listIterator();
                Link association = null;
//                MyHelperClass conn = new MyHelperClass();
                pstmt =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO links (note1id, note2id) VALUES (?, ?)");
                try {
                    while (itr.hasNext()) {
                        association = itr.next();
                        pstmt.setInt(1, n.getID());
                        pstmt.setInt(2, association.getID());
                        pstmt.execute();
                    }
                } catch (UncheckedIOException e) {
//                    MyHelperClass conn = new MyHelperClass();
                    conn.rollback();
//                    MyHelperClass conn = new MyHelperClass();
                    conn.setAutoCommit(true);
                    e.printStackTrace();
                    return false;
                }
            } else {
                query = "INSERT INTO notes (templateid, title, keywords) VALUES (" + n.getTemplate().getID() + ", '" + escapeCharacters(n.getTitle()) + "', '" + escapeCharacters(n.getKeywords()) + "')";
                try {
                    stmt.executeUpdate(query);
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
//                    MyHelperClass conn = new MyHelperClass();
                    conn.rollback();
//                    MyHelperClass conn = new MyHelperClass();
                    conn.setAutoCommit(true);
                    return false;
                }
                LinkedList<FieldData> fields =(LinkedList<FieldData>)(Object) n.getFields();
                ListIterator<FieldData> iter = fields.listIterator(0);
                FieldData f = null;
                n.setID(Integer.parseInt((String)(Object)executeMySQLGet("SELECT LAST_INSERT_ID()")));
                PreparedStatement pstmt;
                try {
                    pstmt =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO fielddata (noteid, fieldid, data) VALUES (?,?,?)");
                    while (iter.hasNext()) {
                        f = iter.next();
                        if ((FieldDataImage)(Object)f instanceof FieldDataImage) {
                            System.out.println("field is an image.");
                            pstmt.setBytes(3, ((FieldDataImage)(FieldDataImage)(Object) f).getDataBytes());
                        } else {
                            System.out.println("field is not an image");
                            pstmt.setString(3, f.getData());
                        }
                        pstmt.setInt(1, n.getID());
                        pstmt.setInt(2, f.getID());
                        pstmt.execute();
                    }
                } catch (UncheckedIOException e) {
                    conn.rollback();
                    conn.setAutoCommit(true);
                    e.printStackTrace();
                    return false;
                }
                Vector<Link> assoc =(Vector<Link>)(Object) n.getAssociations();
                Iterator<Link> itr = assoc.listIterator();
                Link l = null;
                pstmt =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO links (note1id, note2id) VALUES (?,?)");
                try {
                    while (itr.hasNext()) {
                        l = itr.next();
                        pstmt.setInt(1, n.getID());
                        pstmt.setInt(2, l.getID());
                        pstmt.execute();
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
            ex.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getID(){ return null; }}

class NoteData {

public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getKeywords(){ return null; }
	public MyHelperClass getFields(){ return null; }
	public MyHelperClass setID(int o0){ return null; }
	public MyHelperClass getAssociations(){ return null; }
	public MyHelperClass getTemplate(){ return null; }
	public MyHelperClass getID(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass execute(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class FieldData {

public MyHelperClass getID(){ return null; }
	public MyHelperClass getData(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setBytes(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass execute(){ return null; }}

class FieldDataImage {

public MyHelperClass getDataBytes(){ return null; }}

class Link {

public MyHelperClass getID(){ return null; }}
