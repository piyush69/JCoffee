


class c4961134 {
public MyHelperClass delObras(Connection o0, PreparedStatement o1, MyHelperClass o2){ return null; }
	public MyHelperClass salvarObra(Connection o0, PreparedStatement o1, Obra o2, MyHelperClass o3){ return null; }
public MyHelperClass close(Connection o0, PreparedStatement o1){ return null; }
	public MyHelperClass alterarEndereco(Connection o0, PreparedStatement o1, Artista o2){ return null; }

    private void alterarArtista(Artista artista) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass C3P0Pool = new MyHelperClass();
            conn =(Connection)(Object) C3P0Pool.getConnection();
            String sql = "UPDATE artista SET nome = ?,sexo = ?,email = ?,obs = ?,telefone = ? where numeroinscricao = ?";
            ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            ps.setString(1, artista.getNome());
            ps.setBoolean(2, artista.isSexo());
            ps.setString(3, artista.getEmail());
            ps.setString(4, artista.getObs());
            ps.setString(5, artista.getTelefone());
            ps.setInt(6, artista.getNumeroInscricao());
            ps.executeUpdate();
            alterarEndereco(conn, ps, artista);
            delObras(conn, ps, artista.getNumeroInscricao());
            sql = "insert into obra VALUES (?,?,?,?,?,?)";
            ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            for (Obra obra :(Obra[])(Object) (Object[])(Object)artista.getListaObras()) {
                salvarObra(conn, ps, obra, artista.getNumeroInscricao());
            }
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

class Artista {

public MyHelperClass getNome(){ return null; }
	public MyHelperClass getTelefone(){ return null; }
	public MyHelperClass getNumeroInscricao(){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass getListaObras(){ return null; }
	public MyHelperClass isSexo(){ return null; }
	public MyHelperClass getObs(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setBoolean(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Obra {

}
