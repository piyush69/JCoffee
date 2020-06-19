


class c8912107 {
public static MyHelperClass close(Connection o0, PreparedStatement o1){ return null; }
public static MyHelperClass C3P0Pool;
	public static MyHelperClass Types;
//	public MyHelperClass close(Connection o0, PreparedStatement o1){ return null; }
	public static MyHelperClass getCategoria(String o0){ return null; }
//public MyHelperClass Types;
//	public MyHelperClass C3P0Pool;
//	public MyHelperClass getCategoria(String o0){ return null; }

    private static void salvarObra(Artista artista, Obra obra) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        int categoria;
        System.out.println("Migracao.salvarObra() obra: " + obra.toString2());
        if (obra.getCategoria() != null) {
            categoria =(int)(Object) getCategoria((String)(Object)obra.getCategoria().getNome()).getCodigo();
        } else {
            categoria =(int)(Object) getCategoria("Sem Categoria").getCodigo();
        }
        try {
            conn =(Connection)(Object) C3P0Pool.getConnection();
            String sql = "insert into obra VALUES (?,?,?,?,?,?)";
            ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            ps.setNull(1, Types.INTEGER);
            ps.setString(2, obra.getTitulo());
            ps.setInt(3,(int)(Object) obra.getSelec());
            ps.setInt(4, categoria);
            ps.setInt(5,(int)(Object) artista.getNumeroInscricao());
            ps.setInt(6,(int)(Object) obra.getCodigo());
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
public MyHelperClass getCodigo(){ return null; }
	public MyHelperClass getNome(){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Artista {

public MyHelperClass getNumeroInscricao(){ return null; }}

class Obra {

public MyHelperClass getTitulo(){ return null; }
	public MyHelperClass toString2(){ return null; }
	public MyHelperClass getCategoria(){ return null; }
	public MyHelperClass getSelec(){ return null; }
	public MyHelperClass getCodigo(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setNull(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
