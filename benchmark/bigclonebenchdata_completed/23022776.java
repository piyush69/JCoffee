


class c23022776 {
public MyHelperClass processInsertRelatedCompany(DatabaseAdapter o0, HoldingBean o1, AuthSession o2){ return null; }

    public Long processAddHolding(Holding holdingBean, AuthSession authSession) {
        if (authSession == null) {
            return null;
        }
        PreparedStatement ps = null;
        DatabaseAdapter dbDyn = null;
        try {
            MyHelperClass DatabaseAdapter = new MyHelperClass();
            dbDyn =(DatabaseAdapter)(Object) DatabaseAdapter.getInstance();
            CustomSequenceType seq = new CustomSequenceType();
            seq.setSequenceName("seq_WM_LIST_HOLDING");
            seq.setTableName("WM_LIST_HOLDING");
            seq.setColumnName("ID_HOLDING");
            Long sequenceValue =(Long)(Object) dbDyn.getSequenceNextValue(seq);
            ps =(PreparedStatement)(Object) dbDyn.prepareStatement("insert into WM_LIST_HOLDING " + "( ID_HOLDING, full_name_HOLDING, NAME_HOLDING )" + "values " + ((boolean)(Object)dbDyn.getIsNeedUpdateBracket() ? "(" : "") + " ?, ?, ? " + ((boolean)(Object)dbDyn.getIsNeedUpdateBracket() ? ")" : ""));
            int num = 1;
            MyHelperClass RsetTools = new MyHelperClass();
            RsetTools.setLong(ps, num++, sequenceValue);
            ps.setString(num++, holdingBean.getName());
            ps.setString(num++, holdingBean.getShortName());
            int i1 =(int)(Object) ps.executeUpdate();
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("Count of inserted records - " + i1);
            HoldingBean bean = new HoldingBean(holdingBean);
            bean.setId(sequenceValue);
            processInsertRelatedCompany(dbDyn, bean, authSession);
            dbDyn.commit();
            return sequenceValue;
        } catch (Exception e) {
            try {
                if (dbDyn != null) dbDyn.rollback();
            } catch (Exception e001) {
            }
            String es = "Error add new holding";
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
	public MyHelperClass setLong(PreparedStatement o0, int o1, Long o2){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Holding {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getShortName(){ return null; }}

class AuthSession {

}

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

class HoldingBean {

HoldingBean(Holding o0){}
	HoldingBean(){}
	public MyHelperClass setId(Long o0){ return null; }}
