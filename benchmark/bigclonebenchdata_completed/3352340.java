


class c3352340 {

    public Long processAddCompany(Company companyBean, String userLogin, Long holdingId, AuthSession authSession) {
        if (authSession == null) {
            return null;
        }
        PreparedStatement ps = null;
        DatabaseAdapter dbDyn = null;
        try {
            MyHelperClass DatabaseAdapter = new MyHelperClass();
            dbDyn =(DatabaseAdapter)(Object) DatabaseAdapter.getInstance();
            CustomSequenceType seq = new CustomSequenceType();
            seq.setSequenceName("seq_WM_LIST_COMPANY");
            seq.setTableName("WM_LIST_COMPANY");
            seq.setColumnName("ID_FIRM");
            Long sequenceValue =(Long)(Object) dbDyn.getSequenceNextValue(seq);
            ps =(PreparedStatement)(Object) dbDyn.prepareStatement("insert into WM_LIST_COMPANY (" + "	ID_FIRM, " + "	full_name, " + "	short_name, " + "	address, " + "	telefon_buh, " + "	telefon_chief, " + "	chief, " + "	buh, " + "	fax, " + "	email, " + "	icq, " + "	short_client_info, " + "	url, " + "	short_info, " + "is_deleted" + ")" + ((boolean)(Object)dbDyn.getIsNeedUpdateBracket() ? "(" : "") + " select " + "	?," + "	?," + "	?," + "	?," + "	?," + "	?," + "	?," + "	?," + "	?," + "	?," + "	?," + "	?," + "	?," + "	?,0 from WM_AUTH_USER " + "where USER_LOGIN=? " + ((boolean)(Object)dbDyn.getIsNeedUpdateBracket() ? ")" : ""));
            int num = 1;
            MyHelperClass RsetTools = new MyHelperClass();
            RsetTools.setLong(ps, num++, sequenceValue);
            ps.setString(num++,(String)(Object) companyBean.getName());
            ps.setString(num++,(String)(Object) companyBean.getShortName());
            ps.setString(num++,(String)(Object) companyBean.getAddress());
            ps.setString(num++, "");
            ps.setString(num++, "");
            ps.setString(num++,(String)(Object) companyBean.getCeo());
            ps.setString(num++,(String)(Object) companyBean.getCfo());
            ps.setString(num++, "");
            ps.setString(num++, "");
//            MyHelperClass RsetTools = new MyHelperClass();
            RsetTools.setLong(ps, num++, null);
            ps.setString(num++, "");
            ps.setString(num++,(String)(Object) companyBean.getWebsite());
            ps.setString(num++,(String)(Object) companyBean.getInfo());
            ps.setString(num++, userLogin);
            int i1 =(int)(Object) ps.executeUpdate();
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("Count of inserted records - " + i1);
            if (holdingId != null) {
                MyHelperClass InternalDaoFactory = new MyHelperClass();
                InternalDaoFactory.getInternalHoldingDao().setRelateHoldingCompany(dbDyn, holdingId, sequenceValue);
            }
            dbDyn.commit();
            return sequenceValue;
        } catch (Exception e) {
            try {
                if (dbDyn != null) dbDyn.rollback();
            } catch (Exception e001) {
            }
            String es = "Error add new company";
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
	public MyHelperClass setLong(PreparedStatement o0, int o1, Object o2){ return null; }
	public MyHelperClass close(DatabaseAdapter o0, PreparedStatement o1){ return null; }
	public MyHelperClass getInternalHoldingDao(){ return null; }
	public MyHelperClass setRelateHoldingCompany(DatabaseAdapter o0, Long o1, Long o2){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass setLong(PreparedStatement o0, int o1, Long o2){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Company {

public MyHelperClass getCfo(){ return null; }
	public MyHelperClass getCeo(){ return null; }
	public MyHelperClass getShortName(){ return null; }
	public MyHelperClass getWebsite(){ return null; }
	public MyHelperClass getAddress(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getInfo(){ return null; }}

class AuthSession {

}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
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
