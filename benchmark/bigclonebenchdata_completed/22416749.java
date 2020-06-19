


class c22416749 {
public MyHelperClass Tbl;

    private int getRootNodeId(DataSource dataSource) throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String query = null;
        try {
            conn =(Connection)(Object) dataSource.getConnection();
            st =(Statement)(Object) conn.createStatement();
            MyHelperClass col = new MyHelperClass();
            query = "select " + col.id + " from " + Tbl.tree + " where " + col.parentId + " is null";
            rs =(ResultSet)(Object) st.executeQuery(query);
            while ((boolean)(Object)rs.next()) {
//                MyHelperClass col = new MyHelperClass();
                return(int)(Object) rs.getInt((int)(Object)col.id);
            }
            query = "insert into " + Tbl.tree + "(" + col.lKey + ", " + col.rKey + ", " + col.level + ") values(1,2,0)";
//            MyHelperClass col = new MyHelperClass();
            st.executeUpdate(query, new String[] {(String)(Object) col.id });
            rs =(ResultSet)(Object) st.getGeneratedKeys();
            while ((boolean)(Object)rs.next()) {
                int genId =(int)(Object) rs.getInt(1);
                rs.close();
                conn.commit();
                return genId;
            }
            throw new SQLException("Не удается создать корневой элемент для дерева.");
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
            }
            try {
                st.close();
            } catch (Exception e) {
            }
            try {
                conn.rollback();
            } catch (Exception e) {
            }
            try {
                conn.close();
            } catch (Exception e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass level;
	public MyHelperClass tree;
	public MyHelperClass parentId;
	public MyHelperClass id;
	public MyHelperClass rKey;
	public MyHelperClass lKey;
}

class DataSource {

public MyHelperClass getConnection(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0, String[] o1){ return null; }
	public MyHelperClass getGeneratedKeys(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}
