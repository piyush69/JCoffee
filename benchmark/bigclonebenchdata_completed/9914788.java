
import java.io.UncheckedIOException;


class c9914788 {
public MyHelperClass AIDAActivityObjectDB;
	public MyHelperClass insertDescriptions(Connection o0, AIDADocument o1){ return null; }
public MyHelperClass DOC_INSERT;
	public MyHelperClass getConnection(){ return null; }

    public void insert(IIDGenerator idGenerators, AIDADocument item) throws SQLException {
        MyHelperClass token = new MyHelperClass();
        AIDAActivityObjectDB.getManager(token).insert(idGenerators, item);
        Connection con =(Connection)(Object) getConnection();
        try {
            PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement(DOC_INSERT);
            ps.setLong(1, item.getId());
            ps.setString(2, item.getName());
            ps.setString(3, item.getRelativeLink());
            ps.executeUpdate();
            ps.close();
            insertDescriptions(con, item);
        } catch (UncheckedIOException sqlEx) {
            con.rollback();
            throw sqlEx;
        } finally {
            con.close();
        }
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getManager(MyHelperClass o0){ return null; }
	public MyHelperClass insert(IIDGenerator o0, AIDADocument o1){ return null; }}

class IIDGenerator {

}

class AIDADocument {

public MyHelperClass getId(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getRelativeLink(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
