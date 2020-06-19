
import java.io.UncheckedIOException;


class c21293479 {

    public void removeGames(List games) throws SQLException {
        MyHelperClass ConnectionManager = new MyHelperClass();
        Connection conn =(Connection)(Object) ConnectionManager.getManager().getConnection();
        PreparedStatement stm = null;
        conn.setAutoCommit(false);
        try {
            for (Game game :(Game[])(Object) (Object[])(Object)games) {
                MyHelperClass Statements = new MyHelperClass();
                stm =(PreparedStatement)(Object) conn.prepareStatement(Statements.DELETE_GAME);
                stm.setInt(1, game.getGameID());
                stm.executeUpdate();
            }
        } catch (UncheckedIOException e) {
            conn.rollback();
            throw e;
        } finally {
            if (stm != null) stm.close();
        }
        conn.commit();
        conn.setAutoCommit(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DELETE_GAME;
public MyHelperClass getManager(){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class List {

}

class Game {

public MyHelperClass getGameID(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
