


class c8912110 {
public static MyHelperClass salvarEndereco(Connection o0, PreparedStatement o1, Artista o2){ return null; }
	public static MyHelperClass close(Connection o0, PreparedStatement o1){ return null; }
//public MyHelperClass close(Connection o0, PreparedStatement o1){ return null; }
//	public MyHelperClass salvarEndereco(Connection o0, PreparedStatement o1, Artista o2){ return null; }

    private static void salvarArtista(Artista artista) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass C3P0Pool = new MyHelperClass();
            conn =(Connection)(Object) C3P0Pool.getConnection();
            String sql = "insert into artista VALUES (?,?,?,?,?,?,?)";
            ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            ps.setInt(1, artista.getNumeroInscricao());
            ps.setString(2, artista.getNome());
            ps.setBoolean(3, artista.isSexo());
            ps.setString(4, artista.getEmail());
            ps.setString(5, artista.getObs());
            ps.setString(6, artista.getTelefone());
            MyHelperClass Types = new MyHelperClass();
            ps.setNull(7, Types.INTEGER);
            ps.executeUpdate();
            salvarEndereco(conn, ps, artista);
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

class Artista {

public MyHelperClass getNome(){ return null; }
	public MyHelperClass getTelefone(){ return null; }
	public MyHelperClass getNumeroInscricao(){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass isSexo(){ return null; }
	public MyHelperClass getObs(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setBoolean(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setNull(int o0, MyHelperClass o1){ return null; }}
