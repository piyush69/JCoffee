


class c17102809 {
public MyHelperClass col;
	public MyHelperClass email;
	public MyHelperClass name;
	public MyHelperClass login;
	public MyHelperClass Tbl;
	public MyHelperClass role;
	public MyHelperClass pass;

    private int create() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String query = null;
        try {
            MyHelperClass dataSource = new MyHelperClass();
            conn =(Connection)(Object) dataSource.getConnection();
            st =(Statement)(Object) conn.createStatement();
            query = "insert into " + Tbl.users + "(" + col.name + "," + col.login + "," + col.pass + "," + col.passHash + "," + col.email + "," + col.role + "," + col.addDate + ") values('" + name + "','" + login + "','" + pass + "','" + pass.hashCode() + "','" + email + "'," + role + ",now())";
            MyHelperClass col = new MyHelperClass();
            st.executeUpdate(query, new String[] {(String)(Object) col.id });
            rs =(ResultSet)(Object) st.getGeneratedKeys();
            while ((boolean)(Object)rs.next()) {
                int genId =(int)(Object) rs.getInt(1);
                conn.commit();
                return genId;
            }
            throw new SQLException("Не удается получить generatedKey при создании пользователя.");
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
public MyHelperClass email;
	public MyHelperClass addDate;
	public MyHelperClass name;
	public MyHelperClass id;
	public MyHelperClass passHash;
	public MyHelperClass users;
	public MyHelperClass login;
	public MyHelperClass role;
	public MyHelperClass pass;
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
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}
