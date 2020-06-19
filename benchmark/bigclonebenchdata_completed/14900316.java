
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14900316 {
public MyHelperClass getUserById(MyHelperClass o0){ return null; }
public MyHelperClass createProperties(User o0, Connection o1){ return null; }
	public MyHelperClass closeConnection(Connection o0){ return null; }
public MyHelperClass jdbcStoreResource;
	public MyHelperClass ds;
	public MyHelperClass User;
	public MyHelperClass checkUser(){ return null; }

//    @Override
    public User createUser(User bean) throws SitoolsException {
        checkUser();
        if (!(Boolean)(Object)User.isValid(bean)) {
            throw new SitoolsException("CREATE_USER_MALFORMED");
        }
        Connection cx = null;
        try {
            cx =(Connection)(Object) ds.getConnection();
            cx.setAutoCommit(false);
            PreparedStatement st =(PreparedStatement)(Object) cx.prepareStatement(jdbcStoreResource.CREATE_USER);
            int i = 1;
            st.setString(i++, bean.getIdentifier());
            st.setString(i++, bean.getFirstName());
            st.setString(i++, bean.getLastName());
            st.setString(i++, bean.getSecret());
            st.setString(i++, bean.getEmail());
            st.executeUpdate();
            st.close();
            createProperties(bean, cx);
            if (!(Boolean)(Object)cx.getAutoCommit()) {
                cx.commit();
            }
        } catch (UncheckedIOException e) {
            try {
                cx.rollback();
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
                throw new SitoolsException("CREATE_USER ROLLBACK" + e1.getMessage(),(SQLException)(Object) e1);
            }
            e.printStackTrace();
            throw new SitoolsException("CREATE_USER " + e.getMessage(),(SQLException)(Object) e);
        } finally {
            closeConnection(cx);
        }
        return(User)(Object) getUserById(bean.getIdentifier());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CREATE_USER;
public MyHelperClass isValid(User o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class User {

public MyHelperClass getFirstName(){ return null; }
	public MyHelperClass getSecret(){ return null; }
	public MyHelperClass getIdentifier(){ return null; }
	public MyHelperClass getLastName(){ return null; }
	public MyHelperClass getEmail(){ return null; }}

class SitoolsException extends Exception{
	public SitoolsException(String errorMessage) { super(errorMessage); }
	SitoolsException(String o0, SQLException o1){}
	SitoolsException(){}
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
