import java.io.*;
import java.lang.*;
import java.util.*;



class c8701067 {
public MyHelperClass Logger;
	public MyHelperClass StorageUtils;
	public MyHelperClass Level;
	public MyHelperClass StringUtils;
	public MyHelperClass getConnection(){ return null; }

    public void markAsCachedHelper(Item item, Date from, Date to, Map<String, Boolean> properties) {
        if (properties.size() == 0) {
            return;
        }
        Connection conn = null;
        MyHelperClass representer = new MyHelperClass();
        Iterable<Integer> props =(Iterable<Integer>)(Object) representer.getInternalReps(properties.keySet());
//        MyHelperClass representer = new MyHelperClass();
        Integer hostIndex =(Integer)(Object) representer.lookUpInternalRep((String)(Object)item.getResolved().getHost());
        HashMap<Integer, long[]> periods = new HashMap<Integer, long[]>();
        for (Map.Entry<String, Boolean> e : properties.entrySet()) {
//            MyHelperClass representer = new MyHelperClass();
            periods.put((Integer)(Object)representer.lookUpInternalRep(e.getKey()), new long[] { from.getTime(), to.getTime(), e.getValue() ? 1 : 0 });
        }
        try {
            conn =(Connection)(Object) getConnection();
            conn.setAutoCommit(false);
            conn.setSavepoint();
            PreparedStatement stmt = null;
            try {
                stmt =(PreparedStatement)(Object) conn.prepareStatement("SELECT MIN(starttime), MAX(endtime), MAX(hasvalues) FROM cachedperiods WHERE " + "id = ? AND host = ? AND prop = ? AND " + "starttime <= ? AND endtime >= ?");
                stmt.setString(1, item.getResolved().getId());
                stmt.setInt(2, hostIndex);
                stmt.setLong(4, to.getTime());
                stmt.setLong(5, from.getTime());
                for (Map.Entry<Integer, long[]> e1 : periods.entrySet()) {
                    stmt.setInt(3, e1.getKey());
                    ResultSet rs =(ResultSet)(Object) stmt.executeQuery();
                    if ((boolean)(Object)rs.next()) {
                        e1.getValue()[0] = Math.min((int)(Object)rs.getLong(1), e1.getValue()[0]);
                        e1.getValue()[1] = Math.max((int)(Object)rs.getLong(2), e1.getValue()[1]);
                        e1.getValue()[2] = Math.max((int)(Object)rs.getInt(3), e1.getValue()[2]);
                    }
                    StorageUtils.close(rs);
                }
                StorageUtils.close(stmt);
                stmt =(PreparedStatement)(Object) conn.prepareStatement("DELETE FROM cachedperiods WHERE " + "id = ? AND host = ? AND " + "starttime <= ? AND endtime >= ? AND " + "prop IN (" + StringUtils.join(props.iterator(), ",") + ")");
                stmt.setString(1, item.getResolved().getId());
                stmt.setInt(2, hostIndex);
                stmt.setLong(3, to.getTime());
                stmt.setLong(4, from.getTime());
                stmt.executeUpdate();
                StorageUtils.close(stmt);
                stmt =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO cachedperiods (id, host, prop, starttime, endtime, hasvalues) VALUES (?, ?, ?, ?, ?, ?)");
                stmt.setString(1, item.getResolved().getId());
                stmt.setInt(2, hostIndex);
                for (Map.Entry<Integer, long[]> e2 : periods.entrySet()) {
                    stmt.setInt(3, e2.getKey());
                    stmt.setLong(4, e2.getValue()[0]);
                    stmt.setLong(5, e2.getValue()[1]);
                    stmt.setInt(6, (int) e2.getValue()[2]);
                    stmt.executeUpdate();
                }
            } finally {
                StorageUtils.close(stmt);
            }
            conn.commit();
        } catch (UncheckedIOException ex) {
            Logger.getLogger(MetaDataStoragerImpl.class.getName()).log(Level.SEVERE, "Cannot update cachedperiods table.",(SQLException)(Object) ex);
            try {
                conn.rollback();
            } catch (UncheckedIOException ex1) {
                Logger.getLogger(MetaDataStoragerImpl.class.getName()).log(Level.SEVERE, "Could not roll back database, please consult system administrator.",(SQLException)(Object) ex1);
            }
        } finally {
            StorageUtils.close(conn);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getInternalReps(Set<String> o0){ return null; }
	public MyHelperClass lookUpInternalRep(String o0){ return null; }
	public MyHelperClass close(ResultSet o0){ return null; }
	public MyHelperClass join(Iterator<Integer> o0, String o1){ return null; }
	public MyHelperClass close(Connection o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, SQLException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass close(PreparedStatement o0){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getHost(){ return null; }}

class Item {

public MyHelperClass getResolved(){ return null; }}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass setSavepoint(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, Integer o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }}

class ResultSet {

public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class MetaDataStoragerImpl {

}
