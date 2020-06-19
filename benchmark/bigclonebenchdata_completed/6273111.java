
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6273111 {
public MyHelperClass TribuneLogic;
	public MyHelperClass Statements;
	public MyHelperClass findStadiumBy_N_C(String o0, String o1){ return null; }

    public void removeStadium(String name, String city) throws StadiumException {
        MyHelperClass ConnectionManager = new MyHelperClass();
        Connection conn =(Connection)(Object) ConnectionManager.getManager().getConnection();
        int id =(int)(Object) findStadiumBy_N_C(name, city);
        if (id == -1) throw new StadiumException("No such stadium");
        try {
            conn.setAutoCommit(false);
            PreparedStatement stm =(PreparedStatement)(Object) conn.prepareStatement(Statements.SELECT_STAD_TRIBUNE);
            stm.setInt(1, id);
            ResultSet rs =(ResultSet)(Object) stm.executeQuery();
            TribuneLogic logic =(TribuneLogic)(Object) TribuneLogic.getInstance();
            while ((boolean)(Object)rs.next()) {
                logic.removeTribune(rs.getInt("tribuneID"));
            }
            stm =(PreparedStatement)(Object) conn.prepareStatement(Statements.DELETE_STADIUM);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (UncheckedIOException e) {
            try {
                conn.rollback();
                conn.setAutoCommit(true);
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
            throw new StadiumException("Removing stadium failed",(SQLException)(Object) e);
        }
        try {
            conn.commit();
            conn.setAutoCommit(true);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DELETE_STADIUM;
	public MyHelperClass SELECT_STAD_TRIBUNE;
public MyHelperClass getManager(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class StadiumException extends Exception{
	public StadiumException(String errorMessage) { super(errorMessage); }
	StadiumException(){}
	StadiumException(String o0, SQLException o1){}
}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class TribuneLogic {

public MyHelperClass removeTribune(MyHelperClass o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
