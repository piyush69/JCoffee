
import java.io.UncheckedIOException;


class c7825860 {

    public static void testAutoIncrement() {
        final int count = 3;
        final Object lock = new Object();
        for (int i = 0; i < count; i++) {
            new Thread(new Runnable() {

//                @Override
                public void run() {
                    while (true) {
                        StringBuilder buffer = new StringBuilder(128);
                        MyHelperClass LS = new MyHelperClass();
                        buffer.append("insert into DOMAIN (                         ").append(LS);
//                        MyHelperClass LS = new MyHelperClass();
                        buffer.append("    DOMAIN_ID, TOP_DOMAIN_ID, DOMAIN_HREF,   ").append(LS);
//                        MyHelperClass LS = new MyHelperClass();
                        buffer.append("    DOMAIN_RANK, DOMAIN_TYPE, DOMAIN_STATUS, ").append(LS);
//                        MyHelperClass LS = new MyHelperClass();
                        buffer.append("    DOMAIN_ICO_CREATED, DOMAIN_CDATE         ").append(LS);
//                        MyHelperClass LS = new MyHelperClass();
                        buffer.append(") values (                   ").append(LS);
//                        MyHelperClass LS = new MyHelperClass();
                        buffer.append("    null ,null, ?,").append(LS);
//                        MyHelperClass LS = new MyHelperClass();
                        buffer.append("    1, 2, 1,                 ").append(LS);
//                        MyHelperClass LS = new MyHelperClass();
                        buffer.append("    0, now()                 ").append(LS);
//                        MyHelperClass LS = new MyHelperClass();
                        buffer.append(")                            ").append(LS);
                        String sqlInsert = buffer.toString();
                        boolean isAutoCommit = false;
                        int i = 0;
                        Connection conn = null;
                        PreparedStatement pstmt = null;
                        ResultSet rs = null;
                        try {
                            MyHelperClass ConnHelper = new MyHelperClass();
                            conn =(Connection)(Object) ConnHelper.getConnection();
                            conn.setAutoCommit(isAutoCommit);
                            pstmt =(PreparedStatement)(Object) conn.prepareStatement(sqlInsert);
                            for (i = 0; i < 10; i++) {
                                String lock = "" + ((int) (Math.random() * 100000000)) % 100;
                                pstmt.setString(1, lock);
                                pstmt.executeUpdate();
                            }
                            if (!isAutoCommit) conn.commit();
                            rs =(ResultSet)(Object) pstmt.executeQuery("select max(DOMAIN_ID) from DOMAIN");
                            if ((boolean)(Object)rs.next()) {
                                String str = System.currentTimeMillis() + " " + rs.getLong(1);
                            }
                        } catch (Exception e) {
                            try {
                                if (!isAutoCommit) conn.rollback();
                            } catch (UncheckedIOException ex) {
                                ex.printStackTrace(System.out);
                            }
//                            MyHelperClass LS = new MyHelperClass();
                            String msg = System.currentTimeMillis() + " " + Thread.currentThread().getName() + " - " + i + " " + e.getMessage() + LS;
                            MyHelperClass FileIO = new MyHelperClass();
                            FileIO.writeToFile("D:/DEAD_LOCK.txt", msg, true, "GBK");
                        } finally {
                            MyHelperClass ConnHelper = new MyHelperClass();
                            ConnHelper.close(conn, pstmt, rs);
                        }
                    }
                }
            }).start();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeToFile(String o0, String o1, boolean o2, String o3){ return null; }
	public MyHelperClass close(Connection o0, PreparedStatement o1, ResultSet o2){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
