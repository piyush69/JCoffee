import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8062076 {

    public void updateUser(User portalUserBean, AuthSession authSession)  throws Throwable {
        DatabaseAdapter dbDyn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass DatabaseAdapter = new MyHelperClass();
            dbDyn = DatabaseAdapter.getInstance();
            String sql = "update WM_LIST_USER " + "set    FIRST_NAME=?,MIDDLE_NAME=?,LAST_NAME=?, " + "       ADDRESS=?,TELEPHONE=?,EMAIL=? " + "where  ID_USER=? and is_deleted=0 and  ID_FIRM in ";
            switch(dbDyn.getFamaly()) {
                MyHelperClass DatabaseManager = new MyHelperClass();
                case DatabaseManager.MYSQL_FAMALY:
                    String idList = authSession.getGrantedCompanyId();
                    sql += " (" + idList + ") ";
                    break;
                default:
                    sql += "(select z1.ID_FIRM from v$_read_list_firm z1 where z1.user_login = ?)";
                    break;
            }
            ps = dbDyn.prepareStatement(sql);
            int num = 1;
            ps.setString(num++, portalUserBean.getFirstName());
            ps.setString(num++, portalUserBean.getMiddleName());
            ps.setString(num++, portalUserBean.getLastName());
            ps.setString(num++, portalUserBean.getAddress());
            ps.setString(num++, portalUserBean.getPhone());
            ps.setString(num++, portalUserBean.getEmail());
            ps.setLong(num++, portalUserBean.getUserId());
            switch(dbDyn.getFamaly()) {
                MyHelperClass DatabaseManager = new MyHelperClass();
                case DatabaseManager.MYSQL_FAMALY:
                    break;
                default:
                    ps.setString(num++, authSession.getUserLogin());
                    break;
            }
            int i1 = ps.executeUpdate();
            MyHelperClass log = new MyHelperClass();
            if (log.isDebugEnabled()) log.debug("Count of updated record - " + i1);
            dbDyn.commit();
        } catch (Exception e) {
            try {
                if (dbDyn != null) {
                    dbDyn.rollback();
                }
            } catch (Exception e001) {
            }
            String es = "Error update of portal user";
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

class User {

}

class AuthSession {

}

class DatabaseAdapter {

}

class PreparedStatement {

}
