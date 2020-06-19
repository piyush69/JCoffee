import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8512998 {
public MyHelperClass appendQuery(CalculateTransferObject o0){ return null; }
public MyHelperClass UPDATE_HANDS_SQL;
	public MyHelperClass getDataSource(){ return null; }

    public boolean updateCalculatedHand(CalculateTransferObject query, BasicStartingHandTransferObject[] hands) throws Throwable, CalculateDAOException {
        boolean retval = false;
        Connection connection = null;
        Statement statement = null;
        PreparedStatement prep = null;
        ResultSet result = null;
        MyHelperClass SELECT_ID_SQL = new MyHelperClass();
        StringBuffer sql = new StringBuffer((int)(Object)SELECT_ID_SQL);
        sql.append(appendQuery(query));
        try {
            connection =(Connection)(Object) getDataSource().getConnection();
            connection.setAutoCommit(false);
            statement =(Statement)(Object) connection.createStatement();
            result =(ResultSet)(Object) statement.executeQuery(sql.toString());
            if ((boolean)(Object)result.first()) {
                String id =(String)(Object) result.getString("id");
                prep =(PreparedStatement)(Object) connection.prepareStatement(UPDATE_HANDS_SQL);
                for (int i = 0; i < hands.length; i++) {
                    prep.setInt(1, hands[i].getWins());
                    prep.setInt(2, hands[i].getLoses());
                    prep.setInt(3, hands[i].getDraws());
                    prep.setString(4, id);
                    prep.setString(5,(String)(Object) hands[i].getHand());
                    if ((int)(Object)prep.executeUpdate() != 1) {
                        throw new SQLException("updated too many records in calculatehands, " + id + "-" + hands[i].getHand());
                    }
                }
                connection.commit();
            }
        } catch (SQLException sqle) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.setNextException(sqle);
                throw new CalculateDAOException((String)(Object)e);
            }
            throw new CalculateDAOException((String)(Object)sqle);
        } finally {
            if (result != null) {
                try {
                    result.close();
                } catch (SQLException e) {
                    throw new CalculateDAOException((String)(Object)e);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new CalculateDAOException((String)(Object)e);
                }
            }
            if (prep != null) {
                try {
                    prep.close();
                } catch (SQLException e) {
                    throw new CalculateDAOException((String)(Object)e);
                }
            }
        }
        return retval;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(){ return null; }}

class CalculateTransferObject {

}

class BasicStartingHandTransferObject {

public MyHelperClass getLoses(){ return null; }
	public MyHelperClass getHand(){ return null; }
	public MyHelperClass getWins(){ return null; }
	public MyHelperClass getDraws(){ return null; }}

class CalculateDAOException extends Exception{
	public CalculateDAOException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }}

class ResultSet {

public MyHelperClass first(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
