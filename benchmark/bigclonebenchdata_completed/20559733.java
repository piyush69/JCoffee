


class c20559733 {

    public Long addPortletName(PortletNameBean portletNameBean) {
        PreparedStatement ps = null;
        DatabaseAdapter dbDyn = null;
        try {
            MyHelperClass DatabaseAdapter = new MyHelperClass();
            dbDyn =(DatabaseAdapter)(Object) DatabaseAdapter.getInstance();
            CustomSequenceType seq = new CustomSequenceType();
            seq.setSequenceName("seq_WM_PORTAL_PORTLET_NAME");
            seq.setTableName("WM_PORTAL_PORTLET_NAME");
            seq.setColumnName("ID_SITE_CTX_TYPE");
            Long sequenceValue =(Long)(Object) dbDyn.getSequenceNextValue(seq);
            ps =(PreparedStatement)(Object) dbDyn.prepareStatement("insert into WM_PORTAL_PORTLET_NAME " + "( ID_SITE_CTX_TYPE, TYPE ) " + "values " + ((boolean)(Object)dbDyn.getIsNeedUpdateBracket() ? "(" : "") + " ?, ?" + ((boolean)(Object)dbDyn.getIsNeedUpdateBracket() ? ")" : ""));
            MyHelperClass RsetTools = new MyHelperClass();
            RsetTools.setLong(ps, 1, sequenceValue);
            ps.setString(2, portletNameBean.getPortletName());
            ps.executeUpdate();
            dbDyn.commit();
            return sequenceValue;
        } catch (Exception e) {
            try {
                if (dbDyn != null) dbDyn.rollback();
            } catch (Exception e001) {
            }
            String es = "Error add new portlet name ";
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

public MyHelperClass close(DatabaseAdapter o0, PreparedStatement o1){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass setLong(PreparedStatement o0, int o1, Long o2){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class PortletNameBean {

public MyHelperClass getPortletName(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class DatabaseAdapter {

public MyHelperClass commit(){ return null; }
	public MyHelperClass getIsNeedUpdateBracket(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getSequenceNextValue(CustomSequenceType o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class CustomSequenceType {

public MyHelperClass setColumnName(String o0){ return null; }
	public MyHelperClass setSequenceName(String o0){ return null; }
	public MyHelperClass setTableName(String o0){ return null; }}
