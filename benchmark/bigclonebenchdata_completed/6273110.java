
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6273110 {
public MyHelperClass findStadiumBy_N_C(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass Statements;
	public MyHelperClass TribuneLogic;
	public MyHelperClass getMaxId(){ return null; }

    public void addStadium(Stadium stadium) throws StadiumException {
        MyHelperClass ConnectionManager = new MyHelperClass();
        Connection conn =(Connection)(Object) ConnectionManager.getManager().getConnection();
        if ((int)(Object)findStadiumBy_N_C(stadium.getName(), stadium.getCity()) != -1) throw new StadiumException("Stadium already exists");
        try {
            MyHelperClass Statements = new MyHelperClass();
            PreparedStatement stm =(PreparedStatement)(Object) conn.prepareStatement(Statements.INSERT_STADIUM);
            conn.setAutoCommit(false);
            stm.setString(1, stadium.getName());
            stm.setString(2, stadium.getCity());
            stm.executeUpdate();
            int id =(int)(Object) getMaxId();
            TribuneLogic logic =(TribuneLogic)(Object) TribuneLogic.getInstance();
            for (Tribune trib :(Tribune[])(Object) (Object[])(Object)stadium.getTribunes()) {
                int tribuneId =(int)(Object) logic.addTribune(trib);
                if (tribuneId != -1) {
                    stm =(PreparedStatement)(Object) conn.prepareStatement(Statements.INSERT_STAD_TRIBUNE);
                    stm.setInt(1, id);
                    stm.setInt(2, tribuneId);
                    stm.executeUpdate();
                }
            }
        } catch (UncheckedIOException e) {
            try {
                conn.rollback();
                conn.setAutoCommit(true);
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
            throw new StadiumException("Adding stadium failed",(SQLException)(Object) e);
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
public MyHelperClass INSERT_STAD_TRIBUNE;
	public MyHelperClass INSERT_STADIUM;
public MyHelperClass getManager(){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Stadium {

public MyHelperClass getTribunes(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getCity(){ return null; }}

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

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class TribuneLogic {

public MyHelperClass addTribune(Tribune o0){ return null; }}

class Tribune {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
