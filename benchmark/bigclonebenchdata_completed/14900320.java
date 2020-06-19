
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14900320 {
public MyHelperClass getUserById(MyHelperClass o0){ return null; }
	public MyHelperClass deleteProperties(MyHelperClass o0, Connection o1){ return null; }
public MyHelperClass createProperties(User o0, Connection o1){ return null; }
	public MyHelperClass closeConnection(Connection o0){ return null; }
public MyHelperClass jdbcStoreResource;
	public MyHelperClass ds;
	public MyHelperClass checkUser(){ return null; }

//    @Override
    public User updateUser(User bean) throws SitoolsException {
        checkUser();
        Connection cx = null;
        try {
            cx =(Connection)(Object) ds.getConnection();
            cx.setAutoCommit(false);
            PreparedStatement st;
            int i = 1;
            if (bean.getSecret() != null && !"".equals(bean.getSecret())) {
                st =(PreparedStatement)(Object) cx.prepareStatement(jdbcStoreResource.UPDATE_USER_WITH_PW);
                st.setString(i++, bean.getFirstName());
                st.setString(i++, bean.getLastName());
                st.setString(i++, bean.getSecret());
                st.setString(i++, bean.getEmail());
                st.setString(i++, bean.getIdentifier());
            } else {
                st =(PreparedStatement)(Object) cx.prepareStatement(jdbcStoreResource.UPDATE_USER_WITHOUT_PW);
                st.setString(i++, bean.getFirstName());
                st.setString(i++, bean.getLastName());
                st.setString(i++, bean.getEmail());
                st.setString(i++, bean.getIdentifier());
            }
            st.executeUpdate();
            st.close();
            if (bean.getProperties() != null) {
                deleteProperties(bean.getIdentifier(), cx);
                createProperties(bean, cx);
            }
            if (!(Boolean)(Object)cx.getAutoCommit()) {
                cx.commit();
            }
        } catch (UncheckedIOException e) {
            try {
                cx.rollback();
            } catch (UncheckedIOException e1) {
                throw new SitoolsException("UPDATE_USER ROLLBACK" + e1.getMessage(),(SQLException)(Object) e1);
            }
            throw new SitoolsException("UPDATE_USER " + e.getMessage(),(SQLException)(Object) e);
        } finally {
            closeConnection(cx);
        }
        return(User)(Object) getUserById(bean.getIdentifier());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UPDATE_USER_WITHOUT_PW;
	public MyHelperClass UPDATE_USER_WITH_PW;
public MyHelperClass getConnection(){ return null; }}

class User {

public MyHelperClass getProperties(){ return null; }
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
