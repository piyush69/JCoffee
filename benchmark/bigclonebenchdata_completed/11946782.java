


class c11946782 {

    public static void addIntegrityEnforcements(Session session) throws HibernateException {
        Transaction tx = null;
        try {
            tx =(Transaction)(Object) session.beginTransaction();
            Statement st =(Statement)(Object) session.connection().createStatement();
            st.executeUpdate("DROP TABLE hresperformsrole;" + "CREATE TABLE hresperformsrole" + "(" + "hresid varchar(255) NOT NULL," + "rolename varchar(255) NOT NULL," + "CONSTRAINT hresperformsrole_pkey PRIMARY KEY (hresid, rolename)," + "CONSTRAINT ResourceFK FOREIGN KEY (hresid) REFERENCES resserposid (id) ON UPDATE CASCADE ON DELETE CASCADE," + "CONSTRAINT RoleFK FOREIGN KEY (rolename) REFERENCES role (rolename) ON UPDATE CASCADE ON DELETE CASCADE" + ");");
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createStatement(){ return null; }}

class Session {

public MyHelperClass connection(){ return null; }
	public MyHelperClass beginTransaction(){ return null; }}

class HibernateException extends Exception{
	public HibernateException(String errorMessage) { super(errorMessage); }
}

class Transaction {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}
