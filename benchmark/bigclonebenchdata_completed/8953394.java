


class c8953394 {
public MyHelperClass logger;

    private void update(String statement, SyrupConnection con, boolean do_log) throws Exception {
        Statement s = null;
        try {
            s =(Statement)(Object) con.createStatement();
            s.executeUpdate(statement);
            con.commit();
        } catch (Throwable e) {
            if (do_log) {
                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.INFO, "Update failed. Transaction is rolled back", e);
            }
            con.rollback();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
public MyHelperClass log(MyHelperClass o0, String o1, Throwable o2){ return null; }}

class SyrupConnection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}
