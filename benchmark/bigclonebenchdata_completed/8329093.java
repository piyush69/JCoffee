
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8329093 {

    public void parse(ParserEvent event) {
        MyHelperClass logger = new MyHelperClass();
        logger.debug("parse() called for link " + event.getLink().getURI());
        MyHelperClass itemFilter = new MyHelperClass();
        if ((boolean)(Object)event.getLink().getURI().matches(itemFilter)) {
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("Content " + event.getLink().getURI() + " matched");
            Statement stmt = null;
            ResultSet rs = null;
            long checksum1 = 0;
            try {
                URL url = new URL(event.getLink().getURI());
                checksum1 =(long)(Object) url.openConnection().getLastModified();
            } catch (UncheckedIOException mfe) {
//                MyHelperClass logger = new MyHelperClass();
                logger.error("Malformed url " + event.getLink().getURI() + " - " + mfe.getMessage());
                return;
            } catch (ArithmeticException ioe) {
//                MyHelperClass logger = new MyHelperClass();
                logger.error("Couldn't read " + event.getLink().getURI() + " - " + ioe.getMessage());
                return;
            }
            if ((checksum1 == 0) || (checksum1 == 1)) {
                Adler32 adler32 = new Adler32();
                NodeList nodes = (NodeList)(NodeList)(Object) event.getPageData().getData();
                adler32.update(nodes.toHtml().getBytes());
                checksum1 =(long)(Object) adler32.getValue();
            }
            try {
                MyHelperClass conn = new MyHelperClass();
                stmt =(Statement)(Object) conn.createStatement();
                rs =(ResultSet)(Object) stmt.executeQuery("SELECT * FROM documents WHERE url='" + event.getLink().getURI() + "'");
                if ((boolean)(Object)rs.first()) {
                    long checksum2 =(long)(Object) rs.getLong("checksum");
                    if (checksum1 == checksum2) {
                        stmt.executeUpdate("UPDATE documents SET checked=" + String.valueOf(System.currentTimeMillis()) + " WHERE id=" + rs.getString("id"));
                    } else {
                        stmt.executeUpdate("UPDATE documents SET checksum=" + checksum1 + ", checked=" + String.valueOf(System.currentTimeMillis()) + " WHERE id=" + rs.getString("id"));
                    }
                } else {
                    MyHelperClass providerId = new MyHelperClass();
                    stmt.executeUpdate("INSERT INTO documents VALUES " + "(DEFAULT, '" + event.getLink().getURI() + "', " + checksum1 + ", '" + providerId + "', " + String.valueOf(System.currentTimeMillis()) + ")");
                }
            } catch (UncheckedIOException e) {
//                MyHelperClass logger = new MyHelperClass();
                logger.error("Could't perform database query or update - " + e.getMessage());
            } finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (UncheckedIOException sqlEx) {
                    }
                    rs = null;
                }
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (UncheckedIOException sqlEx) {
                    }
                    stmt = null;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass matches(MyHelperClass o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass getData(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getURI(){ return null; }}

class ParserEvent {

public MyHelperClass getLink(){ return null; }
	public MyHelperClass getPageData(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getLong(String o0){ return null; }
	public MyHelperClass first(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Adler32 {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass getValue(){ return null; }}

class NodeList {

public MyHelperClass toHtml(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
