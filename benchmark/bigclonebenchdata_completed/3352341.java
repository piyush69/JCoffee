import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3352341 {

    public void processSaveCompany(Company companyBean, AuthSession authSession)  throws Throwable {
        if (authSession == null) {
            return;
        }
        DatabaseAdapter dbDyn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass DatabaseAdapter = new MyHelperClass();
            dbDyn = DatabaseAdapter.getInstance();
            String sql = "UPDATE WM_LIST_COMPANY " + "SET " + "	full_name = ?, " + "	short_name = ?, " + "	address = ?, " + "	telefon_buh = ?, " + "	telefon_chief = ?, " + "	chief = ?, " + "	buh = ?, " + "	fax = ?, " + "	email = ?, " + "	icq = ?, " + "	short_client_info = ?, " + "	url = ?, " + "	short_info = ? " + "WHERE ID_FIRM = ? and ID_FIRM in ";
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
            ps.setString(num++, companyBean.getName());
            ps.setString(num++, companyBean.getShortName());
            ps.setString(num++, companyBean.getAddress());
            ps.setString(num++, "");
            ps.setString(num++, "");
            ps.setString(num++, companyBean.getCeo());
            ps.setString(num++, companyBean.getCfo());
            ps.setString(num++, "");
            ps.setString(num++, "");
            MyHelperClass RsetTools = new MyHelperClass();
            RsetTools.setLong(ps, num++, null);
            ps.setString(num++, "");
            ps.setString(num++, companyBean.getWebsite());
            ps.setString(num++, companyBean.getInfo());
            MyHelperClass RsetTools = new MyHelperClass();
            RsetTools.setLong(ps, num++, companyBean.getId());
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
                if (dbDyn != null) dbDyn.rollback();
            } catch (Exception e001) {
            }
            String es = "Error save company";
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

class Company {

}

class AuthSession {

}

class DatabaseAdapter {

}

class PreparedStatement {

}
