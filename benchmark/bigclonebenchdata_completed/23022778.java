import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23022778 {

    public void processDeleteHolding(Holding holdingBean, AuthSession authSession)  throws Throwable {
        if (authSession == null) {
            return;
        }
        DatabaseAdapter dbDyn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass DatabaseAdapter = new MyHelperClass();
            dbDyn = DatabaseAdapter.getInstance();
            if (holdingBean.getId() == null) throw new IllegalArgumentException("holdingId is null");
            processDeleteRelatedCompany(dbDyn, holdingBean, authSession);
            String sql = "delete from WM_LIST_HOLDING " + "where  ID_HOLDING=? and ID_HOLDING in ";
            switch(dbDyn.getFamaly()) {
                MyHelperClass DatabaseManager = new MyHelperClass();
                case DatabaseManager.MYSQL_FAMALY:
                    String idList = authSession.getGrantedHoldingId();
                    sql += " (" + idList + ") ";
                    break;
                default:
                    sql += "(select z1.ID_ROAD from v$_read_list_road z1 where z1.user_login = ?)";
                    break;
            }
            ps = dbDyn.prepareStatement(sql);
            MyHelperClass RsetTools = new MyHelperClass();
            RsetTools.setLong(ps, 1, holdingBean.getId());
            switch(dbDyn.getFamaly()) {
                MyHelperClass DatabaseManager = new MyHelperClass();
                case DatabaseManager.MYSQL_FAMALY:
                    break;
                default:
                    ps.setString(2, authSession.getUserLogin());
                    break;
            }
            int i1 = ps.executeUpdate();
            MyHelperClass log = new MyHelperClass();
            if (log.isDebugEnabled()) log.debug("Count of deleted records - " + i1);
            dbDyn.commit();
        } catch (Exception e) {
            try {
                if (dbDyn != null) dbDyn.rollback();
            } catch (Exception e001) {
            }
            String es = "Error delete holding";
            MyHelperClass log = new MyHelperClass();
            log.error(es, e);
            throw new IllegalStateException(es, e);
        } finally {
            MyHelperClass DatabaseManager = new MyHelperClass();
            DatabaseManager.close(dbDyn, ps);
            dbDyn = null;
            ps = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Holding {

}

class AuthSession {

}

class DatabaseAdapter {

}

class PreparedStatement {

}
