
import java.io.UncheckedIOException;


class c13233761 {

    public void executeUpdateTransaction(List queries) throws SQLException {
        MyHelperClass connection = new MyHelperClass();
        assert connection != null;
//        MyHelperClass connection = new MyHelperClass();
        boolean autoCommit =(boolean)(Object) connection.getAutoCommit();
//        MyHelperClass connection = new MyHelperClass();
        connection.setAutoCommit(false);
        try {
            Iterator iterator =(Iterator)(Object) queries.iterator();
            while ((boolean)(Object)iterator.hasNext()) {
                String query = (String)(String)(Object) iterator.next();
//                MyHelperClass connection = new MyHelperClass();
                Statement statement =(Statement)(Object) connection.createStatement();
                statement.executeUpdate(query);
            }
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
//            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(autoCommit);
        } catch (UncheckedIOException e) {
//            MyHelperClass connection = new MyHelperClass();
            connection.rollback();
            throw new SQLException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class List {

public MyHelperClass iterator(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}
