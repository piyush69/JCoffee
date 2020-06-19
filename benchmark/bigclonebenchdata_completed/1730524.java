
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1730524 {

    public static boolean update(Departamento objDepartamento) {
        int result = 0;
        MyHelperClass DBConnection = new MyHelperClass();
        Connection c =(Connection)(Object) DBConnection.getConnection();
        PreparedStatement pst = null;
        if (c == null) {
            return false;
        }
        try {
            c.setAutoCommit(false);
            String sql = "update departamento set nome = ?, sala = ?, telefone = ?, id_orgao = ? where id_departamento= ?";
            pst =(PreparedStatement)(Object) c.prepareStatement(sql);
            pst.setString(1, objDepartamento.getNome());
            pst.setString(2, objDepartamento.getSala());
            pst.setString(3, objDepartamento.getTelefone());
            pst.setLong(4, (objDepartamento.getOrgao()).getCodigo());
            pst.setInt(5, objDepartamento.getCodigo());
            result =(int)(Object) pst.executeUpdate();
            c.commit();
        } catch (UncheckedIOException e) {
            try {
                c.rollback();
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
            System.out.println("[DepartamentoDAO.update] Erro ao atualizar -> " + e.getMessage());
        } finally {
//            MyHelperClass DBConnection = new MyHelperClass();
            DBConnection.closePreparedStatement(pst);
//            MyHelperClass DBConnection = new MyHelperClass();
            DBConnection.closeConnection(c);
        }
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCodigo(){ return null; }
	public MyHelperClass closePreparedStatement(PreparedStatement o0){ return null; }
	public MyHelperClass closeConnection(Connection o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Departamento {

public MyHelperClass getSala(){ return null; }
	public MyHelperClass getNome(){ return null; }
	public MyHelperClass getTelefone(){ return null; }
	public MyHelperClass getOrgao(){ return null; }
	public MyHelperClass getCodigo(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
