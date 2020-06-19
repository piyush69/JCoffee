
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15535344 {
public MyHelperClass fail(String o0){ return null; }
public MyHelperClass assertEquals(boolean o0, boolean o1){ return null; }

    public void testDoubleNaN() {
        double value = 0;
        boolean wasEqual = false;
        String message = "DB operation completed";
        String ddl1 = "DROP TABLE t1 IF EXISTS;" + "CREATE TABLE t1 ( d DECIMAL, f DOUBLE, l BIGINT, i INTEGER, s SMALLINT, t TINYINT, " + "dt DATE DEFAULT CURRENT_DATE, ti TIME DEFAULT CURRENT_TIME, ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP );";
        try {
            MyHelperClass stmnt = new MyHelperClass();
            stmnt.execute(ddl1);
            MyHelperClass connection = new MyHelperClass();
            PreparedStatement ps =(PreparedStatement)(Object) connection.prepareStatement("INSERT INTO t1 (d,f,l,i,s,t,dt,ti,ts) VALUES (?,?,?,?,?,?,?,?,?)");
            ps.setString(1, "0.2");
            ps.setDouble(2, 0.2);
            ps.setLong(3, java.lang.Long.MAX_VALUE);
            ps.setInt(4, Integer.MAX_VALUE);
            ps.setInt(5, Short.MAX_VALUE);
            ps.setInt(6, 0);
            ps.setDate(7,(Date)(Object) new java.sql.Date(System.currentTimeMillis()));
            ps.setTime(8,(Time)(Object) new java.sql.Time(System.currentTimeMillis()));
            ps.setTimestamp(9,(Timestamp)(Object) new java.sql.Timestamp(System.currentTimeMillis()));
            ps.execute();
            ps.setInt(1, 0);
            ps.setDouble(2, java.lang.Double.NaN);
            ps.setLong(3, java.lang.Long.MIN_VALUE);
            ps.setInt(4, Integer.MIN_VALUE);
            ps.setInt(5, Short.MIN_VALUE);
            ps.setInt(6, 0);
            ps.setTimestamp(7,(Timestamp)(Object) new java.sql.Timestamp(System.currentTimeMillis() + 1));
            ps.setTime(8,(Time)(Object) new java.sql.Time(System.currentTimeMillis() + 1));
            ps.setDate(9,(Date)(Object) new java.sql.Date(System.currentTimeMillis() + 1));
            ps.execute();
            ps.setInt(1, 0);
            ps.setDouble(2, java.lang.Double.POSITIVE_INFINITY);
            ps.setInt(4, Integer.MIN_VALUE);
            ps.setObject(5, Boolean.TRUE);
            ps.setBoolean(5, true);
            MyHelperClass Types = new MyHelperClass();
            ps.setObject(5, new Short((short) 2), Types.SMALLINT);
//            MyHelperClass Types = new MyHelperClass();
            ps.setObject(6, new Integer(2), Types.TINYINT);
            ps.setObject(7,(Boolean)(Object) new java.sql.Date(System.currentTimeMillis() + 2));
            ps.setObject(8,(Boolean)(Object) new java.sql.Time(System.currentTimeMillis() + 2));
            ps.setObject(9,(Boolean)(Object) new java.sql.Timestamp(System.currentTimeMillis() + 2));
            ps.execute();
//            MyHelperClass Types = new MyHelperClass();
            ps.setObject(1, new Float(0), Types.INTEGER);
//            MyHelperClass Types = new MyHelperClass();
            ps.setObject(4, new Float(1), Types.INTEGER);
            ps.setDouble(2, java.lang.Double.NEGATIVE_INFINITY);
            ps.execute();
//            MyHelperClass stmnt = new MyHelperClass();
            ResultSet rs =(ResultSet)(Object) stmnt.executeQuery("SELECT d, f, l, i, s*2, t FROM t1");
            boolean result =(boolean)(Object) rs.next();
            value =(double)(Object) rs.getDouble(2);
            int integerValue =(int)(Object) rs.getInt(4);
            if ((boolean)(Object)rs.next()) {
                value =(double)(Object) rs.getDouble(2);
                wasEqual = Double.isNaN(value);
                integerValue =(int)(Object) rs.getInt(4);
                integerValue =(int)(Object) rs.getInt(1);
            }
            if ((boolean)(Object)rs.next()) {
                value =(double)(Object) rs.getDouble(2);
                wasEqual = wasEqual && value == Double.POSITIVE_INFINITY;
            }
            if ((boolean)(Object)rs.next()) {
                value =(double)(Object) rs.getDouble(2);
                wasEqual = wasEqual && value == Double.NEGATIVE_INFINITY;
            }
//            MyHelperClass stmnt = new MyHelperClass();
            rs =(ResultSet)(Object) stmnt.executeQuery("SELECT MAX(i) FROM t1");
            if ((boolean)(Object)rs.next()) {
                int max =(int)(Object) rs.getInt(1);
                System.out.println("Max value for i: " + max);
            }
            {
//                MyHelperClass stmnt = new MyHelperClass();
                stmnt.execute("drop table CDTYPE if exists");
//                MyHelperClass stmnt = new MyHelperClass();
                rs =(ResultSet)(Object) stmnt.executeQuery("CREATE TABLE cdType (ID INTEGER NOT NULL, name VARCHAR(50), PRIMARY KEY(ID))");
//                MyHelperClass stmnt = new MyHelperClass();
                rs =(ResultSet)(Object) stmnt.executeQuery("SELECT MAX(ID) FROM cdType");
                if ((boolean)(Object)rs.next()) {
                    int max =(int)(Object) rs.getInt(1);
                    System.out.println("Max value for ID: " + max);
                } else {
                    System.out.println("Max value for ID not returned");
                }
//                MyHelperClass stmnt = new MyHelperClass();
                stmnt.executeUpdate("INSERT INTO cdType VALUES (10,'Test String');");
//                MyHelperClass stmnt = new MyHelperClass();
                stmnt.executeQuery("CALL IDENTITY();");
                try {
//                    MyHelperClass stmnt = new MyHelperClass();
                    stmnt.executeUpdate("INSERT INTO cdType VALUES (10,'Test String');");
                } catch (UncheckedIOException e1) {
//                    MyHelperClass stmnt = new MyHelperClass();
                    stmnt.execute("ROLLBACK");
//                    MyHelperClass connection = new MyHelperClass();
                    connection.rollback();
                }
            }
        } catch (UncheckedIOException e) {
            fail(e.getMessage());
        }
        System.out.println("testDoubleNaN complete");
        assertEquals(true, wasEqual);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INTEGER;
	public MyHelperClass SMALLINT;
	public MyHelperClass TINYINT;
public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass execute(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setTimestamp(int o0, Timestamp o1){ return null; }
	public MyHelperClass setObject(int o0, Boolean o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setObject(int o0, Short o1, MyHelperClass o2){ return null; }
	public MyHelperClass setObject(int o0, Integer o1, MyHelperClass o2){ return null; }
	public MyHelperClass setObject(int o0, Time o1){ return null; }
	public MyHelperClass setBoolean(int o0, boolean o1){ return null; }
	public MyHelperClass setObject(int o0, Timestamp o1){ return null; }
	public MyHelperClass setInt(int o0, short o1){ return null; }
	public MyHelperClass setTime(int o0, Time o1){ return null; }
	public MyHelperClass setDate(int o0, Date o1){ return null; }
	public MyHelperClass setObject(int o0, Date o1){ return null; }
	public MyHelperClass setObject(int o0, Float o1, MyHelperClass o2){ return null; }
	public MyHelperClass setDouble(int o0, double o1){ return null; }
	public MyHelperClass execute(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getDouble(int o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Timestamp {

}

class Time {

}

class Date {

}
