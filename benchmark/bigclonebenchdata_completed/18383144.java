import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18383144 {
public MyHelperClass store(Context o0, Connection o1){ return null; }

    protected boolean store(Context context) throws Throwable, DataStoreException, ServletException {
        Connection db =(Connection)(Object) context.getConnection();
        Statement st = null;
        String q = null;
        Integer subscriber =(Integer)(Object) context.getValueAsInteger("subscriber");
        int amount = 0;
        if (subscriber == null) {
            throw new DataAuthException("Don't know who moderator is");
        }
        Object response = context.get("Response");
        if (response == null) {
            throw new DataStoreException("Don't know what to moderate");
        } else {
            Context scratch = (Context) context.clone();
            MyHelperClass TableDescriptor = new MyHelperClass();
            TableDescriptor.getDescriptor("response", "response", scratch).fetch(scratch);
            Integer author =(Integer)(Object) scratch.getValueAsInteger("author");
            if (subscriber.equals(author)) {
                throw new SelfModerationException("You may not moderate your own responses");
            }
        }
        context.put("moderator", subscriber);
        context.put("moderated", response);
        if (db != null) {
            try {
                st =(Statement)(Object) db.createStatement();
                q = "select mods from subscriber where subscriber = " + subscriber.toString();
                ResultSet r =(ResultSet)(Object) st.executeQuery(q);
                if ((boolean)(Object)r.next()) {
                    if ((int)(Object)r.getInt("mods") < 1) {
                        throw new DataAuthException("You have no moderation points left");
                    }
                } else {
                    throw new DataAuthException("Don't know who moderator is");
                }
                Object reason = context.get("reason");
                q = "select score from modreason where modreason = " + reason;
                r =(ResultSet)(Object) st.executeQuery(q);
                if ((boolean)(Object)r.next()) {
                    amount =(int)(Object) r.getInt("score");
                    context.put("amount", new Integer(amount));
                } else {
                    throw new DataStoreException("Don't recognise reason (" + reason + ") to moderate");
                }
                MyHelperClass keyField = new MyHelperClass();
                context.put(keyField, null);
                if ((boolean)(Object)this.store(context, db)) {
                    db.setAutoCommit(false);
                    q = "update RESPONSE set Moderation = " + "( select sum( Amount) from MODERATION " + "where Moderated = " + response + ") " + "where Response = " + response;
                    st.executeUpdate(q);
                    q = "update subscriber set mods = mods - 1 " + "where subscriber = " + subscriber;
                    st.executeUpdate(q);
                    q = "select author from response " + "where response = " + response;
                    r =(ResultSet)(Object) st.executeQuery(q);
                    if ((boolean)(Object)r.next()) {
                        int author =(int)(Object) r.getInt("author");
                        if (author != 0) {
                            int points = -1;
                            if (amount > 0) {
                                points = 1;
                            }
                            StringBuffer qb = new StringBuffer("update subscriber ");
                            qb.append("set score = score + ").append(amount);
                            qb.append(", mods = mods + ").append(points);
                            qb.append(" where subscriber = ").append(author);
                            st.executeUpdate(qb.toString());
                        }
                    }
                    db.commit();
                }
            } catch (Exception e) {
                try {
                    db.rollback();
                } catch (Exception whoops) {
                    throw new DataStoreException("Shouldn't happen: " + "failed to back out " + "failed insert: " + whoops.getMessage());
                }
                throw new DataStoreException("Failed to store moderation: " + e.getMessage());
            } finally {
                if (st != null) {
                    try {
                        st.close();
                    } catch (Exception noclose) {
                    }
                    context.releaseConnection(db);
                }
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fetch(Context o0){ return null; }
	public MyHelperClass getDescriptor(String o0, String o1, Context o2){ return null; }}

class Context {

public MyHelperClass put(String o0, Integer o1){ return null; }
	public MyHelperClass put(MyHelperClass o0, Object o1){ return null; }
	public MyHelperClass put(String o0, Object o1){ return null; }
	public MyHelperClass releaseConnection(Connection o0){ return null; }
	public MyHelperClass getValueAsInteger(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class DataStoreException extends Exception{
	public DataStoreException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class DataAuthException extends Exception{
	public DataAuthException(String errorMessage) { super(errorMessage); }
}

class SelfModerationException extends Exception{
	public SelfModerationException(String errorMessage) { super(errorMessage); }
}

class ResultSet {

public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }}
