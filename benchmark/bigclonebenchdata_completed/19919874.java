


class c19919874 {

    public Long createSite(Site site, List hosts) {
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isDebugEnabled()) {
//            MyHelperClass log = new MyHelperClass();
            log.debug("site: " + site);
            if (site != null) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("    language: " + site.getDefLanguage());
//                MyHelperClass log = new MyHelperClass();
                log.debug("    country: " + site.getDefCountry());
//                MyHelperClass log = new MyHelperClass();
                log.debug("    variant: " + site.getDefVariant());
//                MyHelperClass log = new MyHelperClass();
                log.debug("    companyId: " + site.getCompanyId());
            }
        }
        PreparedStatement ps = null;
        DatabaseAdapter dbDyn = null;
        try {
            MyHelperClass DatabaseAdapter = new MyHelperClass();
            dbDyn =(DatabaseAdapter)(Object) DatabaseAdapter.getInstance();
            CustomSequenceType seq = new CustomSequenceType();
            seq.setSequenceName("seq_WM_PORTAL_LIST_SITE");
            seq.setTableName("WM_PORTAL_LIST_SITE");
            seq.setColumnName("ID_SITE");
            Long siteId =(Long)(Object) dbDyn.getSequenceNextValue(seq);
            ps =(PreparedStatement)(Object) dbDyn.prepareStatement("insert into WM_PORTAL_LIST_SITE (" + "ID_SITE, ID_FIRM, DEF_LANGUAGE, DEF_COUNTRY, DEF_VARIANT, " + "NAME_SITE, ADMIN_EMAIL, IS_CSS_DYNAMIC, CSS_FILE, " + "IS_REGISTER_ALLOWED " + ")values " + ((boolean)(Object)dbDyn.getIsNeedUpdateBracket() ? "(" : "") + "	?," + "	?," + "	?," + "	?," + "	?," + "	?," + "	?," + "	?," + "	?," + "	? " + ((boolean)(Object)dbDyn.getIsNeedUpdateBracket() ? ")" : ""));
            int num = 1;
            MyHelperClass RsetTools = new MyHelperClass();
            RsetTools.setLong(ps, num++, siteId);
//            MyHelperClass RsetTools = new MyHelperClass();
            RsetTools.setLong(ps, num++,(Long)(Object) site.getCompanyId());
            ps.setString(num++, site.getDefLanguage());
            ps.setString(num++, site.getDefCountry());
            ps.setString(num++, site.getDefVariant());
            ps.setString(num++, site.getSiteName());
            ps.setString(num++, site.getAdminEmail());
            ps.setInt(num++,(boolean)(Object) site.getCssDynamic() ? 1 : 0);
            ps.setString(num++, site.getCssFile());
            ps.setInt(num++,(boolean)(Object) site.getRegisterAllowed() ? 1 : 0);
            int i1 =(int)(Object) ps.executeUpdate();
//            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("Count of inserted records - " + i1);
            if (hosts != null) {
                for (String s :(String[])(Object) (Object[])(Object)hosts) {
                    VirtualHost host =(VirtualHost)(Object) new VirtualHostBean(null, siteId, s);
                    MyHelperClass InternalDaoFactory = new MyHelperClass();
                    InternalDaoFactory.getInternalVirtualHostDao().createVirtualHost(dbDyn, host);
                }
            }
            dbDyn.commit();
            return siteId;
        } catch (Exception e) {
            try {
                if (dbDyn != null) dbDyn.rollback();
            } catch (Exception e001) {
            }
            String es = "Error add new site";
//            MyHelperClass log = new MyHelperClass();
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
	public MyHelperClass createVirtualHost(DatabaseAdapter o0, VirtualHost o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass setLong(PreparedStatement o0, int o1, Long o2){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getInternalVirtualHostDao(){ return null; }}

class Site {

public MyHelperClass getCompanyId(){ return null; }
	public MyHelperClass getDefCountry(){ return null; }
	public MyHelperClass getCssFile(){ return null; }
	public MyHelperClass getAdminEmail(){ return null; }
	public MyHelperClass getDefLanguage(){ return null; }
	public MyHelperClass getDefVariant(){ return null; }
	public MyHelperClass getSiteName(){ return null; }
	public MyHelperClass getRegisterAllowed(){ return null; }
	public MyHelperClass getCssDynamic(){ return null; }}

class List {

}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
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

class VirtualHost {

}

class VirtualHostBean {

VirtualHostBean(Object o0, Long o1, String o2){}
	VirtualHostBean(){}}
