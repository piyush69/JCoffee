
import java.io.UncheckedIOException;


class c21293476 {
public MyHelperClass Statements;
	public MyHelperClass getMaxId(){ return null; }

    public void addGames(List games) throws StadiumException, SQLException {
        MyHelperClass ConnectionManager = new MyHelperClass();
        Connection conn =(Connection)(Object) ConnectionManager.getManager().getConnection();
        conn.setAutoCommit(false);
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            for (Game game :(Game[])(Object) (Object[])(Object)games) {
                MyHelperClass Statements = new MyHelperClass();
                stm =(PreparedStatement)(Object) conn.prepareStatement(Statements.SELECT_STADIUM);
                stm.setString(1, game.getStadiumName());
                stm.setString(2, game.getStadiumCity());
                rs =(ResultSet)(Object) stm.executeQuery();
                int stadiumId = -1;
                while ((boolean)(Object)rs.next()) {
                    stadiumId =(int)(Object) rs.getInt("stadiumID");
                }
                if (stadiumId == -1) throw new StadiumException("No such stadium");
//                MyHelperClass Statements = new MyHelperClass();
                stm =(PreparedStatement)(Object) conn.prepareStatement(Statements.INSERT_GAME);
                stm.setInt(1, stadiumId);
                stm.setDate(2, game.getGameDate());
                stm.setTime(3, game.getGameTime());
                stm.setString(4, game.getTeamA());
                stm.setString(5, game.getTeamB());
                stm.executeUpdate();
                int gameId =(int)(Object) getMaxId();
                List sectorPrices =(List)(Object) game.getSectorPrices();
                for (SectorPrice price :(SectorPrice[])(Object) (Object[])(Object)sectorPrices) {
                    stm =(PreparedStatement)(Object) conn.prepareStatement(Statements.INSERT_TICKET_PRICE);
                    stm.setInt(1, gameId);
                    stm.setInt(2,(int)(Object) price.getSectorId());
                    stm.setInt(3,(int)(Object) price.getPrice());
                    stm.executeUpdate();
                }
            }
        } catch (UncheckedIOException e) {
            conn.rollback();
            throw e;
        } finally {
            rs.close();
            stm.close();
        }
        conn.commit();
        conn.setAutoCommit(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INSERT_GAME;
	public MyHelperClass INSERT_TICKET_PRICE;
	public MyHelperClass SELECT_STADIUM;
public MyHelperClass getManager(){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class List {

}

class Game {

public MyHelperClass getStadiumCity(){ return null; }
	public MyHelperClass getTeamA(){ return null; }
	public MyHelperClass getGameDate(){ return null; }
	public MyHelperClass getSectorPrices(){ return null; }
	public MyHelperClass getStadiumName(){ return null; }
	public MyHelperClass getTeamB(){ return null; }
	public MyHelperClass getGameTime(){ return null; }}

class StadiumException extends Exception{
	public StadiumException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setDate(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setTime(int o0, MyHelperClass o1){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SectorPrice {

public MyHelperClass getSectorId(){ return null; }
	public MyHelperClass getPrice(){ return null; }}
