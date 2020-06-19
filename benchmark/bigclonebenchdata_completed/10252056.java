


class c10252056 {

    public void updatePortletName(PortletName portletNameBean) {
        DatabaseAdapter dbDyn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass DatabaseAdapter = new MyHelperClass();
            dbDyn =(DatabaseAdapter)(Object) DatabaseAdapter.getInstance();
            String sql = "update WM_PORTAL_PORTLET_NAME " + "set    TYPE=? " + "where  ID_SITE_CTX_TYPE=?";
            ps =(PreparedStatement)(Object) dbDyn.prepareStatement(sql);
            ps.setString(1, portletNameBean.getPortletName());
            MyHelperClass RsetTools = new MyHelperClass();
            RsetTools.setLong(ps, 2, portletNameBean.getPortletId());
            int i1 =(int)(Object) ps.executeUpdate();
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("Count of updated record - " + i1);
            dbDyn.commit();
        } catch (Exception e) {
            try {
                if (dbDyn != null) dbDyn.rollback();
            } catch (Exception e001) {
            }
            String es = "Error save portlet name";
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

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass close(DatabaseAdapter o0, PreparedStatement o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass setLong(PreparedStatement o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class PortletName {

public MyHelperClass getPortletId(){ return null; }
	public MyHelperClass getPortletName(){ return null; }}

class DatabaseAdapter {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
