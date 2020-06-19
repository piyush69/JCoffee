
import java.io.UncheckedIOException;


class c9168699 {
public MyHelperClass getInsertSql(ArchiveEntry o0){ return null; }
	public MyHelperClass sanityCheck(ArchiveEntry o0){ return null; }
	public MyHelperClass getSelectSql(ArchiveEntry o0){ return null; }
public MyHelperClass getConnection(){ return null; }

    public void insertArchiveEntries(ArchiveEntry entries[]) throws WeatherMonitorException {
        String sql = null;
        try {
            Connection con =(Connection)(Object) getConnection();
            Statement stmt =(Statement)(Object) con.createStatement();
            ResultSet rslt = null;
            con.setAutoCommit(false);
            for (int i = 0; i < entries.length; i++) {
                if (!(Boolean)(Object)sanityCheck(entries[i])) {
                } else {
                    sql =(String)(Object) getSelectSql(entries[i]);
                    rslt =(ResultSet)(Object) stmt.executeQuery(sql);
                    if ((boolean)(Object)rslt.next()) {
                        if ((int)(Object)rslt.getInt(1) == 0) {
                            sql =(String)(Object) getInsertSql(entries[i]);
                            if ((int)(Object)stmt.executeUpdate(sql) != 1) {
                                con.rollback();
                                System.out.println("rolling back sql");
                                throw new WeatherMonitorException("exception on insert");
                            }
                        }
                    }
                }
            }
            con.commit();
            stmt.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            throw new WeatherMonitorException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ArchiveEntry {

}

class WeatherMonitorException extends Exception{
	public WeatherMonitorException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
