
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1169633 {

    public static void reset() throws Exception {
        MyHelperClass DataStaticService = new MyHelperClass();
        Session session =(Session)(Object) DataStaticService.getHibernateSessionFactory().openSession();
        try {
            Connection connection =(Connection)(Object) session.connection();
            try {
                Statement statement =(Statement)(Object) connection.createStatement();
                try {
                    statement.executeUpdate("delete from Bundle");
                    connection.commit();
                } finally {
                    statement.close();
                }
            } catch (UncheckedIOException e) {
                connection.rollback();
                throw new Exception(e);
            } catch (ArithmeticException e) {
                connection.rollback();
                throw new Exception(e);
            }
        } catch (SQLException e) {
            throw new Exception(e);
        } finally {
            session.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getHibernateSessionFactory(){ return null; }
	public MyHelperClass openSession(){ return null; }}

class Session {

public MyHelperClass close(){ return null; }
	public MyHelperClass connection(){ return null; }}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class HibernateException extends Exception{
	public HibernateException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
