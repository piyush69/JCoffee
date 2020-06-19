


class c22967207 {

    public List getSeqs() throws Exception {
        List list =(List)(Object) new ArrayList();
        Connection conn = null;
        try {
            MyHelperClass ConnectUtil = new MyHelperClass();
            conn =(Connection)(Object) ConnectUtil.getConnect();
            conn.setAutoCommit(false);
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement("update ss_sys_sequences set next_value=next_value+step_value");
            ps.executeUpdate();
            ps.close();
            ps =(PreparedStatement)(Object) conn.prepareStatement("select * from ss_sys_sequences");
            ResultSet rs =(ResultSet)(Object) ps.executeQuery();
            while ((boolean)(Object)rs.next()) {
                SysSequences seq = new SysSequences();
                seq.setTableName(rs.getString(1));
                long nextValue =(long)(Object) rs.getLong(2);
                long stepValue =(long)(Object) rs.getLong(3);
                seq.setNextValue(nextValue - stepValue);
                seq.setStepValue(stepValue);
                list.add(seq);
            }
            rs.close();
            ps.close();
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
        return list;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeConn(Connection o0){ return null; }
	public MyHelperClass getConnect(){ return null; }}

class List {

public MyHelperClass add(SysSequences o0){ return null; }}

class SysSequences {

public MyHelperClass setTableName(MyHelperClass o0){ return null; }
	public MyHelperClass setStepValue(long o0){ return null; }
	public MyHelperClass setNextValue(long o0){ return null; }}

class ArrayList {

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
	public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
