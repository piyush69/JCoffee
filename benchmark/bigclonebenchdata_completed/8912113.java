


class c8912113 {
public static MyHelperClass close(Connection o0, PreparedStatement o1){ return null; }
//public MyHelperClass close(Connection o0, PreparedStatement o1){ return null; }

    private static void salvarCategoria(Categoria categoria) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass C3P0Pool = new MyHelperClass();
            conn =(Connection)(Object) C3P0Pool.getConnection();
            String sql = "insert into categoria VALUES (?,?)";
            ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            MyHelperClass Types = new MyHelperClass();
            ps.setNull(1, Types.INTEGER);
            ps.setString(2, categoria.getNome());
            ps.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            if (conn != null) conn.rollback();
            throw e;
        } finally {
            close(conn, ps);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INTEGER;
public MyHelperClass getConnection(){ return null; }}

class Categoria {

public MyHelperClass getNome(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setNull(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
