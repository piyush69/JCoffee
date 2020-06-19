


class c22967208 {

    public SysSequences getSeqs(String tableName) throws SQLException {
        SysSequences seq = new SysSequences();
        if (tableName == null || tableName.trim().equals("")) return null;
        Connection conn = null;
        try {
            MyHelperClass ConnectUtil = new MyHelperClass();
            conn =(Connection)(Object) ConnectUtil.getConnect();
            conn.setAutoCommit(false);
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement("update ss_sys_sequences set next_value=next_value+step_value where table_name='" + tableName + "'");
            ps.executeUpdate();
            ps.close();
            ps =(PreparedStatement)(Object) conn.prepareStatement("select * from ss_sys_sequences where table_name='" + tableName + "'");
            ResultSet rs =(ResultSet)(Object) ps.executeQuery();
            while ((boolean)(Object)rs.next()) {
                long nextValue =(long)(Object) rs.getLong(2);
                long stepValue =(long)(Object) rs.getLong(3);
                seq.setTableName(tableName);
                seq.setNextValue(nextValue - stepValue + 1);
                seq.setStepValue(stepValue);
            }
            rs.close();
            ps.close();
            if (seq.getTableName() == null) {
                MyHelperClass Constants = new MyHelperClass();
                ps =(PreparedStatement)(Object) conn.prepareStatement("insert into ss_sys_sequences values('" + tableName + "'," + ((int)(Object)Constants.DEFAULT_CURR_VALUE + (int)(Object)Constants.DEFAULT_STEP_VALUE) + "," + Constants.DEFAULT_STEP_VALUE + ")");
                ps.executeUpdate();
                ps.close();
                seq.setTableName(tableName);
//                MyHelperClass Constants = new MyHelperClass();
                seq.setNextValue((int)(Object)Constants.DEFAULT_CURR_VALUE + 1);
//                MyHelperClass Constants = new MyHelperClass();
                seq.setStepValue((long)(Object)Constants.DEFAULT_STEP_VALUE);
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            e.printStackTrace();
        } finally {
            try {
                conn.setAutoCommit(true);
            } catch (Exception e) {
            }
            MyHelperClass ConnectUtil = new MyHelperClass();
            ConnectUtil.closeConn(conn);
        }
        return seq;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_CURR_VALUE;
	public MyHelperClass DEFAULT_STEP_VALUE;
public MyHelperClass closeConn(Connection o0){ return null; }
	public MyHelperClass getConnect(){ return null; }}

class SysSequences {

public MyHelperClass setStepValue(long o0){ return null; }
	public MyHelperClass setTableName(String o0){ return null; }
	public MyHelperClass setNextValue(long o0){ return null; }
	public MyHelperClass getTableName(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}
