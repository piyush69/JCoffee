


class c6668684 {
public static MyHelperClass log;
	public static MyHelperClass context;
	public static MyHelperClass xadatasource;
	public static MyHelperClass init(){ return null; }
//public MyHelperClass context;
//	public MyHelperClass xadatasource;
//	public MyHelperClass log;
//	public MyHelperClass init(){ return null; }

    public static void doIt(String action) {
        int f = -1;
        Statement s = null;
        Connection connection = null;
        try {
            init();
            log.info("<<< Looking up UserTransaction >>>");
            UserTransaction usertransaction = (UserTransaction)(UserTransaction)(Object) context.lookup("java:comp/UserTransaction");
            log.info("<<< beginning the transaction >>>");
            usertransaction.begin();
            log.info("<<< Connecting to xadatasource >>>");
            connection =(Connection)(Object) xadatasource.getConnection();
            log.info("<<< Connected >>>");
            s =(Statement)(Object) connection.createStatement();
            s.executeUpdate("update testdata set foo=foo + 1 where id=1");
            if ((action != null) && action.equals("commit")) {
                log.info("<<< committing the transaction >>>");
                usertransaction.commit();
            } else {
                log.info("<<< rolling back the transaction >>>");
                usertransaction.rollback();
            }
            log.info("<<< transaction complete >>>");
        } catch (Exception e) {
            log.error("doIt", e);
        } finally {
            try {
                s.close();
                connection.close();
            } catch (Exception x) {
                log.error("problem closing statement/connection", x);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass lookup(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class Connection {

public MyHelperClass close(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class UserTransaction {

public MyHelperClass begin(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}
