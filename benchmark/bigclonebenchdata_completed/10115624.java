


class c10115624 {
public MyHelperClass getRepositoryConnection(MyHelperClass o0, String o1, int o2){ return null; }

    public void registerSchema(String newSchemaName, String objectControlller, long boui, String expression, String schema) throws SQLException {
        Connection cndef = null;
        PreparedStatement pstm = null;
        try {
            MyHelperClass p_ctx = new MyHelperClass();
            cndef =(Connection)(Object) this.getRepositoryConnection(p_ctx.getApplication(), "default", 2);
            MyHelperClass MessageLocalizer = new MyHelperClass();
            String friendlyName = MessageLocalizer.getMessage("SCHEMA_CREATED_BY_OBJECT") + " [" + objectControlller + "] " + MessageLocalizer.getMessage("WITH_BOUI") + " [" + boui + "]";
            pstm =(PreparedStatement)(Object) cndef.prepareStatement("DELETE FROM NGTDIC WHERE TABLENAME=? and objecttype='S'");
            pstm.setString(1, newSchemaName);
            pstm.executeUpdate();
            pstm.close();
            pstm =(PreparedStatement)(Object) cndef.prepareStatement("INSERT INTO NGTDIC (SCHEMA,OBJECTNAME,OBJECTTYPE,TABLENAME, " + "FRIENDLYNAME, EXPRESSION) VALUES (" + "?,?,?,?,?,?)");
            pstm.setString(1, schema);
            pstm.setString(2, newSchemaName);
            pstm.setString(3, "S");
            pstm.setString(4, newSchemaName);
            pstm.setString(5, friendlyName);
            pstm.setString(6, expression);
            pstm.executeUpdate();
            pstm.close();
            cndef.commit();
        } catch (Exception e) {
            cndef.rollback();
            e.printStackTrace();
            throw new SQLException(e.getMessage());
        } finally {
            if (pstm != null) {
                try {
                    pstm.close();
                } catch (Exception e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMessage(String o0){ return null; }
	public MyHelperClass getApplication(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
