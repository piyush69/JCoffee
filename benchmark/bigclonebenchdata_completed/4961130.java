


class c4961130 {
public MyHelperClass close(Connection o0, PreparedStatement o1){ return null; }

//    @Override
    public void delCategoria(Integer codigo) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass C3P0Pool = new MyHelperClass();
            conn =(Connection)(Object) C3P0Pool.getConnection();
            String sql = "delete from categoria where id_categoria = ?";
            ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            ps.setInt(1, codigo);
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

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, Integer o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
