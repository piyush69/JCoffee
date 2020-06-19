


class c14271724 {
public MyHelperClass stmt;
	public MyHelperClass conn2;
	public MyHelperClass conn1;
	public MyHelperClass assertTrue(String o0, boolean o1){ return null; }
	public MyHelperClass assertEquals(String o0, int o1, int o2){ return null; }

    public void testJDBCSavepoints() throws Exception {
        String sql;
        String msg;
        int i;
        PreparedStatement ps;
        ResultSet rs;
        Savepoint sp1;
        Savepoint sp2;
        Savepoint sp3;
        Savepoint sp4;
        Savepoint sp5;
        Savepoint sp6;
        Savepoint sp7;
        int rowcount = 0;
        sql = "drop table t if exists";
        MyHelperClass stmt = new MyHelperClass();
        stmt.executeUpdate(sql);
        sql = "create table t(id int, fn varchar, ln varchar, zip int)";
//        MyHelperClass stmt = new MyHelperClass();
        stmt.executeUpdate(sql);
        MyHelperClass conn1 = new MyHelperClass();
        conn1.setAutoCommit(true);
//        MyHelperClass conn1 = new MyHelperClass();
        conn1.setAutoCommit(false);
        sql = "insert into t values(?,?,?,?)";
//        MyHelperClass conn1 = new MyHelperClass();
        ps =(PreparedStatement)(Object) conn1.prepareStatement(sql);
        ps.setString(2, "Mary");
        ps.setString(3, "Peterson-Clancy");
        i = 0;
        for (; i < 10; i++) {
            ps.setInt(1, i);
            ps.setInt(4, i);
            ps.executeUpdate();
        }
//        MyHelperClass conn1 = new MyHelperClass();
        sp1 =(Savepoint)(Object) conn1.setSavepoint("savepoint1");
        for (; i < 20; i++) {
            ps.setInt(1, i);
            ps.setInt(4, i);
            ps.executeUpdate();
        }
//        MyHelperClass conn1 = new MyHelperClass();
        sp2 =(Savepoint)(Object) conn1.setSavepoint("savepoint2");
        for (; i < 30; i++) {
            ps.setInt(1, i);
            ps.setInt(4, i);
            ps.executeUpdate();
        }
//        MyHelperClass conn1 = new MyHelperClass();
        sp3 =(Savepoint)(Object) conn1.setSavepoint("savepoint3");
        for (; i < 40; i++) {
            ps.setInt(1, i);
            ps.setInt(4, i);
            ps.executeUpdate();
        }
//        MyHelperClass conn1 = new MyHelperClass();
        sp4 =(Savepoint)(Object) conn1.setSavepoint("savepoint4");
        for (; i < 50; i++) {
            ps.setInt(1, i);
            ps.setInt(4, i);
            ps.executeUpdate();
        }
//        MyHelperClass conn1 = new MyHelperClass();
        sp5 =(Savepoint)(Object) conn1.setSavepoint("savepoint5");
//        MyHelperClass conn1 = new MyHelperClass();
        sp6 =(Savepoint)(Object) conn1.setSavepoint("savepoint6");
//        MyHelperClass conn1 = new MyHelperClass();
        sp7 =(Savepoint)(Object) conn1.setSavepoint("savepoint7");
//        MyHelperClass stmt = new MyHelperClass();
        rs =(ResultSet)(Object) stmt.executeQuery("select count(*) from t");
        rs.next();
        rowcount =(int)(Object) rs.getInt(1);
        rs.close();
        msg = "select count(*) from t value";
        try {
            assertEquals(msg, 50, rowcount);
        } catch (Exception e) {
        }
        conn2.setAutoCommit(false);
        conn2.setSavepoint("savepoint1");
        conn2.setSavepoint("savepoint2");
        msg = "savepoint released succesfully on non-originating connection";
        try {
            conn2.releaseSavepoint(sp2);
            assertTrue(msg, false);
        } catch (Exception e) {
        }
        try {
            conn2.rollback(sp1);
            msg = "succesful rollback to savepoint on " + "non-originating connection";
            assertTrue(msg, false);
        } catch (Exception e) {
        }
        msg = "direct execution of <release savepoint> statement failed to " + "release JDBC-created SQL-savepoint with identical savepoint name";
        try {
            conn2.createStatement().executeUpdate("release savepoint \"savepoint2\"");
        } catch (Exception e) {
            try {
                assertTrue(msg, false);
            } catch (Exception e2) {
            }
        }
        msg = "direct execution of <rollback to savepoint> statement failed to " + "roll back to existing JDBC-created SQL-savepoint with identical " + "savepoint name";
        try {
            conn2.createStatement().executeUpdate("rollback to savepoint \"savepoint1\"");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                assertTrue(msg, false);
            } catch (Exception e2) {
            }
        }
        conn1.releaseSavepoint(sp6);
        msg = "savepoint released succesfully > 1 times";
        try {
            conn1.releaseSavepoint(sp6);
            assertTrue(msg, false);
        } catch (Exception e) {
        }
        msg = "savepoint released successfully after preceding savepoint released";
        try {
            conn1.releaseSavepoint(sp7);
            assertTrue(msg, false);
        } catch (Exception e) {
        }
        msg = "preceding same-point savepoint destroyed by following savepoint release";
        try {
            conn1.releaseSavepoint(sp5);
        } catch (Exception e) {
            try {
                assertTrue(msg, false);
            } catch (Exception e2) {
            }
        }
        conn1.rollback(sp4);
        rs =(ResultSet)(Object) stmt.executeQuery("select count(*) from t");
        rs.next();
        rowcount =(int)(Object) rs.getInt(1);
        rs.close();
        msg = "select * rowcount after 50 inserts - 10 rolled back:";
        try {
            assertEquals(msg, 40, rowcount);
        } catch (Exception e) {
        }
        msg = "savepoint rolled back succesfully > 1 times";
        try {
            conn1.rollback(sp4);
            assertTrue(msg, false);
        } catch (Exception e) {
        }
        conn1.rollback(sp3);
        rs =(ResultSet)(Object) stmt.executeQuery("select count(*) from t");
        rs.next();
        rowcount =(int)(Object) rs.getInt(1);
        rs.close();
        msg = "select count(*) after 50 inserts - 20 rolled back:";
        try {
            assertEquals(msg, 30, rowcount);
        } catch (Exception e) {
        }
        msg = "savepoint released succesfully after use in rollback";
        try {
            conn1.releaseSavepoint(sp3);
            assertTrue(msg, false);
        } catch (Exception e) {
        }
        conn1.rollback(sp1);
        msg = "savepoint rolled back without raising an exception after " + "rollback to a preceeding savepoint";
        try {
            conn1.rollback(sp2);
            assertTrue(msg, false);
        } catch (Exception e) {
        }
        conn1.rollback();
        msg = "savepoint released succesfully when it should have been " + "destroyed by a full rollback";
        try {
            conn1.releaseSavepoint(sp1);
            assertTrue(msg, false);
        } catch (Exception e) {
        }
        conn1.setAutoCommit(false);
        sp1 =(Savepoint)(Object) conn1.setSavepoint("savepoint1");
        conn1.rollback();
        conn1.setAutoCommit(false);
        conn1.createStatement().executeUpdate("savepoint \"savepoint1\"");
        conn1.setAutoCommit(false);
        sp1 =(Savepoint)(Object) conn1.setSavepoint("savepoint1");
        conn1.createStatement().executeUpdate("savepoint \"savepoint1\"");
        conn1.setAutoCommit(false);
        sp1 =(Savepoint)(Object) conn1.setSavepoint("savepoint1");
        conn1.createStatement().executeUpdate("savepoint \"savepoint1\"");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass releaseSavepoint(Savepoint o0){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass setSavepoint(String o0){ return null; }
	public MyHelperClass rollback(Savepoint o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class Savepoint {

}
