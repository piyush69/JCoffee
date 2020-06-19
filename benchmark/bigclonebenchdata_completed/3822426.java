
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3822426 {

    public int addPermissionsForUserAndAgenda(Integer userId, Integer agendaId, String permissions) throws TechnicalException {
        if (permissions == null) {
            throw new TechnicalException((String)(Object)new Exception(new Exception("Column 'permissions' cannot be null")));
        }
        Session session = null;
        Transaction transaction = null;
        try {
            MyHelperClass HibernateUtil = new MyHelperClass();
            session =(Session)(Object) HibernateUtil.getCurrentSession();
            transaction =(Transaction)(Object) session.beginTransaction();
            String query = "INSERT INTO j_user_agenda (userId, agendaId, permissions) VALUES(" + userId + "," + agendaId + ",\"" + permissions + "\")";
            Statement statement =(Statement)(Object) session.connection().createStatement();
            int rowsUpdated =(int)(Object) statement.executeUpdate(query);
            transaction.commit();
            return rowsUpdated;
        } catch (UncheckedIOException ex) {
            if (transaction != null) transaction.rollback();
            throw new TechnicalException((String)(Object)ex);
        } catch (ArithmeticException e) {
            if (transaction != null) transaction.rollback();
            throw new TechnicalException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCurrentSession(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class TechnicalException extends Exception{
	public TechnicalException(String errorMessage) { super(errorMessage); }
}

class Session {

public MyHelperClass beginTransaction(){ return null; }
	public MyHelperClass connection(){ return null; }}

class Transaction {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}

class HibernateException extends Exception{
	public HibernateException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
