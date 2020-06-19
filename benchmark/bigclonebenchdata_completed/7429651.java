import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7429651 {
public MyHelperClass bidStateInsert(Context o0){ return null; }
	public MyHelperClass bidPrivateInsert(Context o0, Context o1){ return null; }
	public MyHelperClass computeCheckoutTotal(Context o0, Statement o1){ return null; }

        protected void execute(Context context) throws Throwable, java.lang.Exception {
            Connection c = null;
            Statement s = null;
            Integer check = context.getValueAsInteger("Total");
            System.err.println("In BuyWidget.execute()");
            try {
                c = context.getConnection();
                c.setAutoCommit(false);
                s = c.createStatement();
                int total = computeCheckoutTotal(context, s);
                if (check == null) {
                    throw new Exception("Shouldn't: No total?");
                }
                if (check.intValue() != total) {
                    throw new Exception("Shouldn't: Basket changed? " + "total was " + total + "; checksum was " + check);
                }
                StringBuffer q = new StringBuffer("select BIDSTATE.Bid, BIDSTATE.Amount, " + "BIDSTATE.QShipping, BIDSTATE.QInsure " + "from BID, BIDSTATE " + "where  BIDSTATE.Bid = BID.Bid " + "and ( BIDSTATE.BidStatus = 0 " + "or BIDSTATE.BidStatus = 15) " + "and BID.Customer = ");
                q.append(context.get("customer"));
                q.append(" and bidstate.bidstate =  " + "( select max( bidstate.bidstate) " + "from bidstate " + "where bid = bid.bid) ");
                System.err.println(q.toString());
                Contexts rows = new RSContexts(s.executeQuery(q.toString()));
                Enumeration e = rows.elements();
                while (e.hasMoreElements()) {
                    Context row = (Context) e.nextElement();
                    row.merge((Map) context);
                    MyHelperClass ConnectionPool = new MyHelperClass();
                    row.put("Username", context.get(ConnectionPool.DBUSERMAGICTOKEN));
                    MyHelperClass BidStatus = new MyHelperClass();
                    row.put("BidStatus", BidStatus.OFFER);
                    s.executeUpdate(bidStateInsert(row));
                    s.execute(bidPrivateInsert(context, row));
                }
                c.commit();
            } catch (Exception any) {
                c.rollback();
                throw new DataStoreException("Your card will not be debited: " + any.getMessage());
            } finally {
                try {
                    if (s != null) {
                        s.close();
                    }
                    if (c != null) {
                        context.releaseConnection(c);
                    }
                } catch (SQLException sex) {
                } catch (DataStoreException dse) {
                }
            }
            MyHelperClass REDIRECTMAGICTOKEN = new MyHelperClass();
            context.put(REDIRECTMAGICTOKEN, "account");
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OFFER;
	public MyHelperClass DBUSERMAGICTOKEN;
}

class Context {

public MyHelperClass releaseConnection(Connection o0){ return null; }
	public MyHelperClass getValueAsInteger(String o0){ return null; }
	public MyHelperClass merge(Map o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass put(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Contexts {

public MyHelperClass elements(){ return null; }}

class RSContexts {

}

class DataStoreException extends Exception{
	public DataStoreException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
