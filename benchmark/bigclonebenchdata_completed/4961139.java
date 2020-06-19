


class c4961139 {
public MyHelperClass delObras(Connection o0, PreparedStatement o1, Integer o2){ return null; }
	public MyHelperClass delEndereco(Connection o0, PreparedStatement o1, Integer o2){ return null; }
	public MyHelperClass close(Connection o0, PreparedStatement o1){ return null; }

//    @Override
    public void delArtista(Integer numeroInscricao) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass C3P0Pool = new MyHelperClass();
            conn =(Connection)(Object) C3P0Pool.getConnection();
            String sql = "delete from artista where numeroinscricao = ?";
            ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            ps.setInt(1, numeroInscricao);
            ps.executeUpdate();
            delEndereco(conn, ps, numeroInscricao);
            delObras(conn, ps, numeroInscricao);
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
