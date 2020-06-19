
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10056705 {
public MyHelperClass XColor;
	public MyHelperClass deleteDB(Connection o0, long o1){ return null; }

       

    public long saveDB(Connection con, long id, boolean commit) throws SQLException {
        StringBuffer SQL = null;
        Statement statement = null;
        ResultSet result_set = null;
        try {
            statement =(Statement)(Object) con.createStatement();
            if (id < 0) {
                MyHelperClass QueryUtils = new MyHelperClass();
                id =(long)(Object) QueryUtils.sequenceGetNextID(con, "PATTERN_OUTLINE");
            } else {
                deleteDB(con, id);
            }
            SQL = new StringBuffer("insert into ");
            SQL.append("PATTERN_OUTLINE values (");
            SQL.append(id);
            SQL.append(",");
            MyHelperClass pattern = new MyHelperClass();
            SQL.append(XColor.toInt(pattern.getPatternColor()));
            SQL.append(",");
//            MyHelperClass pattern = new MyHelperClass();
            SQL.append(pattern.getPatternStyle());
            SQL.append(",");
//            MyHelperClass pattern = new MyHelperClass();
            SQL.append(pattern.getPatternDensity());
            SQL.append(",");
//            MyHelperClass pattern = new MyHelperClass();
            SQL.append(XColor.toInt(pattern.getBackgroundColor()));
            SQL.append(",");
            MyHelperClass outline = new MyHelperClass();
            SQL.append(XColor.toInt(outline.getColor()));
            SQL.append(",");
//            MyHelperClass outline = new MyHelperClass();
            SQL.append(outline.getStyle());
            SQL.append(",");
//            MyHelperClass outline = new MyHelperClass();
            SQL.append(outline.getWidth());
            SQL.append(")");
            statement.executeUpdate(new String(SQL));
            SQL = null;
            if (commit) {
                con.commit();
            }
        } catch (UncheckedIOException e) {
            System.err.println(getClass().getName() + ":" + e + " SQL:=" + SQL);
            if (commit) {
                con.rollback();
            }
            throw e;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } 
		catch (UncheckedIOException e) {
		
		}
            }
	}
	return saveDB(con, id, false);
}

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPatternDensity(){ return null; }
	public MyHelperClass getStyle(){ return null; }
	public MyHelperClass getPatternStyle(){ return null; }
	public MyHelperClass getWidth(){ return null; }
	public MyHelperClass getColor(){ return null; }
	public MyHelperClass toInt(MyHelperClass o0){ return null; }
	public MyHelperClass getPatternColor(){ return null; }
	public MyHelperClass sequenceGetNextID(Connection o0, String o1){ return null; }
	public MyHelperClass getBackgroundColor(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class ResultSet {

}
