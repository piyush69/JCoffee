


class c17337238 {
public MyHelperClass col;
	public MyHelperClass user;
	public MyHelperClass Tbl;
public MyHelperClass title;
	public MyHelperClass RetailerViewer;
	public MyHelperClass descr;
	public MyHelperClass saveDescr(int o0){ return null; }

    private Retailer create() throws SQLException, IOException {
        Connection conn = null;
        Statement st = null;
        String query = null;
        ResultSet rs = null;
        try {
            MyHelperClass dataSource = new MyHelperClass();
            conn =(Connection)(Object) dataSource.getConnection();
            st =(Statement)(Object) conn.createStatement();
            query = "insert into " + Tbl.ret + "(" + col.title + "," + col.addDate + "," + col.authorId + ") " + "values('" + title + "',now()," + user.getId() + ")";
            MyHelperClass col = new MyHelperClass();
            st.executeUpdate(query, new String[] {(String)(Object) col.id });
            rs =(ResultSet)(Object) st.getGeneratedKeys();
            if (!(Boolean)(Object)rs.next()) {
                throw new SQLException("Не удается получить generated key 'id' в таблице retailers.");
            }
            int genId =(int)(Object) rs.getInt(1);
            rs.close();
            saveDescr(genId);
            conn.commit();
            Retailer ret = new Retailer();
            ret.setId(genId);
            ret.setTitle(title);
            ret.setDescr(descr);
            RetailerViewer.getInstance().somethingUpdated();
            return ret;
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (Exception e1) {
            }
            throw e;
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
                conn.close();
            } catch (Exception e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass addDate;
	public MyHelperClass id;
	public MyHelperClass title;
	public MyHelperClass authorId;
	public MyHelperClass ret;
public MyHelperClass getConnection(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass somethingUpdated(){ return null; }}

class Retailer {

public MyHelperClass setTitle(MyHelperClass o0){ return null; }
	public MyHelperClass setId(int o0){ return null; }
	public MyHelperClass setDescr(MyHelperClass o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0, String[] o1){ return null; }
	public MyHelperClass getGeneratedKeys(){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}
