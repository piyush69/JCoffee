


class c4615986 {
public MyHelperClass DatabaseManager;

    public void processAction(DatabaseAdapter db_, DataDefinitionActionDataListType parameters) throws Exception {
        PreparedStatement ps = null;
        try {
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("db connect - " + db_.getClass().getName());
            MyHelperClass DefinitionService = new MyHelperClass();
            String seqName =(String)(Object) DefinitionService.getString(parameters, "sequence_name", null);
            if (seqName == null) {
                String errorString = "Name of sequnce not found";
//                MyHelperClass log = new MyHelperClass();
                log.error(errorString);
                throw new Exception(errorString);
            }
//            MyHelperClass DefinitionService = new MyHelperClass();
            String tableName =(String)(Object) DefinitionService.getString(parameters, "name_table", null);
            if (tableName == null) {
                String errorString = "Name of table not found";
//                MyHelperClass log = new MyHelperClass();
                log.error(errorString);
                throw new Exception(errorString);
            }
//            MyHelperClass DefinitionService = new MyHelperClass();
            String columnName =(String)(Object) DefinitionService.getString(parameters, "name_pk_field", null);
            if (columnName == null) {
                String errorString = "Name of column not found";
//                MyHelperClass log = new MyHelperClass();
                log.error(errorString);
                throw new Exception(errorString);
            }
            CustomSequenceType seqSite = new CustomSequenceType();
            seqSite.setSequenceName(seqName);
            seqSite.setTableName(tableName);
            seqSite.setColumnName(columnName);
            long seqValue =(long)(Object) db_.getSequenceNextValue(seqSite);
//            MyHelperClass DefinitionService = new MyHelperClass();
            String valueColumnName =(String)(Object) DefinitionService.getString(parameters, "name_value_field", null);
            if (columnName == null) {
                String errorString = "Name of valueColumnName not found";
//                MyHelperClass log = new MyHelperClass();
                log.error(errorString);
                throw new Exception(errorString);
            }
//            MyHelperClass DefinitionService = new MyHelperClass();
            String insertValue =(String)(Object) DefinitionService.getString(parameters, "insert_value", null);
            if (columnName == null) {
                String errorString = "Name of insertValue not found";
//                MyHelperClass log = new MyHelperClass();
                log.error(errorString);
                throw new Exception(errorString);
            }
            String sql = "insert into " + tableName + " " + "(" + columnName + "," + valueColumnName + ")" + "values" + "(?,?)";
//            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) {
//                MyHelperClass log = new MyHelperClass();
                log.debug(sql);
//                MyHelperClass log = new MyHelperClass();
                log.debug("pk " + seqValue);
//                MyHelperClass log = new MyHelperClass();
                log.debug("value " + insertValue);
            }
            ps =(PreparedStatement)(Object) db_.prepareStatement(sql);
            ps.setLong(1, seqValue);
            ps.setString(2, insertValue);
            ps.executeUpdate();
            db_.commit();
        } catch (Exception e) {
            try {
                db_.rollback();
            } catch (Exception e1) {
            }
            MyHelperClass log = new MyHelperClass();
            log.error("Error insert value", e);
            throw e;
        } finally {
            DatabaseManager.close(ps);
            ps = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getString(DataDefinitionActionDataListType o0, String o1, Object o2){ return null; }
	public MyHelperClass close(PreparedStatement o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class DatabaseAdapter {

public MyHelperClass getSequenceNextValue(CustomSequenceType o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class DataDefinitionActionDataListType {

}

class PreparedStatement {

public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class CustomSequenceType {

public MyHelperClass setColumnName(String o0){ return null; }
	public MyHelperClass setSequenceName(String o0){ return null; }
	public MyHelperClass setTableName(String o0){ return null; }}
